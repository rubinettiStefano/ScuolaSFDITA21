package implementazioni;

import interfacce.Cypher;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class CriptatoreAES implements Cypher {
    SecretKey chiave = generateKey();
    private static final String ALGO = "AES/GCM/NoPadding";
    private static final int TAG_LENGTH_BIT = 128; // Lunghezza del tag di autenticazione
    private static final int IV_LENGTH_BYTE = 12;  // Lunghezza standard per GCM

    byte[] iv = new byte[IV_LENGTH_BYTE];

    public CriptatoreAES() {
        new java.security.SecureRandom().nextBytes(iv);
    }

    private SecretKey generateKey() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(256);
            return keyGen.generateKey();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }

    }

    public String cripta(String chiaro) {
        try {
            Cipher cipher = Cipher.getInstance(ALGO);
            GCMParameterSpec spec = new GCMParameterSpec(TAG_LENGTH_BIT, iv);
            cipher.init(Cipher.ENCRYPT_MODE, chiave, spec);

            byte[] cipherText = cipher.doFinal(chiaro.getBytes());
            return Base64.getEncoder().encodeToString(cipherText);
        } catch (Exception e) {
            return null;
        }

    }

    public String decripta(String criptata)  {
        try {
            Cipher cipher = Cipher.getInstance(ALGO);
            GCMParameterSpec spec = new GCMParameterSpec(TAG_LENGTH_BIT, iv);
            cipher.init(Cipher.DECRYPT_MODE, chiave, spec);

            byte[] decodedData = Base64.getDecoder().decode(criptata);
            byte[] plainText = cipher.doFinal(decodedData);
            return new String(plainText);
        } catch (Exception e) {
            return null;
        }
    }
}
