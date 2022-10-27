package com.example.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		Moja moja = new MagicMoja();
		System.out.println(moja.pullOut());
	}
}
