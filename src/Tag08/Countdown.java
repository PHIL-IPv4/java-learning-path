package Tag08;

/*
START
    int countdownStart = 10
    int countdownTarget = 0

    for (i = countdownStart, countdownTarget <= i, i--)
        print(i)

    --oder--

    do while countdownTarget <= countdownStart
        print(countdownStart)
        countdownStart--

    print("Die Rakete startet")
END
 */

public class Countdown {
    public  static void main(String args[]) {
        int countdownStart = 10;
        int countdownEnd = 0;

        for(int i = countdownStart; i >= countdownEnd; i--){
            System.out.println(i);
        }

        System.out.println("Rakete startet nun");

        do {
            System.out.println(countdownStart);
            countdownStart--;
        } while (countdownStart >= countdownEnd);

        System.out.println("Rakete startet nun");
    }
}
