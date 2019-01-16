package org.andestech.learning.rfb18.g3;

/**
 * Hello world!
 * @since 1.8
 *
 *
 */
public class App 
{
    /**
     * @author And
     *
     * @param args
     */
    public static void main( String[] args )
    {

        // if
        int i=12;
        if ( !(i != 13 || 2==i/6) )
        { i = 13;
            System.out.println("i is ok: " + i);}
         else {
            System.out.println("False");
        }

        int flag = 0x2;

         if(flag == 0x1) {
             System.out.println("1st " + flag);
         }
         else if(flag == 0x2) {
             System.out.println("2d " + flag);
         }
         else if(flag == 0x4) {
             System.out.println("3d " + flag);
             //...
             //...
         }
         else if(flag == 0x8) {
             System.out.println("4th " + flag);
         }
         else {System.out.println("not allowed:" + flag);}
//................

        int Napple=22;

        String app = "You bought " + Napple +
            " apple";
        if(Napple!=1) {app = app + "s.";}
        else {app = app + ".";}
        System.out.println(app);


        System.out.println("You bought " + Napple +
                " apple" + (Napple!=1?"s.":".")  );

         // switch

        switch (flag)
        {
            case 0x1:
                System.out.println("1st " + flag);
                //...
                //
                break;
            case 0x2:
                System.out.println("2d " + flag);
                break;

            case 0x4:
                System.out.println("3d " + flag);
                //...
                //...
                break;

            case 0x8:
                System.out.println("4th " + flag);
                break;

            default:
                System.out.println("Smth... " + flag);

        }

    }
}
