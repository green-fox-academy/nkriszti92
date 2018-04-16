public class VariableMutation {
    public static void main(String[] args) {
        // make it bigger by 10
        int a = 3;
        a +=10;
        System.out.println(a);



        // make it smaller by 7
        int b = 100;
        b -= 7;
        System.out.println(b);



        // please double c's value
        int c = 44;
        c *= 2;
        System.out.println(c);



        // please divide by 5 d's value
        int d = 125;
        d /= 5;
        System.out.println(d);



        // please cube of e's value
        int e = 8;
        e *= e*e;
        System.out.println(e);



        // tell if f1 is bigger than f2 (print as a boolean)
        int f1 = 123;
        int f2 = 345;
        boolean bigger = (f1 > f2);
        if (bigger){
            System.out.println(f1 +" > " + f2);
        }
        else System.out.println(f1 +" < " + f2);




        // tell if the double of g2 is bigger than g1 (print as a boolean)
        int g1 = 350;
        int g2 = 200;
        g2 *= 2;

        boolean doubleOf = (g2 > g1);

        if (doubleOf){
            System.out.println(g2 + " > " + g1 + " is " + doubleOf );
        }
        else System.out.println(g2 + " > " + g1 + " is " + doubleOf);




        // tell if it has 11 as a divisor (print as a boolean)
        int h = 135798745;
        int h2 = h % 11;
        boolean divisor = (h2 == 0);
        if (divisor){
            System.out.println("11 is a divisor of " + h + " is" + divisor );
        }
        else System.out.println("11 is a divisor of " + h + " is" + divisor);



        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i1 = 10;
        int i2 = 3;
        int i21 = i2 * i2 * i2;
        int i22 = i2 * i2;

        boolean statement1 = (i1 > i22);
        boolean statement2 = (i1 < i21);
        boolean statements = (statement1 && statement2);

        if (statements){
            System.out.println(i1 + " > " + i22 + " and " + i1 + " < " + i21 + " is " + statements);
        }
        else System.out.println(i1 + " > " + i22 + " and " + i1 + " < " + i21 + " is " + statements);




        // tell if j is dividable by 3 or 5 (print as a boolean)
        int j = 1521;
        int ifDiv3 = j % 3;
        int ifDiv5 = j % 5;
        boolean div3 = (ifDiv3 ==0);
        boolean div5 = (ifDiv5 ==0);
        boolean dividable = (div3 || div5);

        if(dividable){
            System.out.println(j + " is dividiable by 3 or 5 is " + dividable);
        }
        else System.out.println(j + " is dividiable by 3 or 5 is " + dividable);


        //fill the k variable with its content 4 times
        String k = "Apple";
        k += k;
        k += k;
        k += k;
        k += k;
        System.out.println(k);
    }
}