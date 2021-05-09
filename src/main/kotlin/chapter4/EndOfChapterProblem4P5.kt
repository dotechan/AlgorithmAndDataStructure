package chapter4

fun main(args: Array<String>) {
    println("753数（各桁の値が7,5,3のいずれかであり、かつ7,5,3がいずれも一度以上は登場する整数）")
    println("正の整数Kが与えられたときに、K以下の753数が何個あるかを求めるアルゴリズムを設計")
    println("> K:整数")
    val K = readLine()!!.toLong()

    func(K, 0, 0)
    println("counter = $counter")
}

private var counter = 0
private fun func(N: Long, cur: Long, use: Int) {
    // ベースケース
    if (cur > N) return

    // 7,5,3がいずれも一度以上は登場する場合
    if (use == 0b111) {
        counter = counter.inc()
    }

    // 現在の値に7を付け加える
    func(N, cur * 10 + 7, use or 0b001)

    // 現在の値に5を付け加える
    func(N, cur * 10 + 5, use or 0b010)

    // 現在の値に3を付け加える
    func(N, cur * 10 + 3, use or 0b100)
}