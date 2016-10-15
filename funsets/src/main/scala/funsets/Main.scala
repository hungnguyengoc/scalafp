package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  // my test
  /*val s = Set(1, 2, 3, 4, 5, 6)
  print("S = ")
  printSet(s)

  def f(x: Int) = x % 2 == 0
  def f1(x: Int) = x > 0

  println(forall(s, f))
  println(forall(s, f1))

  val p = Set(5, 6, 7, 8)
  print("P = ")
  printSet(p)

  val t = diff(s, s)
  print("T = ")
  printSet(t)

  print("Union S and P = ")
  printSet(union(s, p))

  print("Interset S and P = ")
  printSet(intersect(s, p))

  print("Map S x -> x + 1 : ")
  printSet(map(s, x => x + 1))*/

}
