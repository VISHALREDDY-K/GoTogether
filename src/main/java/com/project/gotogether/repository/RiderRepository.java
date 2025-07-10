package com.project.gotogether.repository;

import com.project.gotogether.entity.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderRepository extends JpaRepository<Rider,String> {
}
