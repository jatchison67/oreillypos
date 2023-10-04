package com.innosoft.oreillypos.api;

import com.innosoft.oreillypos.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class OreillyPosController {
    @Autowired
    private InvoiceService invoiceService;
    @GetMapping("/")
    public Map<Long, String> getTenderDetails(@RequestParam Long customerId){
        return invoiceService.getTenderDetails(customerId);
    }
}
