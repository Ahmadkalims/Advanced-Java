// Example demonstrating the use of Wrapper Classes in Java
public class WrapperClassDemo {
    public static void main(String[] args) {
        // 1. Boolean Wrapper Class
        Boolean booleanWrapper = Boolean.valueOf(true);
        System.out.println("Boolean Wrapper: " + booleanWrapper);
        
        // 2. Byte Wrapper Class
        Byte byteWrapper = Byte.valueOf((byte) 10);
        System.out.println("Byte Wrapper: " + byteWrapper);
        
        // 3. Short Wrapper Class
        Short shortWrapper = Short.valueOf((short) 20);
        System.out.println("Short Wrapper: " + shortWrapper);
        
        // 4. Integer Wrapper Class
        Integer integerWrapper = Integer.valueOf(30);
        System.out.println("Integer Wrapper: " + integerWrapper);
        
        // 5. Long Wrapper Class
        Long longWrapper = Long.valueOf(100000L);
        System.out.println("Long Wrapper: " + longWrapper);
        
        // 6. Float Wrapper Class
        Float floatWrapper = Float.valueOf(5.75f);
        System.out.println("Float Wrapper: " + floatWrapper);
        
        // 7. Double Wrapper Class
        Double doubleWrapper = Double.valueOf(10.5);
        System.out.println("Double Wrapper: " + doubleWrapper);
        
        // 8. Character Wrapper Class
        Character charWrapper = Character.valueOf('1');
        System.out.println("Character Wrapper: " + charWrapper);
        
        // Autoboxing: Automatic conversion of primitive types to wrapper objects
        int intPrimitive = 42;
        Integer intWrapper = intPrimitive; // Autoboxing
        System.out.println("Autoboxed Integer: " + intWrapper);
        
        // Unboxing: Automatic conversion of wrapper objects to primitive types
        Integer boxedInteger = Integer.valueOf(50);
        int unboxedInt = boxedInteger; // Unboxing
        System.out.println("Unboxed Integer: " + unboxedInt);
        
        // Parsing Strings to Primitives
        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString);
        System.out.println("Parsed Integer from String: " + parsedInt);
        
        // Converting Wrappers to String
        String doubleString = doubleWrapper.toString();
        System.out.println("Double Wrapper as String: " + doubleString);
        
        // Using some useful methods
        System.out.println("Maximum Integer value: " + Integer.MAX_VALUE);
        System.out.println("Minimum Integer value: " + Integer.MIN_VALUE);
        
        System.out.println("Is '1' a digit? " + Character.isDigit(charWrapper));
        System.out.println("Is '1' a letter? " + Character.isLetter(charWrapper));
    }
}
