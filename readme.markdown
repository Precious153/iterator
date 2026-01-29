# Java class note

**Primitives Type**

- *byte(-128 to 127)*
- *short(-32,768 to 32768)*
- *int(±2,147,483,647)*
- *long(6-7dp)*
- *boolean(true or false)*
- *char(0 to 65,535)*
- *float*
- *double*

```
public class Main{
   public static void main (String [] ags){
   byte temperature = -10;
   short students = 1000;
   int age = 10;
   long worldPopulation = 7800000000L;
   boolean isJavaFun = true;
   char grade ='A';
   float pi = 3.14f;
   double pi = 3.141592653589793;
   } 
}
```
**Reference Type**

- *String*
- *Array*\

**Wrapper Type**

*wrapper classes allow primitive data types to be represented as objects.*

- *Byte*
- *Short*
- *Integer*
- *Long*
- *Float*
- *Double*
- *Character*
- *Boolean*

```
class WrapperClassesExamples {
    public static void main(String[] args) {

        byte b = 1;
        Byte byteObj = Byte.valueOf(b);

        int i = 10;
        Integer intObj = Integer.valueOf(i);

        float f = 18.6f;
        Float floatObj = Float.valueOf(f);

        double d = 250.5;
        Double doubleObj = Double.valueOf(d);

        char c = 'a';
        Character charObj = c; 

        System.out.println("Wrapper Objects:");
        System.out.println(byteObj);
        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);
        System.out.println(charObj);

        // Unboxing
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        System.out.println("\nUnwrapped values:");
        System.out.println(bv);
        System.out.println(iv);
        System.out.println(fv);
        System.out.println(dv);
        System.out.println(cv);
    }
}
```

