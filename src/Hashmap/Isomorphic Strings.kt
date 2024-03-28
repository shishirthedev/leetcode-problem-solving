package Hashmap

fun main() {
    print(isIsomorphic2(s = "foo", t = "egg"))
}

fun isIsomorphic(s: String, t: String): Boolean {
    val charToIndexS: MutableMap<Char, Int> = hashMapOf()
    val charToIndexT: MutableMap<Char, Int> = hashMapOf()
    for (i in s.indices) {
        val charS = s[i]
        val prevIndexOfCharS = charToIndexS.put(charS, i)
        val charT = t[i]
        val prevIndexOfCharT = charToIndexT.put(charT, i)
        if (prevIndexOfCharS != prevIndexOfCharT) return false
    }
    return true
}

fun isIsomorphic2(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val map: MutableMap<Char, Char> = hashMapOf()
    for (i in s.indices) {
        val a = s[i]
        val b = t[i]
        if (map.containsKey(a)) {
            if (map.getValue(a) != b) return false
        } else {
            if (map.values.contains(b)) return false
            map.put(a, b)
        }
    }
    return true
}