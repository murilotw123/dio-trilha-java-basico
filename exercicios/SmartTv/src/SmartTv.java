public class SmartTv {
    boolean Ligada = false;
    int canal = 1;
    int volume = 50;

public void aumentarVolume(){
    volume++;
}
public void diminuirVolume(){
    volume--;
}

public void aumentarCanal(){
    canal++;
}
public void diminuirCanal(){
    canal--;
}
public void escolherCanalExpecifico(int canalExpecifico){
    canal = canalExpecifico;
    
    
}


    public void Ligar(){
        Ligada = true;
    }
    public void Desligar(){
        Ligada = false;
    }
}
