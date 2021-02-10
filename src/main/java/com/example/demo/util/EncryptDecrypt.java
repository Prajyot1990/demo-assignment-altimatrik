package com.example.demo.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.example.demo.entity.TaskData;
import com.google.gson.Gson;

public class EncryptDecrypt {

	public static String encrypt(String key,String value) {
        try {
            IvParameterSpec iv = new IvParameterSpec("RandomInitVector".getBytes(StandardCharsets.UTF_8));
            SecretKeySpec skeySpec = new
                    SecretKeySpec(key
                    .getBytes(StandardCharsets.UTF_8), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(value.getBytes());
            byte[] original = Base64.getEncoder().encode(encrypted);
            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
	
	public static String decrypt(String key,String encrypted) {
	        try {
	            IvParameterSpec iv = new IvParameterSpec("RandomInitVector"
	                    .getBytes(StandardCharsets.UTF_8));
	            SecretKeySpec skeySpec = new SecretKeySpec(key.
	                    getBytes(StandardCharsets.UTF_8), "AES");

	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
	            byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));
	            return new String(original);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        return null;
	    }
public static void main(String[] args) {
	/* String key = "Bar12345Bar12345"; // 128 bit key
    // String initVector = "RandomInitVector"; // 16 bytes IV
	 TaskData d=new TaskData();
	 d.setDescription("Assignment should inspring boot mysql java and maven");
	 d.setId(123l);
	 d.setTaskName("Interview Assignment");
	 d.setCreatedAt(new Date());
	 d.setExpiredAt(new Date());
	 Gson gson = new Gson(); 
	 gson.toJson(d);
			

     System.out.println(
             encrypt(key, gson.toJson(d)));*/
}
}
