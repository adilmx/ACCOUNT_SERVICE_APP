package com.adilmx.spring_jaxws_app.ws.soap;

import com.adilmx.spring_jaxws_app.entity.Account;
import com.adilmx.spring_jaxws_app.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "AccountWS")
public class AccounTSoapService {

    @Autowired
    private AccountRepo accountRepo;


    @WebMethod
    public Account findById(@WebParam(name = "id") Long id) {
        return accountRepo.findById(id).get();
    }

    @WebMethod
    public List<Account> findAll() {
        return accountRepo.findAll();
    }

    @WebMethod
    public Account save(@WebParam(name = "account") Account account) {
        return accountRepo.save(account);
    }

    @WebMethod
    public int verser(@WebParam(name = "mt") double mt, @WebParam(name = "account") Account account) {
        account.setSolde(account.getSolde() + mt);
        return 1;
    }

    @WebMethod
    public int retirer(@WebParam(name = "mt") double mt,@WebParam(name = "account") Account account) {
        account.setSolde(account.getSolde() - mt);
        return 1;
    }
}
