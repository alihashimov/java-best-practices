package az.et.practice.algorithm.common;

import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {

    }

    public static void example() {
        //Verilmish metini tersine cevirin mes:Salam Cavabi:malas
        String duzune = "Salama necesem?";
        for (int i = duzune.length() - 1; i >= 0; i--) {
            System.out.print(duzune.charAt(i));
        }
    }

    public static void example1() {
        //Verilmish metini tersine cevirin mes:Salam Cavabi:malas 2 ci usulu.
        String duzune = "Salama necesen?";
        String tersine = "";
        for (int i = 0; i < duzune.length(); i++) {
            tersine = duzune.charAt(i) + tersine;
        }
        System.out.println("tersine=" + tersine);
    }

    public static void example2() {
        //Yazilmish reqemi soze chevirin meselen: 125 : bir yuz iyirmi besh.
        String[] sozler = new String[1001];
        sozler[1] = "bir";
        sozler[2] = "iki";
        sozler[3] = "uch";
        sozler[4] = "dord";
        sozler[5] = "besh";
        sozler[6] = "alti";
        sozler[7] = "yeddi";
        sozler[8] = "sekkiz";
        sozler[9] = "doqquz";
        sozler[10] = "on";
        sozler[20] = "iyirmi";
        sozler[30] = "otuz";
        sozler[40] = "qirx";
        sozler[50] = "elli";
        sozler[60] = "altmish";
        sozler[70] = "yetmish";
        sozler[80] = "seksen";
        sozler[90] = "dogsan";
        sozler[100] = "yuz";
        sozler[1000] = " min";
        int number = new Scanner(System.in).nextInt();
        int step = 1;
        String result = "";
        while (number != 0) {   //12345
            int remainer = number % 10;
            number = number / 10;
            if (remainer != 0) {
                if (step == 100) {
                    result = sozler[remainer] + " yuz" + " " + result;
                } else if (step == 1000) {
                    result = sozler[remainer] + " min" + " " + result;
                } else {
                    result = sozler[remainer * step] + " " + result;
                }
            }
            step = step * 10;
        }
        System.out.println(result);
    }

    public static void example3(int number) {
        // 0-dan verilmish edede qeder butun 2-ye bolune bilen ededleri chap et.
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static boolean example4(int number) {

        //  Verilen ededin sade olub olmadigini teyin edin
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        boolean result = count > 2;
        return result;
    }

    public static boolean example5(int number) {

        // Verilen ededin sade olub olmadigini teyin edin.2 ci usulu

        for (int i = 2; i < number; i++) {
            if (number % i == 0) return true;
        }
        return false;
    }

    // 3 5 7 11 13 17
    public static void example6(int number) {
        //0-dan verilmish edede qeder sade ededleri chap et.
        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i + " ");
            }

        }

    }


    public static void example7() {
        //Verilmish ededin butun ededleri cemini tap.
        int reqem = 12345;
        int cem = 0;
        int qaliq = 0;
        while (reqem != 0) {
            qaliq = reqem % 10;
            reqem = reqem / 10;
            cem += qaliq;
        }
        System.out.println(cem);


    }

    public static void example8() {
        //  3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishmek
        int a = 5;
        int b = 4;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static void example9() {
        //  3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishmek 2 ci usul
        int a = 5;
        int b = 4;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static void example10() {
        //Ededin reqemlerinin sayini tapin.//12345

        int reqem = 12345;
        int count = 0;
        while (reqem != 0) {
            reqem = reqem / 10;
            count++;
        }
        System.out.println(count);

    }

    public static void example11(int number) {
        // Fordan istifade ederek (rekursiya olmadan) Faktorial mes:5! = 5*4*3*2*1
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static int example12(int number) {
        // Fordan istifade etmeden (rekursiya ile) Faktorial mes:5! = 5*4*3*2*1;
        if (number == 0) {
            return 1;
        } else {

            return number * example12(number - 1);
        }


    }

    public static boolean example13(String text) {
       /* Verilen string-in tersi ile duzunun bir birine beraber olub olmadigi.
                Meselen:  "SOS" - "SOS" -> true
               "Hello"-"olleH" -> false */
        String tersi = "";
        for (int i = 0; i < text.length(); i++) {
            tersi = text.charAt(i) + tersi;
        }
        return text.equals(tersi);
    }

    public static void example14() {
        /* Daxil edilen reqemlerin tersi ile duzunun eyni olub olmadigini teyin eden method yazin
        Meselen 545 ve 545  duzdur amma 574 475 sehvdi;r */
        int reqem = 547;
        int muveqqeti = reqem;
        int tersi = 0;
        while (muveqqeti != 0) {
            tersi = tersi * 10 + (muveqqeti % 10);
            muveqqeti = muveqqeti / 10;
        }
        System.out.println(reqem);
        System.out.println(tersi);
        System.out.println(reqem == tersi);
    }

    public static void example15(int a, char c, boolean altAlta) {
        /* Method 1 reqem, bir simvol ve 1 boolean qebul edir.
           public static void foo(int a, char c, boolean altAlta)
        a qeder c simvolunu chap etsin. altAlta dəyişəni true-dursa altAlta eks halda yan yana chap etsin.
           */

        for (int i = 0; i < a; i++) {
            if (altAlta) {
                System.out.println(c);
            } else {
                System.out.print(c);

            }
        }
    }

    public static void example16(int a, int b, int c) {
       /* Method 3 reqem qebul edir a,b,c,
        public static void foo(int a, int b, int c)
        a-dan b-ye qeder butun ededleri c qeder quvvete yukseldir Math.pow-dan istifadə edərək
        foo(1,5,2) ->   1^2=1;  2^2=4; 3^2=9, 4^2=16, 5^2=25 */
        for (int i = a; i <= b; i++) {
            System.out.print(Math.pow(i, c) + ", ");
        }

    }

    public static int example17(int number) {
       /* Methoda daxil edilen reqemin musbet, menfi yoxsa 0 oldugunu teyin eden method yazin.
       Eger menfidirse method geriye -1 qaytarsin, 0-dirsa 0, musbetdirse +1 qaytarsin.*/
        if (number > 0) return +1;
        else if (number < 0) return -1;
        else return 0;


    }

    public static void example18(int a, int b, int c, int d) {
        /* Methoda 4 reqem daxil edilir
           Eger bu reqemlerden her hansisa 2-si bir birine beraberdirse geriye true qaytarsin.
           Tip: Massiv istifade edin 4 5 3 6 */
        int[] arr = new int[]{a, b, c, d};

    }

    public static boolean example19(int a, int b, int c, int d) {
        /*Methoda 4 reqem daxil edilir.
        a,b,c,d  eger ededler artan ardicilliqla daxil edilibse geriye true qaytarsin eks halda false
        4 5 6 2 */
        int[] arr = new int[]{a, b, c, d};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                if (arr[i] == arr[j]) return true;

            }
        }
        return false;
    }

    public static boolean example19kopy(int a, int b, int c, int d) {
        /*Methoda 4 reqem daxil edilir.
        a,b,c,d  eger ededler artan ardicilliqla daxil edilibse geriye true qaytarsin eks halda false
        4 5 6 2 */
        int[] arr = new int[]{a, b, c, d};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] == arr[j])
                    return true;

            }
        }
        return false;
    }

    public static boolean example19kopy1(int a, int b, int c, int d) {
        /*Methoda 4 reqem daxil edilir.
        a,b,c,d  eger ededler artan ardicilliqla daxil edilibse geriye true qaytarsin eks halda false
        4 5 6 2 */
        int[] arr = new int[]{a, b, c, d};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;

            }
        }
        return false;
    }

    public static boolean example19kopy2(int a, int b, int c, int d) {
        /*Methoda 4 reqem daxil edilir.
        a,b,c,d  eger ededler artan ardicilliqla daxil edilibse geriye true qaytarsin eks halda false
        4 5 6 2 */
        int[] arr = new int[]{a, b, c, d};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;

            }
        }
        return false;
    }


    public static char example20(String text, int a) {
        /*Method bir String ve bir int qebul edir ve hemin String-in hemin index-inde olan simvolunu qaytarsin.
        Meselen: method(“Salam”, 4)   a herfini return edecek */
        return text.charAt(a);
    }

    public static boolean example21(String text1, String text2) {
        /* Method 2 String qebul edir ve onlarin beraber olub olmadigini return edir true ve ya false
         method(“Salam”,”Salam”); */
        if (text1.equals(text2)) return true;
        return false;

    }

    public static String example22(String s, char c, int count) {
        /*Method String s, char c, int count qebul edir.
        S-i count qeder c ile birleshdirir ve geriye return edir
        foo(String s, char c, int count){}
        foo(“Soz”, ‘c’, 5); -> Sozccccc */
        String result = "";
        for (int i = 0; i < count; i++) {
            result = s += c;
        }
        return result;


    }

    public static boolean example23(String a, String b, String c) {
        /* Method 3 String qebul edir.  String a, String b, String c.
        A ve b-nin ichinde c varsa onda true eks halda false */
        if (a.contains(c) && b.contains(c)) return true;
        return false;

    }

    public static void example24(String text, int begin, int end) {
        /* Method String a, int begin, int end daxil edilir.
         A-nin begin ve end arasini alt alta chap edir.
        (Hello World, 3,7) netice olacaq:l
                                         o
                                         W  */
        for (int i = begin; i < end; i++) {
            System.out.println(text.substring(begin, end));
        }
    }

    public static String example25(String text1, String text2) {
        /* 2 soz daxil edilir uzunlugu boyuk olan String geriye return edilir.
        “Hello”, Hello World”  -> Hello World return olacaq  */
        if (text1.length() > text2.length()) return text1;
        else return text2;


    }

    public static String example26(String text) {
        /*21.Ele bir method yazin ki:  HeLLo WorlD-> chevrilsin olsun hEllO wORLd.
         Yeni boyuk herfler kichikle, kichik herfler boyukle evez olsun  65-90 boyukler 97-122 kichikler
         hint:  ya ASCII ←--interviewlarda bu ustun tutulu
         Ya da String-in funksiyalari: toLowerCase(), toUpperCase() istifade edin. */
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int code = text.charAt(i);
            if (code >= 65 && code <= 90) {
                result += (char) (code + 32);
            } else if (code >= 97 && code <= 122) {
                result += (char) (code - 32);
            } else {
                return result;
            }
        }
        return result;

    }

    public static String example27(String text) {
        /*”       Salam    necesen        ishler     nece          gedir       “   ←-----   metnini
         “Salam necesen ishler nece gedir” ←--------      halina getirin. */

        String[] arr = text.split(" ");
        String sonMetn = "";
        for (int i = 0; i < arr.length; i++) {
            String simvol = arr[i];
            if (!simvol.isEmpty()) {
                sonMetn += simvol + " ";
            }
        }
        return sonMetn.trim();
    }

}
