package com.Calculatebonus;

import java.util.Scanner;

public class BonusCalculation {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int sun=scn.nextInt();
        int mon=scn.nextInt();
        int tue=scn.nextInt();
        int wed=scn.nextInt();
        int thu=scn.nextInt();
        int fri=scn.nextInt();
        int sat=scn.nextInt();
        int monrate=0,tuerate=0,wedrate=0,thurate=0,frirate=0,satrate=0,sunrate=0;
        int totalhours=mon+tue+wed+thu+fri+sat+sun;
        int totalrate=0;
        if(mon<=8)
        {
            monrate=mon*100;
        }
        else if(mon>8 && totalhours<=40)
        {
            monrate=((mon-8)*115)+800;
        }
        else if(mon>8 && totalhours>40)
        {
            monrate=mon*100;
        }
        if(tue<=8)
        {
            tuerate=(tue)*100;
        }
        else if(tue>8 && totalhours<=40)
        {
            tuerate=((tue-8)*115)+800;
        }
        else if(tue>8 && totalhours>40)
        {
            tuerate=tue*100;
        }
        if(wed<=8)
        {
            wedrate=wed*100;
        }
        if(wed>8 && totalhours<=40)
        {
            wedrate=((wed-8)*115)+800;
        }
        else if(wed>8 && totalhours>40)
        {
            wedrate=wed*100;
        }
        if(thu<=8)
        {
            thurate=thu*100;
        }
        if(thu>8 && totalhours<=40)
        {
            thurate=((thu-8)*115)+800;
        }
        else if(thu>8 && totalhours>40)
        {
            thurate=thu*100;
        }
        if(fri<=8)
        {
            frirate=fri*100;
        }
        if(fri>8 && totalhours<=40)
        {
            frirate=((fri-8)*115)+800;
        }
        else if(fri>8 && totalhours>40)
        {
            frirate=fri*100;
        }
        if(totalhours<=40)
        {
            satrate=sat*125;
            sunrate=sun*150;
        }
        else
        {
            satrate=sat*100;
            sunrate=sun*100;

        }
        if(totalhours>40)
        {
            totalhours=totalhours-40;
            totalrate=totalrate+(totalhours*25);
        }
        System.out.println(monrate+tuerate+wedrate+thurate+frirate+satrate+sunrate+totalrate);


    }
}
