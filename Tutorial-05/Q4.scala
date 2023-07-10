import scala.io.StdIn

object findEven{

    def main(args: Array[String]): Unit = {
        printf("Enter a Number:")
        val n=scala.io.StdIn.readInt()

        IsEven(n)
        
    }
    def IsEven(x:Int):Unit={
        x%2 match
            case 0=>println("Even Number")
            case 1: Int =>IsOdd(x) 
        
    }
    def IsOdd(t:Int):Unit={

        println("Odd Number")

    }
}