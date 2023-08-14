import scala.compiletime.ops.string
object Q3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))
    println(formatNames("Ni", toUpper) + formatNames("roshan", toLower))
    println(formatNames("Saman", toLower))
    println(
      formatNames("K", toUpper) + formatNames("umar", toLower) + formatNames("a", toUpper)
    )
  }

  val toUpper: String => String = x => x.toUpperCase
  val toLower: String => String = x => x.toLowerCase
  val formatNames: (String, String => String) => String = (name, formatter) => formatter(name)
}
