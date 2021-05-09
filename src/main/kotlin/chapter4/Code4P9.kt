package chapter4

fun main(args: Array<String>) {
    println("> N:要素数")
    val N = readLine()!!.toInt()
    println("> W:和")
    val W = readLine()!!.toInt()
    println("> list:要素")
    val list = readLine()!!.split(" ").map { it.toInt() }

    // 再帰的に解く
    if (func(N, W, list)) {
        println("Yes")
    } else {
        println("No")
    }
}

private fun func(i: Int, w: Int, list: List<Int>): Boolean {
    // ベースケース
    if (i == 0) {
        return w == 0
    }

    // a[i - 1]を選ばない場合
    if (func(i - 1, w , list)) return true

    // a[i - 1]を選ぶ場合
    if (func(i - 1, w - list[i - 1], list)) return true

    // どちらもfalseの場合はfalse
    return false
}