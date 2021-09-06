public class Superhero implements  CharacterAbility {
    private String heroName,weaponName;
    private int health,weaponAttack,attackPower;

    Superhero(String heroName,String weaponName){
        this.heroName = heroName;
        this.weaponName = weaponName;

        health = 100;
        weaponAttack = 8;
        attackPower = 20;
    }



    @Override
    public int getHealth(){return health;}

    @Override
    public void setHealth(int health){
        this.health = health;
    }

    @Override
    public void setWeaponName(String wn){
        this.weaponName = wn;
    }

    @Override
    public String getWeaponName(){return weaponName;}

    @Override
    public void setWeaponAttack(int weaponAttack){
        this.weaponAttack = weaponAttack;
    }

    @Override
    public int getWeaponAttack(){
        return weaponAttack;
    }

    @Override
    public void setHeroname(String name){
        this.heroName = name;
    }

    @Override
    public String getHeroName(){return heroName;}

    @Override
    public void setAttackPower(int a){
        attackPower = a;
    }

    @Override
    public int getAttack(){return attackPower;}

    @Override
    public void attack(Superhero o){ o.health=o.health - (attackPower+weaponAttack); }

}
