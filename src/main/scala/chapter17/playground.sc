
class Person(id: Long, firstName: String, lastName: String)
class Student(id: Long, firstName: String, lastName: String) extends Person(id, firstName, lastName)

class Pair[T](first: T, second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair[R](newFirst, second)
}


val pair =  new Pair(new Student(1, "Joe", "Doe"), new Student(2, "George", "Washington"))

pair.replaceFirst(new Person(1, "Arthur", "Clark"))




import scala.util.Failure

class UnsuccessfulResponseException extends Exception
class Cucu extends Exception

def matchTest(x: Any) = {
  x match {

    case Failure(exception: UnsuccessfulResponseException) => 1
    case Failure(exception: Cucu) => 0
    case Failure(exception) => 2
    case _ => 3
  }
}

println(matchTest(Failure(exception = new UnsuccessfulResponseException)))
println(matchTest(Failure(exception = new Cucu)))
println(matchTest(Failure(exception = new Exception )))

