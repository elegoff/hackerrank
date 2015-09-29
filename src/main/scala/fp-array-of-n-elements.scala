object Array_of_n_elements{

  def main(args : Array[String]){
    val output =f(3)
    //expect List(1,2,3)
    println("done " + output)
  }

  def f(num:Int) : List[Int] = (1 to num).toList

}
