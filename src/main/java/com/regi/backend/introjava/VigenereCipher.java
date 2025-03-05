package com.regi.backend.introjava;

public class VigenereCipher {
    // Metode untuk enkripsi Vigenère Cipher
    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        key = key.toUpperCase();

        for (int i = 0, j = 0; i < text.length(); i++) {
            char plainChar = text.charAt(i);
            char keyChar = key.charAt(j % key.length());

            // Enkripsi hanya untuk huruf A-Z
            if (plainChar >= 'A' && plainChar <= 'Z') {
                int encryptedChar = ((plainChar - 'A') + (keyChar - 'A')) % 26 + 'A';
                result.append((char) encryptedChar);
                j++; // Hanya geser key jika plaintext adalah huruf
            } else {
                result.append(plainChar); // Jika ada karakter lain (spasi, angka, dll.), tetap sama
            }
        }
        return result.toString();
    }

    // Metode untuk dekripsi Vigenère Cipher
    public static String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        key = key.toUpperCase();

        for (int i = 0, j = 0; i < text.length(); i++) {
            char cipherChar = text.charAt(i);
            char keyChar = key.charAt(j % key.length());

            if (cipherChar >= 'A' && cipherChar <= 'Z') {
                int decryptedChar = ((cipherChar - 'A') - (keyChar - 'A') + 26) % 26 + 'A';
                result.append((char) decryptedChar);
                j++;
            } else {
                result.append(cipherChar);
            }
        }
        return result.toString();
    }

    // Main Method untuk menjalankan program
    public static void main(String[] args) {
        String plaintext = "AMIKOM";
        String key = "YOGYA";

        // Enkripsi
        String encrypted = encrypt(plaintext, key);
        System.out.println("Encrypted: " + encrypted);

        // Dekripsi
        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }
}
