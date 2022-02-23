package controller.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CustomerRegisterRequest {
    private String email;
    private String password;
    private String name;
    private String phone;
    private String address;
}
