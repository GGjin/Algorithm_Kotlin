package easy

//给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
//
// 注意：整数序列中的每一项将表示为一个字符串。
//
// 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
//
// 1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
//
//
// 第一项是数字 1
//
// 描述前一项，这个数是 1 即 “一个 1 ”，记作 11
//
// 描述前一项，这个数是 11 即 “两个 1 ” ，记作 21
//
// 描述前一项，这个数是 21 即 “一个 2 一个 1 ” ，记作 1211
//
// 描述前一项，这个数是 1211 即 “一个 1 一个 2 两个 1 ” ，记作 111221
//
//
//
// 示例 1:
//
// 输入: 1
//输出: "1"
//解释：这是一个基本样例。
//
// 示例 2:
//
// 输入: 4
//输出: "1211"
//解释：当 n = 3 时，序列是 "21"，其中我们有 "2" 和 "1" 两组，"2" 可以读作 "12"，也就是出现频次 = 1 而 值 = 2；类似
//"1" 可以读作 "11"。所以答案是 "12" 和 "11" 组合在一起，也就是 "1211"。
// Related Topics 字符串
// 👍 497 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
fun countAndSay(n: Int): String {
    if (n == 1)
        return "1"

    val str = countAndSay(n - 1)
    val s = StringBuffer()
    var pl = 0
    var cur = 1
    while (cur in 1 until str.length) {
        if (str[pl] != str[cur]) {
            s.append(cur - pl).append(str[pl])
            pl = cur
        }
        cur++
    }
    if (pl != cur) {
        s.append(cur - pl).append(str[pl])
    }
    return s.toString()
}
//leetcode submit region end(Prohibit modification and deletion)

fun main() {
    val a = countAndSay(5)
    print(a)
}