package chapter3

fun main(args: Array<String>) {
    println("N個の整数a0,a1,...,an-1と整数値vが与えられます。")
    println("ai = vとなるデータが存在するかどうかを判定してください。")

    // 入力を受け取る
    println("> N:整数を入力")
    val N = readLine()!!.toInt()
    println("> v:整数を入力")
    val v = readLine()!!.toInt()
    println("> list:半角スペース区切りで整数を入力")
    val list = readLine()!!.split(" ").map { it.toInt() }

    // 線形探索
    var found_id = -1 // 初期値は-1などありえない値に
    repeat(N) {
        if (list[it] == v) {
            found_id = it // 見つかったら添字を記録
        }
    }

    // 結果を出力（-1のときは見つからなかったことを表す）
    println("found_id = $found_id")
}