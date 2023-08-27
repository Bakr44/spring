package com.example.week6.Service;

import com.example.week6.Api.ApiExeption;
import com.example.week6.Model.User;
import com.example.week6.Repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetialsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final AuthRepository authRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=authRepository.findUserByUsername(username);
        if (user==null){
            throw new ApiExeption("Wrong username or password");
        }
        return user;
    }
}
