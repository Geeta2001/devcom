package com.devcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devcom.entity.Feed;

@Repository
public interface IFeedRepository extends JpaRepository<Feed,Integer>{


}
