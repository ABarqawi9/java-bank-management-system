# Bank Management System

This is a simple Bank Management System implemented in Java. The program allows users to perform various banking operations such as viewing account balance, depositing money, and withdrawing money. It utilizes Java's built-in data structures like List, Queue, and Stack to manage transactions and customer requests.

## Features

1. **User Authentication**: Users are required to enter a password (2120074 in this case) to access the banking system.

2. **View Account Balance**: Users can view their current account balance along with account type and card PIN.

3. **Deposit Money**: Users can deposit money into their account. The deposit amount is added to the current balance.

4. **Withdraw Money**: Users can withdraw money from their account. If the withdrawal amount exceeds the current balance, the transaction will fail.

5. **Transaction History**: The program maintains a list of transaction objects, representing each deposit or withdrawal transaction. This transaction history can be used for auditing and record-keeping purposes.

6. **Customer Requests**: The system uses a queue to manage customer requests. However, the queue is not currently utilized in the main code provided.

## How to Run

To run the Bank Management System, follow these steps:

1. Compile the Java file: `javac BankManagementSystem.java`

2. Run the compiled class: `java BankManagementSystem`

3. Enter the correct password (2120074) to access the banking system.

4. Choose from the available options (1 to view amount, 2 to deposit, 3 to withdraw, and n to exit).

## Note

This implementation is a basic version of a Bank Management System and lacks some essential features such as proper error handling, user account management, and persistence of data beyond the program execution. It should not be used for actual banking operations as it is, but it serves as a starting point for learning Java and basic software design.

## Future Enhancements

Here are some ideas for enhancing the system:

1. Implement a proper user account management system with user profiles, balances, and PIN verification.

2. Improve error handling by validating user input and providing meaningful error messages.

3. Add options to transfer funds between accounts.

4. Implement persistence by storing transaction history and user data in a database.

5. Enhance security measures to ensure safe and secure banking operations.

6. Extend the customer request feature to handle different types of requests and prioritize them based on urgency.

Remember, this code is for educational purposes only and should not be used in real-world applications without significant improvements and security considerations.
