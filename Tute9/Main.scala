class Rational(numerator: Int, denominator: Int) {
  require(denominator != 0, "Denominator cannot be zero")

  private val gcdValue: Int = gcd(numerator.abs, denominator.abs)
  val numer: Int = numerator / gcdValue
  val denom: Int = denominator / gcdValue

  def neg: Rational = new Rational(-numer, denom)


  def sub(subNumPrevious: Rational): Rational = {
    val newNumer = (this.numer * subNumPrevious.denom) - (subNumPrevious.numer * this.denom)
    val newDenom = this.denom * subNumPrevious.denom
    new Rational(newNumer, newDenom)
  }

  override def toString: String = s"$numer/$denom"

  // Helper function to find the greatest common divisor (gcd)
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}



