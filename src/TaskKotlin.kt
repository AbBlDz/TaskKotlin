import java.util.*

data class Words(
        val word: String = "",
        val coincidences: Int = 0
)

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

    val wordsList = mutableListOf<Words>()
    var countWords: Int

    for (uniqueElement in uniqueList) {
        countWords = 0;
        for (element in wordsArray) {
            if (uniqueElement == element) {
                countWords++
            }
        }
        wordsList.add(Words(uniqueElement, countWords))
    }

    wordsList.sortWith(compareByDescending { it.coincidences })

    println("\n Output the result: \n")
    wordsList.forEach { element ->
        println(" ${element.word} ${element.coincidences}")
    }
}
