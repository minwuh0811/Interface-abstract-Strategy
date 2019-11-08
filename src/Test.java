import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    Ryu ryu=new Ryu();
    Chan chan=new Chan();
    Ken ken=new Ken();
    ArrayList<String> actions=new ArrayList<>();
    @org.junit.jupiter.api.Test
    void greet() {

        ryu.greet();
        chan.greet();
        ken.greet();
    }
    @org.junit.jupiter.api.Test
    void actionJump(){
        ryu.setActionStratege(new Jump());
        actions.add(ryu.performAction());
        chan.setActionStratege(new Jump());
        actions.add(chan.performAction());
        ken.setActionStratege(new Jump());
        actions.add(ken.performAction());
        ArrayList<String> actionExpect= new ArrayList<>();
        actionExpect.add("Jump");
        actionExpect.add("Jump");
        actionExpect.add("Jump");
        assertEquals(actionExpect,actions);
    }

    @org.junit.jupiter.api.Test
    void actionRoll(){
        ryu.setActionStratege(new Roll());
        actions.add(ryu.performAction());
        chan.setActionStratege(new Roll());
        actions.add(chan.performAction());
        ken.setActionStratege(new Roll());
        actions.add(ken.performAction());
        ArrayList<String> actionExpect= new ArrayList<>();
        actionExpect.add("Roll");
        actionExpect.add("Roll");
        actionExpect.add("Roll");
        assertEquals(actionExpect,actions);
    }

}