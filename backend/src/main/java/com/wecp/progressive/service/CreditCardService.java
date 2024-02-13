package com.wecp.progressive.service;


import com.wecp.progressive.entity.CreditCard;
import com.wecp.progressive.repository.CreditCardRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    public List<CreditCard> getAllCreditCards() {
        return creditCardRepository.findAll();
    }

    public CreditCard getCreditCardById(Long id) {
        //return null;
        Optional<CreditCard> cc = creditCardRepository.findById(id);
        return cc.get();
    }

    public CreditCard createCreditCard(CreditCard creditCard) {
        //return null;
        return creditCardRepository.save(creditCard);
    }

    public void updateCreditCard(CreditCard creditCard) {
        creditCardRepository.save(creditCard);
    }

    public void deleteCreditCard(Long id) {
        creditCardRepository.deleteById(id);
    }
}
