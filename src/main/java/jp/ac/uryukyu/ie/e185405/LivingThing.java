package jp.ac.uryukyu.ie.e185405;

/**
 * 生物クラス。
 *  String name; //生物の名前
 *  int hitPoint; //生物のHP
 *  int attack; //生物の攻撃力
 *  boolean dead; //生死状態。true=死亡。
 * Created by tnal on 2019/12/21.
 */

public class LivingThing {

    /**
     * コンストラクタ。名前、HP、攻撃力、生死状態を指定する。
     * @param name 生物の名前
     * @param hitPoint 生物のHP
     * @param attack 生物の攻撃力
     * @param dead 生死状態
     */
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