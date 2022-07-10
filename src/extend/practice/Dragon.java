package extend.practice;

public class Dragon extends Monster {

	public void attack(Living target) {

		System.out.println("モンスターのターン！");
		int dmg = Rand.get(10) * this.offensive;
		System.out.println(this.name + "が炎で攻撃！" + target.name + "に" + dmg + "ポイントのダメージを与えた。");
		target.hp -= dmg;

	}

}
