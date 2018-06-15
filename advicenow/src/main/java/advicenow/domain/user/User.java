package advicenow.domain.user;

import java.time.LocalDateTime;

public class User {
    private final Long userId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final Character gender;
    private final LocalDateTime lastLogin;
    private final LocalDateTime creationDate;
    
    public User(Long userId, String firstName, String lastName, String email, String phone, Character gender, LocalDateTime lastLogin, LocalDateTime creationDate) {
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.lastLogin = lastLogin;
        this.creationDate = creationDate;
    }

	public Long getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public Character getGender() {
		return gender;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}
    
    
	/*
	{
		"user_id": "232",
		"first_name": "John",
		"last_name": "Miles",
		"email": "user@email.com",
		"phone:": "5511998117823",
		"gender": "M",
		"birth": "01/10/1990",
		"last_login": "15/05/2018",
		"creation_date": "01/04/2018"
	}
	*/
}