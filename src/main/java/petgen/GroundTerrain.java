package petgen;

public class GroundTerrain implements Battleground{
    @Override
    public void showInfo() {
        System.out.println(
                "ARENA: Ground Tarrain" + "\n" +
                "DESCRIPTION: Ground Terrain is a fierce arena for battling fictional " +
                        "creatures, set on dry, dusty terrain that heavily favors Terra beasts. " +
                        "With a bonus of 10 points to their abilities. All creatures must navigate " +
                        "obstacles and strategically use their unique powers to emerge victorious. " +
                        "Only the strongest and most skilled creatures can survive the intense " +
                        "battles that take place in Ground Terrain." + "\n" +
                "DIMENSION: 500 meters by 500 meters" + "\n" +
                "LOCATION: Ground Terrain is located in the heart of the Dragonfire Mountains."
        );
    }

    @Override
    public void fight(TerraBeast fighter1, Aquasprites fighter2) {
        int advantage=(int) (Math.random() * 10) + 1;

        double upGradeTerraBeast = fighter1.getOverAll() + advantage;
        double aquaspriteStrength = fighter2.getOverAll();

        if(aquaspriteStrength > upGradeTerraBeast){
            System.out.println("WINNER: " + fighter2.getName() + "! Against all odds.");
        }else {
            System.out.println("WINNER: " + fighter1.getName() + "! It wasn't even a contest...");
        }

    }
}
