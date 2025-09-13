import java.util.ArrayList;

public class Bookshelf{
	private ArrayList<Book> arrayList = new ArrayList<Book>();
	public Bookshelf(){
	}
	public void add(Book book){
		this.arrayList.add(book);
	}
	public Book get(String isbn){
		//this.arrayList�ɓ����Ă��邷�ׂĂ̖{�����o���AISBN������isbn
		//�ƈ�v����Ƃ��ɁA���̖{�iBook�I�u�W�F�N�g�j��return����B
		//�Ō�܂ŊY������{��������Ȃ��ꍇ�́Anull��return����B
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			//Book�I�u�W�F�N�g���P��arrayList������o���B
			Book book = this.arrayList.get(i);
			//���o����Book�I�u�W�F�N�g��ISBN���擾����B
			String s = book.getIsbn();
			//�擾����ISBN�ƈ���isbn�����������`�F�b�N�B���������
			//����Book�I�u�W�F�N�g��return����B
			if(s.equals(isbn)){
				return book;
			}
		}
		return null;
	}
	public int size(){
		int size = this.arrayList.size();
		return size;
	}
}