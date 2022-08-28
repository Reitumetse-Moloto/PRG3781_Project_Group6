package com.project.appuser;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name= "students")
public class appRegister implements UserDetails{
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY

            //generator = "student_sequence"
    )
    private Long registerId;
    
    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(nullable = false, length = 20)
    private String studentName;
    @Column(nullable = false, length = 20)
    private String courseName;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(nullable = false, length = 50)
    private String address;
    @Enumerated(EnumType.STRING)
    private AppUserRole appUserRole;
    private Boolean locked = false;
    private Boolean enabled = false;


    public appRegister(String studentName,
                    String address,
                    String email,
                    String password,
                    String courseName,
        AppUserRole appUserRole) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.appUserRole = appUserRole;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }


    @Override
    public String getUsername() {
        return null;
    }


    @Override
    public boolean isAccountNonExpired() {
        return false;
    }


    @Override
    public boolean isAccountNonLocked() {
        return false;
    }


    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }


    @Override
    public boolean isEnabled() {
        return false;
    }
}
