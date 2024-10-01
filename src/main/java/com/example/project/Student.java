package com.example.project;

public class Student {
    // instance variables 
    String firstName;
    String lastName;
    int gradYear;
    double acculumatedTestScores;
    int testScoreCount;
    double highestTestScore;
    
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        acculumatedTestScores = 0.0;
        testScoreCount = 0;
        highestTestScore = 0.0;

    }
 
    // returns firstName
    public String getFirstName() {
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        return lastName;
    }
 
    // returns highestTestScore
    public double getHighestTestScore() {
        return highestTestScore;
    }

    // returns getTestScore
    public int getTestScoreCount(){
        return testScoreCount;
    }

    // returns gradYear
    public int getGradYear(){
        return gradYear;
    }
    
    //sets Graduation Year to another 
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        acculumatedTestScores += newTestScore;
        testScoreCount++;
        if (newTestScore > highestTestScore){
            highestTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if (averageTestScore() < 65) {
            return false;

        } else {
            return true;
            
        }
        
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        return acculumatedTestScores / testScoreCount;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 