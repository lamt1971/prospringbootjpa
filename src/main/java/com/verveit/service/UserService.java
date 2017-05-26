package com.verveit.service;

import java.util.List;

public interface UserService {

	public UserDTO getUser(String userName);

	public List<UserDTO> getUsers();

}
