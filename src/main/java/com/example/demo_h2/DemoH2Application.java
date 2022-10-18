package com.example.demo_h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.io.*;

@SpringBootApplication
public class DemoH2Application {

	public static void main(String[] args) {

		SpringApplication.run(DemoH2Application.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() throws IOException {
		// File file = new ClassPathResource("./static/MOCK_DATA.json").getFile();
		// BufferedReader reader = new BufferedReader(new FileReader(file));
		//
		// String s;
		// StringBuilder sb = new StringBuilder();
		// while((s = reader.readLine()) != null){
		// 	sb.append(s);
		// }
		// ObjectMapper mapper = new ObjectMapper();

		// mapper.readValue(sb.toString(), Ingredient[].class);


		// ObjectMapper mapper = new ObjectMapper();
		//
		// Ingredient[] ingredients = mapper.readValue(new ClassPathResource("./static/MOCK_DATA.json").getFile(), Ingredient[].class);
	}

}
