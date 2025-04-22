package com.example.contacts.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contacts.model.RegisterUserRequestDTO;
import com.example.contacts.repository.UserRepository;
import com.example.contacts.service.UserService;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private Validator validator;

  @Override
  public void register(RegisterUserRequestDTO dto) {
    Set<ConstraintViolation<RegisterUserRequestDTO>> constraintViolations = validator.validate(dto);
    if (constraintViolations.size() != 0) {
      throw new ConstraintViolationException(constraintViolations);
    }

    // todo: cek db
  }

}
