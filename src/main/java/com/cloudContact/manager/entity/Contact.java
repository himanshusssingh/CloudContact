package com.cloudContact.manager.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {

    @Id
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String profile;
    @Column(length = 500)
    private String description;
    private Boolean favorite = false;
    private String websiteLink;
    private String linkedInLink;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<SocialLink> socialLinks = new ArrayList<>();

    @ManyToOne
    private User user;
}
