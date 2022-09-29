package org.inaes.av;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
@RequestMapping("/asambleas-virtuales")
public class AsambleasVirtualesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsambleasVirtualesApplication.class, args);
	}

	@GetMapping("/ejemplo")
	public @ResponseBody String pruebaController() {
		return "Hola, este es un ejemplo de un rest controller";
	}

	

}
