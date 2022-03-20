public class BmiService {
    public int calculate() {
        int weight = 77; // Масса в кг
        double height = 1.70; // Рост в метрах
        double index = weight / (height * height);
        return (int) index;
    }
}
