public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("a Tv está ligada: "+smartTv.Ligada);
        System.out.println("Canal atual:"+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.Ligar();
        System.out.println("a Tv está ligada: "+smartTv.Ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println(smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);
        smartTv.escolherCanalExpecifico(20);
        System.out.println(smartTv.canal);

        
    }
}
