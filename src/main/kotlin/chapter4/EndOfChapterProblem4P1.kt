package chapter4

fun main(args: Array<String>) {
    println("> N:要素数")
    val N = readLine()!!.toInt()

    println(tribo(N))

    repeat(N + 1) {
        println(memo[it])
    }
}

private var memo: Array<Long> = Array(50) { -1L }

private fun tribo(N: Int): Long {
    // ベースケース
    if (N == 0) {
        return 0
    } else if (N == 1) {
        return 0
    } else if (N == 2) {
        return 1
    }

    if (memo[N] != -1L) return memo[N]

    memo[N] = tribo(N - 1) + tribo(N - 2) + tribo(N - 3)

    return memo[N]
}
