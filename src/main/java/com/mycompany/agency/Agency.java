package com.mycompany.agency;



public class Agency
{
    //-----------------------------------------------------------------
    //  Creates a staff of employees for a agency and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
//        Staff personnel = new Staff("");
        Intern intern = new Intern("", "", "", "", 0);
        TempEmployee temp = new TempEmployee("", "", "", "", 20);

//        personnel.payday();
        intern.pay();
        temp.pay();
        temp.addHours(10);

    }
}
