import kotlin.reflect.typeOf

fun main() {
    val list = mutableListOf<Any>()
    list.add(2)
    list.add("Carla")
    list.add(2.520)
    list.add("Emilly")

//    list.removeLast()
//    list.removeFirst()

//    list.removeAt(2)
//    list[2] = "Rute"

    list
        .filter {
            when (it) {
                is Int -> {
                    true
                }

                is Double -> {
                    true
                }

                else -> {
                    false
                }
            }
        }
        .forEach { println(it) }
}