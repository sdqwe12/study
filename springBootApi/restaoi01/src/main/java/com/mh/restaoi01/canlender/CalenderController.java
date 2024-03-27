package com.mh.restaoi01.canlender;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/calender")
@RequiredArgsConstructor
public class CalenderController {

    private final CalenderService calenderService;

    @PostMapping("")
    public List<Double> findCaloriesPerMonth(@RequestBody String id) {
        System.out.println("콘트롤러 id"+id);
        return calenderService.findCalorieDifferencePerMonth(id);
    }

//    @PostMapping("")
//    public List<String> findRecord(@RequestBody String id){
//
//        System.out.println("콘트롤러 id"+id);
//
//        List<String> records = calenderService.findRecordPermonth(id);
//        return records;
//    }



//    @PostMapping("id/{id}")
//    public List<String[]> findRecord(@PathVariable String id){
//        System.out.println(id);
//
//        List<String[]> records = calenderService.findRecordPermonth(id);
//        System.out.println(records);
//
//        return records;
//    }



//    @PostMapping("")
//    public List<String> findRecord(@RequestBody String id) {
//        Map<String, Integer> calorieBalanceMap = calenderService.dailyCalorieBalance(id);
//        List<String> calorieBalanceList = new ArrayList<>();
//
//        for (Map.Entry<String, Integer> entry : calorieBalanceMap.entrySet()) {
//            String date = entry.getKey();
//            int balance = entry.getValue();
//            String record = date + ": " + balance;
//            calorieBalanceList.add(record);
//        }
//
//        return calorieBalanceList;
//    }
}
