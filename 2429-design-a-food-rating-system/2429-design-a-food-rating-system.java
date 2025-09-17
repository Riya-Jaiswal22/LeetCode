class FoodRatings {
    Map<String, Integer> foodRating;
    Map<String, String> foodCuisine;
    Map<String, TreeSet<String>> cuisineFood;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodRating = new HashMap<>();
        foodCuisine = new HashMap<>();
        cuisineFood = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            foodRating.put(food, rating);
            foodCuisine.put(food, cuisine);
            Comparator<String> cmp = (a, b) -> {
                int r1 = foodRating.get(a);
                int r2 = foodRating.get(b);
                if (r1 != r2) return r2 - r1; 
                return a.compareTo(b);
            };
            cuisineFood.computeIfAbsent(cuisine, k -> new TreeSet<>(cmp))
                       .add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisine.get(food);
        TreeSet<String> set = cuisineFood.get(cuisine);

        set.remove(food);
        foodRating.put(food, newRating);
        set.add(food);
    }

    public String highestRated(String cuisine) {
        return cuisineFood.get(cuisine).first();
    }
}


/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */