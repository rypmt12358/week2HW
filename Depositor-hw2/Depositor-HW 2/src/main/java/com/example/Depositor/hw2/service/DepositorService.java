package com.example.Depositor.hw2.service;

import com.example.Depositor.hw2.model.Depositor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class DepositorService {

    private List<Depositor> bankList;

    public List<Depositor> getBankList() {
        return this.bankList;
    }

    public DepositorService() {
        this.bankList = new ArrayList<>();
        this.bankList.add(new Depositor(1, "John", 20000));
        this.bankList.add(new Depositor(2, "Jimmy", 210000));
        this.bankList.add(new Depositor(3, "Kevin", 220000));
        this.bankList.add(new Depositor(4, "Hawk", 230000));
        this.bankList.add(new Depositor(5, "James", 240000));
    }

    public Depositor createDepositor(Depositor Depositor) {
        this.bankList.add(Depositor);
        return Depositor;
    }

    public Depositor getDepositor(int id) {
        for (com.example.Depositor.hw2.model.Depositor Depositor : this.bankList) {
            if (id == Depositor.getId()) {
                return Depositor;
            }
        }
        return null;
    }

    public Depositor updateDepositor(int id, Depositor Depositor) {
        for (com.example.Depositor.hw2.model.Depositor updatedDepositor : this.bankList) {
            if (id == updatedDepositor.getId()) {
                updatedDepositor.setDollar(Depositor.getDollar());
                updatedDepositor.setName(Depositor.getName());
                return updatedDepositor;
            }
        }
        return null;
    }

    public Depositor deleteDepositor(int id){
        for (Depositor deletedDepositor : this.bankList){
            if (id == deletedDepositor.getId()){
                this.bankList.remove(deletedDepositor);
                return deletedDepositor;

            }
        }
        return null;
    }
}
