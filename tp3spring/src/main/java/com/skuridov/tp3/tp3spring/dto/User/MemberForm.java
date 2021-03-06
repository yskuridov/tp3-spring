package com.skuridov.tp3.tp3spring.dto.User;


import com.skuridov.tp3.tp3spring.model.User.Member;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberForm {
    private String id;
    private String firstName;
    private String lastName;
    private String address;

    public MemberForm(String id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public MemberForm(Member member){
        this(Long.toString(member.getId()), member.getFirstName(), member.getLastName(), member.getAddress());
    }

    public Member toMember(){
        return new Member(getFirstName(), getLastName(), getAddress());
    }

}
