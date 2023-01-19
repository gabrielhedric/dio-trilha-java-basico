public class Usuario {

    public static void main(String[] args) throws Exception {
        SmarTv smarTv = new SmarTv();

        System.out.println("TV Ligada: " + smarTv.estadoTv);
        System.out.println("Canal Atual: " + smarTv.canal);
        System.out.println("Volume Atual: " + smarTv.volume);

        //Ligar ou desligar a TV:
        smarTv.ligarTv ();
        System.out.println("TV Ligada: " + smarTv.estadoTv);
        smarTv.desligarTv ();
        System.out.println("TV Ligada: " + smarTv.estadoTv);

        //Controlar o canal:

        smarTv.aumentarCanal ();
        System.out.println("Canal Atual: " + smarTv.canal);
        smarTv.diminuirCanal ();
        System.out.println("Canal Atual: " + smarTv.canal);
        smarTv.escolherCanal(15);
        System.out.println("Canal Atual: " + smarTv.canal);

        //Controlar o volume
        smarTv.aumentarVolume ();
        smarTv.aumentarVolume ();
        smarTv.aumentarVolume ();
        smarTv.aumentarVolume ();
        smarTv.aumentarVolume ();
        System.out.println("Volume Atual: " + smarTv.volume);

        smarTv.abaixarVolume ();
        System.out.println("Volume Atual: " + smarTv.volume);
    }
}
