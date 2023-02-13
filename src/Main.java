public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000; // почему здесь не указываем вторую переменную про 20р?
        int miles = service.calculate(price); // почему здесь указываем только price?
        System.out.println(miles);
    }
}
