package mx.formato.presentacion.web.config.security.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.session.HttpSessionEventPublisher;

import mx.formato.negocio.util.Md5;
import mx.formato.presentacion.web.config.authentication.UserDetailsServiceImpl;
import mx.formato.presentacion.web.config.security.web.authentication.CustomAuthenticationFailureHandler;
import mx.formato.presentacion.web.config.security.web.authentication.CustomAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsServiceImpl userDetailsService;
	
	public static final String ROLE_USER = "USER";
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence charSequence) {
				return Md5.get(charSequence.toString());
			}

			@Override
			public boolean matches(CharSequence charSequence, String s) {

				
				
				return Md5.get(charSequence.toString()).equals(s);
			}
		};
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();

		http.authorizeRequests().antMatchers("/seguridad/**","/recursos/**").permitAll();
		http.authorizeRequests().antMatchers("/formulario/**").access("hasAnyRole('ROLE_USER')");
		
		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/error");

		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS);
		
		// disable frame options
		http.headers().frameOptions().disable();

		http.sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
		
		// Config for Login Form
		http.authorizeRequests().and().formLogin()
				.failureHandler(customAuthenticationFailureHandler())
				.loginProcessingUrl("/j_spring_security_check")
				.successHandler(customAuthenticationSuccessHandler())
				.loginPage("/seguridad/login")
				.usernameParameter("j_username")
				.passwordParameter("j_password")
				.and().logout()
				.logoutUrl("/seguridad/logout")
				.logoutSuccessUrl("/seguridad/login");

	}

	@Bean
	public AuthenticationFailureHandler customAuthenticationFailureHandler() {
		return new CustomAuthenticationFailureHandler();
	}

	@Bean
	public AuthenticationSuccessHandler customAuthenticationSuccessHandler() {
		return new CustomAuthenticationSuccessHandler();
	}

	@Bean
	public HttpSessionEventPublisher httpSessionEventPublisher() {
		return new HttpSessionEventPublisher();
	}
	
//	
//	@Bean
//	public ErrorPageFilter errorPageFilter() {
//	    return new ErrorPageFilter();
//	}


}