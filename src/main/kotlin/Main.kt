import java.io.File

fun main() {

    val wordsFile: File = File("words.txt")
    wordsFile.createNewFile()
    wordsFile.writeText("") //это строка для того, чтобы при каждом новом запуске функции мэйн очищать файл
    wordsFile.appendText("hello|привет|1\n")
    wordsFile.appendText("dog|собака|1\n")
    wordsFile.appendText("cat|кошка|1\n")

    val readWorldsFile = wordsFile.readLines()

    val listOfDictionary: MutableList<Word> = mutableListOf()

    for (i in readWorldsFile) {
        val split = i.split("|")
        listOfDictionary.add(Word(split[0], split[1], split[2]))
        listOfDictionary[2] :? 0
    }

    println(listOfDictionary)
}

data class Word (
    val original: String,
    val translate: String,
    val correctAnswersCount: Int? = null
)