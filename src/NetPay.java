/*
 * Sean Luo
 * Netpay.java
 * This program calculates the NetPay 
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //h represents the work hours
        double h=40;
        //w represents the price per hour of work
        double w=5;
        //i represents the inserance premium
        double i=2;
        //t represents the tax amount
        double t=0.22;
        //n represents the wage
        double n=(h*w-i)-t*(h*w-i);
        System.out.println("The n is= $"+n);
    }
    
}