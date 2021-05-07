package chapter3

fun main(args: Array<String>) {
    println("N個の正の整数a0,a1,...,an-1が与えられます。")
    println("これらに対して「N個の整数がすべて偶数ならば2で割った値に置き換える」という")
    println("操作を、操作が行えなくなるまで繰り返します。")
    println("何回の操作を行うことになるかを求めるアルゴリズムを設計してください。")

    // 入力を受け取る
    println("> N:整数を入力")
    val N = readLine()!!.toInt()
    println("> list: 半角スペース区切りで整数を入力")
    val list = readLine()!!.split(" ").map { it.toInt() }

    // N個の整数内に奇数が存在するか確認する
    var copyList = list.toList()
    var containsOddNum = false // 初期値は奇数を"含まない"にしておく
    var count = 0
    while (!containsOddNum) {
        repeat(N) {
            if (copyList[it] % 2 != 0) {
                containsOddNum = true
            }
        }

        if (!containsOddNum) {
            count = count.inc()

            copyList = copyList.map { it / 2 }
        }
    }

    println("2で割ることができた回数: $count")
}