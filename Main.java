
import java.util.*;
class Main {
    public static int monthcall(int month){
        int daysinmonth;
        switch(month){
            case 1:
                {
                return 31;
                
                }
            case 2:
                {
                return 28;
                
                }
            case 3:
                {
                return 31;
                
                }
            case 4:
                {
                return 30;
              
                }
            case 5:
                {
                return 31;
                
                }
            case 6:
                {
                return 30;
                
                }
            case 7:
                {
               return 31;
                }
            case 8:
                {
                return 31;
                
                }
            case 9:
                {
                return 30;
                
                }
            case 10:
                {
                return 31;
               
                }
            case 11:
                {
                return 30;
            
                }
            case 12:
                {
                return 31;
                
                }
        }
        return 0;
    }
    public static void main(String[] args) {
        
        System.out.println("Hello, World!"); 
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[20];
        int arr1[]=new int[20];
        String today=sc.next();
        int sum=0,k=0;
        for(int i=0;i<today.length();i++){
            if(today.charAt(i)=='.'){
                k++;
                sum=0;
            }
            else{
                sum=(today.charAt(i)-'0')+sum*10;
                arr[k]=sum;
            }
        }
       String zoho="1.9.22";
        int sum1=0,k1=0;
        for(int i=0;i<zoho.length();i++){
            if(zoho.charAt(i)=='.'){
                k1++;
                sum1=0;
            }
            else{
                sum1=(zoho.charAt(i)-'0')+sum1*10;
                arr1[k1]=sum1;
                
            }
        }
        
       Main obj=new Main();
       int daysinmonth;
       int days,monthdays,daysfordiffmonth=0;
       
       if(arr[2]==arr1[2]&&arr[1]==arr1[1]&&arr[0]==arr1[0]){  //same date...
           System.out.println("same date");
       }
       else if(arr[2]==arr1[2]&&arr[1]==arr1[1]&&arr1[0]!=arr[0]){ //month same date same..
        days=arr1[0]-arr[0];
        System.out.println("no.of left days in the same month: "+days);
       }
       else if(arr[2]==arr1[2]&&arr1[1]!=arr[1]){
           while(arr[1]<arr1[1]){ 
               daysfordiffmonth=daysfordiffmonth+obj.monthcall(arr[1]);
               System.out.println(daysfordiffmonth);
               arr[1]++;
           }
           System.out.println("no.of days left between months: "+(daysfordiffmonth+(obj.monthcall(arr[1])-arr[0])));
       }
       else if(arr[2]!=arr1[2]&&arr[1]!=arr1[1]&&arr1[0]!=arr[0]){
           
              days=Math.abs(arr1[0]-arr[0]);
       
           while(arr[1]<arr1[1]){
               daysfordiffmonth=daysfordiffmonth+obj.monthcall(arr[1]);
               arr[1]++;
           }
           while(arr[1]>arr1[1]){
               daysfordiffmonth=daysfordiffmonth-obj.monthcall(arr[1]);
               arr[1]--;
           }
          
            int d=days+daysfordiffmonth+Math.abs(arr[2]-arr1[2])*365;
            System.out.println(d);
       }
       else if(arr[2]!=arr1[2]&&arr[1]==arr1[1]&&arr1[0]==arr[0]){
          System.out.println(Math.abs(arr[2]-arr1[2])*365);
       }
       }
        
    }
