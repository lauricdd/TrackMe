package avila.schiatti.virdi.model.subscription;

import avila.schiatti.virdi.model.data.BloodType;
import avila.schiatti.virdi.model.data.Gender;
import avila.schiatti.virdi.model.user.Individual;
import xyz.morphia.annotations.*;

@Embedded
@Indexes(@Index(fields = { @Field("individual") }))
public class D4HQuery {
    @Reference(idOnly = true)
    private Individual individual;
    private String country;
    private String city;
    private String province;
    @Embedded
    private Gender gender;
    @Embedded
    private Comparison ageComparison;
    private Integer age;
    @Embedded
    private BloodType bloodType;

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public Comparison getAgeComparison() {
        return ageComparison;
    }

    public void setAgeComparison(Comparison ageComparison) {
        this.ageComparison = ageComparison;
    }
}
