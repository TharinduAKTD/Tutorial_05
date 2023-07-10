import scala.io.StdIn

object Isprime {

    def main(args: Array[String]): Unit = {
        printf("Enter a Number :")
        val n=scala.io.StdIn.readInt()

        println(prime_num(n))

    }
    def prime_num(n:Int):Boolean={
        def prime(t:Int,stillPrime:Boolean):Boolean={
            if (!stillPrime)
                false
            else if (t<=1)
                true
            else
                prime(t-1,n%t != 0 && stillPrime)
        }
        prime(n/2,true)
            

    }
}