package inheritanceTask2;/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */

import java.time.LocalDate;

/**
 * IKIN HASANOV's response to Homework "Inheritance", Module 2.
 *
 *   Task:
 *      Create a class Person and a class Student as  its daughter.  25 fields.
 *
 * @version 1.10
 * @Since 21-03-2021
 * @class Person
 * @author Ilkin Hasanov
 */
public class Student extends Person{
    private int studentID;
    private String university;
    private Degree degree;
    private String faculty;
    private String department;
    private Speciality speciality;
    private int enrolmentYear;
    private byte averageGrade;
    private int numOfCourses;
    private StudyLanguage language;
    private boolean isExhibitioner;

    private boolean isLibraryMember;
    private boolean isSportClubMember;
    private boolean isArtClubMember;

    public Student(int studentID, String university, Degree degree,
                   String faculty, String department, Speciality speciality,
                   int enrolmentYear, byte averageGrade, int numOfCourses,
                   StudyLanguage language, boolean isExhibitioner,
                   boolean isLibraryMember, boolean isSportClubMember,
                   boolean isArtClubMember) {
        this.studentID = studentID;
        this.university = university;
        this.degree = degree;
        this.faculty = faculty;
        this.department = department;
        this.speciality = speciality;
        this.enrolmentYear = enrolmentYear;
        this.averageGrade = averageGrade;
        this.numOfCourses = numOfCourses;
        this.language = language;
        this.isExhibitioner = isExhibitioner;
        this.isLibraryMember = isLibraryMember;
        this.isSportClubMember = isSportClubMember;
        this.isArtClubMember = isArtClubMember;
    }

    public Student(String firstName, String lastName, boolean isMarried,
                   LocalDate birthday, String bloodGroup, boolean isFemale,
                   boolean isMale, String citizenship, int passportID,
                   String address, String phoneNumber, String email,
                   int studentID, String university, Degree degree,
                   String faculty, String department, Speciality speciality,
                   int enrolmentYear, byte averageGrade, int numOfCourses,
                   StudyLanguage language, boolean isExhibitioner,
                   boolean isLibraryMember, boolean isSportClubMember,
                   boolean isArtClubMember) {
        super(firstName, lastName, isMarried, birthday, bloodGroup, isFemale,
                isMale, citizenship, passportID, address, phoneNumber, email);
        this.studentID = studentID;
        this.university = university;
        this.degree = degree;
        this.faculty = faculty;
        this.department = department;
        this.speciality = speciality;
        this.enrolmentYear = enrolmentYear;
        this.averageGrade = averageGrade;
        this.numOfCourses = numOfCourses;
        this.language = language;
        this.isExhibitioner = isExhibitioner;
        this.isLibraryMember = isLibraryMember;
        this.isSportClubMember = isSportClubMember;
        this.isArtClubMember = isArtClubMember;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public int getEnrolmentYear() {
        return enrolmentYear;
    }

    public void setEnrolmentYear(int enrolmentYear) {
        this.enrolmentYear = enrolmentYear;
    }

    public byte getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(byte averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

    public StudyLanguage getLanguage() {
        return language;
    }

    public void setLanguage(StudyLanguage language) {
        this.language = language;
    }

    public boolean isExhibitioner() {
        return isExhibitioner;
    }

    public void setExhibitioner(boolean exhibitioner) {
        isExhibitioner = exhibitioner;
    }

    public boolean isLibraryMember() {
        return isLibraryMember;
    }

    public void setLibraryMember(boolean libraryMember) {
        isLibraryMember = libraryMember;
    }

    public boolean isSportClubMember() {
        return isSportClubMember;
    }

    public void setSportClubMember(boolean sportClubMember) {
        isSportClubMember = sportClubMember;
    }

    public boolean isArtClubMember() {
        return isArtClubMember;
    }

    public void setArtClubMember(boolean artClubMember) {
        isArtClubMember = artClubMember;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "studentID=" + this.getStudentID() +
                ", university='" + this.getUniversity() + '\'' +
                ", degree=" + this.getDegree() +
                ", faculty='" + this.getFaculty() + '\'' +
                ", department='" + this.getDepartment() + '\'' +
                ", speciality=" + this.getSpeciality() +
                ", enrolmentYear=" + this.getEnrolmentYear() +
                ", averageGrade=" + this.getAverageGrade() +
                ", numOfCourses=" + this.getNumOfCourses() +
                ", language=" + this.getLanguage() +
                ", isExhibitioner=" + this.isExhibitioner() +
                ", isLibraryMember=" + this.isLibraryMember() +
                ", isSportClubMember=" + this.isSportClubMember() +
                ", isArtClubMember=" + this.isArtClubMember() +
                '}';
    }
}
