public interface CharacterAbility extends  Attack,Health,Weapon {
    String getHeroName();
    void setHeroname(String name);
    default void info(){
        System.out.println(getHeroName());
        System.out.println("Sisa Darah = "+getHealth());
        System.out.println("Senjata yang digunakan = "+getWeaponName());
    }
}
