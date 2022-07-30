fun main(){
    val data = arrayOf(1, 6, 3, 5, 8, 7, 4, 20)
    sortData(data)
}

fun sortData(input: Array<Int>){
    val ranges = 0 until input.size-2
    var temp: Int

    for(i in ranges){
        for(j in ranges){
            if (input[j] > input[j + 1]) {
                temp = input[j]
                input[j] = input[j + 1]
                input[j + 1] = temp
            }
        }
    }

    println(input.joinToString(","))
}