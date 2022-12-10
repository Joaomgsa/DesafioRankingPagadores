package services;

import java.util.Map;
import java.util.TreeMap;

public class PaymentService {

    public int sumOfPayments(Map<String,Integer> map){
        int sum = 0;
        for(String key : map.keySet()){
            sum += map.get(key);
        }
        return sum;
    }
}
