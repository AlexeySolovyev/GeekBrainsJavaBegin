public class LogicOperations {
    public static void main(String[] args) {

        int a = 7;
        int b = 10;

        if (a > b) {
            System.out.println(a * b);
        } else {
            System.out.println(a + b);
        }

        //-------------------------------

        int x = 9;
        int y = 9;

        if (x > y) {
            System.out.println("x > y");
        }
        else if (x < y) {
            System.out.println("x < y");
        }
        else {
            System.out.println("x = y");
        }

        //-------------------------------

        int month = 13;
        String monthName;

        switch (month) {
            case 1: monthName = "Январь";
                break;
            case 2: monthName = "Февраль";
                break;
            case 3: monthName = "Март";
                break;
            case 4: monthName = "Апрель";
                break;
            case 5: monthName = "Май";
                break;
            case 6: monthName = "Июнь";
                break;
            case 7: monthName = "Июль";
                break;
            case 8: monthName = "Август";
                break;
            case 9: monthName = "Сентябрь";
                break;
            case 10: monthName = "Октябрь";
                break;
            case 11: monthName = "Ноябрь";
                break;
            case 12: monthName = "Декабрь";
                break;
            default: monthName = "Не знаем такого месяца!";

        }
        System.out.println(monthName);

        //---------------------------- Тернарный оператор
        int absVal, val;
        val = -7;
         absVal = (val < 0) ? - val : val;
        System.out.println("Модуль числа " + val + " равен: " + absVal);
    }
}
