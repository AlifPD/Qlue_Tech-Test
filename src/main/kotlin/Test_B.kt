fun main(){
    val data = arrayOf(1, 2, 3, 4, 5, 6)
    multiplyMirrorIndex(data)
}

fun multiplyMirrorIndex(data: Array<Int>) {
    val temp= mutableListOf<Int>()
    for(i in data.indices){
        temp.add(data[i]*data[data.size - i - 1])
    }
    println(temp.joinToString(","))
}
