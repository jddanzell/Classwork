package feb26;

import javax.xml.transform.sax.SAXSource;

public class FractionRunner
{
    public static void main(String[] args)
    {
        Fraction f1 = new Fraction(1,4);
        Fraction f2 = new Fraction(1,4);
        System.out.println(f1.compareTo(f2));
    }
}
