package sample;

public class BinaryCalculator {
    private static int bit1;
    private static int bit2;
    private static int bit3;
    private static int bit4;
    private static int bit5;
    private static int bit6;
    private static int bit7;
    private static int bit8;

    public int getBit1() {
        return bit1;
    }

    public void setBit1(int bit1) {
        if (bit1 == 1) {
            this.bit1 = 128;
        }
        if (bit1 == 0) {
            this.bit1 = 0;
        }
    }

    public int getBit2() {
        return bit2;
    }

    public void setBit2(int bit2) {
        if (bit2 == 1) {
            this.bit2 = 64;
        }
        if (bit2 == 0) {
            this.bit2 = 0;
        }
    }

    public int getBit3() {
        return bit3;
    }

    public void setBit3(int bit3) {
        if (bit3 == 1) {
            this.bit3 = 32;
        }
        if (bit3 == 0) {
            this.bit3 = 0;
        }
    }

    public int getBit4() {
        return bit4;
    }

    public void setBit4(int bit4) {
        if (bit4 == 1) {
            this.bit4 = 16;
        }
        if (bit4 == 0) {
            this.bit4 = 0;
        }
    }

    public int getBit5() {
        return bit5;
    }

    public void setBit5(int bit5) {
        if (bit5 == 1) {
            this.bit5 = 8;
        }
        if (bit5 == 0) {
            this.bit5 = 0;
        }
    }

    public int getBit6() {
        return bit6;
    }

    public void setBit6(int bit6) {
        if (bit6 == 1) {
            this.bit6 = 4;
        }
        if (bit6 == 0) {
            this.bit6 = 0;
        }
    }

    public int getBit7() {
        return bit7;
    }

    public void setBit7(int bit7) {
        if (bit7 == 1) {
            this.bit7 = 2;
        }
        if (bit7 == 0) {
            this.bit7 = 0;
        }
    }

    public int getBit8() {
        return bit8;
    }

    public void setBit8(int bit8) {
        if (bit8 == 1) {
            this.bit8 = 1;
        }
        if (bit8 == 0) {
            this.bit8 = 0;
        }
    }

    public static String getTotal() {

        int Result = bit1 + bit2 + bit3 + bit4 + bit5 + bit6 + bit7 + bit8;
        String Message;
        Message = "Result: " + Result;
        return Message;
    }


}
