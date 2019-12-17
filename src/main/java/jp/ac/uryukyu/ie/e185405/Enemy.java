package jp.ac.uryukyu.ie.e185405;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {


    public Enemy (String name, int maxHP, int attack) {
        super(name,maxHP,attack);
    }



}