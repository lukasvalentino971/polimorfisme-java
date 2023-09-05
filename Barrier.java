package tugas12_Lukas;

public class Barrier implements  Destroyable {
    int strength;

    public Barrier(int strength){
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= (0.1 * strength);
    }

    public String getBarrierInfo(){
        return "Barrier Strength " + strength ;
    }
}
