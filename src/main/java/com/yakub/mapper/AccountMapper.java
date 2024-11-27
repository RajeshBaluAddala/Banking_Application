package com.yakub.mapper;

import com.yakub.dto.AccountDto;
import com.yakub.entity.Account;

public class AccountMapper {

    public static Account mapToAcccount(AccountDto accountDto){
        Account account=new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
                  AccountDto accountDto=new AccountDto(
                          account.getId(),
                          account.getAccountHolderName(),
                          account.getBalance()
                  );
                  return accountDto;
    }
}







