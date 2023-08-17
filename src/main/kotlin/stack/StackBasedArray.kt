package stack

class StackBasedArray<T>(
    private val size:Int
) {
    private var top=-1
    private val myStack:Array<Any?> = arrayOfNulls(size)
    fun push(element:T){
        if (top<size-1){
            top++
            myStack[top]=element
        }else{
            println("stack is full")
        }
    }

    fun pop(){
        top--
    }

    fun isEmpty():Boolean{
//        return myStack.isEmpty() //or
        return top==-1 //or
    }

    fun getTop():Any?{
        return myStack[top]
    }

    fun print(){
        for (i in top downTo 0){
            print(myStack[i].toString()+"-")
        }
        println()
    }
}