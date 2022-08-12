package com.example.Depositor.hw2.controller;

import com.example.Depositor.hw2.model.Depositor;
import com.example.Depositor.hw2.service.DepositorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/depositor")
//http://localhost:8080/depositor
public class DepositorController {
    @Autowired
    private DepositorService depositorService;

    @GetMapping()
    public List<Depositor> getAllDepositor() {
        return this.depositorService.getBankList();
    }

    @GetMapping("/{id}")
    public Depositor getDepositor(@PathVariable int id) {
        Depositor getedDepositor = this.depositorService.getDepositor(id);
        return getedDepositor;
    }

    @PostMapping()
    public Depositor createDepositor(@RequestBody Depositor depositor) {
        Depositor createdDepositor = this.depositorService.createDepositor(depositor);
        return createdDepositor;
    }

    @PutMapping("/{id}")
    public Depositor updateDepositor(@PathVariable int id, @RequestBody Depositor depositor) {
        Depositor updatedDepositor = this.depositorService.updateDepositor(id, depositor);
        return updatedDepositor;
    }

    @DeleteMapping("/{id}")
    public Depositor deletedDepositor(@PathVariable int id) {
        Depositor deletedDepositor = this.depositorService.deleteDepositor(id);
        return deletedDepositor;
    }
}




