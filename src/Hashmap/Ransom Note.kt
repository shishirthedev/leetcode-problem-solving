package Hashmap

fun main() {
    println(canConstruct(ransomNote = "aa", magazine = "ab"))
}

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val mapOfRansomNote = hashMapOf<Char, Int>()
    val mapOfMagazine = hashMapOf<Char, Int>()

    ransomNote.forEach {
        if (mapOfRansomNote.containsKey(it)) {
            mapOfRansomNote.put(it, mapOfRansomNote.getValue(it) + 1)
        } else mapOfRansomNote.put(it, 1)
    }
    magazine.forEach {
        if (mapOfMagazine.containsKey(it)) {
            mapOfMagazine.put(it, mapOfMagazine.getValue(it) + 1)
        } else mapOfMagazine.put(it, 1)
    }

    for ((char, count) in mapOfRansomNote) {
        if (mapOfMagazine.containsKey(char).not()) return false
        if (count > mapOfMagazine.getValue(char)) return false
    }
    return true
}