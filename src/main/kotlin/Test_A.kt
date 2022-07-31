fun main(){
    val data = arrayOf(1, 6, 3, 5, 8, 7, 4, 20)
    sortData(data)
}

fun sortData(data: Array<Int>){
    val ranges = 0 until data.size-2

    for(i in ranges){
        for(j in ranges){
            if (data[j] > data[j + 1]) {
                data[j] += data[j+1]
                data[j+1] = data[j]-data[j+1]
                data[j] -= data[j+1]
            }
        }
    }

    println(data.joinToString(","))
}