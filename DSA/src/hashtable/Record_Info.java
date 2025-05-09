package hashtable;

import stack.Student;

public class Record_Info {

	public enum record_type {EMPTY, OCCUPIED, DELETED};
	public record_type status;
	public Student ref;
	
	
	public record_type getStatus() {
		return status;
	}
	public void setStatus(record_type status) {
		this.status = status;
	}
	public Student getRef() {
		return ref;
	}
	public void setRef(Student ref) {
		this.ref = ref;
	}
	
	
}
