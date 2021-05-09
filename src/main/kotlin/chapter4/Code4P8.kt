package chapter4

fun main(args: Array<String>) {
    println(fibo(49))

    repeat(49) {
        println(memo[it])
    }
}

// メモ化用配列を-1で初期化する
var memo: Array<Long> = Array(50) { -1L }

private fun fibo(N: Int): Long {
    // ベースケース
    if (N == 0) return 0
    else if (N == 1) return 1

    // メモをチェック（すでに計算済みならば答えをリターンする）
    if (memo[N] != -1L) return memo[N]

    // 答えをメモ化しながら、再帰呼び出し
    memo[N] = fibo(N - 1) + fibo(N - 2)
    return memo[N]
}
