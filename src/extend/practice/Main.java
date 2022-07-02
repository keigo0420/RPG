package extend.practice;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Human h1 = new Wizzard();
		Human h2 = new Brave();
		Human h3 = new Fighter();

		h1.name = "魔法使い";
		h1.hp = 100;
		h1.offensive = 50;
		h2.name = "勇者";
		h2.hp = 150;
		h2.offensive = 70;
		h3.name = "戦士";
		h3.hp = 110;
		h3.offensive = 50;

		Monster m1 = new Dragon();
		Monster m2 = new Slime();
		Monster m3 = new Oak();

		m1.name = "ドラゴン";
		m1.hp = 120;
		m1.offensive = 80;
		m2.name = "スライム";
		m2.hp = 80;
		m2.offensive = 40;
		m3.name = "オーク";
		m3.hp = 100;
		m3.offensive = 50;

		List<Human> human = new ArrayList<>(); // 人間リスト
		human.add(h1);
		human.add(h2);
		human.add(h3);

		List<Monster> monster = new ArrayList<>(); // モンスターリスト
		monster.add(m1);
		monster.add(m2);
		monster.add(m3);

		while (true) {
			Human h = human.get(Rand.get(human.size()));
			Monster m = monster.get(Rand.get(monster.size()));

			h.attack(m);
			if (m.hp <= 0) {
				System.out.println(m.name + "は倒れた。");
				monster.remove(m);
			}
			if (monster.isEmpty()) {
				System.out.println("勇者たちは勝利した！");
				break;
			}
			m.attack(h);
			if (h.hp <= 0) {
				System.out.println(h.name + "は倒れた。");
				human.remove(h);
			}
			if (human.isEmpty()) {
				System.out.println("勇者たちは負けてしまった！");
				break;
			}

		}
	}
}
