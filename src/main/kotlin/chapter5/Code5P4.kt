package chapter5

import kotlin.math.abs
import kotlin.math.min


fun main(args: Array<String>) {
    // 入力受け取り
    println("> N:整数を入力")
    val N = readLine()!!.toInt()
    println("> list:半角スペース区切りで整数を入力")
    val list = readLine()!!.split(" ").map { it.toInt() }

    val dp = Array(N) { Long.MAX_VALUE}
    dp[0] = 0

    for (i in 0 until N) {
        if (i + 1 < N) {
            dp[i + 1] = min(dp[i + 1], dp[i] + abs(list[i] - list[i + 1]))
        }
        if (i + 2 < N) {
            dp[i + 2] = min(dp[i + 2], dp[i] + abs(list[i] - list[i + 2]))
        }
    }

    println(dp[N - 1])
}
