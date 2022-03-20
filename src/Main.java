public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int index = service.calculate();

        System.out.println(index);
    }

}
