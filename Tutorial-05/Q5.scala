import scala.io.StdIn

object EvenAdder{

    def main(args: Array[String]): Unit = {
        println("Enter a Number:")
        val n=scala.io.StdIn.readInt()

        IsEven(n)
        

    }
    def IsEven(x:Int):Unit={
        if (x%2==0)
            addEven(x)
        else
            IsEven(x-1)
        
    }

    def addEven(t:Int):Int={

       val total=t+addEven(t)
       return total
       
    }
    

}