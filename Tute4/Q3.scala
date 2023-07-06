import scala.compiletime.ops.string
object Q3 {
  def main(args: Array[String]): Unit = {

    println(formatNames("Benny", toUpper));
    println(formatNames("Ni", toUpper) + formatNames("roshan", toLower));
    println(formatNames("Saman", toLower));
    println(
      formatNames("K", toUpper) + formatNames("umar", toLower) + formatNames(
        "a",
        toUpper
      )
    );

  }

  def toUpper(x: String): String = {
    x.toUpperCase();
  }
  def toLower(x: String): String = {
    x.toLowerCase();
  }
  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }

}
