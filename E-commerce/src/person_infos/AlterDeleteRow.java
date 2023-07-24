package person_infos;

public class AlterDeleteRow {
	private int Id;
	private String Newname;
	private String NewGmail;
	private String NewPhone;
	
	public AlterDeleteRow() {
		this.Id=Id;
		this.Newname=Newname;
		this.NewGmail=NewGmail;
		this.NewPhone=NewPhone;
	}
	public int getId(){
		return Id;
	}
	public void setid(int Id) {
		this.Id=Id;
	}
	public String getNewname() {
		return Newname;
	}
	public void setNewname(String Newname) {
		this.Newname=Newname;

	}
	public String getNewGmail() {
		return NewGmail;
	}
	public void setNewGmail(String NewGmail) {
		this.NewGmail=NewGmail;

	}
	public String getNewPhone() {
		return NewPhone;
	}
	public void setNewPhone(String NewPhone) {
		this.NewPhone=NewPhone;

	
	}
	
	
}
