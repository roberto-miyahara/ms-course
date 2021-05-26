package com.mspoc.payroll.services;

import com.mspoc.payroll.entities.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    public Payment getPayment(long workerId, int days){
        return new Payment("Bob", 200.0, days);
    }
}
