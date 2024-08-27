package Modulos.EstruturaDeRepetição;

public class forArray {
    public static void main(String[] args) {
            String Alunos[] = {"MURILO","JOAO","LUCAS"};

            for(int i=0; i<Alunos.length; i++){
                System.out.println("o aluno no indice i= " + Alunos[i]);
            }

            for(String aluno : Alunos){
                System.out.println("O nome do aluno é: " + aluno);
            }
    }
    
}
