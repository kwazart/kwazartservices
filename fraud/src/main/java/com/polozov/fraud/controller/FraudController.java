package com.polozov.fraud.controller;

import com.polozov.fraud.response.FraudCheckResponse;
import com.polozov.fraud.service.FraudCheckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {

    private FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
