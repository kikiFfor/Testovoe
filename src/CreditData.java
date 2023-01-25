/**
 * Класс отвечает за хранение данных
 */

import java.util.Scanner;

public class CreditData {

    String vvedennieDannie;
    float summaCredita;
    float egemesyachniyPlatej;
    float procent;
    String typeOfClient;


    void vvodParametrs() {

        Scanner vvod = new Scanner(System.in);
        vvedennieDannie = vvod.nextLine();
        System.out.println();
    }

    void setParametrs () {

        String[] subparametrs = vvedennieDannie.split(" ");

        summaCredita = Float.parseFloat(subparametrs[0]);
        egemesyachniyPlatej = Float.parseFloat(subparametrs[1]);
        procent = Float.parseFloat(subparametrs[2]);
        typeOfClient = subparametrs[3];

    }

}

