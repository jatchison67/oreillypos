package com.innosoft.oreillypos.service;

import com.innosoft.oreillypos.data.model.Invoice;
import com.innosoft.oreillypos.data.repo.InvoiceRepository;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InvoiceService {
@Autowired
    InvoiceRepository invoiceRepository;
    public Map<Long, String> getTenderDetails(Long customer_id){
        List<Invoice> invoices = invoiceRepository.findByCustomerid(customer_id);
        Map<Long, String> tenderMap = new HashMap<>();
        for(Invoice invoice : invoices){
            try {
                tenderMap.put(invoice.getInvoiceid(), invoice.getInvoice_data().getString("type"));
            }
            catch (JSONException ex){
                System.out.println(ex.getMessage());
            }
        }
        return tenderMap;
    }
}
