package Final.wsd.Life.Coffe.member;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tbl_members")
@NoArgsConstructor
public class newMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long id;
    private String emberName;
    private String MemberEmail;
    private String MemberPassword;
}
