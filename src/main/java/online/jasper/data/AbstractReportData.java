package online.jasper.data;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public abstract class AbstractReportData {

    public Map<String, Object> paramsToMap() {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.convertValue(this, Map.class);
        return map;
    }
}
