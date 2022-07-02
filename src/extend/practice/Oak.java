package extend.practice;

public class Oak extends Monster {
	public void attack(Living target) {
		System.out.println("モンスターのターン！");
		int dmg = Rand.get(9) * this.offensive;
		System.out.println(this.name + "が槍で攻撃！" + target.name + "に" + dmg + "ポイントのダメージを与えた。");
		target.hp -= dmg;

	}

}
