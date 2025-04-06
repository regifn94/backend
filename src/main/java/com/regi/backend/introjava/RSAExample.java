package com.regi.backend.introjava;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class RSAExample {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        KeyPair pair = keyGen.generateKeyPair();

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());

        byte[] encrypted = cipher.doFinal("Hello, Kriptografi!".getBytes());
        System.out.println("Encrypted: " + new String(encrypted));

        cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println("Decrypted: " + new String(decrypted));
    }
}
