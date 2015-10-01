object EvalEx{

  def main(args : Array[String]){

    val input = List(20.0f, 5.0f, 0.5f, -0.5f)
    val output = input map f
    //expects List(2423600.1887,143.6895,1.6487,0.6065)
    println("done " + output)

  }

  def f(x: Float):Float=
  {   
    // Compute and Return the value of e^x
    val maxloops = 9
    def factorial(n : Int) : Int = {
      n match {
        case 1 => 1
        case _ => n *  factorial(n -1)  
      }
    }

    def exRank( x: Float, n : Int): Float ={
      //compute x^n/n!
      val numer = Math.pow(x,n)
      val denom = factorial(n)
      (numer/denom).toFloat
    }

    def looping(x : Float, rank :Int): Float = {
      if (rank > 0){
        exRank(x, rank) + looping(x, rank  - 1)
      }else{
        1f
      }

    }

    looping(x, maxloops)
  }
}
