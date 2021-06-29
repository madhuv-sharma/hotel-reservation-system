package HRS; // may vary

import java.util.*;
import java.io.*;

public class HRS_Main
{

    String c_name, add, phone_no;
    double b_amt, gst;
    int b_dur, adults, children,total_cust, mattress;
    char laundry, brkfst, lunch, dinner, wifi, swimming, gym, spa, r_type, x;
    boolean flag;
    
    public hrs()
    {
        c_name=null;
        add=null;
        phone_no=null;
        b_amt=0.0d;
        gst=0.0d;
        b_dur=0;
        adults=0;
        children=0;
        total_cust=0;
        mattress=0;
        laundry=' ';
        brkfst=' ';
        lunch=' ';
        dinner=' ';
        wifi=' ';
        swimming=' ';
        gym=' ';
        spa=' ';
        r_type=' ';
        x=' ';
        flag=true;
    }
    
    public void inp() throws IOException
    {
        System.out.println("**********Welcome to Hotel California**********"); // Any Hotel Name
        
        Date date = new Date();
        System.out.println("**********"+date.toString()+"**********");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter B/b to book a room and E/e for exit :");
        x=sc.nextLine().charAt(0);
        
        for(;x!='B'&&x!='b'&&x!='E'&&x!='e';)
        {
            System.out.println("Wrong input.\nEnter B/b to book a room and E/e for exit :");
            x=sc.nextLine().charAt(0);
        }
        
        if(x=='E'||x=='e')
            System.exit(0);
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        for(;;)
        {
            System.out.println("Enter Number Of Adults :");
            adults=sc.nextInt();
            for(;adults<0;)
            {
                System.out.println("Wrong input.\nEnter Number Of Adults :");
                adults=sc.nextInt();
            }

            System.out.println("Enter Number Of Children :");
            children=sc.nextInt();
            for(;children<0;)
            {
                System.out.println("Wrong input.\nEnter Number Of Children :");
                children=sc.nextInt();
            }

            total_cust=adults+children;
            
            if(total_cust!=0)
                break;
            else
                System.out.println("Wrong input.\nTotal number of customers cannot be 0.");
        }
        
        System.out.println("Enter Number Of Mattresses (if required) @Rs100 per mattress per day :");
        mattress=sc.nextInt();
        for(;mattress<0;)
        {
            System.out.println("Wrong input.\nEnter Number Of Mattresses (if required) :");
            mattress=sc.nextInt();
        }
        
        for(;;)
        {
            System.out.println("Enter your Name :");
            c_name=br.readLine();
            for(int i=0;i<c_name.length();i++)
            {
                if(i==0)
                    if(Character.isWhitespace(c_name.charAt(i)))
                    {
                        flag=false;
                        break;
                    }
                if(!(Character.isLetter(c_name.charAt(i))||Character.isWhitespace(c_name.charAt(i))))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
               break;
            else
            {
                System.out.println("Wrong input.");
                flag=true;
            }
        }
        
        System.out.println("Enter Address :");
        add=br.readLine();
        
        for(;;)
        {
            System.out.println("Enter your Phone Number :");
            phone_no=br.readLine();
            for(int i=0;i<phone_no.length();i++)
                if(!(Character.isDigit(phone_no.charAt(i))))
                {
                    flag=false;
                    break;
                }
            if(flag)
               break;
            else
            {
                System.out.println("Wrong input.");
                flag=true;
            }
        }
        
        for(;;)
        {
            System.out.println("Enter Booking Duration (in days) :");
            b_dur=sc.nextInt();
            if(b_dur<1)
                System.out.println("Wrong input.");
            else
                break;
        }
        
        System.out.println("Enter 1 for Standard room (@Rs 5000/day), 2 for Deluxe (@Rs 7000/day) or 3 for Super Deluxe (@Rs 9000/day) :");
        r_type=sc.next().charAt(0);
        for(;r_type!='1'&&r_type!='2'&&r_type!='3';)
        {
            System.out.println("Wrong input.\nEnter 1 for Standard room (@Rs 5000/day), 2 for Deluxe  (@Rs 7000/day) or 3 for Super Deluxe  (@Rs 9000/day) :");
            r_type=sc.next().charAt(0);
        }
        
        System.out.println("Enter Y/y to avail laundry service (@Rs 200/day) and N/n if not :");
        laundry=sc.next().charAt(0);
        for(;laundry!='Y'&&laundry!='N'&&laundry!='y'&&laundry!='n';)
        {
            System.out.println("Wrong input\nEnter Y/y to avail laundry service (@Rs 200/day) and N/n if not :");
            laundry=sc.next().charAt(0);
        }      
        
        System.out.println("Enter Y/y if interested in having breakfast (@Rs 500/day) and N/n if not :");
        brkfst=sc.next().charAt(0);
        for(;brkfst!='Y'&&brkfst!='N'&&brkfst!='y'&&brkfst!='n';)
        {
            System.out.println("Wrong input\nEnter Y/y if interested in having breakfast (@Rs 500/day) and N/n if not :");
            brkfst=sc.next().charAt(0);
        }
        
        System.out.println("Enter Y/y if interested in having lunch (@Rs 500/day) and N/n if not :");
        lunch=sc.next().charAt(0);
        for(;lunch!='Y'&&lunch!='N'&&lunch!='y'&&lunch!='n';)
        {
            System.out.println("Wrong input\nEnter Y/y if interested in having lunch (@Rs 500/day) and N/n if not :");
            lunch=sc.next().charAt(0);
        }
        
        System.out.println("Enter Y/y if interested in having dinner (@Rs 500/day) and N/n if not :");
        dinner=sc.next().charAt(0);
        for(;dinner!='Y'&&dinner!='N'&&dinner!='y'&&dinner!='n';)
        {
            System.out.println("Wrong input\nEnter Y/y if interested in having dinner (@Rs 500/day) and N/n if not :");
            dinner=sc.next().charAt(0);
        }
        
        System.out.println("Enter Y/y for wifi (@Rs 200/day) and N/n to not :");
        wifi=sc.next().charAt(0);
        for(;wifi!='Y'&&wifi!='N'&&wifi!='y'&&wifi!='n';)
        {
            System.out.println("Wrong input\nEnter Y/y for wifi (@Rs 200/day) and N/n to not :");
            wifi=sc.next().charAt(0);
        }           
        
        System.out.println("Enter Y/y to access swimming pool area (@Rs 250/day) and N/n to not :");
        swimming=sc.next().charAt(0);
        for(;swimming!='Y'&&swimming!='N'&&swimming!='y'&&swimming!='n';)
        {
            System.out.println("Wrong input\nEnter Y/y to access swimming pool area (@Rs 250/day) and N/n to not :");
            swimming=sc.next().charAt(0);
        }
        
        System.out.println("Enter Y/y to get gym facility (@Rs 250/day) and N/n to not :");
        gym=sc.next().charAt(0);
        for(;gym!='Y'&&gym!='N'&&gym!='y'&&gym!='n';)
        {
            System.out.println("Wrong input\nEnter Y/y to get gym facility (@Rs 250/day) and N/n to not :");
            gym=sc.next().charAt(0);
        }            
        
        System.out.println("Enter Y/y to get spa facility (@Rs 300/day) and N/n to not :");
        spa=sc.next().charAt(0);
        for(;spa!='Y'&&spa!='N'&&spa!='y'&&spa!='n';)
        {
            System.out.println("Wrong input\nEnter Y/y to get spa facility (@Rs 300/day) and N/n to not :");
            spa=sc.next().charAt(0);
        }
    }
    
    public double calculate()
    {
        System.out.println("Customer Name - "+c_name);
        if(r_type=='1')
            b_amt=b_dur*5000;
        else if(r_type=='2')
            b_amt=b_dur*7000;
        else
            b_amt=b_dur*9000;
        
        System.out.println("Room rental- Rs "+b_amt);
        b_amt+=(100*b_dur*mattress);
        
        System.out.println("Mattress charges- Rs "+((100.0)*b_dur*mattress));
        
        if(laundry=='Y'||laundry=='y')
        {
            b_amt+=(200*b_dur);
            System.out.println("Laundry charges- Rs "+((200.0)*b_dur));
        }
        else
            System.out.println("Laundry charges- Rs 0.0");
        
        if(brkfst=='Y'||brkfst=='y')
        {
            b_amt+=(500*b_dur);
            System.out.println("Breakfast charges- Rs "+((500.0)*b_dur));
        }
        else
            System.out.println("Breakfast charges- Rs 0.0");
        
        if(lunch=='Y'||lunch=='y')
        {
            b_amt+=(500*b_dur);
            System.out.println("Lunch charges- Rs "+((500.0)*b_dur));
        }
        else
            System.out.println("Lunch charges- Rs 0.0");
        
        if(dinner=='Y'||dinner=='y')
        {
            b_amt+=(500*b_dur);
            System.out.println("Dinner charges- Rs "+((500.0)*b_dur));
        }
        else
            System.out.println("Dinner charges- Rs 0.0");
        
        if(wifi=='Y'||wifi=='y')
        {
            b_amt+=(200*b_dur);
            System.out.println("Wifi charges- Rs "+((200.0)*b_dur));
        }
        else
            System.out.println("Wifi charges- Rs 0.0");
        
        if(swimming=='Y'||swimming=='y')
        {
            b_amt+=(250*b_dur);
            System.out.println("Swimming charges- Rs "+((250.0)*b_dur));
        }
        else
            System.out.println("Swimming charges- Rs 0.0");
        
        if(gym=='Y'||gym=='y')
        {
            b_amt+=(250*b_dur);
            System.out.println("Gym charges- Rs "+((250.0)*b_dur));
        }
        else
             System.out.println("Gym charges- Rs 0.0");
        
        if(spa=='Y'||spa=='y')
        {
            b_amt+=(300*b_dur);
            System.out.println("Spa charges- Rs "+((300.0)*b_dur));
        }
        else
             System.out.println("Spa charges- Rs 0.0");
        
        System.out.println("Bill (excluding GST) - Rs "+b_amt);
        gst=((b_amt*18)/100);
        System.out.println("GST(18%)- Rs "+gst);
        b_amt=b_amt+gst;
        
        return b_amt;
    }
    
    public static void main()
    {
        hrs obj=new hrs();
        
        try
            obj.inp();
        catch(IOException e)
            e.printStackTrace();
        
        System.out.println("Amount payable (inclusive of GST) is Rs "+obj.calculate());
        
        System.out.println("**********Thank you for your visit.**********\n**********We hope to see you again!**********");
    }
    
}
