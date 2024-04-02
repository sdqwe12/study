package com.mh.restaoi01.canlender;

import com.mh.restaoi01.user.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/calender")
@RequiredArgsConstructor
public class CalenderController {

    private final CalenderService calenderService;

    @PostMapping("")
    public List<Double> findCaloriesPerMonth(@RequestBody UserDto userDto) {

        return calenderService.findCalorieDifferencePerMonth(userDto.getId());
    }



    @PostMapping("/a/{id}")
    public String a(@PathVariable String id){
        System.out.println("컨트롤에서 받는 id ="+id);
        return calenderService.abc(id);
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
