package com.company;

public class Cipher {

    private String msg;
    private int key;
    private String decryption = "";
    private String encryption = "";
    private char e;
    private char d;

    public Cipher(String message, int shift) {
        msg = message;
        key = shift;
        encrypt();
    }

    public String encrypt() {
        for(int x = 0; x < msg.length(); x++) {
            e = (char)(msg.charAt(x) + key);
            if (e > 'z')
                encryption += (char)(msg.charAt(x) - (26 - key));
            else
                encryption += (char)(msg.charAt(x) + key);
        }
        return encryption;
    }

    public String decrypt() {
        for(int x = 0; x < encryption.length(); x++) {
            d = (char)(encryption.charAt(x) - key);
            if (d < 'a')
                decryption += (char)(encryption.charAt(x) + (26 - key));
            else
                decryption += (char)(encryption.charAt(x) - key);
        }
        return decryption;
    }
}