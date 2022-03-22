public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 77; // Масса в кг
        double height = 1.70; // Рост в метрах
        double index = service.calculate(weight, height);

        System.out.println(index);
    }

}
