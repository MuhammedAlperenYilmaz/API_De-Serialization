package testDataRepository;

import java.util.HashMap;
import java.util.Map;

public class JsonPlaceHolderTestData {
    public int successStatusCode = 200;

    public Map createRequestBodyMap() {
        Map<String, Object> requestBodyMap = new HashMap<>();
        requestBodyMap.put("title", "Ahmet");
        requestBodyMap.put("body", "Merhaba");
        requestBodyMap.put("userId", 10.0);
        requestBodyMap.put("id", 70.0);
        return requestBodyMap;
    }
}
