public class Main {
    public static void main(String[] args) {
        Cacing player1 = new Cacing();
        Cacing player2 = new Cacing();

        player1.userName = "Fatimatus";
        player1.score = 900;
        player1.length = 9.5;

        player2.userName = "Sakdiyah";
        player2.score = 1300;
        player2.length = 13.8;

        player1.eatSnack();

        System.out.println(player1.score);
        player1.eatOthers(player2);
        System.out.println(player1.score);


    }
}
