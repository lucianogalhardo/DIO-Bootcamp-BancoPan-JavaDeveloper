public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        // CHAMANDO MÉTODO LIGA E DESLIGA P/ LIGAR A SMARTTV
        smartTv.ligar ();
            System.out.println("STATUS ATUAL DA TV");


        // POSIÇÃO ATUAL DA SMARTV
            System.out.print("\n");
            System.out.println("Tv Ligada? " + smartTv.ligada);
            System.out.println("Canal Atual? " + smartTv.canal);
            System.out.println("Volume Atual? " + smartTv.volume);

            System.out.print("\n");
            System.out.println("controlando o VOLUME:");
        
        // CHAMANDO MÉTODO PARA CONTROLE DE VOLUME
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
            System.out.println("Volume Atual: " + smartTv.volume);

        // CHAMANDO MÉTODO PARA CONTROLE DE CANAL
        System.out.print("\n");
        System.out.println("controlando o CANAL:");
        smartTv.mudarCanal(13);
            System.out.println("Canal Atual? " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
            System.out.println("Canal Atual? " + smartTv.canal);
            
            System.out.print("\n");
            System.out.println("NOVO STATUS DA TV:");
            System.out.print("\n");
            System.out.println("Tv Ligada? " + smartTv.ligada);
            System.out.println("Canal Atual? " + smartTv.canal);
            System.out.println("Volume Atual? " + smartTv.volume);

            
        // CHAMANDO MÉTODO LIGA E DESLIGA PARA DESLIGAR A SMARTTV
        smartTv.desligar ();
        System.out.println("NOVO STATUS -> Tv Ligada? " + smartTv.ligada);

    }


}
