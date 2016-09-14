package abstractionshw.Abs6;

public class Gandalf extends Wizard {

    @Override
    public final void getMagicType() {
        System.out.println("Magic Type:  Light Magic");
    }

    @Override
    public final void getRace() {
        System.out.println("Race:   Human");
    }

    @Override
    public final void speak() {
        System.out.println("You shall not pass!");
    }
    
}
