package easy

import sun.misc.FpUtils

//实现 strStr() 函数。
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
//果不存在，则返回 -1。
//
// 示例 1:
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
//
//
// 示例 2:
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
//
//
// 说明:
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
// Related Topics 双指针 字符串
// 👍 496 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty())
        return 0

    if (haystack.isEmpty())
        return -1

    val l1 = haystack.length
    val l2 = needle.length

    for (i in 0..l1 - l2) {
        var k = i
        var j = 0
        while (j < l2 && k < l1 && haystack[k] == needle[j]) {
            k++
            j++
        }
        if (j == l2)
            return i
    }
    return -1
}

fun strStr1(haystack: String, needle: String): Int {
    if (needle.isEmpty())
        return 0

    if (haystack.isEmpty())
        return -1

   return haystack.indexOf(needle)
}
//leetcode submit region end(Prohibit modification and deletion)
