package petgen;

public class MireTrench implements Battleground{
    @Override
    public void showInfo() {
        System.out.println(
                "ARENA: Mire Trench" + "\n" +
                        "DESCRIPTION: Mire Trench is a treacherous swampy arena where creatures battle" +
                        " for dominance in a challenging and murky environment. Aquatic creatures have " +
                        "the upper hand here, with a 5 point advantage that allows them to fully utilize " +
                        "their unique abilities in battle. On the other hand, earth creatures face disadvantages" +
                        " of up to -5 points due to the difficult terrain. Only the strongest and most adaptable" +
                        " creatures can navigate the dangers of Mire Trench and emerge victorious." + "\n" +
                        "DIMENSION: 500 meters by 500 meters" + "\n" +
                        "LOCATION: Mire Trench is located deep within the heart of the Forgotten Marsh."
        );
    }

    @Override
    public void fight(TerraBeast fighter1, Aquasprites fighter2) {
        int advantage = (int) (Math.random() * 5) + 1;
        int disadvantage = (int)(Math.random() * 5) - 5;

        double upGradedAquasprite = fighter2.getOverAll() + advantage;
        double downGradedTerraBeast = fighter1.getOverAll();

        if(downGradedTerraBeast > upGradedAquasprite){
            System.out.println("WINNER: " + fighter1.getName() + "! Against all odds.");
        }else{
            System.out.println("WINNER: " + fighter2.getName() + "! It wasn't even a contest...");
        }

    }
}
