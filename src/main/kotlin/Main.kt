import java.io.File

fun main() {

    val wordsFile: File = File("words.txt")
    wordsFile.createNewFile()
    wordsFile.appendText("hello привет \n")
    wordsFile.appendText("dog собака")
    wordsFile.appendText("cat кошка")

    wordsFile.readLines()
    println(wordsFile.readLines())

    var wordCount = 2

    while (wordsFile[wordCount] < wordCount){
        println(wordsFile.readLines()[wordCount])
    }
}