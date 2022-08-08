package com.example.Depositor.hw2.service;

import com.example.Depositor.hw2.model.Bank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class BankService {

    private List<Bank> bankList;

    public List<Bank> getBankList() {
        return this.bankList;
    }

    public BankService() {
        this.bankList = new ArrayList<>();
        this.bankList.add(new Bank(1, "John", 20000));
        this.bankList.add(new Bank(2, "Jimmy", 210000));
        this.bankList.add(new Bank(3, "Kevin", 220000));
        this.bankList.add(new Bank(4, "Hawk", 230000));
        this.bankList.add(new Bank(5, "James", 240000));
    }

    public Bank createDepositor(Bank Depositor) {
        this.bankList.add(Depositor);
        return Depositor;
    }

    public Bank getDepositor(int id) {
        for (Bank Depositor : this.bankList) {
            if (id == Depositor.getId()) {
                return Depositor;
            }
        }
        return null;
    }

    public Bank updateDepositor(int id, Bank Depositor) {
        for (Bank updatedDepositor : this.bankList) {
            if (id == updatedDepositor.getId()) {
                updatedDepositor.setDollar(Depositor.getDollar());
                updatedDepositor.setName(Depositor.getName());
                return updatedDepositor;
            }
        }
        return null;
    }

    public Bank deleteDepositor(int id){
        for (Bank deletedDepositor : this.bankList){
            if (id == deletedDepositor.getId()){
                this.bankList.remove(deletedDepositor);
                return deletedDepositor;

            }
        }
        return null;
    }
}
