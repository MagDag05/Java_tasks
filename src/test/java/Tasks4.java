public class Tasks4 {


// Task1
    private static void comparingOfValues(int number, int number2) {


        if (number > number2) {
            System.out.println(number);
                    }
        else {
            System.out.println(number2);
        }

    }
//Task 2
     private static void booleanComparasing(int number3) {

        boolean someCondition = true;


         if (number3 > 0) {
             System.out.println(someCondition);
         }
         else {
             System.out.println("false");
         }
   }

// Task 3
//
//    a)	AND &&
//    public static void main(String[] args) {
//        int i = 40;
//        if (i > 0 && i < 100) {
//                System.out.println(0 < значение i < 100);
//            }
//        }
//    }
//
//    b)	OR ||
//    public static void main(String[] args) {
//        int a = 40;
//        if (a > 0 || a < 100) {
//            System.out.println("a > 0 OR a < 100");
//           }

// Task4
//    public static void main(String[] args) {
//        int number = 7777;
//        int result;
//
//        result = (number > 100) ? (result = 100) : (result = number);
//
//
//    }

//Task5

    public static void ternaryOperator(){

        int a = 2;
        String result = (a < 0 ) ? "a < 0": "a > 0";

    }

//Task 6
    public static void ternaryOperator2() {
        int c = 10;
        int d;

        int result = (c < 100) ? (d=1) : (d=0);
    }
//Task7
    public static void switchOperator() {
        String str = "A";

        switch (str) {
            case "A" :
                System.out.println("A");
                break;
            case "B" :
                System.out.println("B");
                break;
            default:
                System.out.println("C");

        }

    }
//Tasks 8.	Найдите и исправьте ошибки
//    public class Main {
//        public static void main(String[] args) {
//        int num = 77;
//                if (num == 88) {
//                    System.out.println("num > 12” AND “num < 93");
//            }
//        }

////Task 9.	Найдите и исправьте ошибки
//    public class Main {
//        public static void main(String[] args) {
//            int a = 1;
//            int c = a > 0 ? 1 : (-1 + a);
//        }
//    }
//Task 10.	Найдите и исправьте ошибки

//    int k = 10;
//    switch (k) {
//        case  10:
//            System.out.println(10);
//            break;
//        case  11:
//            System.out.println(11);
//            break;
//        case  12:
//            System.out.println(12);
//            break;
//        default:
//            System.out.println("Error");
//    }





//11.	Исправьте код так, чтобы распечатался
//    a)	результат  33.333333333333336,
//    b)	затем результат 33.333332,
//    c)	результат 33.33333206176758,
//    d)	результат  33.0
//            (не создавайте новые переменные).

////    public static void main(String[] args) {
//
//
//        System.out.println((double)100 / 3);
//        System.out.println((float)100 / 3);
//        System.out.println((byte) 100 / 3);
//        System.out.println(Math.round( 100) / 3);
//    }

//    Task 12

    static void isVowelOrNotSwitch(char ch)
    {
        String check = "consonant";
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                check = "vowel";
        }
        System.out.println(check);

    }

    static void vowelOrConsonant (char ch)
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' || ch == 'A' ||
                ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }

    //Task 13
    private static void leapYear(int year) {

            if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");}
            else{
            System.out.println(year + " is not a leap year");
            }

  }
//  Task 14

    private static void numbers(int num, int num2) {

        switch (num % num2) {

            case (0):
                System.out.println(("0"));
                break;
            case (1):
                System.out.println("1");
                break;
            default  : System.out.println("-1");

        }}
//Task 15

        private static void ageRange(int age) {


            String permission = age >18 ? "Drive car" : "Do not drive car";

            System.out.println(permission);


        }





   public static void main(String[] args) {

       comparingOfValues(3333, 9999);
       booleanComparasing(555);
       ternaryOperator();
         leapYear(1600);
         numbers(100,100);
         ageRange(19);
         isVowelOrNotSwitch('E');
        vowelOrConsonant('X');

   }
}
