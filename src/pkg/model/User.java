package pkg.model;

public class User {
	
	private String useId;
	private String password;
	
	public User()
	{
		
	}
	public User(String useId, String password) {
		super();
		this.useId = useId;
		this.password = password;
	}
	public String getUseId() {
		return useId;
	}
	public void setUseId(String useId) {
		this.useId = useId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((useId == null) ? 0 : useId.hashCode());
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
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (useId == null) {
			if (other.useId != null)
				return false;
		} else if (!useId.equals(other.useId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [useId=" + useId + ", password=" + password + "]";
	}
	
	

}
