package net.fiwzi.quiz.internal.repository;

import net.fiwzi.quiz.infrastructure.storages.BirthdayNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BirthdayNumberRepository {
    Map<String,List<Map<List<Integer>, String>>> birthdayNumber;
    public BirthdayNumberRepository(Map<String,List<Map<List<Integer>, String>>> birthdayNumber) {
        this.birthdayNumber = birthdayNumber;
    }
    public List<String> find(String day,int digit) {
        List<String> value = new ArrayList<String>();
        List<Map<List<Integer>, String>> dayGet = birthdayNumber.get(day);
        for (Map<List<Integer>, String> map : dayGet) {
            for (List<Integer> keys : map.keySet()) {
                if (keys.contains(digit)) {
                    value.add(map.get(keys));
                }
            }
        }
        return value;
    }
}
