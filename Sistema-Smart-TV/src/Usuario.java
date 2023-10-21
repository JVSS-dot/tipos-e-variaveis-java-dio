public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTV smartTV = new SmartTV();
        
        System.out.println("O canal atual : " +smartTV.canal);
        
        smartTV.mudarCanal(13);
        System.out.println("O novo canal : " +smartTV.canal);






        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual " +smartTV.volume);

        System.out.println("Tv ligada ? " + smartTV.ligada);
        System.out.println("Qual canal : " + smartTV.canal);
        System.out.println("Qual o volume : " + smartTV.volume);



        smartTV.ligar();
        System.out.println("Novo status, Tv ligada ? " + smartTV.ligada);


        smartTV.desligar();
        System.out.println("Novo status, Tv ligada ? " + smartTV.ligada);
    }
    
}
