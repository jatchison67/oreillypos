package com.innosoft.oreillypos.data.repo;

import com.innosoft.oreillypos.data.model.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    List<Invoice> findByCustomerid(Long id);
}
