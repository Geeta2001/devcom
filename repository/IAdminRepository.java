package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.Admin;


@Repository
public interface IAdminRepository extends JpaRepository<Admin,Integer>{

}
