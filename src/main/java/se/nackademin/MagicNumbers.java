package se.nackademin;

/*
*MagicNumbers 
*Denna klass ska beräkna de magiska tal som används i systemet. VD:ns brorson har skrivit tester och påbörjat en del funktioner, men den är inte färdigimplementerad. Detta ska göras av dig.
*/


public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int a = name.split(" ").length;//1.Beräkna antalet namn (här: antalet mellanslag i namnet + 1)
        a += age;//2.Lägg till kundens ålder
        while (a > 10) {
            a -= 7; //3.Subtrahera 7 tills siffran är under 10
        }
        
        return a;
    }

    public int calculateB() {
           int b = location.length();//1.Ta antalet tecken i kundens bostadsort
        b += income;//2.Lägg till kundens inkomst
        while (b >= 10) {
            b -=7;//3.Subtrahera 7 tills siffran är under 10
        }
        return b;
    }

    public int calculateC() {
          int c = calculateA() + calculateB();//1.Beräkna <A, Addera <B>
        c -= height;//3.Subtrahera kundens längd
        while (c >= 0) {
            c += 10;//4.Addera 10 tills talet inte längre är negativt
        }
        return c;
    }

    public int calculateD() {
       int d = calculateA();//1.Beräkna <A>
       if (d > 5) {
           d += calculateB();//2.Om <A> är över 5, addera <B>
       } else {
           d += calculateC();//2.1.Om <A> är under eller lika med 5, addera <C>
       }
       d -= income;//3.Subtrahera kundens inkomst
       while (d > 0) {
           d +=10;//4.Addera 10 tills talet inte längre är negativt
       }
        return d;
    }

    public int calculateE() {
        long e = age;//1.Ta kundens ålder
        e *= income;//2.Multiplicera med kundens inkomst
        e *= income;//3.Multiplicera resultatet från steg 2 med kundens inkomst, igen
        e *= height;//4.Multiplicera resultatet från steg 3 med kundens längd
        double ef = Math.sqrt(e);//5.Ta roten ur genom Math.sqrt()
        while (ef >= 10) {
            ef /=2.0;//6.Dividera talet med 2 tills talet är under 10
            ef = Math.round(ef);//7.Avrunda med Math.round()
        }
                
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
