

object FilterArray {

  def main(args: Array[String]){
    val delim : Int = 3
    val arr : List[Int] = List(10,9,8,2,7,5,1,3,0)
    val output = f(delim, arr)
    //expect List(2,1,0)
    println("done " + output) 
  }

def f(delim:Int,arr:List[Int]):List[Int] =  arr.filter(_ < delim)

  

    


}

