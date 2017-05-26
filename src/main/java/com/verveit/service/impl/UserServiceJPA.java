package com.verveit.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verveit.data.UserDTO;
import com.verveit.service.UserService;
import com.verveit.springdata.dao.UserRepoJPA;
import com.verveit.springdata.domain.UserJPA;

@Service
public class UserServiceJPA implements UserService {

	@Autowired
	UserRepoJPA repo;

	@Override
	public UserDTO getUser(String userName) {
		List<UserJPA> users = repo.findByUserName(userName);
		return convertToDTO((users != null ? users.get(0) : null));
	}

	@Override
	public List<UserDTO> getUsers() {
		List<UserJPA> users = repo.findAll();
		List<UserDTO> result = users.stream().map(entity -> convertToDTO(entity)).collect(Collectors.toList());
		return result;
	}

	private UserDTO convertToDTO(UserJPA user) {
		if (user == null) {
			return null;
		}
		UserDTO result = new UserDTO();
		result.setUserId(user.getId().toString());
		result.setUserName(user.getUserName());
		result.setFirstName(user.getFirstName());
		result.setLastName(user.getLastName());
		return result;
	}


}
