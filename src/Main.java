public class Main {


    public static void main(String[] args) {
        Ryu ryu=new Ryu();
        Chan chan=new Chan();
        Ken ken=new Ken();
        ryu.greet();
        chan.greet();
        ken.greet();

        ryu.setActionStratege(new Jump());
        ryu.performAction().action();
        chan.setActionStratege(new Jump());
        chan.performAction().action();
        ken.setActionStratege(new Jump());
        ken.performAction().action();
    }
}
