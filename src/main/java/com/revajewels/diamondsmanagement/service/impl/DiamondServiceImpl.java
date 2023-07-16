package com.revajewels.diamondsmanagement.service.impl;

import com.revajewels.diamondsmanagement.entity.DiamondsEntity;
import com.revajewels.diamondsmanagement.repository.DiamondRepository;
import com.revajewels.diamondsmanagement.service.DiamondService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiamondServiceImpl implements DiamondService {

    private final DiamondRepository diamondRepository;

    public DiamondServiceImpl(DiamondRepository diamondRepository) {
        this.diamondRepository = diamondRepository;
    }

    @Override
    public List<DiamondsEntity> findAllDiamonds() {
        return diamondRepository.findAll();
    }

    @Override
    public Optional<DiamondsEntity> findById(Long id) {
        return diamondRepository.findById(id);
    }

    @Override
    public DiamondsEntity saveDiamond(DiamondsEntity diamondsEntity) {
        return diamondRepository.save(diamondsEntity);
    }

    @Override
    public DiamondsEntity updateDiamond(DiamondsEntity diamondsEntity) {
        return diamondRepository.save(diamondsEntity);
    }

    @Override
    public void deleteDiamond(Long id) {
        diamondRepository.deleteById(id);
    }
}
