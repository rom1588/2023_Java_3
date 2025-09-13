import java.util.ArrayList;

public class Bookshelf{
	private ArrayList<Book> arrayList = new ArrayList<Book>();
	public Bookshelf(){
	}
	public void add(Book book){
		this.arrayList.add(book);
	}
	public Book get(String isbn){
		//this.arrayListに入っているすべての本を取り出し、ISBNが引数isbn
		//と一致するときに、その本（Bookオブジェクト）をreturnする。
		//最後まで該当する本が見つからない場合は、nullをreturnする。
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			//Bookオブジェクトを１つarrayListから取り出す。
			Book book = this.arrayList.get(i);
			//取り出したBookオブジェクトのISBNを取得する。
			String s = book.getIsbn();
			//取得したISBNと引数isbnが等しいかチェック。等しければ
			//そのBookオブジェクトをreturnする。
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