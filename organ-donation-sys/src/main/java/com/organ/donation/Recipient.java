package com.organ.donation;

public class Recipient {
       private Long id;
    private String name;
    private String email;
    private String bloodType;
    private String requiredOrgan;

    public Recipient() {}

    public Recipient(Long id, String name, String email, String bloodType, String requiredOrgan) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bloodType = bloodType;
        this.requiredOrgan = requiredOrgan;
    }

}
