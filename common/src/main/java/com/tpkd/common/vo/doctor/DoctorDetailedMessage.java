package com.tpkd.common.vo.doctor;

import java.io.Serializable;

public class DoctorDetailedMessage implements Serializable {
    private int doctorId;
    private String doctorName;
    private String hospitalName;
    private String professionalTitle;
    private String departmentName;
    private String introduce;
    private String goodAt;
    private String medicalBackground;
    private String honnor;
    private String imageUrl;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getProfessionalTitle() {
        return professionalTitle;
    }

    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getGoodAt() {
        return goodAt;
    }

    public void setGoodAt(String goodAt) {
        this.goodAt = goodAt;
    }

    public String getMedicalBackground() {
        return medicalBackground;
    }

    public void setMedicalBackground(String medicalBackground) {
        this.medicalBackground = medicalBackground;
    }

    public String getHonnor() {
        return honnor;
    }

    public void setHonnor(String honnor) {
        this.honnor = honnor;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
