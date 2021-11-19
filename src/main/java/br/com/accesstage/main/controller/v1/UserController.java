package br.com.accesstage.main.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

	// RESTFULL
	@GetMapping("/{UserId}")
	public UserDto findById(@PathVariable("UserId") String id) {
		
		return UserDto.builder().id(id).build();
	}
	
}
