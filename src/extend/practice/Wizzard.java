package extend.practice;

public class Wizzard extends Human {

	public void attack(Living target) {

		System.out.println("�l�Ԃ̃^�[���I");
		int dmg = Rand.get(9) * this.offensive;
		System.out.println(this.name + "�����@�ōU���I" + target.name + "��" + dmg + "�|�C���g�̃_���[�W��^�����B");
		target.hp -= dmg;

	}

}
