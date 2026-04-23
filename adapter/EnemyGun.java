import java.util.Random;

public class EnemyGun implements EnemyAttacker {

    private Random generator = new Random();

    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Gun Causes " + attackDamage + " Damage");
    }

    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Gun Moves " + movement + " Spaces");
    }

    public void assignDriver(String driverName) {
        System.out.println(driverName + " is Driving the Enemy Gun");
    }

}
