package com.mh.restaoi01.canlender;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;



@Service
@RequiredArgsConstructor
public class CalenderService {

    private final CalenderRepository calenderRepository;

    public List<Double> findCalorieDifferencePerMonth(String id) {
        System.out.println("서비스 id" + id);
        List<Object[]> results = calenderRepository.findCalorieDifferencePerDay(id);
        List<Double> calorieDifferences = new ArrayList<>();

        for (Object[] result : results) {
            Double calorieDifference = (Double) result[0]; // Double 타입으로 캐스팅
            calorieDifferences.add(calorieDifference);
        }

        return calorieDifferences;
    }


//    private static final Logger logger = LoggerFactory.getLogger(CalenderService.class);

//    public List<String> findRecordPermonth(String id) {
//        System.out.println("서비스 id" + id);
//        logger.info("Received id: {}", id);
//
//        List<String> records = calenderRepository.calenderexercisesql(id);
//        List<String> foodrecords = calenderRepository.calenderfoodsql(id);
//        List<String> combineerecords = new ArrayList<>();
//
//        combineerecords.addAll(records);
//        combineerecords.addAll(foodrecords);
//
//        return combineerecords;
//    }



//    public List<String[]> findRecordPermonth(String id) {
//        List<String[]> records = calenderRepository.calenderFKsql(id);
//        records.stream().forEach(strings -> {
//            System.out.println(" 0 = "+strings[0]);
//            System.out.println(" 1 = " +strings[1]);
//        });
//        List<String> foodrecords = calenderRepository.calenderfoodsql(id);
//
//        List<String> combineerecords = new ArrayList<>();
//        combineerecords.addAll(records);
//
//        combineerecords.addAll(foodrecords);
//
//        return records;
//    }

//    public Map<String, Integer> dailyCalorieBalance(String id) {
//        System.out.println("여기오나");
//        Map<String, Double> calorieBalance = new HashMap<>();
//
//
//        List<Object[]> exerciseRecords = calenderRepository.dailyExerciseCalories(id);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//        for (Object[] record : exerciseRecords) {
//            String dateString = dateFormat.format(record[0]);
//            Double exerciseCalories = ((Double) record[1]).doubleValue();
//            calorieBalance.put(dateString, exerciseCalories);
//        }
//
//
//        List<Object[]> mealRecords = calenderRepository.dailyMealCalories(id);
//        for (Object[] record : mealRecords) {
//            String date = (String) record[0];
//            Integer mealCalories = ((BigInteger) record[1]).intValue();
//            System.out.println(date);
//            System.out.println(mealCalories);
//            calorieBalance.put(date, calorieBalance.getOrDefault(date, 0) - mealCalories);
//        }
//
//        return calorieBalance;
//    }
}
