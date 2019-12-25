package jp.ac.uryukyu.ie.e195743;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param hitPoint モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int hitPoint, int attack) {
        super(name,hitPoint,attack);
    }

    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */

    /*public boolean isDead() {
        return isDead();
    }
    public String getName(){
        return getName();
    }*/

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    /*public void attack(Hero hero){
        int damage = (int)(Math.random() * this.getAttack());
        if(!this.isDead()) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.getName(), hero.getName(), damage);
        }
        hero.wounded(damage);
    }*/

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */

    int HP = super.getHitPoint();

    public void wounded(int damage){
        setHitPoint(getHitPoint()-damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("%sは倒れた。\n", getName());
        }
    }
}