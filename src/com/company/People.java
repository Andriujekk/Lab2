package com.company;

public class People {

    private final String Name;
    private final String LastName;
    private final int Age;
    private final String Job;


    People(String Name, String LastName, int Age, String Job)
    {
        this.Name = Name;
        this.LastName = LastName;
        this.Age = Age;
        this.Job = Job;
    }

    public String getFirstName()
    {
        return Name;
    }

    public String getLastName()
    {
        return LastName;
    }

    public int getAge()
    {
        return Age;
    }

    public String getJob()
    {
        return Job;
    }

}