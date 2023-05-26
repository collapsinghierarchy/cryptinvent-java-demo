import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;

public class CryptInventTestfile {


  public void foo() {
    try {
      Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
    } catch(NoSuchAlgorithmException e) {
      System.out.println("Something is wrong");
    } catch(NoSuchPaddingException ep) {
      System.out.println("Something is wrong");
    }
  }
}