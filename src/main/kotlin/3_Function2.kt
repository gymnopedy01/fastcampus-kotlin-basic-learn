fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}

fun main() {

    //네임드 아규먼트 문법
    log(message = "인포 로그")
    log(level = "DEBUG", message = "디버그 로그")
    log("WARN", "워닝 로그")
    log(level = "ERROR", message = "에러 로그")
    log("", "인포 로그")

}
