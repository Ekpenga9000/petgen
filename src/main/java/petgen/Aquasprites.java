package petgen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Aquasprites extends MysticalCreatures {

    private String[] potentialAbilities = {
            "Hydrokinesis",
            "Telepathy",
            "Invisibility",
            "Electrokinesis",
            "Regeneration",
            "Super Strength",
            "Water Breathing",
            "Camouflage",
            "Poisonous/Toxic Attacks",
            "Flight",
            "Sonar",
            "Shape-Shifting",
            "Healing",
            "Teleportation",
            "Acidic Attacks",
            "Psychic Attacks"
    };

    public Aquasprites(String name, int age){
        super(name, age);
        id = "AQUA" + id;
        sound = "Growl!!";
        abilities = setAbilities();
        description = setDescription();
        powerPool = setPowerPool();
        overAll = setOverAll();
        price = setPrice();
    }

    private List<String> setAbilities(){

        List<String> addAbilities = new ArrayList<>();
        int length = setLength();

        while(addAbilities.size() < length){
            int rand = (int) (Math.random() * potentialAbilities.length);
            String ability = potentialAbilities[rand];

            if(!addAbilities.add(ability)){
                addAbilities.add(ability);
            }
        }

        if(addAbilities.isEmpty()){
            addAbilities.add("This beast possesses no ability.");
        }
        return addAbilities;
    }

    private double setOverAll(){
        List<String> allAbilities = abilities;
        double power = 0.0;

        for (String ability: allAbilities) {
            power = power + powerPool.get(ability);
        }
        return ((power/25) * 100) + 20;
    }

    private HashMap<String, Double> setPowerPool(){
        HashMap<String, Double> allPowerPool = new HashMap<>();

       allPowerPool.put("This beast possesses no ability.", 0.1);
       allPowerPool.put("Hydrokinesis", 4.5);
       allPowerPool.put("Telepathy", 4.0);
       allPowerPool.put("Invisibility", 4.0);
       allPowerPool.put("Electrokinesis", 4.0);
       allPowerPool.put("Regeneration", 4.0);
       allPowerPool.put("Super Strength", 3.5);
       allPowerPool.put("Water Breathing", 1.5);
       allPowerPool.put("Camouflage", 3.5);
       allPowerPool.put("Poisonous/Toxic Attacks", 3.5);
       allPowerPool.put("Flight", 3.0);
       allPowerPool.put("Sonar", 3.0);
       allPowerPool.put("Shape-Shifting", 3.0);
       allPowerPool.put("Healing", 3.0);
       allPowerPool.put("Teleportation", 2.5);
       allPowerPool.put("Acidic Attacks", 3.5);
       allPowerPool.put("Psychic Attacks", 4.5);
       allPowerPool.put("Adaptation", 2.5);
       allPowerPool.put("Bioluminescence", 2.0);
       allPowerPool.put("Hydrophobic Shielding", 2.7);
       allPowerPool.put("Size Alteration", 1.5);

       return allPowerPool;
    }
    private String setDescription(){
        return "Aquatic creatures that possess extraordinary abilities from their exposure to the Sea Nymphs.";
    }

    private double setPrice(){
        double value = overAll * setLength() + 2 * 10;

        return value;
    }

    public void showInfo(){
        System.out.println("TYPE: Aqua Sprite");
        super.showInfo();
    }
}
