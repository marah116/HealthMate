package com.example.healthmate;


import java.util.ArrayList;
import java.util.List;

public class MockupData {

    public static List<String> loadCenters(NutritionCentersActivity context) {
        List<String> centersList = new ArrayList<>();
        centersList.add("Healthy Life Center");
        centersList.add("Fit Nutrition Hub");
        centersList.add("Wellness Nutrition Center");
        return centersList;
    }
    public static Center getCenterDetails(String centerName) {
        switch (centerName) {
            case "Healthy Life Center":
                return new Center("Healthy Life Center",
                        "A center dedicated to providing healthy nutrition and personalized plans.",
                        "+1234567890",
                        "8:00 AM - 6:00 PM",
                        "Ramallah, Palestine",
                        "Healthy eating workshops, Personal nutrition plans, Weight management programs");

            case "Fit Nutrition Hub":
                return new Center("Fit Nutrition Hub",
                        "Focuses on fitness-based nutrition with workshops and diet consultations.",
                        "+9876543210",
                        "9:00 AM - 7:00 PM",
                        "Bethlehem, Palestine",
                        "Fitness nutrition, Diet consultation, Meal planning, Supplement guidance");

            case "Wellness Nutrition Center":
                return new Center("Wellness Nutrition Center",
                        "Providing comprehensive wellness services including nutrition and lifestyle advice.",
                        "+1122334455",
                        "10:00 AM - 8:00 PM",
                        "Hebron, Palestine",
                        "Wellness and lifestyle coaching, Stress management, Group nutrition sessions");

            default:
                return null;
        }
    }


    public static List<Gym> getGyms() {
        List<Gym> gyms = new ArrayList<>();

        gyms.add(new Gym("Powerhouse Gym",
                "Location: Ramallah, Al-Masyoun\n" +
                        "Phone: +970 2 2987654\n" +
                        "Hours: Open Daily 10:00 AM - 12:00Am\n" +
                        "Men’s Hours: Daily 7:00 PM - 12:00 AM\n" +
                        "Women’s Hours: Daily 10:00 AM - 6:00 PM\n" +
                        "Features:\n" +
                        "- State-of-the-art equipment\n" +
                        "- Experienced personal trainers\n" +
                        "- Variety of fitness classes (spinning, Zumba, etc.)\n" +
                        "- Sauna and steam room access",
                R.drawable.gym1));

        gyms.add(new Gym("Fit Nation",
                "Location: Nablus, Rafidia\n" +
                        "Phone: +970 9 2345678\n" +
                        "Hours: Mon-Fri 6:00 AM - 10:00 PM, Sat 8:00 AM - 8:00 PM\n" +
                        "Men’s Hours: Mon-Fri 6:00 AM - 2:00 PM\n" +
                        "Women’s Hours: Mon-Fri 2:00 PM - 10:00 PM, Sat 10:00 AM - 6:00 PM\n" +
                        "Features:\n" +
                        "- Yoga and Pilates classes\n" +
                        "- Full cardio and weight room\n" +
                        "- Nutritional counseling\n" +
                        "- Locker rooms and showers",
                R.drawable.gym2));

        gyms.add(new Gym("Elite Fitness",
                "Location: Hebron, Al-Salam Street\n" +
                        "Phone: +970 2 2256789\n" +
                        "Hours: Mon-Fri 5:00 AM - 11:00 PM, Sun closed\n" +
                        "Men’s Hours: Mon-Fri 5:00 AM - 3:00 PM\n" +
                        "Women’s Hours: Mon-Fri 3:00 PM - 11:00 PM\n" +
                        "Features:\n" +
                        "- Personal training programs\n" +
                        "- Advanced strength training equipment\n" +
                        "- Indoor track and pool\n" +
                        "- Wellness center with massages",
                R.drawable.gym3));

        gyms.add(new Gym("BodyShape Gym",
                "Location: Bethlehem, Beit Jala\n" +
                        "Phone: +970 2 2767890\n" +
                        "Hours: Daily 6:00 AM - 10:00 PM\n" +
                        "Men’s Hours: 6:00 AM - 4:00 PM\n" +
                        "Women’s Hours: 4:00 PM - 10:00 PM\n" +
                        "Features:\n" +
                        "- Comprehensive weight loss programs\n" +
                        "- Customized workout plans\n" +
                        "- Free initial fitness consultation\n" +
                        "- Childcare center",
                R.drawable.gym4));

        gyms.add(new Gym("Muscle Factory",
                "Location: Gaza City, Al-Rimal\n" +
                        "Phone: +970 8 2889012\n" +
                        "Hours: Mon-Sat 6:00 AM - 10:00 PM, Sun 8:00 AM - 5:00 PM\n" +
                        "Men’s Hours: Mon-Sat 6:00 AM - 2:00 PM\n" +
                        "Women’s Hours: Mon-Sat 2:00 PM - 10:00 PM, Sun 10:00 AM - 5:00 PM\n" +
                        "Features:\n" +
                        "- Specialized bodybuilding programs\n" +
                        "- Nutritional supplements available\n" +
                        "- On-site physio and recovery services\n" +
                        "- Annual bodybuilding competitions",
                R.drawable.gym5));

        return gyms;
    }




    public static List<String> getDietPlans() {
        List<String> dietPlans = new ArrayList<>();
        dietPlans.add("Weight Gain Plan - High-calorie meals");
        dietPlans.add("Weight Loss Plan - Low-calorie meals");
        dietPlans.add("Muscle Building Plan - Protein-rich meals");
        dietPlans.add("Healthy Lifestyle Plan - Balanced diet");
        dietPlans.add("Detox Plan - Cleansing meals");
        return dietPlans;
    }



    public static List<FoodItem> getFoodItems() {
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new FoodItem("Apple", 0.95));
        foodItems.add(new FoodItem("Banana", 1.05));
        foodItems.add(new FoodItem("Chicken Breast", 1.65));
        foodItems.add(new FoodItem("Rice (1 cup)", 2.00));
        foodItems.add(new FoodItem("Egg (1 medium)", 1.40));
        return foodItems;
    }
}

