package com.putaoteng.task4.test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import org.junit.Before;
import org.junit.Test;

import com.putaoteng.task5.utils.MD5Encryption;

public class MD5Test {
	private MD5Encryption md5 = null;
	String encryString = null;
	
	@Before
	public void setUp() throws Exception {
		this.md5 = new MD5Encryption();
	}

	@Test
	public void testEncoderByMd5() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String str = "username";
		
		this.encryString = md5.EncoderByMd5(str);
		System.out.println(encryString);
	}

	@Test
	public void testCheckpassword() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		boolean isEquals = md5.checkpassword("username", "FMSwa4JOxZMjk2JRf1OLKQ==");
		
		System.out.println(isEquals);
	}

}
