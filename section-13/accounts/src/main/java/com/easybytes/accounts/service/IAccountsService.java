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

    /**
     *
     * @param customerDto Object
     * @return boolean indicating if the update of account details if successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);

    /**
     *
     * @param accountNumber - Long
     * @return boolean indicating if the update of communication status is successful or not
     */
    boolean updateCommunicationStatus(Long accountNumber);


}
