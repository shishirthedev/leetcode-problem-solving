package SlidingWindow


fun sumOfAllSubArrays(arr: IntArray, k: Int): Int {
    var windowSum = 0
    for (i in 0 until k) windowSum += arr[i]

    var sum = windowSum
    var startIndex = 0
    var endIndex = k

    while (endIndex < arr.size) {
        windowSum = windowSum - arr[startIndex] + arr[endIndex]
        sum += windowSum
        startIndex++
        endIndex++
    }
    return sum
}

fun sumOfMaxOfAllSubArrays(arr: IntArray, k: Int): Int {
    var startIndex = 0
    var endIndex = k
    val windowElements = ArrayList<Int>()

    for (i in 0 until endIndex) windowElements.add(arr[i])
    var sumOfMax = windowElements.maxOrNull() ?: 0

    while (endIndex < arr.size) {
        windowElements.remove(startIndex)
        windowElements.add(endIndex)
        val max = windowElements.maxOrNull() ?: 0
        sumOfMax += max
        startIndex++
        endIndex++
    }
    return sumOfMax
}


fun sumOfMinOfAllSubArrays(arr: IntArray, k: Int): Int {
    var startIndex = 0
    var endIndex = k
    val windowElements = ArrayList<Int>()

    for (i in 0 until k) windowElements.add(arr[i])
    var sumOfMin = windowElements.minOrNull() ?: 0
    while (endIndex < arr.size) {
        windowElements.remove(startIndex)
        windowElements.add(endIndex)
        val min = windowElements.minOrNull() ?: 0
        sumOfMin += min
        startIndex++
        endIndex++
    }
    return sumOfMin
}


fun sumOfAllMinAndMaxOfAllSubArrays(arr: IntArray, k: Int): Int {
    var startIndex = 0
    var endIndex = k
    val windowElements = ArrayList<Int>()
    for (i in 0 until k) windowElements.add(arr[i])
    var sumOfMinMax = (windowElements.maxOrNull() ?: 0) + (windowElements.minOrNull() ?: 0)
    while (endIndex < arr.size) {
        windowElements.remove(arr[startIndex])
        windowElements.add(arr[endIndex])
        sumOfMinMax += (windowElements.maxOrNull() ?: 0) + (windowElements.minOrNull() ?: 0)
        startIndex++
        endIndex++
    }
    return sumOfMinMax
}


//------------------------------------
// sum of all sub arrays of size k
// max sum of all sub arrays of size k
// max average of all sub arrays of size k
// max of all sub arrays of size k
// min of all sub arrays of size k
// sum of all max and min of all sub arrays of size k