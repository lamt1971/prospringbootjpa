package com.verveit.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.verveit.data.UserDTO;
import com.verveit.service.UserService;

@Controller
public class RestController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user/{userName}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody UserDTO getUser(@PathVariable String userName) {
		return userService.getUser(userName);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody List<UserDTO> getUsers() {
		return userService.getUsers();
	}

}
