package Hashmap

import java.util.*

fun main() {
    print(groupAnagrams(arrayOf("a")))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val groupAnagrams: MutableMap<String, MutableList<String>> = HashMap()
    for (str in strs) {
        val sortedStr = str.toCharArray().sorted().toString()
        if (groupAnagrams.containsKey(sortedStr)) {
            groupAnagrams[sortedStr]?.add(str)
        } else {
            val arr = ArrayList<String>()
            arr.add(str)
            groupAnagrams[sortedStr] = arr
        }
    }
    return ArrayList<List<String>>(groupAnagrams.values)
}