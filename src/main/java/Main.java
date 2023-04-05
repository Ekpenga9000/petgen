import petgen.Aquasprites;
import petgen.GroundTerrain;
import petgen.MireTrench;
import petgen.TerraBeast;

public class Main {
    public static void main(String[] args) {
        TerraBeast newTerraBeast = new TerraBeast("Jack", 2);
        Aquasprites newAquasprites = new Aquasprites("Susie", 5);

        newTerraBeast.showInfo();
        newTerraBeast.speak();

        System.out.println("***********************************");
        newAquasprites.showInfo();
        newAquasprites.speak();

        System.out.println("***********************************");

        GroundTerrain groundTerrain = new GroundTerrain();

        System.out.println("***********************************");

        groundTerrain.showInfo();

        System.out.println("***********************************");

        groundTerrain.fight(newTerraBeast, newAquasprites);

        System.out.println("****** BATTLE 2 ************");

        MireTrench mireTrench = new MireTrench();

        mireTrench.showInfo();

        System.out.println("***********************************");

        mireTrench.fight(newTerraBeast, newAquasprites);
    }
}