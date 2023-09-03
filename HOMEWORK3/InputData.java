package HOMEWORK3;
import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, номер телефона - цифры) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 4) {
                return arrayData;
            } else if (arrayData.length < 4){
                System.out.println("you have not entered all the data, please try again");
            } else System.out.println("you entered more data, please try again");
        }

    }
}