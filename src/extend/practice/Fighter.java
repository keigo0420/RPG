package extend.practice;

public class Fighter extends Human {
public void attack(Living target) {
		
		System.out.println("人間のターン！");
		int dmg=Rand.get(this.offensive);
		System.out.println(this.name+"が斧で攻撃！"+target.name+"に"+dmg+"ポイントのダメージを与えた。");
        target.hp-=dmg;

	}
	
	
    }
	


