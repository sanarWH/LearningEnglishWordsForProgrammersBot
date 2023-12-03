import java.io.File

fun main() {

    val wordsFile: File = File("words.txt")
    wordsFile.createNewFile()
    wordsFile.writeText("") //это строка для того, чтобы при каждов новом запуске функции мэйн очищать файл
    wordsFile.appendText("hello привет \n")
    wordsFile.appendText("dog собака\n")
    wordsFile.appendText("cat кошка\n")

    val readWorldsFile = wordsFile.readLines()

    for (i in readWorldsFile) {
        println(i)
    }
}