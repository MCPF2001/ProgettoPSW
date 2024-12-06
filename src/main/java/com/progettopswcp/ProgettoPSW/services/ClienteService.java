package com.progettopswcp.ProgettoPSW.services;

import com.progettopswcp.ProgettoPSW.entities.cliente;
import com.progettopswcp.ProgettoPSW.repositories.ClienteRepository;
import com.progettopswcp.ProgettoPSW.support.exceptions.MailUserAlreadyExistsException;
import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AccountingService {
    @Autowired
    private ClienteRepository clienteRepository;


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public cliente registraCliente(cliente c) throws MailUserAlreadyExistsException {
        if (clienteRepository.existsByEmail(c.getEmail()) ) {
            throw new MailUserAlreadyExistsException();
        }
        return clienteRepository.save(c);
   }

    @Transactional(readOnly = true)
     public List<cliente> getAllUsers() {
       return clienteRepository.findAll();
    }


}


