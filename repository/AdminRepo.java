package com.springboot.springbootdevapp.adminRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootdevapp.adminEntity.Admin;

public interface AdminRepo extends JpaRepository<Admin,String> {

}
