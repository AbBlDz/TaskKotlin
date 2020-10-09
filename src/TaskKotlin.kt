import java.util.*

fun main(args: Array<String>) {

    // Проверяю были ли получены данные и если данные отсутствуют, принимаю их со стандартного потока ввода
    val wordsArray: Array<String> = if (args.isEmpty())
        readLine().toString()
                .split(" ")
                .toTypedArray()
    else
        args

    val uniqueList: MutableSet<String> = mutableSetOf()
    wordsArray.forEach  {element ->
        uniqueList.add(element)
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
