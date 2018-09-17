package prv.zielony.scala.tutorials

/**
  * Created by zielony on 01.02.16.
  */
object Algorithmics {

  /**
    * The goal of the first exercise is to implement the factorial function defined as:
    *    - for negative numbers (None)
    *    - for zero: 1
    *    - for positive numbers: factorial(n) = n * factorial(n-1)
    */

  def factorial(input: Int): Option[Int] = {
    if (input < 0) {
      None
    } else if (input == 0) {
      Some(1)
    } else {
      Some(input * factorial(input - 1).get)
    }
  }

  /**
    * The goal is to implement a function calculating Fibonacci numbers, defined as:
    *  - for negative numbers: undefined (None)
    *  - for zero: 1
    *  - for one: 2
    *  - for positive numbers: f(n) = f(n-1) + f(n-2)
    */

  def fibonacci(n: Int): Option[Int] = {
    if (n < 0) {
      None
    } else if (n == 0) {
      Some(1)
    } else if (n == 1) {
      Some(2)
    } else {
      Some(fibonacci(n - 1).get + fibonacci(n - 2).get)
    }
  }
}
