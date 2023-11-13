/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Enemy spider = new Spider();
        Enemy lizard = new Lizard();
        Bat bat = new Bat(5);

        System.out.println("Halloween Battle");
        System.out.println("Player Vs Spider");

        spider.attack();
        player.defend();
        System.out.println("--------------");
        player.attack();
        lizard.defend();
        System.out.println("--------------");
        lizard.attack();
        player.sleep();
        System.out.println("--------------");
        player.attack();
        bat.defend();
        System.out.println("--------------");
        bat.fly();
        if(bat.canFly()) {
            player.fly();
        }
        System.out.println("--------------");
        int evilLevel =  bat.getEvilLevel();
        System.out.println("Bat's evil level: " + evilLevel);



    }
}
