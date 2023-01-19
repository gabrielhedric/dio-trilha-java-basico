public class SmarTv {

    boolean estadoTv = false;
    int canal = 0;
    int volume = 10;

    public void ligarTv(){
        estadoTv = true;
    }
    public void desligarTv(){
        estadoTv = false;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void escolherCanal( int canalDesejado){
        canal = canalDesejado;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void abaixarVolume(){
        volume--;
    }
}
