package com.organ.donation;

public class Donor {
       private Long id;
    private String name;
    private String email;
    private String bloodType;
    private String organ;

    public Donor() {}

    public Donor(Long id, String name, String email, String bloodType, String organ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bloodType = bloodType;
        this.organ = organ;
    }

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getBloodType() { return bloodType; }
    public void setBloodType(String bloodType) { this.bloodType = bloodType; }
    public String getOrgan() { return organ; }
    public void setOrgan(String organ) { this.organ = organ; }
}
 