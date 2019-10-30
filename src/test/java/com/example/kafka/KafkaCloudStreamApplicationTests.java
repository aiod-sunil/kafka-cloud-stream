package com.example.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

@SpringBootTest
class KafkaCloudStreamApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		System.out.println(upper().apply("hello"));
	}

	public static Function<String,String> upper(){
		return  value->value.toUpperCase();
	}
}
