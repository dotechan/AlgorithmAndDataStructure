package chapter4

fun main(args: Array<String>) {
    println("> N:要素数")
    val N = readLine()!!.toInt()

    println(tribo(N))
}

private fun tribo(N: Int): Int {
    // ベースケース
    if (N == 0) {
        return 0
    } else if (N == 1) {
        return 0
    } else if (N == 2) {
        return 1
    }

    val result = tribo(N - 1) + tribo(N - 2) + tribo(N - 3)
    return result
}
