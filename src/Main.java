public class Main {
    public static void main(String[] args) {

        int[] sales = {100, 200, 105, 500, 150, 400};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println("Обрезанное среднее = " + salesManager.stat());

    }
}
