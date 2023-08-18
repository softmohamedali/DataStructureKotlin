import stack.StackBasedArray

fun main(args: Array<String>) {
    val m=StackBasedArray<String>(3)
    m.push("dsf")
    m.print()
    m.push("r")
    m.print()
    m.push("v")
    println("pop = ${m.getTop()}")
    m.pop()
    m.print()
    m.push("vv")
    m.print()
}