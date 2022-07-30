fun main(){
    val data = arrayOf(10, 33, 13, 72, 44, 51, 17)
    evenOddIndex(data)
}

fun evenOddIndex(data: Array<Int>) {
    val temp = data.toMutableList()
    for(i in 0 until temp.size-1){
        if(i%2==0)
            temp[i]+=temp[i+1]
        else
            temp[i]-=temp[i+1]
    }

    temp.removeLast()
    println(temp.joinToString(","))
}
