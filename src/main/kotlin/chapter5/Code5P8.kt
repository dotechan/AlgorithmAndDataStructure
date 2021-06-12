package chapter5

import kotlin.math.min

fun main(args: Array<String>) {
    // 入力受け取り
    println("> S:文字列を入力")
    val S = readLine()!!
    println("> T:文字列を入力")
    val T = readLine()!!

    // DPテーブル定義
    val dp = Array(S.length + 1) {
        Array(T.length + 1) {
            Int.MAX_VALUE
        }
    }

    // DP初期条件
    dp[0][0] = 0

    // DPループ
    for (i in 0..S.length) {
        for (j in 0..T.length) {
            // 変更条件
            if (i > 0 && j > 0) {
                if (S[i - 1] == T[j - 1]) {
                    dp[i][j] = min(dp[i][j], dp[i - 1][j - 1])
                } else {
                    dp[i][j] = min(dp[i][j], dp[i - 1][j - 1] + 1)
                }
            }

            // 削除操作
            if (i > 0) {
                dp[i][j] = min(dp[i][j], dp[i - 1][j] + 1)
            }

            // 挿入操作
            if (j > 0) {
                dp[i][j] = min(dp[i][j], dp[i][j - 1] + 1)
            }

            print(dp[i][j])
            print(" ")
        }
        println()
    }

    // 答えを出力
    println()
    println("答え = ${dp[S.length][T.length]}")
}
