object FilterPosition {

    def main(args: Array[String]) {
      

      val li = List(8,15,22,1,10,6,2,18,18,1)
      val output = f(li)

      //expect List(15,1,6,18,1)

      println("done " +li) 
      
    }

  def f(arr:List[Int]):List[Int] = {
    arr.zipWithIndex.filter(_._2 % 2 ==1).map(_._1)
  }

}
