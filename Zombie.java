package tugas12_Lukas;

public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void destroyed() {
        health -= 0;
    }

    public String getZombieInfo(){
        return "Data Zombie : \nHealth = " + this.health + "\nLevel = " + this.level;
    }
}
