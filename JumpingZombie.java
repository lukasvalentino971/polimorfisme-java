package tugas12_Lukas;

public class JumpingZombie extends Zombie {
    JumpingZombie(int health, int level){
        super(health, level);
    }

    public void heal(){
        switch (level){
            case 1  :
                health += (30/100 * health);
                break;
            case 2  :
                health += (40/100 * health);
                break;
            case 3  :
                health += (50/100 * health);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (10 * health / 100);
        heal();

    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data : \nHealth = " + this.health + "\nLevel = " + this.level;
    }
}
