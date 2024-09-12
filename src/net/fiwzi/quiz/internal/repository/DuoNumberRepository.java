package net.fiwzi.quiz.internal.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DuoNumberRepository {
    Map<List<String>,String> duoNumberRepository;
    public DuoNumberRepository(Map<List<String>,String> duoNumberRepository) {
        this.duoNumberRepository = duoNumberRepository;
    }
    public List<String> find(String address) {
        List<String> duoNumberEntity = new ArrayList<String>();
        String value;
        for (List<String> keys : duoNumberRepository.keySet()) {
            if(address.contains(keys.get(0) + "") || address.contains(keys.get(1) + "")) {
//                value = address.contains(keys.get(0)) ? keys.get(0) : keys.get(1);
                duoNumberEntity.add(keys.get(0) + " หรือ " + keys.get(1) + ": " + duoNumberRepository.get(keys));
            }
        }

        return duoNumberEntity;
    }
}
