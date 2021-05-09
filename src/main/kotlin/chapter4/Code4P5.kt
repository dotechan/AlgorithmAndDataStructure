package chapter4

fun main(args: Array<String>) {
    println(fibo(5))
}

private fun fibo(N: Int): Int {
    // 再帰関数を呼び出したことを報告する
    println("fibo($N)を呼び出しました")

    // ベースケース
    if (N == 0) return 0
    else if (N == 1) return 1

    // 再帰的に答えを求めて出力する
    var result = fibo(N - 1) + fibo(N - 2)
    println("$N 項目 = $result")

    return result
}