

object ListReplication {

  def main(args: Array[String]){
  //def main(args : Array[String]){

    val times =3
    val li = List(1,2,3)
    val output = f(times, li)
    //expect :List(1,1,1,2,2,2,3,3,3)
    println("done " + output)
  }

 def f(num:Int,arr:List[Int]):List[Int] = {
    arr match {
      case Nil => Nil
      case hd::tl => List.fill(num)(hd) ::: f(num, tl)
    }


  }

    


}

