package jp.ac.uryukyu.ie.e185405;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name,int maxHP,int attack){
        this.name = name;
        hitPoint = maxHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maxHP, attack);
    }

    public boolean isDead() {
        return dead;
    }
    public void setDead(boolean dead){this.dead = dead;}

    public String getName(){
        return name;
    }

    public int getHitPoint() {return hitPoint;}


    public void attack(LivingThing livingThing) {
        int damage = (int) (Math.random() * attack);
        if (isDead()) {
            damage = 0;
        } else {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, livingThing.getName(), damage);
            livingThing.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }




}