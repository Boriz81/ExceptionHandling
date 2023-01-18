public class Main {
    public static void main(String[] args) {

        try { // Попытка выполнить код заключенный в теле блока из {}
            //int ExceptionHandling = 10 / 0;
            int ExceptionHandling2 = Integer.parseInt("123a");
                                    // Double.parseDouble("123");
        } catch (ArithmeticException e) { // поймать exception (прерывание, исключение)
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Была ошибка в вводе числа");
            System.out.println(e.getCause());
        }
        System.out.println("Exception Handling!");
    }
}