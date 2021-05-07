package chapter3

fun main(args: Array<String>) {
    println("N個の整数a0,a1,...,an-1と整数値vが与えられます。")
    println("N個の整数値のうち、整数値vが何個含まれるかを求めるO(N)のアルゴリズムを設計してください。")

    // 入力を受け取る
    println("> N:整数を入力")
    val N = readLine()!!.toInt()
    println("> v:整数を入力")
    val v = readLine()!!.toInt()
    println("> list:半角スペース区切りで整数を入力")
    val list = readLine()!!.split(" ").map { it.toInt() }

    // 線形探索
    var count = 0
    repeat(N) {
        if (list[it] == v) {
            count = count.inc()
        }
    }

    // 結果を出力（-1のときは見つからなかったことを表す）
    println("count = $count")
}