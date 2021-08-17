package com.example.demo.service;


import com.example.demo.entity.User;
import com.example.demo.req.UserSaveReq;
import com.example.demo.req.UserUpdateReq;
import com.example.demo.res.UserBasicRes;
import lombok.NonNull;

public interface IUserService {
    UserBasicRes update(@NonNull UserUpdateReq req);

    UserBasicRes save(@NonNull UserSaveReq req);

    UserBasicRes findById(@NonNull Long id);

    UserBasicRes delById(@NonNull Long id);
}
