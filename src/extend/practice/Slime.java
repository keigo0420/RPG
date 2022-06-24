package extend.practice;

public class Slime extends Monster {
	
	public void attack(Living target) {
		System.out.println("モンスターのターン！");
		int dmg=Rand.get(this.offensive);
		System.out.println(this.name+"が体当たりで攻撃！"+target.name+"に"+dmg+"ポイントのダメージを与えた。");
	    target.hp-=dmg;

	}
	
	}


