package extend.practice;

public class Slime extends Monster {
	
	public void attack(Living target) {
		System.out.println("�����X�^�[�̃^�[���I");
		int dmg=Rand.get(this.offensive);
		System.out.println(this.name+"���̓�����ōU���I"+target.name+"��"+dmg+"�|�C���g�̃_���[�W��^�����B");
	    target.hp-=dmg;

	}
	
	}


