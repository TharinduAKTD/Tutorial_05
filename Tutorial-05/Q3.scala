import scala.io.StdIn

object Sum_Of_Numbers{
    def main(args: Array[String]): Unit = {

        println("Enter a Number:")
        val n=scala.io.StdIn.readInt()

        println(sum(n))

    }
    def sum(x: Int): Int = {

        if (x==1)
            return 1
        else
            val total=x+sum(x-1)
            return total
    }

    

}