package com.godcoder.myhome.repository;

import com.godcoder.myhome.model.Board;
import com.godcoder.myhome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
