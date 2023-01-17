public class Types_of_Credits {


    public static void for_business (float Summa_kredita, float Egemesyachniy_platej, float Procent, String type_of_client ){

        float nachalnaya = Summa_kredita;
        float Viplacheno_banku = 0f;

        for(int i=1; Summa_kredita>=Egemesyachniy_platej ; i++) {

            Summa_kredita = Summa_kredita - Egemesyachniy_platej;
            Viplacheno_banku = Viplacheno_banku + Egemesyachniy_platej;

            //System.out.println(Summa_kredita);

            if (i % 12 == 0) {
              //  System.out.println("ГОД");
                Summa_kredita = Summa_kredita * (1f + Procent / 100);
            }
        }

        Viplacheno_banku = Viplacheno_banku + Summa_kredita;

        float pereplata = Viplacheno_banku - nachalnaya;

        System.out.println(pereplata+"\n// общая сумма к оплате: " + Viplacheno_banku);
    }

    public static void for_human (float Summa_kredita, float Egemesyachniy_platej, float Procent, String type_of_client ){

       /* System.out.println("\nfor_human\nДля типа клиента “human” проценты начисляются сразу же:");*/
        float nachalnaya = Summa_kredita;

        Summa_kredita=Summa_kredita*(1f+Procent/100f);

        float Viplacheno_banku = 0f;

        //System.out.println("Начало"+Summa_kredita);

        for(int i=1; Summa_kredita>=Egemesyachniy_platej ; i++) {

            Summa_kredita = Summa_kredita - Egemesyachniy_platej;
            Viplacheno_banku = Viplacheno_banku + Egemesyachniy_platej;
           // System.out.println(Summa_kredita);

            if (i % 12 == 0) {
                //System.out.println("ГОД");
                Summa_kredita = Summa_kredita * (1f + Procent / 100);
            }
        }
            Viplacheno_banku = Viplacheno_banku + Summa_kredita;

            float pereplata = Viplacheno_banku - nachalnaya;

            System.out.println(pereplata+"\n// общая сумма к оплате: " + Viplacheno_banku);



        }


    }


