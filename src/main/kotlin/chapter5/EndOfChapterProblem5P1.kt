package chapter5

import kotlin.math.max

fun main(args: Array<String>) {
    // 参考リンク
    // https://qiita.com/drken/items/dc53c683d6de8aeacf5a#%E8%A7%A3%E6%B3%95-2

    // 入力受け取り
    println("> N:夏休みの日にちを入力")
    val N = readLine()!!.toInt()

    val a = Array(N) {
        Array(3) {
            0
        }
    }

    // 幸福度を初期化
    for (i in 0 until N) {
        for (j in 0..2) {
            println("a[$i][$j]の幸福度を入力")
            a[i][j] = readLine()!!.toInt()
        }
    }

    println("幸福度のテーブル")
    for (i in 0 until N) {
        print("${i + 1}日目:")
        for (j in 0..2) {
           print("${a[i][j]} ")
        }
        println("")
    }

    // DPテーブル定義
    // push-based : dp[i]が確定している時にdp[i + 1]を求める方式のためDPテーブルのサイズを+1しておく
    val dp = Array(N + 1) {
        Array(3) {
            0
        }
    }

    // DP初期条件
    // DPループ
    for (i in 0 until N) {
        for (j in 0..2) {
            for (k in 0..2) {
                if (j == k) continue
                dp[i + 1][k] = max(dp[i + 1][k], dp[i][j] + a[i][k])
            }
        }
    }

    // 答えを出力
    println()
    var res = 0
    for (j in 0..2) {
        res = max(res, dp[N][j])
    }
    print("答え = $res")
}
