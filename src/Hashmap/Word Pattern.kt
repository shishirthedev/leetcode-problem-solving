package Hashmap

fun main() {
    print(wordPattern(pattern = "abba", s = "dog cat cat dog"))
}

fun wordPattern(pattern: String, s: String): Boolean {
    val sSplit = s.split(" ")
    if(pattern.length != sSplit.size) return false
    val map: HashMap<Char, String> = hashMapOf()
    for ((index, char) in pattern.withIndex()) {
        val str = sSplit[index]
        if (map.containsKey(char)) {
            if (map.getValue(char) != str) return false
        } else {
            if (map.values.contains(str)) return false
            map.put(char, str)
        }
    }
    return true
}