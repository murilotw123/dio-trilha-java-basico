package Modulos.Estruturascondicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        System.out.println("saldo antes do if:" + saldo);
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }

        System.out.println("Novo saldo:" + saldo);
    }
    
}
