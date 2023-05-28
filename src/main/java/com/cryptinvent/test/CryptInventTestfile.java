import javax.crypto.Cipher;
import java.security.Signature;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;

public class CryptInventTestfile {


  public void foo() {
    try {
      Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
      Cipher c1 = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding"); 
      Cipher c2 = Cipher.getInstance("DES/ECB/NoPadding"); 
    
      Signature sig = Signature.getInstance("SHA256withRSA"); 
    } catch(NoSuchAlgorithmException e) {
      System.out.println("Something is wrong");
    } catch(NoSuchPaddingException ep) {
      System.out.println("Something is wrong");
    }
  }
}