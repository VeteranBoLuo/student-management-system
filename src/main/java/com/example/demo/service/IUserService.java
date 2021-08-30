package com.example.demo.service;


import com.example.demo.entity.User;

import lombok.NonNull;

public interface IUserService {
    User save(@NonNull User user);

}
