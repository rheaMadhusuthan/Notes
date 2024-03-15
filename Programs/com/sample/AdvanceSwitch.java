package com.sample;

class AdvanceSwitch {
    //old switch :
    // 1. break after every case madatory
    // 2. multiple values in one case not supported
    public static void main(String args[]) {
        int itemCode = 8; //supports string, int, char, enum
        switch (itemCode) {
            case 1, 2, 3 :
                System.out.println("It's an electronic gadget!");
                break;

            case 4, 5:
                System.out.println("It's a mechanical device!");
        }

        int itemCode1 = 003; // can use switch as an expression
        String text = switch (itemCode1) {
            case 001 :
                yield "It's a laptop!"; // with yield no need to break
            case 002 :
                yield "It's a desktop!";
            case 003 :
                yield "It's a mobile phone!";
            default : // default is necessary
                throw new IllegalArgumentException(itemCode + "is an unknown device!");
        };// since expression need ;

        System.out.println(text);

        switch (itemCode1) {
            case 001 -> System.out.println("It's a laptop!"); // -> instead of : yeild
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
        }
    }
}