package chapter3

import kotlin.math.min

fun main(args: Array<String>) {
    // 入力を受け取る
    println("> N:長さ")
    val N = readLine()!!.toInt()
    println("> S:文字列")
    val S = readLine()!!

    // 長さNの文字列Sの「隙間」はN-1箇所ある
    // 隙間に対して
    // 「+」を入れる
    // 「+」を入れない
    // という2つの選択肢がある。よって全ての選択肢は2^(N-1)通り
    // これらの選択肢を0以上2^(N-1)未満の整数値（変数bit）で管理する

    // N-1箇所の隙間に「+」を入れるかどうかすべて試す
    var res = 0
    var bit = 0
    while (bit < (1 shl (N - 1))) {
        bit = bit.inc()
        // tmp:「+」と「+」との間の値を表す変数
        var tmp = 0
        repeat(N - 1) {
            // 桁をあげる
            tmp *= 10
            tmp += S[it].toInt()

            // 「+」を挿入するとき、答えにtmpを加算して、tmpを0に初期化
            if ((bit and (1 shl it)) != 0) {
                res += tmp
                tmp = 0
            }
        }

        // 最後の「+」から残りの部分を答えに加算
        tmp *= 10
        // C++: temp += S.back() - '0';
        res += tmp
    }

    println("総和 = $res")
}