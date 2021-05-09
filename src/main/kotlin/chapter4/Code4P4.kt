package chapter4

fun main(args: Array<String>) {
    println(GCD(51, 15))
    println(GCD(15, 51))
}

fun GCD(m: Int, n: Int): Int {
    // ベースケース
    if (n == 0) return m

    // 再帰呼び出し
    return GCD(n, m % n)
}
