package tugas12_Lukas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level){
        super(health, level);
    }

    public void heal(){
        switch (level){
            case 1 :
                health += (0.02 * health);
                break;
            case 2  :
                health += (0.03 * health);
                break;
            case 3  :
                health += (0.04 * health);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (0.2 * health);
        heal();



    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data : \nHealth = " + this.health + "\nLevel = " + this.level;
    }
}
