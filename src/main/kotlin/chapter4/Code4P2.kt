package chapter4

/**
 * 再帰関数のテンプレート
 * (戻り値の型) func(引数) {
 *   // ベースケースとは再帰関数の中で再帰呼び出しを行わずにreturnするケースのこと
 *   if (ベースケース) {
 *     return ベースケースに対する値;
 *   }
 *
 *   // 再帰呼び出しを行います
 *   func(次の引数);
 *
 *   return 答え;
 */

fun main(args: Array<String>) {
    func(5)
}

fun func(N: Int): Int {
    // 再帰関数を呼び出したことを報告する
    println("func($N)を呼び出しました")

    if (N == 0) return 0

    // 再帰的に答えを求めて出力する
    var result = N + func(N - 1)
    println("$N までの和 = $result")

    return result
}
