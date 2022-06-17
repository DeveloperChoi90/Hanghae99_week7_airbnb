package hanghae99.clonecoding.airbnb.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Builder
public class Member extends TimeStamp{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private LocalDate birth;

    @Column
    private String picture;

    @Column(columnDefinition = "boolean default false")
    private boolean isHost;

    // 호스트
    @Column
    private String intro;

    @Column
    private String communicate;

    public Member() {

    }
}
