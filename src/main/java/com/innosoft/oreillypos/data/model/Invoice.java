package com.innosoft.oreillypos.data.model;

import com.innosoft.oreillypos.converters.JSONObjectConverter;
import jakarta.persistence.*;
import lombok.Data;
import org.json.JSONObject;

@Entity
@Data
@Table(name = "invoice")
public class Invoice {
    @Id
    private long customer_id;
    private long invoice_id;
    @Column(columnDefinition = "TEXT")
    @Convert(converter= JSONObjectConverter.class) //Convert string to JSON
    private JSONObject invoice_data;
}
