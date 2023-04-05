package petgen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TerraBeast extends MysticalCreatures {

   private String[] potentialAbilities  = {
            "Enhanced Strength",
            "Enhanced Speed",
            "Enhanced Durability",
            "Enhanced Stamina",
            "Enhanced Agility",
            "Invulnerability",
            "Limb Manipulation",
            "Enhanced Smell",
            "Enhanced Hearing",
            "Enhanced Touch",
            "Enhanced Taste",
            "Tactical Analysis",
            "Earth Manipulation",
            "Plant Manipulation",
            "Magnet Manipulation",
            "Forest Manipulation",
            "Gravity Manipulation",
            "Desert Manipulation",
            "Lava Manipulation"
    };

    public TerraBeast(String name, int age) {
        super(name, age);
        id = "TERRA" + id;
        sound = "Roar!!";
        abilities = setAbilities();
        description = setDescription();
        powerPool = setPowerPool();
        overAll = setOverallRating();
        price = setPrice();
    }

    private String setDescription(){
        return "Genetically enhanced land-dwelling creatures with extraordinary abilities from Gaia.";
    }
    private List<String> setAbilities(){
        List<String> addAbilities = new ArrayList<>();

        int length = setLength();

        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * potentialAbilities.length);
            String ability = potentialAbilities[rand];
            if(!addAbilities.contains(ability)){
                addAbilities.add(ability);
            }
        }

        if(addAbilities.isEmpty()){
            addAbilities.add("This beast possesses no ability.");
        }
        return addAbilities;

    }

    private HashMap<String, Double> setPowerPool(){
        HashMap<String, Double> allPowerPool = new HashMap<>();

        allPowerPool.put("This beast possesses no ability.", 0.1);
        allPowerPool.put("Enhanced Strength", 3.0);
        allPowerPool.put("Enhanced Speed", 3.0);
        allPowerPool.put("Enhanced Durability", 3.5);
        allPowerPool.put("Enhanced Stamina", 3.2);
        allPowerPool.put("Enhanced Agility",3.0);
        allPowerPool.put("Invulnerability",3.9);
        allPowerPool.put("Limb Manipulation",2.9);
        allPowerPool.put("Enhanced Smell",2.5);
        allPowerPool.put("Enhanced Hearing",2.5);
        allPowerPool.put("Enhanced Touch",2.3);
        allPowerPool.put("Enhanced Taste",2.0);
        allPowerPool.put("Tactical Analysis",3.0);
        allPowerPool.put("Earth Manipulation",4.5);
        allPowerPool.put("Plant Manipulation",3.9);
        allPowerPool.put("Magnet Manipulation",4.7);
        allPowerPool.put("Forest Manipulation",4.5);
        allPowerPool.put("Gravity Manipulation",5.0);
        allPowerPool.put("Desert Manipulation",4.0);
        allPowerPool.put("Lava Manipulation",4.8);

        return allPowerPool;
    }

    private double setPrice(){
        double value = overAll * setLength() * 10;

        return value;
    }

    private double setOverallRating(){
        List<String> theAbilities = abilities;
        double power = 0.0;

        for (String ability: theAbilities) {
            double abilityScore = powerPool.get(ability);

            power = power + abilityScore;

        }
            power = ((power/25) * 100) + 20;
        return power;
    }

    public void showInfo(){
        System.out.println("TYPE: Terra Beast");
        super.showInfo();
    }
}
