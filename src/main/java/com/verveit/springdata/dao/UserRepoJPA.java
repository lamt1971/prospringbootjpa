package com.verveit.springdata.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verveit.springdata.domain.UserJPA;

public interface UserRepoJPA extends JpaRepository<UserJPA, Serializable> {

	public List<UserJPA> findByUserName(String userName);
}
