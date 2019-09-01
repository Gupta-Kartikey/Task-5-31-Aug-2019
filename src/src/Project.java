
public class Project {

	private int i=0;
	private String cName;
	public Project(int i, String cName) {
		super();
		this.i = i;
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Project [Project ID=" + i + ", Company Name=" + cName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result + i;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (cName == null) {
			if (other.cName != null)
				return false;
		} else if (!cName.equals(other.cName))
			return false;
		if (i != other.i)
			return false;
		return true;
	}

}
