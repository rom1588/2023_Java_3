public class B4_6{
	public static void main(String[] args){
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.add(new Book("978-4-7973-7125-3", "Java����v���O���~���O���b�X��(��)", 
			"����_", "�\�t�g�o���N�N���G�C�e�B�u"));
		bookshelf.add(new Book("978-4-7973-7126-0", "Java����v���O���~���O���b�X��(��)", 
			"����_", "�\�t�g�o���N�N���G�C�e�B�u"));
	
		//�{�I����ISBN����v����{���o��
		Book book = bookshelf.get("978-4-7973-7126-0");
		String title = book.getTitle();
		System.out.println(title);
	}
}