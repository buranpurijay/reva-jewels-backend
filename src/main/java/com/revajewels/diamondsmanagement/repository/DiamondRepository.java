package com.revajewels.diamondsmanagement.repository;

import com.revajewels.diamondsmanagement.entity.DiamondsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiamondRepository extends JpaRepository<DiamondsEntity, Long> {
}
