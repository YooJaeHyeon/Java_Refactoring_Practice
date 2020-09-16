/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wargame;

public class App {
    public static void goToBattle(FlyAble fa) {
        fa.takeOff();
        fa.fly();
    }

    public static void fight(FightAble fa) {
        fa.attack();
    }

    public static void backFromBattle(FlyAble fa) {
        fa.fly();
        fa.land();
    }

    public static void commitWarScenario(AirForcePlaneAble afp) {
        goToBattle(afp);
        fight(afp);
        backFromBattle(afp);
    }

    public static void main(String[] args) {
        Fighter1 f15 = new Fighter1(10);
        Bomber1 b29 = new Bomber1(10);

        commitWarScenario(f15);
        commitWarScenario(b29);
    }
}