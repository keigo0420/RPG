package extend.practice;

import java.util.*;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Human h1 = new Wizzard();
		Human h2 = new Brave();
		Human h3 = new Fighter();

		h1.name = "���@�g��";
		;
		h1.hp = 100;
		h1.offensive = 50;
		h2.name = "�E��";
		h2.hp = 150;
		h2.offensive = 70;
		h3.name = "��m";
		h3.hp = 110;
		h3.offensive = 50;

		Monster m1 = new Dragon();
		Monster m2 = new Slime();
		Monster m3 = new Oak();

		m1.name = "�h���S��";
		m1.hp = 120;
		m1.offensive = 80;
		m2.name = "�X���C��";
		m2.hp = 80;
		m2.offensive = 40;
		m3.name = "�I�[�N";
		m3.hp = 100;
		m3.offensive = 50;

		List<Human> list = new ArrayList<>(); // �l�ԃ��X�g
		list.add(h1);
		list.add(h2);
		list.add(h3);

		List<Monster> list2 = new ArrayList<>(); // �����X�^�[���X�g
		list2.add(m1);
		list2.add(m2);
		list2.add(m3);

		while (true) {
			Human h = list.get(Rand.get(list.size()));
			Monster m = list2.get(Rand.get(list2.size()));

			h.attack(m);
			if (m.hp <= 0) {
				System.out.println(m.name+"�͓|�ꂽ�B");
				list2.remove(m);
			}
			if (list2.isEmpty()) {
				System.out.println("�E�҂����͏��������I");
				break;
			}
			m.attack(h);
			if (h.hp <= 0) {
				System.out.println(h.name+"�͓|�ꂽ�B");
				list.remove(h);
			}if (list.isEmpty()) {
				System.out.println("�E�҂����͕����Ă��܂����I");	
					break;
			}

			/*
			 * m.attack(h);C
			 * 
			 * }
			 * 
			 * while(h1.hp+h2.hp+h3.hp>=0||m1.hp+m2.hp+m3.hp>=0) { //�^�[�Q�b�g���� int w=new
			 * java.util.Random().nextInt(18);
			 * 
			 * 
			 * 
			 * 
			 * 
			 * if(w==1){h2.attack1(m1);} else if(w==2){h2.attack2(m2);} else
			 * if(w==3){h2.attack3(m3);}
			 * 
			 * if(h2.hp<=0) {list.remove("�E��");} if(w==4){h2.attack1(m1);} else
			 * if(w==5){h2.attack2(m2);} else if(w==6){h2.attack3(m3);}
			 * 
			 * 
			 * if(h3.hp<=0) {list.remove("��m");} else if(w==7){h3.attack1(m1);} else
			 * if(w==8){h3.attack2(m2);} else if(w==9){h3.attack3(m3);}
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * else if(w==10){m1.attack4(h1);} else if(w==11){m1.attack5(h2);} else
			 * if(w==12){m1.attack6(h3);}
			 * 
			 * if(m2.hp<=0) {list2.remove("�X���C��");} else if(w==13){m1.attack4(h1);} else
			 * if(w==14){m2.attack5(h2);} else if(w==15){m2.attack6(h3);}
			 * 
			 * if(m3.hp<=0) {list2.remove("�I�[�N");} else if(w==16){m3.attack4(h1);} else
			 * if(w==17){m3.attack5(h2);} else if(w==18){m3.attack6(h3);}
			 * 
			 * 
			 * 
			 * }
			 * 
			 * 
			 * /*if(h1.hp<=0&&h2.hp<=0&&h3.hp<=0) {System.out.println("���������͏��������I");}
			 */

		}
	}
}
