fun main() {
    val list = mutableListOf<String>()
    list.add("Willian")
    list.add("Carla")

    list.forEach { println(it.substring(0,it.length - 1)) }
}