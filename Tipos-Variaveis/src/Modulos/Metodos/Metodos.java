package Modulos.Metodos;

public class Metodos {
    public int somar(int num1, int num2){
        int resultadoSoma = num1 + num2;
        return resultadoSoma;
    }

public void imprimir(String texto){

    //nao precisa de return pois é void
}
public double divisão(int dividendo, int divisor)throws Exception{
    if (divisor == 0) {
        throw new Exception("Divisão por zero não é permitida.");
    }
    return (double) dividendo / divisor;
}
    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        int num1 = 4;
        int num2 = 2;
        int dividendo = 10;
        int divisor = 0;
        int resultadoSoma = metodo.somar(num1, num2);
        System.out.println(resultadoSoma);

        try {
            double resultadoDivisao = metodo.divisão(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());


    }
}
}
