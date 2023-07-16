package com.revajewels.diamondsmanagement.service;

import com.revajewels.diamondsmanagement.entity.DiamondsEntity;

import java.util.List;
import java.util.Optional;

public interface DiamondService {
    List<DiamondsEntity> findAllDiamonds();
    Optional<DiamondsEntity> findById(Long id);
    DiamondsEntity saveDiamond(DiamondsEntity diamondsEntity);
    DiamondsEntity updateDiamond(DiamondsEntity diamondsEntity);
    void deleteDiamond(Long id);
}
