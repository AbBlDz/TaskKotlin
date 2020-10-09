import java.util.*

fun main(args: Array<String>) {

    // Проверяю были ли получены данные и если данные отсутствуют, принимаю их со стандартного потока ввода
    val wordsArray: Array<String> = if (args.isEmpty())
        readLine().toString()
                .split(" ")
                .toTypedArray()
    else
        args

    val uniqueList = mutableListOf<String>()
    var flagOn: Boolean = true
    for (elm in wordsArray) {
        if (uniqueList.contains(elm)) flagOn = false
        if (flagOn) {
            uniqueList.add(elm)
        }
        flagOn = true
    }

    var wordsList: MutableMap<String, Int> = mutableMapOf()
    var countWords: Int

    for (uniqueElement in uniqueList) {
        countWords = 0;
        for (element in wordsArray) {
            if (uniqueElement == element) {
                countWords++
            }
        }
        wordsList[uniqueElement] = countWords
    }

    wordsList.toList().sortedByDescending { it.second }.toMap()

    println("\n Output the result: \n")
    wordsList.forEach { element ->
        println(" ${element.key} ${element.value}")
    }
}
