object HelloWorldNTimes {


  def main(args: Array[String]){
       f(3)
  }




def f(n : Int) ={

  val stringToRepeat = "Hello World"

  1 to n foreach {_ => println(stringToRepeat)}

}

   

}
