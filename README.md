# Bank Management System

## Table of Contents
- [Description](#description)
- [Features](#features)
- [How to Use](#how-to-use)
- [Customization](#customization)
- [Future Enhancements](#future-enhancements)

## Description
The **Bank Management System** is a simple console-based Java application that simulates basic banking operations. Users can log in with a password, view their balance, deposit funds, and withdraw money. The system also keeps track of transactions and includes a queue for customer requests.

## Features
- **User Authentication:** Requires a predefined password to access the system.
- **View Balance:** Displays the current account balance along with a randomly assigned account type.
- **Deposit Money:** Allows users to deposit funds into their account.
- **Withdraw Money:** Users can withdraw money using a recursive function for repeated transactions.
- **Transaction History:** Stores deposit and withdrawal transactions in a list and stack.
- **Customer Requests:** Implements a queue to manage customer requests.
- **Random Card PIN Generator:** Generates a random 4-digit PIN for display.

## How to Use
1. **Run the Java Program**
   - Compile and run the `BankManagementSystem.java` file.
   - The system will prompt for a **password** (default: `2120074`).
   
2. **Choose a Banking Operation**
   - `[1] View amount` → Displays your current balance and account type.
   - `[2] Deposit` → Enter an amount to add to your balance.
   - `[3] Withdraw Money` → Enter an amount to deduct from your balance.

3. **Continue or Exit**
   - After a transaction, the system will ask if you want to perform another transaction (`y/n`).
   - Enter `n` to exit the system.

## Customization
You can modify the following aspects of the program:
- **Initial Balance (`amount`)** → Change the starting amount from `69.96` to a different value.
- **Password (`2120074`)** → Set a custom password for access.
- **Recursive Withdrawal Behavior** → Modify the logic in `recursiveWithdraw()` to change how withdrawals work.
- **Transaction History Storage** → Store transactions in a file or database for persistent tracking.

## Future Enhancements
This project can be improved with the following features:
- **GUI Implementation:** Replace the console-based system with a user-friendly graphical interface.
- **Database Integration:** Store account details and transaction history in a database.
- **Multiple Users:** Implement support for multiple accounts with unique login credentials.
- **Interest Calculation:** Add automated interest on deposits.
- **Loan and Credit System:** Introduce loans and credit score tracking.
