package chapter5

import kotlin.math.max

fun main(args: Array<String>) {
    // 入力受け取り
    println("> N:重さと価値のペアの要素数を整数で入力")
    val N = readLine()!!.toInt()
    println("> W:重さの総和を整数で入力")
    val W = readLine()!!.toInt()
    println("> pair:weightとvalueのpair間はカンマ区切り")
    println("> pair:pair間は半角スペース区切り")
    val weightValuePair = readLine()!!.split(" ").map {
        val weightValue = it.split(",")
        Pair(weightValue[0].toInt(), weightValue[1].toInt())
    }

    // DPテーブル定義
    val dp = Array(N + 1) {
        Array(W + 1) {
            0
        }
    }

    // DPループ
    for (i in 0 until N) {
        for (w in 0..W) {
            // i番目の品物を選ぶ場合
            if (w - weightValuePair[i].first >= 0) {
                dp[i + 1][w] =
                    max(dp[i + 1][w], dp[i][w - weightValuePair[i].first] + weightValuePair[i].second)
            }

            // i番目の品物を選ばない場合
            dp[i + 1][w] =
                max(dp[i + 1][w], dp[i][w])
        }
    }

    println(dp[N][W])
}
