package Final.wsd.Life.Coffe.controller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class MemberRequest {
    private Long id;
    private String MemberName;
    private String MemberEmail;
    private String MemberPassword;
    private String retypeMemberPassword;

}
