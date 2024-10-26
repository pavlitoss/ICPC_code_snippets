import java.util.*;
import java.lang.Math;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double s1 = in.nextDouble();
        double s2 = in.nextDouble();
        double e1 = in.nextDouble();
        double e2 = in.nextDouble();
        double c1 = in.nextDouble();
        double c2 = in.nextDouble();
        double r = in.nextDouble();
        double dX = e1-s1;
        double dY = e2-s2;
        double middleX = s1 + dX/2;
        double ans;

        if(c1+r<middleX ){ //whole circle is on the left of the middle
            double circleArea = r^2*Math.PI;
            circleArea/=2;
            ans = middleX + (circleArea/dY);
            System.out.println(ans);
        }else if(c1-r>middleX){ //whole circle is on the right of the middle
            double circleArea = r^2*Math.PI;
            circleArea/=2;
            ans = middleX - (circleArea/dY);
            System.out.println(ans);
        }else if(c1==middleX){ //whole circle is on the middle exactly
            System.out.println(middleX);
        }else{ //part of the circle touches the middle
            double right = c1+r;
            double left = c1-r;
            double mid;
            double circleArea =  r^2*Math.PI;
            circleArea/=2;
            double targetArea = (dX*dY)/2;
            targetArea -=circleArea;
            double actualArea;
            while(right-left>0.0001){
                mid = (right - left)/2;
                actualArea = 
                //calc actual area move appropriate pointers 
            }
            ans = left;
            System.out.println(ans);
        }


    }
}