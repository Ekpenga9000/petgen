package petgen;

import java.util.HashMap;
import java.util.List;

public abstract class MysticalCreatures {
    //the id of the animals should have start with the 2 letters of the animal's name.
    protected String id;
    private static int index = 1000;
    private String name;
    private int age;

    protected String description;

    protected String genetics;

    protected List<String> abilities;
    protected double price;

    protected String sound;

    protected HashMap<String, Double> powerPool;

    protected double overAll;
    public MysticalCreatures(String name, int age){
        index++;
        this.id = setAnimalId();
        this.name = name;
        this.age = age;
        this.genetics = setGenetics();
    }

    private String setAnimalId(){
        int theAge = age;
        int theIndex = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));

        return "" + theAge + theIndex + randomNumber;
    }

    private String setGenetics(){
        String[] genePool = {"Elite","Good","Great","Average","Bad","Poor"};

        int rand = (int)(Math.random() * genePool.length);

        return new String(genePool[rand]);
    }

    protected int setLength(){

        if(genetics.equals("Bad")){
            return 1;
        }else if(genetics.equals("Average")){
            return 2;
        }else if(genetics.equals("Good")){
            return 3;
        }else if(genetics.equals("Great")){
            return 4;
        }else if(genetics.equals("Elite")){
            return 5;
        }else{
            return 0;
        }
    }


    public void speak(){
        System.out.println(sound);
    }

    public void showInfo(){
        System.out.println("NAME: " + name + "\n" +
                "AGE: " + age + "\n" +
                "ANIMAL NUMBER: " + id +"\n" +
                "GENETICS: " + genetics + "\n" +
                "MARKET VALUE: $" + price + "0" + "\n" +
                "DESCRIPTION: " + description + "\n" +
                "ABILITIES: " + abilities + "\n" +
                "OVERALL: " + overAll);
    }

    public String getName(){
        return name;
    }
   public double getOverAll(){
        return overAll;
   }
}
