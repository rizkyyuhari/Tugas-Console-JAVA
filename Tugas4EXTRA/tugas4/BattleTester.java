public class BattleTester {
    public static void main(String[] args) {
        Superhero thor = new Superhero("Thor", "Stormbreaker");
        Superhero ironman = new Superhero("Ironman", "LaserBeam");

        BattleMode.battle(thor,ironman);
    }
}
