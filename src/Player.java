public class Player extends Character implements CanFly {
    public void attack(){
        System.out.println("Player is attacking");
    }
    public void defend(){
        System.out.println("Player is defending");
    }
    public void sleep(){
        System.out.println("Player is sleeping");
        this.health = 100;
    }
    @Override
    public void fly(){
        System.out.println("Player is flying!");
    }
}