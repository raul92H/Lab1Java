package lab5;

public class Cat {
    private String name;

    private String colour;

    private Integer age;

    private Integer energyLevel;

    private Integer hungerLevel;

    private Integer moodLevel;

    public Cat(String name, String colour, Integer age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.energyLevel = 3;
        this.hungerLevel = 3;
        this.moodLevel = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void play(){
        this.moodLevel++;
        this.energyLevel--;
    }

    public void feed(){
        this.hungerLevel--;
        this.moodLevel++;
    }

    public void sleep(){
        this.energyLevel++;
        this.miau();
    }

    private void miau(){
        System.out.printf("Miau  \nEnergy: %d  Hunger: %d  Mood: %d", energyLevel, hungerLevel, moodLevel);

    }
}
