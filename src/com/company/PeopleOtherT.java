package com.company;

public class PeopleOtherT {

    private final String Name;
    private final String LastName;
    private final int Age;
    private final String Job;

    PeopleOtherT(String FirstName, String LastName, int Age, String Job)
    {
        this.Name = FirstName;
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PeopleOtherT that = (PeopleOtherT) o;

        if (Age != that.Age) return false;
        if (!Name.equals(that.Name)) return false;
        return LastName.equals(that.LastName);
    }

    @Override
    public int hashCode()
    {
        int result = Name.hashCode();
        result = 31 * result + LastName.hashCode();
        result = 31 * result + Age;
        return result;
    }
}