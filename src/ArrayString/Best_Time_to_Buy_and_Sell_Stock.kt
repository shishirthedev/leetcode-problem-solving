package ArrayString

import kotlin.math.max

fun main() {
    val r = maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
    println(r)
}

fun maxProfit(prices: IntArray): Int {
    var buyPrice = prices[0]
    var maxProfit = 0
    for (i in 1 until prices.size) {
        if (prices[i] < buyPrice) buyPrice = prices[i]
        else maxProfit = max(prices[i] - buyPrice, maxProfit)
    }
    return maxProfit
}

//fun maxProfit(prices: IntArray): Int {
//    var maxProfit = 0
//    for ((i, price) in prices.withIndex()) {
//        for (j in i + 1 until prices.size) {
//            if (prices[j] > prices[i]) {
//                val profit = prices[j] - prices[i]
//                if (profit > maxProfit) {
//                    maxProfit = profit
//                }
//            }
//        }
//    }
//    return maxProfit
//}