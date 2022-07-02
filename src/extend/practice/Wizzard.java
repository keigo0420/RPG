package extend.practice;

public class Wizzard extends Human {

	public void attack(Living target) {

		System.out.println("人間のターン！");
		int dmg = Rand.get(9) * this.offensive;
		System.out.println(this.name + "が魔法で攻撃！" + target.name + "に" + dmg + "ポイントのダメージを与えた。");
		target.hp -= dmg;

	}

}
