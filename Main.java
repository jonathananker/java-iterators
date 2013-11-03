/* *** This file is given as part of the programming assignment. *** */

public class Main {

    public static void main(String [] args) {

    // instantiate some elements
    IntSeq i1 = new IntSeq();
    IntSeq i2 = new IntSeq();
    IntSeq i3 = new IntSeq(88);
    IntSeq i4 = new IntSeq(97, 55);
    IntSeq i5 = new IntSeq(102, 103, 101, 107, 109);
    IntSeq i6 = new IntSeq(41, 42, 43, 44);
    CharSeq s1 = new CharSeq("abc");
    CharSeq s2 = new CharSeq("");
    CharSeq s3 = new CharSeq("abcdefghijklmnopqrstuvwxyz0123456789");
    CharSeq s4 = new CharSeq("abcdefghijklmnopqrstuvwx");
    CharSeq s5 = new CharSeq("XYZ");
    CharSeq s6 = new CharSeq("a123b");
        // do everything twice just to double check
        for( int i = 0; i < 2; i++) {
            
             System.out.print( "i1" + ":"); 
             System.out.print(i1); 
             System.out.println(":"); 
             System.out.println( "(Seq)i1 instanceof CharSeq" + ":" + ((Seq)i1 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i1 instanceof IntSeq" + ":" + ((Seq)i1 instanceof IntSeq) + ":");
            
             System.out.print( "i2" + ":"); 
             System.out.print(i2); 
             System.out.println(":"); 
             System.out.println( "(Seq)i2 instanceof CharSeq" + ":" + ((Seq)i2 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i2 instanceof IntSeq" + ":" + ((Seq)i2 instanceof IntSeq) + ":");
            
             System.out.print( "i3" + ":"); 
             System.out.print(i3); 
             System.out.println(":"); 
             System.out.println( "(Seq)i3 instanceof CharSeq" + ":" + ((Seq)i3 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i3 instanceof IntSeq" + ":" + ((Seq)i3 instanceof IntSeq) + ":");
            
             System.out.print( "i4" + ":"); 
             System.out.print(i4); 
             System.out.println(":"); 
             System.out.println( "(Seq)i4 instanceof CharSeq" + ":" + ((Seq)i4 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i4 instanceof IntSeq" + ":" + ((Seq)i4 instanceof IntSeq) + ":");
            
             System.out.print( "i5" + ":"); 
             System.out.print(i5); 
             System.out.println(":"); 
             System.out.println( "(Seq)i5 instanceof CharSeq" + ":" + ((Seq)i5 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i5 instanceof IntSeq" + ":" + ((Seq)i5 instanceof IntSeq) + ":");
            
             System.out.print( "i6" + ":"); 
             System.out.print(i6); 
             System.out.println(":"); 
             System.out.println( "(Seq)i6 instanceof CharSeq" + ":" + ((Seq)i6 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i6 instanceof IntSeq" + ":" + ((Seq)i6 instanceof IntSeq) + ":");
            
             System.out.print( "s1" + ":"); 
             System.out.print(s1); 
             System.out.println(":"); 
             System.out.println( "(Seq)s1 instanceof CharSeq" + ":" + ((Seq)s1 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s1 instanceof IntSeq" + ":" + ((Seq)s1 instanceof IntSeq) + ":");
            
             System.out.print( "s2" + ":"); 
             System.out.print(s2); 
             System.out.println(":"); 
             System.out.println( "(Seq)s2 instanceof CharSeq" + ":" + ((Seq)s2 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s2 instanceof IntSeq" + ":" + ((Seq)s2 instanceof IntSeq) + ":");
            
             System.out.print( "s3" + ":"); 
             System.out.print(s3); 
             System.out.println(":"); 
             System.out.println( "(Seq)s3 instanceof CharSeq" + ":" + ((Seq)s3 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s3 instanceof IntSeq" + ":" + ((Seq)s3 instanceof IntSeq) + ":");
            
             System.out.print( "s4" + ":"); 
             System.out.print(s4); 
             System.out.println(":"); 
             System.out.println( "(Seq)s4 instanceof CharSeq" + ":" + ((Seq)s4 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s4 instanceof IntSeq" + ":" + ((Seq)s4 instanceof IntSeq) + ":");
            
             System.out.print( "s5" + ":"); 
             System.out.print(s5); 
             System.out.println(":"); 
             System.out.println( "(Seq)s5 instanceof CharSeq" + ":" + ((Seq)s5 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s5 instanceof IntSeq" + ":" + ((Seq)s5 instanceof IntSeq) + ":");
            
             System.out.print( "s6" + ":"); 
             System.out.print(s6); 
             System.out.println(":"); 
             System.out.println( "(Seq)s6 instanceof CharSeq" + ":" + ((Seq)s6 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s6 instanceof IntSeq" + ":" + ((Seq)s6 instanceof IntSeq) + ":");
        }
        //check a bit more
        Seq x;
        x = s3;
        
             System.out.print( "x" + ":"); 
             System.out.print(x); 
             System.out.println(":"); 
             System.out.println( "(Seq)x instanceof CharSeq" + ":" + ((Seq)x instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)x instanceof IntSeq" + ":" + ((Seq)x instanceof IntSeq) + ":");
        x = i4;
        
             System.out.print( "x" + ":"); 
             System.out.print(x); 
             System.out.println(":"); 
             System.out.println( "(Seq)x instanceof CharSeq" + ":" + ((Seq)x instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)x instanceof IntSeq" + ":" + ((Seq)x instanceof IntSeq) + ":");
        // okay, if you're still not convinced ...
        Seq [] b = new Seq[8];
        b[0] = new CharSeq("first");
        b[1] = new IntSeq(77, 78, 79);
        b[2] = new IntSeq(81, 82);
        b[3] = new CharSeq("middle");
        b[4] = new IntSeq();
        b[5] = new IntSeq(10, 1, 2, 3, 4, 5, 10, -1, -2, -3, -4);
        b[6] = new CharSeq("");
        b[7] = new CharSeq("last");
        for (int k = 0; k < 2*b.length; k++) {
            System.out.println( "b[k%b.length]" + ":" + (b[k%b.length]) + ":");
        }
        // check out copying --
        // this should work w/o any effort b/c a String is immutable
        String m = "abcde";
        CharSeq s11 = new CharSeq(m);
        System.out.println( "s11" + ":" + (s11) + ":");
        m = "fghij";
        System.out.println( "s11" + ":" + (s11) + ":"); // should show "abcde", not "fghij"
        CharSeq s12 = new CharSeq(m);
        System.out.println( "s12" + ":" + (s12) + ":");
        System.out.println( "s11" + ":" + (s11) + ":"); // should still show "abcde"
        System.out.println( "i1.posMax()" + ":" + (i1.posMax()) + ":");
        System.out.println( "i2.posMax()" + ":" + (i2.posMax()) + ":");
        System.out.println( "i3.posMax()" + ":" + (i3.posMax()) + ":");
        System.out.println( "i4.posMax()" + ":" + (i4.posMax()) + ":");
        System.out.println( "i5.posMax()" + ":" + (i5.posMax()) + ":");
        System.out.println( "i6.posMax()" + ":" + (i6.posMax()) + ":");
        System.out.println( "s1.posMax()" + ":" + (s1.posMax()) + ":");
        System.out.println( "s2.posMax()" + ":" + (s2.posMax()) + ":");
        System.out.println( "s3.posMax()" + ":" + (s3.posMax()) + ":");
        System.out.println( "s4.posMax()" + ":" + (s4.posMax()) + ":");
        System.out.println( "s5.posMax()" + ":" + (s5.posMax()) + ":");
        System.out.println( "s6.posMax()" + ":" + (s6.posMax()) + ":");
        for (int k = 0; k < 2*b.length; k++) {
            System.out.println( "b[k%b.length].posMax()" + ":" + (b[k%b.length].posMax()) + ":");
        }
        System.out.println( "(new CharSeq( \"abcbabababababdbababdbadbaddbabad\" )).posMax()" + ":" + ((new CharSeq( "abcbabababababdbababdbadbaddbabad" )).posMax()) + ":");
        System.out.println( "(new CharSeq( \"abcbabababababdbababdbadbaddbabade\")).posMax()" + ":" + ((new CharSeq( "abcbabababababdbababdbadbaddbabade")).posMax()) + ":");
        System.out.println( "(new CharSeq(\"fabcbabababababdbababdbadbaddbabade\")).posMax()" + ":" + ((new CharSeq("fabcbabababababdbababdbadbaddbabade")).posMax()) + ":");
        System.out.println( "(new IntSeq( 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6) ).posMax()" + ":" + ((new IntSeq( 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6) ).posMax()) + ":");
        System.out.println( "(new IntSeq( 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6, 7)).posMax()" + ":" + ((new IntSeq( 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6, 7)).posMax()) + ":");
        System.out.println( "(new IntSeq(9, 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6, 7)).posMax()" + ":" + ((new IntSeq(9, 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6, 7)).posMax()) + ":");
        System.exit(0);
    }
}
