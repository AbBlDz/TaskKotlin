import java.util.*

data class Words(
        val word: String = "",
        val coincidences: Int = 0
)

fun main(args: Array<String>){

    // Implementation of getting text from stdin
    val wordsArray: Array<String> = if (args.isEmpty())
        readLine().toString().split(" ").toTypedArray()
    else
        args

    //Search for unique values
    val uniqueList = mutableListOf<String>()
    var flagOn: Boolean = true
    for(elm in wordsArray){
        if (uniqueList.contains(elm)) flagOn = false
        if(flagOn){
            uniqueList.add(elm)
        }
        flagOn = true
    }

    //Counting words in a list
    val wordsList = mutableListOf<Words>()
    var countWords: Int

    for(unqElm in uniqueList){
        countWords = 0;
        for (elm in wordsArray){
            if (unqElm == elm) {
                countWords++
            }
        }
        wordsList.add(Words(unqElm, countWords))
    }

    //Sort by word count
    wordsList.sortWith(compareByDescending{it.coincidences})

    // OutPut
    println("\n Output the result: \n")
    wordsList.forEach { elm ->
        println(" ${elm.word} ${elm.coincidences}")
    }
}
