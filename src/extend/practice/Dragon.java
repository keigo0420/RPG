package extend.practice;

public class Dragon extends Monster {

	public void attack(Living target) {

		System.out.println("�����X�^�[�̃^�[���I");
		int dmg = Rand.get(10) * this.offensive;
		System.out.println(this.name + "�����ōU���I" + target.name + "��" + dmg + "�|�C���g�̃_���[�W��^�����B");
		target.hp -= dmg;

	}

}
