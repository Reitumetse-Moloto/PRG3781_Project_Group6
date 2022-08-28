package com.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

import com.project.appuser.AppUser;
import com.project.appuser.AppUserRepository;
import com.project.appuser.AppUserRole;


@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE) //makes sure that the tests dont replace any data in the db
@Rollback(false) // dont rollback
class StudentRegisterLoginApplicationTests {

	@Autowired
	private AppUserRepository repo;

	@Autowired
	private TestEntityManager entityManager;

	@Test
	public void testCreateUser() {
		AppUser Student = new AppUser("Jonathan", "Procos", "69 Solomon Mashlangu", "576853@student.belgiumcampus.ac.za" ,
		"password1", AppUserRole.USER);

		AppUser saveStudent = repo.save(Student);

		AppUser findStudent = entityManager.find(AppUser.class, saveStudent.getId());

		assertThat(findStudent.getEmail()).isEqualTo(Student.getEmail());
	}

	void contextLoads() {
	}

}
