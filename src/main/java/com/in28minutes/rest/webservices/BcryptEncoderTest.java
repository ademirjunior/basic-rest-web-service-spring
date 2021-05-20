package com.in28minutes.rest.webservices;
//Testing in jenkins
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String encodedString = encoder.encode("1234");
		System.out.println(encodedString);

	}
}
