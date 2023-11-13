public class Bat extends Enemy implements CanFly {
    private int evilLevel;

    public Bat(int evilLevel){
        this.evilLevel = evilLevel;
    }

    public void attack(){
        System.out.println("Bat is attacking");
    }
    public void defend(){
        System.out.println("Bat is defending");
    }

    public void fly(){
        System.out.println("Bat is flying");
    }

    public void setEvilLevel(int evilLevel) {
        this.evilLevel = evilLevel;
    }


    public boolean canFly(){
        return true;
    }


    public int getEvilLevel(){
        return this.evilLevel;
    }

}
