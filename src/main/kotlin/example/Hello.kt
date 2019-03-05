package example

data class User(val name: String)

fun main(args: Array<String>) {
    // print as object
    console.log(User("kotlin"))

    // println as string
    console.log(User("kotlin").toString())
}
