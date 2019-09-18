public class Mouse extends Animal {
    public Mouse(){

        System.out.println("Now I am a Mouse!");
    }
    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }

    public String squeek() {
        return "Squeek!";
    }
}
