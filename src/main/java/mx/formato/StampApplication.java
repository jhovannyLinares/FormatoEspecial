package mx.formato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import mx.formato.persistencia.repositorio.IUsuarioRepository;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class StampApplication {

	@Autowired
	IUsuarioRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StampApplication.class, args);

	}

//	@Bean
//	InitializingBean sendDatabase() {
//		return () -> {
//			repository.save(new Usuario(1L,"John", "5f4dcc3b5aa765d61d8327deb882cf99"));
//			repository.save(new Usuario(2L,"Rambo", "5f4dcc3b5aa765d61d8327deb882cf99"));
//		};
//
//	}
}
