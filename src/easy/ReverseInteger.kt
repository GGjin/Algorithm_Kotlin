package easy

import kotlin.math.pow

/**
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

fun reverse(x: Int): Int {
    var res = 0
    var temp = x
    while (temp != 0) {
        val pop = temp % 10
        temp /= 10

        if (res > Int.MAX_VALUE / 10 || res < Int.MIN_VALUE / 10) {
            return 0
        }
        res = res * 10 + pop
    }
    return res
}

fun main() {
    println(2f.pow(31) - 1)
    println(Int.MAX_VALUE)
    println(-2f.pow(31))
    println(Int.MIN_VALUE)
    println(reverse(1534236469))
    println(reverse(123))
    println(9646314351 > 2f.pow(31))
}