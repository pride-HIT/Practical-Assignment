# Practical Assignment – Object Oriented Programming

**Registration Number:** H250130H
**Student Name:** Pride Maphosa
**Department:** Software Engineering

## Overview
A small banking program demonstrating inheritance, abstract classes and polymorphism in Java.

## Files
| File | Description |
|------|-------------|
| `Account.java` | Abstract base class with `accountNumber`, `balance`, `deposit()`, `getBalance()`, and abstract `withdraw()` and `endOfMonth()` |
| `SavingsAccount.java` | Enforces a minimum balance; adds 5% interest at month end |
| `CurrentAccount.java` | Allows overdraft up to a limit; deducts a 5.00 maintenance fee at month end |
| `BankDemo.java` | Runs a polymorphic loop over a `List<Account>` and demonstrates both edge cases |
| `sample_output.txt` | Output of a real run |

## How to Run
Requires JDK 8 or later.

```
javac *.java
java BankDemo
```

## Demonstrated Cases
- **Polymorphism:** `withdraw()` and `endOfMonth()` are called through the `Account` reference only (no casting); each object runs its own overridden version.
- **Savings rejection:** a withdrawal that would drop the balance below the minimum is refused with a message.
- **Overdraft:** a current account goes negative within its overdraft limit; withdrawals beyond the limit are refused.
