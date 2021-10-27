package com.company;

import java.util.*;

public class Collections {

    private final List<People> PeopleArrayList = new ArrayList<>();
    private final List<People> PeopleLinkedList = new LinkedList<>();
    private final Set<People>  PeopleHashSet= new TreeSet<>(new Tree_SetComparator());
    private final Set<People> PeopleTreeSet = new HashSet<>();
    private final Map<Integer, People> PeopleTreeMap = new TreeMap<>();
    private final Map<Integer, People> PeopleHashMap = new HashMap();
    void MainLoop()
    {
        addPeople();

        int choice;

        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println(FinalMenu);
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    display();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }


    private void addPeople() {

        People first = new People("Marek", "Nowak", 42, "Stolarz");

        PeopleArrayList.add(first);
        PeopleLinkedList.add(first);
        PeopleTreeSet.add(first);
        PeopleHashSet.add(first);
        PeopleTreeMap.put(1, first);
        PeopleHashMap.put(1, first);

        People second = new People("Filip", "Skwarek", 28, "Ratownik");

        PeopleArrayList.add(second);
        PeopleLinkedList.add(second);
        PeopleTreeSet.add(second);
        PeopleHashSet.add(second);
        PeopleTreeMap.put(2, second);
        PeopleHashMap.put(2, second);


        People third = new People("Jakub", "Porębski", 37, "Piekarz");

        PeopleArrayList.add(third);
        PeopleLinkedList.add(third);
        PeopleTreeSet.add(third);
        PeopleHashSet.add(third);
        PeopleTreeMap.put(3, third);
        PeopleHashMap.put(3, third);

        People fourth = new People("Tomasz", "Stoch", 34, "Komik");

        PeopleArrayList.add(fourth);
        PeopleLinkedList.add(fourth);
        PeopleTreeSet.add(fourth);
        PeopleHashSet.add(fourth);
        PeopleTreeMap.put(4, fourth);
        PeopleHashMap.put(4, fourth);


        People fifth = new People("Michał", "Kowalski", 23, "Student");

        PeopleArrayList.add(fifth);
        PeopleLinkedList.add(fifth);
        PeopleTreeSet.add(fifth);
        PeopleHashSet.add(fifth);
        PeopleTreeMap.put(5, fifth);
        PeopleHashMap.put(5, fifth);
    }

    private void display() {

        // Formatowanie tekstuu
        String firstLine = String.format("|%15s|%15s|%5s|%8s|", "Name", "Last Name", "Age", "Job");
        String breakLine = "************************************************";

        System.out.println(containers);

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice)
        {

            case 1:

                System.out.println(firstLine);
                System.out.println(breakLine);

                for (var people : PeopleArrayList) {
                    String output = String.format("|%15s|%15s|%5s|%8s|", people.getFirstName(), people.getLastName(), people.getAge(), people.getJob());

                    System.out.println(output);
                    System.out.println(breakLine);
                }
                break;

            case 2:

                System.out.println(firstLine);
                System.out.println(breakLine);

                for (var people : PeopleLinkedList) {
                    String output = String.format("|%15s|%15s|%5s|%8s|", people.getFirstName(), people.getLastName(), people.getAge(), people.getJob());

                    System.out.println(output);
                    System.out.println(breakLine);
                }
                break;

            case 3:

                System.out.println(firstLine);
                System.out.println(breakLine);

                for (var people : PeopleTreeSet) {
                    String output = String.format("|%15s|%15s|%5s|%8s|", people.getFirstName(), people.getLastName(), people.getAge(), people.getJob());

                    System.out.println(output);
                    System.out.println(breakLine);
                }
                break;

            case 4:

                System.out.println(firstLine);
                System.out.println(breakLine);

                for (var people : PeopleHashSet) {
                    String output = String.format("|%15s|%15s|%5s|%8s|", people.getFirstName(), people.getLastName(), people.getAge(), people.getJob());

                    System.out.println(output);
                    System.out.println(breakLine);
                }
                break;

            case 5:

                System.out.println(firstLine);
                System.out.println(breakLine);

                for (int i = 1; i <= PeopleTreeMap.size(); i++) {
                    String output = String.format("|%15s|%15s|%5s|%8s|", PeopleTreeMap.get(i).getFirstName(), PeopleTreeMap.get(i).getLastName(), PeopleTreeMap.get(i).getAge(), PeopleTreeMap.get(i).getJob());

                    System.out.println(output);
                    System.out.println(breakLine);
                }
                break;

            case 6:

                System.out.println(firstLine);
                System.out.println(breakLine);

                for (int i = 1; i <= PeopleHashMap.size(); i++) {
                    String output = String.format("|%15s|%15s|%5s|%8s|", PeopleHashMap.get(i).getFirstName(), PeopleHashMap.get(i).getLastName(), PeopleHashMap.get(i).getAge(), PeopleHashMap.get(i).getJob());

                    System.out.println(output);
                    System.out.println(breakLine);
                }
                break;
        }
    }

    private void delete()
    {
        Random rand = new Random();

        System.out.println(containers);

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        int whichOne = 0;

        switch (choice)
        {
            case 1:

                if(PeopleArrayList.size() > 0)
                {
                    whichOne = rand.nextInt(PeopleArrayList.size());
                    PeopleArrayList.remove(whichOne);
                }
                else
                    System.out.println("Size = 0, couldn't remove object");

                break;

            case 2:

                if(PeopleLinkedList.size() > 0)
                {
                    whichOne = rand.nextInt(PeopleLinkedList.size());
                    PeopleLinkedList.remove(whichOne);
                }
                else
                    System.out.println("Size = 0, couldn't remove object");

                break;

            case 3:

                if(PeopleTreeSet.size() > 0)
                {
                    whichOne = rand.nextInt(PeopleTreeSet.size());

                    Iterator<People> iterHashSet = PeopleTreeSet.iterator();

                    for (int i = 0; i < PeopleTreeSet.size(); )
                    {
                        while (iterHashSet.hasNext())
                        {
                            People next = iterHashSet.next();

                            if (i == whichOne)
                            {
                                iterHashSet.remove();
                            }
                            i++;
                        }
                    }
                }
                else
                    System.out.println("Size = 0, couldn't remove object");

                break;

            case 4:
                if(PeopleHashSet.size() > 0)
                {
                    whichOne = rand.nextInt(PeopleHashSet.size());

                    Iterator<People> iterTreeSet = PeopleHashSet.iterator();

                    for (int i = 0; i < PeopleHashSet.size(); )
                    {
                        while (iterTreeSet.hasNext())
                        {

                            People next = iterTreeSet.next();

                            if (i == whichOne)
                            {
                                iterTreeSet.remove();
                            }

                            i++;
                        }
                    }
                }
                else
                    System.out.println("Size = 0, couldn't remove object");

                break;

            case 5:

                if(PeopleTreeMap.size() > 0)
                {
                    whichOne = rand.nextInt(PeopleTreeMap.size());
                    PeopleTreeMap.remove(whichOne);
                }
                else
                    System.out.println("Size = 0, couldn't remove object");

                break;

            case 6:
                if(PeopleHashMap.size() > 0)
                {
                    whichOne = rand.nextInt(PeopleHashMap.size());
                    PeopleHashMap.remove(whichOne);
                }
                else
                    System.out.println("Size=0");

                break;

        }
    }


    private final String FinalMenu =
            "1. Display\n2. Delete object\n3. Exit";

    private final String containers =
            "1. ArrayList\n2. LinkedList\n3. TreeSet\n" +
                    "4. HashSet\n5. TreeMap\n6. HashMap\n";



    private static class Tree_SetComparator implements Comparator<People>
    {
        @Override
        public int compare(People p1, People p2)
        {
            return 0;
        }
    }
}
