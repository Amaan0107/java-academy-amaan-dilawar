package org.example;

public class Character {
    private String name;
    private int Health;
    private String Outfitcolor;
    private int Attackdamage;
    private int Power;

public Character(String _name, String _Outfitcolor){
    this.name = _name;
    this.Outfitcolor = _Outfitcolor;
    this.Power = 100;
    this.Attackdamage = 110;
    this.Health = 100;
}
    public String getName(){
        return this.name;
    }

    public int getHealth() {
        return this.Health;
    }
    public void setHealth(int _newHealth){
    if(_newHealth > 0 && _newHealth < 100){
    }
         this.Health = _newHealth;
    }
    public void Heal(int howMuchHeal) {
        System.out.println("Drinking potion");

        int newHealth = this.Health + howMuchHeal;
        if (newHealth >100){
            this.setHealth(100);
            System.out.println("Fully recovered !");
        }else{
            setHealth(newHealth);
        }
    }
    public void takeDamage(int damage){
        System.out.println(this.name + " got attached by mojo jojo and took " + damage + " damage!");

        int damageHealth = this.Health - damage;
        System.out.println("Health: " + damageHealth);
        setHealth(damageHealth);
    }
}
