package com.example.Depositor.hw2.controller;

import com.example.Depositor.hw2.model.Bank;
import com.example.Depositor.hw2.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depositor")
//http://localhost:8080/depositor
public class BankController {
    @Autowired
    BankService DepositorService;

    @GetMapping()
    public List<Bank> getAllDepositor() {
        return this.DepositorService.getBankList();
    }

    @GetMapping("/{id}")
    public Bank getDepositor(@PathVariable int id) {
        Bank getedDepositor = this.DepositorService.getDepositor(id);
        return getedDepositor;
    }

    @PostMapping()
    public Bank createDepositor(@RequestBody Bank depositor) {
        Bank createdDepositor = this.DepositorService.createDepositor(depositor);
        return createdDepositor;
    }

    @PutMapping("/{id}")
    public Bank updateDepositor(@PathVariable int id, @RequestBody Bank depositor) {
        Bank updatedDepositor = this.DepositorService.updateDepositor(id, depositor);
        return updatedDepositor;
    }

    @DeleteMapping("/{id}")
    public Bank deletedDepositor(@PathVariable int id) {
        Bank deletedDepositor = this.DepositorService.deleteDepositor(id);
        return deletedDepositor;
    }
}




