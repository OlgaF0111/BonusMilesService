public class BonusMilesService {
    public int calculate(int cost) {  // не понимаю смысла int cost?
        // почему нельзя было в параметрах перечислить price и bonus?
        int price = 10_000;
        int bonus = 20;
        int miles = (price / bonus);

        return miles;
    }
}
