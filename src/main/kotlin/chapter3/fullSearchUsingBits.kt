package chapter3

fun main(args: Array<String>) {
    println("N個の正の整数a0,a1,...,an-1と正の整数Wが与えられます。")
    println("a0,a1,...,an-1の中から何個かの整数を選んで総和をWとすることができるかどうかを判定してください。")

    // 入力受け取り
    println("> N:整数を入力")
    val N = readLine()!!.toInt()
    println("> W:整数を入力")
    val W = readLine()!!.toInt()
    println("> list:半角スペース区切りで整数を入力")
    val list = readLine()!!.split(" ").map {it.toInt()}

    // bitは2^N通りの部分集合全体を動きます
    var exist = false
    var bit = 0
    while (bit < (1 shl N)) {
        bit = bit.inc()

        var sum = 0 // 部分集合に含まれる要素の和
        repeat((N)) {
            // i番目の要素list[i]が部分集合に含まれているかどうか
            if ((bit and (1 shl it)) != 0) {
                sum += list[it]
            }
        }

        // sumがWに一致するかどうか
        if (sum == W) {
            exist = true
        }
    }

    if (exist) {
        println("Yes")
    } else {
        println("No")
    }
}