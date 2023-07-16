package com.revajewels.diamondsmanagement.controller;

import com.revajewels.diamondsmanagement.entity.DiamondsEntity;
import com.revajewels.diamondsmanagement.service.DiamondService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/diamonds")
public class DiamondController {

    private final DiamondService diamondService;

    public DiamondController(DiamondService diamondService) {
        this.diamondService = diamondService;
    }

    @GetMapping
    public List<DiamondsEntity> findAllDiamonds() {
        return diamondService.findAllDiamonds();
    }

    @GetMapping("/{id}")
    public Optional<DiamondsEntity> findDiamondsById(@PathVariable("id") Long id) {
        return diamondService.findById(id);
    }

    @PostMapping
    public DiamondsEntity saveDiamond(@RequestBody DiamondsEntity diamondsEntity) {
        return diamondService.saveDiamond(diamondsEntity);
    }

    @PutMapping
    public DiamondsEntity updateDiamond(@RequestBody DiamondsEntity diamondsEntity) {
        return diamondService.updateDiamond(diamondsEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteDiamond(@PathVariable("id") Long id) {
        diamondService.deleteDiamond(id);
    }
}
