package wrapperclasses;

public class Alldatatypesusage {
	public static void main(String args[]) {
		int i = 1000;
        long l = 10000L;
        float f = 10.5f;
        double d = 20.99;
        char c = 'A';
        Integer intObj = Integer.valueOf(i);
        Long longObj = Long.valueOf(l);
        Float floatObj = Float.valueOf(f);
        Double doubleObj = Double.valueOf(d);
        Character charObj = Character.valueOf(c);
        System.out.println("Integer Object: " + intObj);
        System.out.println("Long Object: " + longObj);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
		
	}

}
