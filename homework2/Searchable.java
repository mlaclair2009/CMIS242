
public interface Searchable {

	public void Way2Search ();
	public void MaxGrade ();

class search implements Searchable {
	
	int grade = 100;
	String name = "Billy Bob";
	search Way2Search = new search();
	
	public void Way2Search (){
	System.out.print(name);
		return;
	}
	search MaxGrade = new search();
	public void MaxGrade (){
		System.out.print(grade);	
		return;
		}
		}
 
}
