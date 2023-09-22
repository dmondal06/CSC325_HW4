package com.mycompany.agency;



public class Agency
{
    //-----------------------------------------------------------------
    //  Creates a staff of employees for a agency and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
//        Staff personnel = new Staff("");
        Intern intern = new Intern("Nova Alim", "56 Scranton Lane", "333-222-1122", "555-555-5555", 0);
        TempEmployee temp = new TempEmployee("Bob", "45 Pineapple Lane", "444-333-2222", "000-000-0012", 20);

//        personnel.payday();
        intern.pay();
        temp.pay();
        temp.addHours(10);

    }
}
