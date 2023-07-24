object Q1 {
  def caesarEncrypt(plaintext: String, shift: Int): String = {
    val encryptedText = plaintext.map { char =>

      val base = if (char.isUpper) 'A' else 'a'
      val shiftedChar = ((char - base + shift) % 26 + base).toChar
      shiftedChar
    }

    encryptedText;
  }

  def caesarDecrypt(ciphertext: String, shift: Int): String = {
    caesarEncrypt(ciphertext, -shift)
  }

  def chipperGetData(): String = {
    println("Enter Text");
    val plaintext = scala.io.StdIn.readLine()
    println("Enter Shifts");
    val shift = scala.io.StdIn.readInt()

    println("Do you want to Encrypt or Decrypt?");

    println("Press 1 to Encrypt or 2 to Decrypt");
    val userInput = scala.io.StdIn.readInt() match {
      case 1 => caesarEncrypt(plaintext, shift)
      case _ => caesarDecrypt(plaintext, shift)
    }
    userInput;
  }

  def main(args: Array[String]): Unit = {
    println(chipperGetData());
  }
}
