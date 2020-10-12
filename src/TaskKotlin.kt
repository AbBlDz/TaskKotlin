fun main(args: Array<String>) {

    val wordsList: List<String> = if (args.isEmpty())
        readLine().toString()
                .split(" ")
                .toList()
    else
        args.toList()

    val sortedWordsList = wordsList.sorted()

    val wordsMap = sortedWordsList.groupingBy { it.toString() }.eachCount()

    val sortedMap = wordsMap.toList().sortedByDescending { it.second}.toMap()

    sortedMap.forEach { element ->
        println(" ${element.key} - ${element.value}") }
}
