package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // Initialize staff members
        staffList[0] = new Executive("Alice", "123 Main St", "555-123-4567", "123-45-6789", 1000.0);
        staffList[1] = new Intern("Nova Alim", "56 Scranton Lane", "333-222-1122", "555-555-5555", 0);
        staffList[2] = new TempEmployee("Bob", "45 Pineapple Lane", "444-333-2222", "000-000-0012", 20);
        staffList[3] = new TempEmployee("Deepa", "56 Night Lane", "545-555-9292", "345-768-2334",10);
        staffList[4] = new Intern("Meow Chang", "89 Meow Lane", "444-222-6767", "999-545-7777", 0);
        staffList[5] = new StaffEmployee("Bork Wolf", "31 Elm street", "631-345-9292", "435-768-5634",10);

        // Award a bonus to the executive
        ((Executive) staffList[0]).awardBonus(500.0);

        // Add hours worked for TempEmployee
        ((TempEmployee) staffList[2]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
