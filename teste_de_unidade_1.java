public class CalculadoraIMC{


   public static String classificarIMC(double imc, String genero) {
       if (genero.equalsIgnoreCase("mulher")) {
           if (imc < 19.1) {
               return "Abaixo do peso";
           } else if (imc < 25.8) {
               return "No peso normal";
           } else if (imc < 27.3) {
               return "Marginalmente acima do peso";
           } else if (imc < 32.3) {
               return "Acima do peso ideal";
           } else {
               return "Obeso";
           }
       } else if (genero.equalsIgnoreCase("homem")) {
           if (imc < 20.7) {
               return "Abaixo do peso";
           } else if (imc < 26.4) {
               return "No peso normal";
           } else if (imc < 27.8) {
               return "Marginalmente acima do peso";
           } else if (imc < 31.1) {
               return "Acima do peso ideal";
           } else {
               return "Obeso";
           }
       } else {
           return "Erro: Genero invalido";
       }
   }


   public static void main(String[] args) {

    // Casos de Teste 
    
         //     HOMEM 
           String genero = "homem";
        // Abaixo do peso (IMC: 19.03)
        // double peso = 55.0;
        // double altura = 1.70;

        // No peso normal (IMC: 23.15)
        // double peso = 75.0;
        // double altura = 1.80;
        
        // Marginalmente acima do peso (IMC: 26.23)
        // double peso = 85.0;
        // double altura = 1.80;

        // Acima do peso ideal (IMC: 30.0)
        // double peso = 90.0;
        // double altura = 1.73;

        // Obeso (IMC: 34.60)
        double peso = 100.0;
        double altura = 1.70;
       


        //   MULHER
        //String genero = "mulher";

        //Abaixo do peso (IMC: 16.53)
        // double peso = 45.0;
        // double altura = 1.65;

        // No peso normal (IMC: 23.44)
        // double peso = 60.0;
        // double altura = 1.60;
        
        // Marginalmente acima do peso (IMC: 25.39)
        // double peso = 65.0;
        // double altura = 1.60;

        // Acima do peso ideal (IMC: 29.30)
        // double peso = 75.0;
        // double altura = 1.60;

        // Obeso (IMC: 35.16)
        //double peso = 90.0;
        //double altura = 1.60;
       

       // String genero = "inválido";


       double imc = peso / (altura * altura);
       String condicao = classificarIMC(imc, genero);


       System.out.println("**************************");
       System.out.println("Calculando IMC para: ");
       System.out.printf("Seu IMC e: %.2f\n", imc);
       System.out.println("Condicao: " + condicao);
       System.out.println("**************************");
   }

}

