package contactos;

public class Contacto {
	private String phone;
	private String email;
	private String company;
	private String country;
	private String first_name;
	private String last_name;
	
	public Contacto(String phone, String email, String company, String country, String first_name,
			String last_name) {
		super();
		this.phone = phone;
		this.email = email;
		this.company = company;
		this.country = country;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public String toString() {
		return "Contacto [phone=" + phone + ", email=" + email + ", company=" + company + ", country=" + country
				+ ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	

	
	
	
	
}
