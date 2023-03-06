fun main(args: Array<String>) {

    plusMinus(arrayOf(-4 ,3 ,-9 ,0 ,4 ,1))
}



fun plusMinus(arr: Array<Int>): Unit {
    val arraySize = arr.size.toDouble()

    var pozitive = 0
    var negative = 0
    var zero = 0

    for(number in arr){
        if(number<0){
            negative++
        }else if(number>0){
            pozitive++
        }else{
            zero++
        }
    }

    println(pozitive/arraySize)
    println(negative/arraySize)
    println(zero/arraySize)
}