package com.Projects.OnlineBookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projects.OnlineBookStore.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders,Long>{

}
