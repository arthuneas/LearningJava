package Exercicios;

public class Test
{
    public static void main(String[] args)
    {
        int total = 0;
        int[] c = new int[13];
        for (int i = 0; i<c.length; i++) {
            c[i] = i + i;
        }
        for (int i = 0; i<c.length; i++) {
            total += c[i];
        }
        System.out.println(total);
    }
}
