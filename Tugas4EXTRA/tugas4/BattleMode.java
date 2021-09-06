public interface BattleMode {
    static  void battle(Superhero hero1, Superhero hero2){
        while(hero1.getHealth()>0 & hero2.getHealth() >0){
            // Random nilai [0,1] untuk giliran attack
            int rand = (int)(Math.random()*2);

            if(rand == 1) {
                hero1.attack(hero2);
                if(hero2.getHealth()<0) hero2.setHealth(0);
                System.out.println(hero1.getHeroName()+" attack "+hero2.getHeroName() +"(Health "+hero2.getHeroName()+" "+hero2.getHealth()+")");
            }
            if(rand == 0){
                hero2.attack(hero1);
                if(hero1.getHealth()<0) hero1.setHealth(0);
                System.out.println(hero2.getHeroName()+" attack "+hero1.getHeroName() +"(Health "+hero1.getHeroName()+" "+hero1.getHealth()+")");
            }

        }
        // Cetak Pemenang dengan memanggil method info pada superhero pemenang
        System.out.println("\n--------------------------------------\n");
        System.out.println("Pemenang Battle");
        if(hero1.getHealth() == 0) hero2.info();
        if(hero2.getHealth() == 0) hero1.info();
    }
}
