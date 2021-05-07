package chapter3

fun main(args: Array<String>) {
    println("N個の正の整数a0,a1,...,an-1と正の整数Wが与えられます。")
    println("この中から2つ選んで差をとります。その差の最大値を求めるO(N)のアルゴリズムを設計してください。")

    // 入力を受け取る
    println("> N:整数を入力")
    val N = readLine()!!.toInt()
    println("> list: 半角スペース区切りで整数を入力")
    val list = readLine()!!.split(" ").map { it.toInt() }

    // N個の最大値と最小値を差を求める
    var max = 0
    var min = 200000000 // 十分に大きい値
    repeat(N) {
        if (list[it] > max) {
            max  = list[it]
        }
        if (list[it] < min) {
            min = list[it]
        }
    }

    println("2値の差の最大値: ${max - min}")
}