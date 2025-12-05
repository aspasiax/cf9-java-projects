package gr.aueb.cf.cf9.part1pop.ch2;

/**
 * Displays information about the primitive integer types
 * (int, byte, short, long).
 * It prints their size in bytes/bits and their range (min, max values).
 */

public class IntApp {

    public static void main(String[] args) {

        System.out.printf("Type: int   | Size: %02d bytes (%d bits) | Min: %,d             | Max: %,d%n",
                Integer.BYTES, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.printf("Type: byte  | Size: %02d byte  (%02d bits) | Min: %d                       | Max: %d%n",
                Byte.BYTES, Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);

        System.out.printf("Type: short | Size: %02d bytes (%d bits) | Min: %,d                    | Max: %,d%n",
                Short.BYTES, Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("Type: long  | Size: %02d bytes (%d bits) | Min: %,d | Max: %,d%n",
                Long.BYTES, Long.BYTES * 8, Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
