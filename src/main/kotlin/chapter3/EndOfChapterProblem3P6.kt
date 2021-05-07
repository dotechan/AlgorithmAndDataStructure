package chapter3

fun main(args: Array<String>) {
    println("2つの正の整数K,Nが与えられます。")
    println("0<=X,Y,Z<=Kを満たす整数(X,Y,Z)の組であってX+Y+Z=Nを満たすものが何通りあるかを求める")
    println("O(N^2)のアルゴリズムを設計してください。")

    // 入力を受け取る
    println("> K:整数を入力")
    val K = readLine()!!.toInt()
    println("> N:整数を入力")
    val N = readLine()!!.toInt()

    var Z = 0
    var count = 0
    for (X in 0..K) {
        for (Y in 0..K) {
            Z = N - (X + Y)
            if (Z in 0..K) {
                println("X = $X, Y = $Y, Z = $Z")
                count = count.inc()
            }
        }
    }

    println("${count}通り")
}