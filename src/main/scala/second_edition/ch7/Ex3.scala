package second_edition.ch7

import scala.util.Random.{nextDouble, nextInt, setSeed}


object Ex3 extends App {
  for (i <- 0 until 10) {
    setSeed(i)
    for (i <- 0 until 5) println(nextInt())
  }

  for (i <- 0 until 10) {
    setSeed(i)
    for (j <- 0 until 5) println(nextDouble())
  }
}
