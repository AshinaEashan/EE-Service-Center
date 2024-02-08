package dto;

public class CustomerDto {
    private Long id;
    private String name;
    private String phoneNUmber;
    private String email;


    public CustomerDto(Long id, String name, String phoneNUmber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNUmber = phoneNUmber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
