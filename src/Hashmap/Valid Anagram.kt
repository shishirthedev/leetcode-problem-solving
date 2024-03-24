package Hashmap

fun main() {
    print(isAnagram(s = "a", t = "ab"))
}

fun isAnagram(s: String, t: String): Boolean {
    val mapOfS: HashMap<Char, Int> = hashMapOf()
    val mapOfT: HashMap<Char, Int> = hashMapOf()

    for(char in s){
        if(mapOfS.containsKey(char)){
            mapOfS.put(char, mapOfS.getValue(char) + 1)
        }else mapOfS.put(char, 1)
    }
    for(char in t){
        if(mapOfT.containsKey(char)){
            mapOfT.put(char, mapOfT.getValue(char) + 1)
        }else mapOfT.put(char, 1)
    }
    if (mapOfS.size != mapOfT.size) return false
    for(item in mapOfS){
        if(mapOfT.containsKey(item.key).not()) return false
        if(item.value != mapOfT.getValue(item.key)) return false
    }
    return true
}