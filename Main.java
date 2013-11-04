/* *** This file is given as part of the programming assignment. *** */

public class Main {
    public static void main(String [] args) {
        if( args.length > 0 ) {
  System.out.println("test of calling "+args[0]
               +" too many times");
         if( args[0].equals("CharSeqIt") ) {
          CharSeqIt si = new CharSeqIt(new CharSeq("cat"));
      System.out.println( "si.next()" + ":" + (si.next()) + ":");
      System.out.println( "si.next()" + ":" + (si.next()) + ":");
      System.out.println( "si.next()" + ":" + (si.next()) + ":");
      System.out.println( "si.next()" + ":" + (si.next()) + ":");
      System.out.println( "si.next()" + ":" + (si.next()) + ":");
      System.out.println( "si.next()" + ":" + (si.next()) + ":");
                }
         else if( args[0].equals("IntSeqIt") ) {
          IntSeqIt ii = new IntSeqIt(new IntSeq(51, 52));
      System.out.println( "ii.next()" + ":" + (ii.next()) + ":");
      System.out.println( "ii.next()" + ":" + (ii.next()) + ":");
      System.out.println( "ii.next()" + ":" + (ii.next()) + ":");
      System.out.println( "ii.next()" + ":" + (ii.next()) + ":");
                }
         else {
      System.err.println("args[0] Oops "+args[0]);
      System.exit(3);
                }
  System.exit(2); // should exit before this one.
 }
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
        // iterators
        System.out.print( "myprints(s1)" + ":"); 
             myprints(s1); 
             System.out.println(":");
        System.out.print( "myprints(s2)" + ":"); 
             myprints(s2); 
             System.out.println(":");
        System.out.print( "myprints(s3)" + ":"); 
             myprints(s3); 
             System.out.println(":");
        System.out.print( "myprints(s4)" + ":"); 
             myprints(s4); 
             System.out.println(":");
        System.out.print( "myprints(s5)" + ":"); 
             myprints(s5); 
             System.out.println(":");
        System.out.print( "myprints(s6)" + ":"); 
             myprints(s6); 
             System.out.println(":");
        System.out.print( "myprinti(i1)" + ":"); 
             myprinti(i1); 
             System.out.println(":");
        System.out.print( "myprinti(i2)" + ":"); 
             myprinti(i2); 
             System.out.println(":");
        System.out.print( "myprinti(i3)" + ":"); 
             myprinti(i3); 
             System.out.println(":");
        System.out.print( "myprinti(i4)" + ":"); 
             myprinti(i4); 
             System.out.println(":");
        System.out.print( "myprinti(i5)" + ":"); 
             myprinti(i5); 
             System.out.println(":");
        System.out.print( "myprinti(i6)" + ":"); 
             myprinti(i6); 
             System.out.println(":");
        System.out.print( "mycrosss(s1,s1)" + ":"); 
             mycrosss(s1,s1); 
             System.out.println(":");
        System.out.print( "mycrosss(s1,s2)" + ":"); 
             mycrosss(s1,s2); 
             System.out.println(":");
        System.out.print( "mycrosss(s2,s2)" + ":"); 
             mycrosss(s2,s2); 
             System.out.println(":");
        System.out.print( "mycrosss(s5,s4)" + ":"); 
             mycrosss(s5,s4); 
             System.out.println(":");
        System.out.print( "mycrosss(s5,s6)" + ":"); 
             mycrosss(s5,s6); 
             System.out.println(":");
        System.out.print( "mycrosss(s6,s6)" + ":"); 
             mycrosss(s6,s6); 
             System.out.println(":");
        System.out.print( "mycrosss(s1,s3)" + ":"); 
             mycrosss(s1,s3); 
             System.out.println(":");
        System.out.print( "mycrosss(s3,s3)" + ":"); 
             mycrosss(s3,s3); 
             System.out.println(":");
        System.out.print( "mycrosss(s3,s3)" + ":"); 
             mycrosss(s3,s3); 
             System.out.println(":");
        System.out.print( "mycrossi(i1,i3)" + ":"); 
             mycrossi(i1,i3); 
             System.out.println(":");
        System.out.print( "mycrossi(i3,i1)" + ":"); 
             mycrossi(i3,i1); 
             System.out.println(":");
        System.out.print( "mycrossi(i1,i1)" + ":"); 
             mycrossi(i1,i1); 
             System.out.println(":");
        System.out.print( "mycrossi(i6,i1)" + ":"); 
             mycrossi(i6,i1); 
             System.out.println(":");
        System.out.print( "mycrossi(i1,i6)" + ":"); 
             mycrossi(i1,i6); 
             System.out.println(":");
        System.out.print( "mycrossi(i2,i3)" + ":"); 
             mycrossi(i2,i3); 
             System.out.println(":");
        System.out.print( "mycrossi(i3,i2)" + ":"); 
             mycrossi(i3,i2); 
             System.out.println(":");
        System.out.print( "mycrossi(i1,i5)" + ":"); 
             mycrossi(i1,i5); 
             System.out.println(":");
        System.out.print( "mycrossi(i4,i5)" + ":"); 
             mycrossi(i4,i5); 
             System.out.println(":");
        System.out.print( "mycrossi(i4,i4)" + ":"); 
             mycrossi(i4,i4); 
             System.out.println(":");
        System.out.print( "mycrossi(i5,i5)" + ":"); 
             mycrossi(i5,i5); 
             System.out.println(":");
        System.out.println( "CharSeqUser.posMax1(s1)" + ":" + (CharSeqUser.posMax1(s1)) + ":");
        System.out.println( "CharSeqUser.posMax1(s2)" + ":" + (CharSeqUser.posMax1(s2)) + ":");
        System.out.println( "CharSeqUser.posMax1(s3)" + ":" + (CharSeqUser.posMax1(s3)) + ":");
        System.out.println( "CharSeqUser.posMax1(s4)" + ":" + (CharSeqUser.posMax1(s4)) + ":");
        System.out.println( "CharSeqUser.posMax1(s5)" + ":" + (CharSeqUser.posMax1(s5)) + ":");
        System.out.println( "CharSeqUser.posMax1(s6)" + ":" + (CharSeqUser.posMax1(s6)) + ":");
        System.exit(0);
    }
    private static void myprints(CharSeq s) {
        CharSeqIt si = new CharSeqIt(s);
        while( si.hasNext() ) {
            System.out.print(si.next() + " ");
        }
    }
    private static void myprinti(IntSeq i) {
        IntSeqIt ii = new IntSeqIt(i);
        while( ii.hasNext() ) {
            System.out.print(ii.next() + " ");
        }
    }
    private static void mycrosss(CharSeq s1, CharSeq s2) {
        CharSeqIt si1 = new CharSeqIt(s1);
        boolean first = true;
        while ( si1.hasNext() ) {
            char p1 = si1.next();
            CharSeqIt si2 = new CharSeqIt(s2);
            while ( si2.hasNext() ) {
                char p2 = si2.next();
                if ( first ) {
                    first = false;
                    System.out.println();
                }
                System.out.println("   " + p1 + " " + p2);
            }
        }
    }
    private static void mycrossi(IntSeq i1, IntSeq i2) {
        IntSeqIt ii1 = new IntSeqIt(i1);
        boolean first = true;
        while ( ii1.hasNext() ) {
            int p1 = ii1.next();
            IntSeqIt ii2 = new IntSeqIt(i2);
            while ( ii2.hasNext() ) {
                int p2 = ii2.next();
                if ( first ) {
                    first = false;
                    System.out.println();
                }
                System.out.println("   " + p1 + " " + p2);
            }
        }
    }
}
