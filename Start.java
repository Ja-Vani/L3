public class Start {
	public static void main(String[] args) {
		Person puh = new Person(Persons.Vinni);
		Person robbin = new Person(Persons.Robin);
		Place forest = new Place("���");
		Place porog = new Place("������");
		Song shum = new Song("�������");
		Boot boot = new Boot("�������� ������");
		puh.like(shum, "�� �������");
		puh.walk(forest);
		puh.sing(shum, "��� ����");
		robbin.sit(porog);
		robbin.wear(boot);
		puh.see(robbin);

	}
}