package task2;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Deal deal1 = new Deal(3, 6, 30);
        Double[] dealArray = new Double[] {deal1.getWidth(), deal1.getLength(), deal1.getPrice()};
//        Deal deal2 = new Deal(1, 2, 10);
//        Deal deal3 = new Deal(5, 3, 20);
//        Deal deal4 = new Deal(8, 4, 50);

        int recommendedPrice = 5;

        Function<Deal, Double[]> makeToArray = new Function<Deal, Double[]>() {
            @Override
            public Double[] apply(Deal deal) {
                Double[] parametersArray = new Double[] {deal.getLength(), deal.getWidth(), deal.getPrice()};
                return new Double[0];
            }
        };

        Function<Double[], Double> calculateDeal = new Function<Double[], Double>() {
            @Override
            public Double apply(Double[] doubles) {
                double value = ((doubles[0] + doubles[1]) / doubles[2]);
                return value;
            }
        };


        Function<Function<Double[], Double>, Boolean> purityOfTheTransaction = new Function<Function<Double[], Double>, Boolean>() {
            @Override
            public Boolean apply(Function<Double[], Double> doubleFunction) {
                return value -> (calculateDeal.apply(dealArray) / recommendedPrice) > 1;
            }
        };



    }
}
