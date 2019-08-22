import java.util.*

fun main (args: Array<String>){
    masuknama();
}
fun masuknama () {
    var scan= Scanner(System.`in`)
    println("masukkan username")
    var masukUsername = scan.next()
    println("masukkan password")
    var masukPassword = scan.next()
    if(masukUsername=="iflab" && masukPassword == "balfi"){
        println("berhasil masuk")
    }
    else  {
        println("username atau password salah")
        for(i in 0..1) {
            println("masukkan username")
            var masukUsername = scan.next()
            println("masukkan password")
            var masukPassword = scan.next()
            if(masukUsername=="iflab" && masukPassword == "balfi"){
                println("berhasil masuk")
                break
            }
            else {
                if(i==1) {
                    println("anda penyusup")
                }
                else{
                    println("username dan password salah")
                }
            }
        }


    }







}