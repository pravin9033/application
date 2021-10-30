package MutualFund;

import java.util.*;

public class MainClass {

    public static void main(String[]args){


        //mutual fund object
        mutual_fund c1 = new mutual_fund();
        c1.setClient_id(1);
        c1.setParent_id(1);
        c1.setBalance_unit(400);
        mutual_fund c2 = new mutual_fund();
        c2.setClient_id(2);
        c2.setParent_id(2);
        c2.setBalance_unit(800);
        mutual_fund c3 = new mutual_fund();
        c3.setClient_id(3);
        c3.setParent_id(3);
        c3.setBalance_unit(1200);

        //creating arraylist of mf object
        ArrayList<Object> cdetails = new ArrayList<Object>();
        cdetails.add(c1);
        cdetails.add(c2);
        cdetails.add(c3);




        //insurance object
        insurance i1 = new insurance();
        i1.setClient_id(1);
        i1.setPolicy_number("1A");
        i1.setPolicy_id(101);
        insurance i2 = new insurance();
        i2.setClient_id(2);
        i2.setPolicy_number("2B");
        i2.setPolicy_id(102);
        insurance i3 = new insurance();
        i3.setClient_id(3);
        i3.setPolicy_number("3C");
        i3.setPolicy_id(103);

        //Creating arraylist of insurance
        ArrayList<Object> idetails = new ArrayList<Object>();
        idetails.add(i1);
        idetails.add(i2);
        idetails.add(i3);




        // creating fixed deposit object
        FixedDeposit fd1 = new FixedDeposit();
        fd1.setClient_id(1);
        fd1.setAmount_invested(10000);
        fd1.setDate("30-10-2021");
        FixedDeposit fd2 = new FixedDeposit();
        fd2.setClient_id(2);
        fd2.setAmount_invested(20000);
        fd2.setDate("29-10-2021");
        FixedDeposit fd3 = new FixedDeposit();
        fd3.setClient_id(3);
        fd3.setAmount_invested(30000);
        fd3.setDate("28-10-2021");

        //Creating arraylist of fixed deposit
        ArrayList<Object> fddetails = new ArrayList<Object>();
        fddetails.add(fd1);
        fddetails.add(fd2);
        fddetails.add(fd3);



        //creating hashmap
        HashMap<Integer,ArrayList> map=new HashMap<Integer, ArrayList>();
        map.put(1,cdetails);
        map.put(2,idetails);
        map.put(3,fddetails);


        // printing map
        for(int i=1;i <=3 ; i++){
            System.out.println(i+":"+map.get(i));
        }





    }
}
