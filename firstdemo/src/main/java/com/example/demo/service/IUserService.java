package com.example.demo.service;


import com.example.demo.entity.User;

import lombok.NonNull;

public interface IUserService {
    User update(@NonNull User user);

    User save(@NonNull User user);

    User findById(@NonNull Long id);

    User delById(@NonNull Long id);
}
