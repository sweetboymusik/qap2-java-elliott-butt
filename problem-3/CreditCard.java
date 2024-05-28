public class CreditCard {
    // instance fields
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // constructors
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    // getters and setters
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return this.owner.toString();
    }

    // methods
    public void charge(Money amount) {
        Money newAmount = balance.add(amount);

        if (this.creditLimit.compareTo(newAmount) != -1) {
            this.balance = newAmount;
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        this.balance = balance.subtract(amount);
    }
}
