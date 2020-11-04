package easy

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
// 你可以假设数组中无重复元素。
//
// 示例 1:
//
// 输入: [1,3,5,6], 5
//输出: 2
//
//
// 示例 2:
//
// 输入: [1,3,5,6], 2
//输出: 1
//
//
// 示例 3:
//
// 输入: [1,3,5,6], 7
//输出: 4
//
//
// 示例 4:
//
// 输入: [1,3,5,6], 0
//输出: 0
//
// Related Topics 数组 二分查找
// 👍 555 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
fun searchInsert(nums: IntArray, target: Int): Int {
    var targetIndex = 0

    for (i in nums.indices) {
        if (target == nums[i]) {
            return i

        } else if (target < nums[i]) {
            break
        }
        targetIndex++
    }

    return targetIndex
}

fun searchInsert1(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        var mid = (left + right) / 2
        if (nums[mid] == target) {
            return mid
        }
        if (nums[mid] > target) {
            right = mid - 1
        }
        if (nums[mid] < target) {
            left = mid + 1
        }
    }
    return left
}
//leetcode submit region end(Prohibit modification and deletion)

fun main() {
    val a = intArrayOf(1, 3, 5, 6)
    val b = searchInsert1(a, 2)
    print(b)
}