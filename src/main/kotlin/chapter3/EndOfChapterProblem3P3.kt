package chapter3

fun main(args: Array<String>) {
    println("N(>=2)個の相違なる整数a0,a1,...,an-1が与えられます。")
    println("このうち2番目に小さい値を求めるO(N)のアルゴリズムを設計してください。")

    // 入力を受け取る
    println("> N:整数を入力")
    val N = readLine()!!.toInt()
    println("> list:半角スペース区切りで2以上の整数を入力")
    val list = readLine()!!.split(" ").map { it.toInt() }

    val INF = 20000000
    // 線形探索
    var worst_value = INF
    var second_value = INF
    repeat(N) {
        if (list[it] < worst_value) {
            second_value = worst_value
            worst_value = list[it]
        } else if (list[it] < second_value) {
            second_value = list[it]
        }
    }

    // 結果を出力
    println("2番目に小さい値: ${second_value}")
}