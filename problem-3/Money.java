public class Money {
    // instance fields
    private long dollars;
    private long cents;

    // constructors
    public Money(double amount) {
        double dollars = Math.floor(amount);
        double cents = Math.round((amount - dollars) * 100);

        this.dollars = (long) dollars;
        this.cents = (long) cents;
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // methods
    public Money add(Money otherAmount) {
        long dollars = this.dollars + otherAmount.dollars;
        long cents = this.cents + otherAmount.cents;
        double amount = dollars + ((double) cents / 100);

        return new Money(amount);
    }

    public Money subtract(Money otherAmount) {
        long dollars = this.dollars - otherAmount.dollars;
        long cents = this.cents - otherAmount.cents;
        double amount = dollars + ((double) cents / 100);

        return new Money(amount);
    }

    public int compareTo(Money otherAmount) {
        int compare;
        if (this.dollars > otherAmount.dollars) {
            compare = 1;
        } else if (this.dollars < otherAmount.dollars) {
            compare = -1;
        } else {
            if (this.cents > otherAmount.cents) {
                compare = 1;
            } else if (this.cents < otherAmount.cents) {
                compare = -1;
            } else {
                compare = 0;
            }
        }
        return compare;
    }

    public boolean equals(Money otherObject) {
        if (this.dollars == otherObject.dollars && this.cents == otherObject.cents) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return String.format("$%d.%02d", this.dollars, this.cents);
    }
}
