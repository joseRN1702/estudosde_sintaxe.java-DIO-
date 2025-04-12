public class Usuario {
public static void main(String[] args) {
    SmartTV smartTv= new SmartTV();
    System.out.println("Tv ligada? "+smartTv.ligada);
    System.out.println("Canal atual: "+smartTv.canal);
    System.out.println("volume atual: "+smartTv.volume);
     smartTv.ligar();
        System.out.println("Novo status ->TV ligada? "+ smartTv.ligada);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(25);
        System.out.println("Canal atual: "+smartTv.canal);


        System.out.println("Volume atual: "+ smartTv.volume);






        smartTv.desligar();
        System.out.println("Novo status ->TV ligada? "+ smartTv.ligada);



}
}
