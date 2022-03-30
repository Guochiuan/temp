package come.cs6310.a5.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRest {
	@GetMapping("/")
	public String sayHello() {
		return "hello aaaa world, time on server is " + LocalDateTime.now();
	}
	

}
