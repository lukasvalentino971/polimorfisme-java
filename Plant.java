package tugas12_Lukas;

public class Plant {
    public void doDestroy(Destroyable des){
        if(des instanceof Zombie){
            Zombie zom = (Zombie) des;
            zom.destroyed();
        }else if(des instanceof WalkingZombie){
            Zombie zom = (WalkingZombie) des;
            zom.destroyed();
        }else if(des instanceof JumpingZombie){
            Zombie zom = (JumpingZombie) des;
            zom.destroyed();
        }else if(des instanceof Barrier){
            Barrier bar = (Barrier) des;
            bar.destroyed();
        }
    }
}
