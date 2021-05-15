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

    for (i in 1 until N) {
        dp[i] = min(dp[i], dp[i - 1] + abs(list[i] - list[i - 1]).toLong())
        if (i > 1) {
            dp[i] = min(dp[i], dp[i - 2] + abs(list[i] - list[i - 2]).toLong())
        }
    }

    println(dp[N - 1])
}
