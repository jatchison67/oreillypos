package com.innosoft.oreillypos.converters;

import jakarta.persistence.AttributeConverter;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONObjectConverter implements AttributeConverter<JSONObject, String> {
    @Override
    public String convertToDatabaseColumn(JSONObject jsonData) {
        String json;
        try{
            json = jsonData.toString();
        }
        catch (NullPointerException ex)
        {
            json = "";
        }
        return json;
    }
    @Override
    public JSONObject convertToEntityAttribute(String jsonDataAsJson) {
        JSONObject jsonData;
        try {
            jsonData = new JSONObject(jsonDataAsJson);
        } catch (JSONException ex) {
            jsonData = null;
        }
        return jsonData;
    }


}
