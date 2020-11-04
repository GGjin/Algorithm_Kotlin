package easy

//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
// 示例 1:
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
//
//
// 示例 2:
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
//
//
// 说明:
//
// 所有输入只包含小写字母 a-z 。
// Related Topics 字符串
// 👍 1136 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var res = strs[0]

    for (i in strs.indices) {
        while (strs[i].indexOf(res) != 0) {
            res = res.substring(0, res.length - 1)
        }
        if (res.isEmpty()) {
            break
        }
    }
    return res
}


fun main() {
    println("abcd".indexOf("f"))
    val array = arrayOf("flower", "flow", "flight")
    val a2 = arrayOf("dog","racecar","car")
//    println(longestCommonPrefix(a2))
}
//leetcode submit region end(Prohibit modification and deletion)
