import java.io.File

fun main() {

    val wordsFile: File = File("words.txt")
    wordsFile.createNewFile()
    wordsFile.writeText("") //это строка для того, чтобы при каждом новом запуске функции мэйн очищать файл
    wordsFile.appendText("hello|привет\n")
    wordsFile.appendText("dog|собака\n")
    wordsFile.appendText("cat|кошка\n")

    val readWorldsFile = wordsFile.readLines()

    val listOfDictionary: MutableList<Word> = mutableListOf()
    val counterOfLearnedWords = listOfDictionary.size

    for (i in readWorldsFile) {
        val split = i.split("|")
        listOfDictionary.add(Word(split[0], split[1]))
    }

    println(listOfDictionary)
    println("Количество выученных слов: $counterOfLearnedWords")
}

data class Word (
    val original: String,
    val translate: String,
)