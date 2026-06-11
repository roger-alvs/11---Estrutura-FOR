public class Ativ3 {
    public static void main(String[] args) {
        System.out.println("Recupere HP! Você achou um kit médico");
        for (int HP =20; HP <= 100; HP += 15){
            int score = HP * 15;

            System.out.println("Seu HP esta regenerando " +HP+ "%");
        }
        System.out.println("Sua vida esta em 100%");
    }
}
