package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    // my test balance
    /*val str = "())("
    val chars = str.toList
    println(balance(chars))

    val coins = List(1, 2)
    println(countChange(4, coins))*/
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {

    //recursion version
    /*if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)*/

    // recursion with tail recursion version
    val k = if (c > r / 2) c else r - c

    @tailrec
    def loop(i: Int, result: Int): Int = {
      if (i == k + 1) result
      else loop(i + 1, result * (r - k + i) / i)
    }

    loop(1, 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def loop(count: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty)
        if (count == 0) true else false
      else if (chars.head.equals(')'))
        if (count == 0) false else loop(count - 1, chars.tail)
      else {
        if (chars.head.equals('(')) loop(count + 1, chars.tail)
        else loop(count, chars.tail)
      }
    }

    loop(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0) 0
    else if (coins.isEmpty)
      if (money == 0) 1 else 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }

}
