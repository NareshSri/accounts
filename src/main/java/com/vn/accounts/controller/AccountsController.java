package com.vn.accounts.controller;

import com.vn.accounts.model.Accounts;
import com.vn.accounts.model.Customer;
import com.vn.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer){
        Accounts accounts =accountsRepository.findByCustomerId(customer.getCustomerId());
        if (accounts !=null){
            return accounts;
        }else{
            return null;
        }
    }

}
