package advicenow.domain.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class User {
	@Id
    private final Long userId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final Character gender;
    private final LocalDate birthDate;
    private final LocalDateTime lastLogin;
    private final LocalDateTime creationDate;
    
    public User(Long userId, String firstName, String lastName, String email, String phone, Character gender, LocalDate birthDate, LocalDateTime lastLogin, LocalDateTime creationDate) {
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	@Override
	public String toString() {
		return String.format("User[userId=%s, firstName='%s', lastName='%s', email='%s', phone='%s', gender='%s', birthDate='%s', lastLogin='%s', creationDate='%s']", 
				this.userId, this.firstName, this.lastName, this.email, this.phone, this.gender, this.birthDate, this.lastLogin, this.creationDate);
	}
}