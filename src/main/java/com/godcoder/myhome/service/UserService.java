package com.godcoder.myhome.service;

import com.godcoder.myhome.model.Role;
import com.godcoder.myhome.model.User;
import com.godcoder.myhome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User save(User user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword()); // 회원가입을 하여서 전달된 패스워드를 암호화 한다.
        user.setPassword(encodedPassword); // 그리고 암호화한 패스워드를 저장한다.
        user.setEnabled(true); // 이렇게 해서 회원가입된 유저들의 권한을 저장한다.
        Role role = new Role();
        role.setId(1);
        user.getRoles().add(role);
        return userRepository.save(user);
    }

}
