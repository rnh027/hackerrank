/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class GFG {
    public static int sample(int input1,int input2,int input3,int input4)
    {
        Integer i = new Integer(input1);
        Integer i1 = new Integer(input2);
        Integer i2 = new Integer(input3);
        Integer i3 = new Integer(input4);
        String s = i.toString()+i1.toString()+i2.toString()+i3.toString();
        char b[] = s.toCharArray();
        int a[]=new int[10];
        for(int j=0;j<b.length;j++)
        {
            int c = (int)b[j]-48;
            a[c] = a[c]+1;
            //System.out.println(a[c]+" "+c);
        }
        int m = 0;
        int in = 0;
        for(int j=9;j>=0;j--)
        {
            if(m<a[j])
            {
                in=j;
                m = a[j];
            }
        }
        System.out.println(in);
        return in;
    }
	public static void main (String[] args) {
		Scanner ip = new Scanner(System.in);
		int i = ip.nextInt();
		int j = ip.nextInt();
		int k = ip.nextInt();
		int l = ip.nextInt();
		int m = sample(i,j,k,l);
	}
}
