import java.util.Scanner;

public class Main {
    public static String calc(String input){
        Num calc;
        String[] arr = input.split(" ");
        if (arr.length != 3) throw new IllegalArgumentException("Неправильно введено выражение.");


        try {

            if ((Integer.parseInt(arr[0]) > 10 || Integer.parseInt(arr[2]) > 10 )|| (Integer.parseInt(arr[0]) < 0 || Integer.parseInt(arr[2]) < 0)){
                throw new IllegalArgumentException("Введите цифры от 1 до 10");}



            calc = new Num(Integer.parseInt(arr[0]), Integer.parseInt(arr[2]));




        } catch (NumberFormatException e) {
            int j = 1;
            boolean firstRomanFound = false;
            boolean secondRomanFound = false;

            while (j < 11 || (firstRomanFound == false && secondRomanFound == false)) {
                if (arr[0].equals(RomNum.getRoman()[j])) {
                    firstRomanFound = true;
                }
                if (arr[2].equals(RomNum.getRoman()[j])) {
                    secondRomanFound = true;
                }
                j++;
            }

            if (firstRomanFound == true && secondRomanFound == true) {
                calc = new RomNum(arr[0], arr[2]);
            }

            else throw new NumberFormatException("Цифры введены неверно");
        }

int result = 0;

        switch(arr[1]) {
            case "+":
               result= calc.plus(); break;
            case "-":
                result=calc.minus(); break;
            case "*":
                result=calc.times(); break;
            case "/":
                result=calc.div(); break;
            default: throw new IllegalArgumentException("Оператор введён неверно");
        }



        if (calc instanceof RomNum) {
            ((RomNum)calc).toRoman();
            return  ((RomNum)calc).getStringResult();
        }

        return Integer.toString(result);


    }
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        System.out.println("Введите ваше выражение: ");

        String input = s.nextLine();
        System.out.println(calc(input));

    }
}