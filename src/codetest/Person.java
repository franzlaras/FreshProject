/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetest;

/**
 *
 * @author user
 */
public class Person {

    private String name;
    private String gender;
    private boolean maried;
    private String age;
    private String alamat;
    private String NIK;
    private String noTelp;

    public Person() {
    }

    public Person(String name, String gender, boolean maried, String age, String alamat, String NIK, String noTelp) {
        this.name = name;
        this.gender = gender;
        this.maried = maried;
        this.age = age;
        this.alamat = alamat;
        this.NIK = NIK;
        this.noTelp = noTelp;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the maried
     */
    public boolean getMaried() {
        return maried;
    }

    /**
     * @param maried the maried to set
     */
    public void setMaried(boolean maried) {
        this.maried = maried;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the NIK
     */
    public String getNIK() {
        return NIK;
    }

    /**
     * @param NIK the NIK to set
     */
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    /**
     * @return the noTelp
     */
    public String getNoTelp() {
        return noTelp;
    }

    /**
     * @param noTelp the noTelp to set
     */
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

}
