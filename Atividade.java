public class Atividade {
    public static void main(String[] args) {
        System.out.println("Iniciando a contagem de BÔNUS");

        for (int nivel = 1; nivel<5; nivel++){
            int score = nivel*100;
            System.out.println("Level " + nivel + " Alcançamos! Pontuação " +score + " XP");
        }
        System.out.println("Fim da fase!");

    }
}
