package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - customerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - input Mobile Number
     * @return Accounts details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);
}
