package net.fiwzi.quiz.infrastructure.storages;

import java.util.*;

public class BirthdayNumber {
    public Map<String,List<Map<List<Integer>, String>>> get() {
        Map<String,List<Map<List<Integer>, String>>> value = new HashMap<String,List<Map<List<Integer>, String>>>();
        value.put(
                "วันจันทร์",
                Arrays.asList(
                        Map.of(List.of(2), "เลขประจำวัน"),
                        Map.of(List.of(2, 4, 8), "การงาน"),
                        Map.of(List.of(5), "การเงิน"),
                        Map.of(List.of(6), "ความรัก"),
                        Map.of(List.of(7), "โชคลาภ"),
                        Map.of(List.of(3), "สุขภาพ"),
                        Map.of(List.of(1), "กาลกิณี")

                )
        );
        value.put(
                "วันอังคาร",
                Arrays.asList(
                        Map.of(List.of(3), "เลขประจำวัน"),
                        Map.of(List.of(3, 6, 7), "การงาน"),
                        Map.of(List.of(8), "การเงิน"),
                        Map.of(List.of(1), "ความรัก"),
                        Map.of(List.of(5), "โชคลาภ"),
                        Map.of(List.of(4), "สุขภาพ"),
                        Map.of(List.of(2), "กาลกิณี"))
        );
        value.put(
                "วันพุธกลางวัน",
                Arrays.asList(
                        Map.of(List.of(4), "เลขประจำวัน"),
                        Map.of(List.of(1, 4, 5), "การงาน"),
                        Map.of(List.of(6), "การเงิน"),
                        Map.of(List.of(2), "ความรัก"),
                        Map.of(List.of(8), "โชคลาภ"),
                        Map.of(List.of(7), "สุขภาพ"),
                        Map.of(List.of(3), "กาลกิณี")
                )
        );
        value.put(
                "วันพุธกลางคืน",
                Arrays.asList(
                        Map.of(List.of(8), "เลขประจำวัน"),
                        Map.of(List.of(1, 4, 8), "การงาน"),
                        Map.of(List.of(3), "การเงิน"),
                        Map.of(List.of(7), "ความรัก"),
                        Map.of(List.of(2), "โชคลาภ"),
                        Map.of(List.of(6), "สุขภาพ"),
                        Map.of(List.of(5), "กาลกิณี"))
                );
        value.put(
                "วันพฤหัสบดี",
                Arrays.asList(
                        Map.of(List.of(5), "เลขประจำวัน"),
                        Map.of(List.of(3, 5, 6), "การงาน"),
                        Map.of(List.of(2), "การเงิน"),
                        Map.of(List.of(4), "ความรัก"),
                        Map.of(List.of(1), "โชคลาภ"),
                        Map.of(List.of(8), "สุขภาพ"),
                        Map.of(List.of(7), "กาลกิณี"))
        );
        value.put(
                "วันศุกร์",
                Arrays.asList(
                        Map.of(List.of(6), "เลขประจำวัน"),
                        Map.of(List.of(2, 6, 7), "การงาน"),
                        Map.of(List.of(4), "การเงิน"),
                        Map.of(List.of(5), "ความรัก"),
                        Map.of(List.of(3), "โชคลาภ"),
                        Map.of(List.of(1), "สุขภาพ"),
                        Map.of(List.of(8), "กาลกิณี")
                        )
        );
        value.put(
                "วันเสาร์",
                Arrays.asList(
                        Map.of(List.of(7), "เลขประจำวัน"),
                        Map.of(List.of(2, 7, 8), "การงาน"),
                        Map.of(List.of(1), "การเงิน"),
                        Map.of(List.of(3), "ความรัก"),
                        Map.of(List.of(6), "โชคลาภ"),
                        Map.of(List.of(5), "สุขภาพ"),
                        Map.of(List.of(4), "กาลกิณี")
                )
        );
        value.put(
                "วันอาทิตย์",
                Arrays.asList(
                        Map.of(List.of(1), "เลขประจำวัน"),
                        Map.of(List.of(1, 3, 7), "การงาน"),
                        Map.of(List.of(7), "การเงิน"),
                        Map.of(List.of(8), "ความรัก"),
                        Map.of(List.of(4), "โชคลาภ"),
                        Map.of(List.of(2), "สุขภาพ"),
                        Map.of(List.of(6), "กาลกิณี"))
        );


        return value;
    }
}
