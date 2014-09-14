package exam;

public class circular
 { 
  


public static void main(String[] args)
  {
	int a[]={23,34,54,87,7,10,13,16,19};
   boolean b=binary(a,0,19,a.length,a.length);
  System.out.println(b);
  
  }
	
  
    public static boolean binary(int b[],int startindex,int key,int endindex,int length)
    {
     
     System.out.println(startindex+" "+endindex );
     
     if(startindex>endindex)
    	return false;
     
     int midindex=0;
     
     
     
     int x=endindex+startindex;
     int y=key;
     
     
     if(x%2==0)
    	
     {
    	midindex=x/2;
     }
     
     else
     {
    	  midindex=(x+1)/2;
     }
     
     System.out.println(midindex);
     if(b[midindex]==key)
     {
    	 
    	 System.out.println(midindex);
    	 return true;
     }
    	
     else if(b[startindex]<b[midindex])
     {
       if(key>=b[startindex] && b[midindex]>=key)
       {   
    	  return binary(b,startindex,y,midindex-1,b.length);
       }
       
       else
       {
    	return   binary(b,midindex+1,y,endindex,b.length);
       }
     
     
     }
    
     else if(b[startindex]>b[midindex])
     {
    	 if(key>=b[startindex] && key<=b[midindex])
    	 {
    return 	binary(b,startindex,y,midindex-1,b.length);
    	 }
    	 
    	 else
    	 {
    	return	 binary(b,midindex+1,y,endindex,b.length);
    	 }
     
     }
    
    
    
     return false;
    }
  
  
	  
	
	
  }
