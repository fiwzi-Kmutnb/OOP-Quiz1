package net.fiwzi.quiz.infrastructure.storages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuoNumber {
   public Map<List<String>,String> get() {
       Map<List<String>,String> data = new HashMap<List<String>,String>();
       data.put(
               List.of("15","51"),
               "เลขคู่แห่งมิตรภาพ"
       );
       data.put(
               List.of("56","65"),
               "เลขเสริมครอบครัว"
       );
       data.put(
               List.of("36","63"),
               "เลขพลังแห่งความรัก"
       );
       data.put(
               List.of("38","83"),
               "เลขเสริมโชคลาภ"
       );
       data.put(
               List.of("67","76"),
               "คู่แห่งความวุ่นวาย"
       );
       data.put(
               List.of("37","73"),
               "คู่แห่งความเครียด"
       );
       data.put(
               List.of("67","76"),
               "คู่แห่งความไม่สมหวังในความรัก"
       );

       return data;

   }
}
