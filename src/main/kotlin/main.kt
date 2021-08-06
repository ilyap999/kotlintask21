fun main() {
    val amount = 520000
    val transferCommis = 0.75
    val minCommisAmount = 3500
    var commisAmount = (amount * transferCommis / 100).toInt()
    if (commisAmount <= minCommisAmount) {
        commisAmount = minCommisAmount
    }
    println("Комиссия: $commisAmount")
}