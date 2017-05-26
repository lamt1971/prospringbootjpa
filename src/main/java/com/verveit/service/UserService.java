package com.verveit.service;

import java.util.List;

import com.verveit.data.UserDTO;

public interface UserService {

	public UserDTO getUser(String userName);

	public List<UserDTO> getUsers();

}
