package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - customerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
