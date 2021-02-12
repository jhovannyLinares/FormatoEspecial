function cargar() {

    let timerInterval
    Swal.fire({
        title: 'Validando Credenciales!',
        html: 'Espere unos segundos.',
        timer: 200000,
        timerProgressBar: false,
        allowOutsideClick: false,
        onBeforeOpen: () => {
            Swal.showLoading()
//            timerInterval = setInterval(() => {
//                Swal.getContent().querySelector('b')
//                    .textContent = Swal.getTimerLeft()
//            }, 100)
        },
        onClose: () => {
            clearInterval(timerInterval)
        }
    }).then((result) => {
        if (
            /* Read more about handling dismissals below */
            result.dismiss === Swal.DismissReason.timer
        ) {
            console.log('I was closed by the timer') // eslint-disable-line
        }
    })

}


//function cargar() {
//    var t;
//    Swal.fire({
//        title: "Auto close alert!",
//        html: "I will close in <b></b> milliseconds.",
//        timer: 2e3,
//        timerProgressBar: !0,
//        onBeforeOpen: function() {
//            Swal.showLoading(), t = setInterval((function() {
//                Swal.getContent().querySelector("b").textContent = Swal.getTimerLeft()
//            }), 100)
//        },
//        onClose: function() {
//            clearInterval(t)
//        }
//    }).then((function(t) {
//        t.dismiss === Swal.DismissReason.timer && console.log("I was closed by the timer")
//    }))
//}