package chapter4

fun main(args: Array<String>) {
    println("753数（各桁の値が7,5,3のいずれかであり、かつ7,5,3がいずれも一度以上は登場する整数）")
    println("正の整数Kが与えられたときに、K以下の753数が何個あるかを求めるアルゴリズムを設計")
    println("> K:整数")
    val K = readLine()!!.toInt()
    val d = K.toString().length
    println("Kの桁数d = $d")

    println("K以下の753数の個数 = ${count753(K, d)}")
}

fun count753(K: Int, d: Int): Int {
    // ベースケース
    if (d == 1) {
        return 0
    } else if (d == 2) {
        return 0
    }

    // メモ化（できれば）

    // 再帰呼び出し
}