public class AdapterPatternDemo {

    public static void main(String[] args) {

        EnemyGun enemyGun = new EnemyGun();
        EnemyRobot enemyRobot = new EnemyRobot();

        System.out.println("The Enemy Gun Strikes");
        enemyGun.fireWeapon();
        enemyGun.driveForward();
        enemyGun.assignDriver("Robocop");

        System.out.println("\nThe Enemy Robot Strikes");

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);
        robotAdapter.fireWeapon();
        robotAdapter.driveForward();
        robotAdapter.assignDriver("Skynet");

    }

}
