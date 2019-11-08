public class Main {
    private Fighter fighter1;
    private Fighter fighter2;


    public static void main(String[] args) {
        Main man=new Main();
    }

    public Main() {
        fighter1=new Ken();
        fighter2=new Chan();

        fighter1.setActionStratege(new Jump());
        fighter2.setActionStratege(new Roll());

        fighter1.greet();
        fighter2.greet();

        fighter1.performAction();
        fighter2.performAction();

        fighter1.performAction();
        fighter2.performAction();
    }
}
