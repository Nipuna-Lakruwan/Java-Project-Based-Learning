# Intermediate Project 2: Bank System

## Overview

The **Bank System** project is an intermediate-level Java application designed to manage customer accounts and transactions in a simulated banking environment. It allows users to create accounts, deposit money, withdraw funds, transfer funds between accounts, and check their account balance.

This project covers a wide range of Java concepts including Object-Oriented Programming (OOP), collections, file handling, and error management. It's designed to enhance your understanding of core Java programming while applying it to a real-world problem.

## Features

- Create new bank accounts (Savings and Current)
- Deposit funds into an account
- Withdraw funds from an account
- Transfer funds between accounts
- Check account balance
- Store and load account data from a file

## Project Structure

```bash
/BankSystem
  ├── /src
  │   ├── Main.java               # Main entry point for the application
  │   ├── BankAccount.java        # Base class for bank accounts
  │   ├── SavingsAccount.java     # Class representing a savings account
  │   ├── CurrentAccount.java     # Class representing a current account
  │   ├── AccountManager.java     # Class to manage accounts and transactions
  │   ├── Transaction.java        # Class to represent a bank transaction
  ├── /data
  │   └── accounts.txt            # File to store account data
  ├── README.md                   # Project documentation
```

## Classes and Responsibilities

### 1. **`BankAccount`**
   - Abstract class that represents the basic structure of a bank account.
   - Common properties like account number, account holder name, and balance are included.
   - Methods for deposit, withdraw, and checking balance are defined.

### 2. **`SavingsAccount`**
   - Extends `BankAccount`.
   - Represents a savings account with additional features like interest rate.

### 3. **`CurrentAccount`**
   - Extends `BankAccount`.
   - Represents a current account, which typically has no interest rate but offers overdraft protection.

### 4. **`AccountManager`**
   - Manages the collection of bank accounts.
   - Provides methods to add new accounts, transfer funds, deposit, withdraw, and check balance.

### 5. **`Transaction`**
   - Represents a bank transaction such as a deposit, withdrawal, or transfer.
   - Keeps track of transaction history.

### 6. **`Main`**
   - Entry point of the application.
   - Handles user interaction and the main loop for banking operations.

## Getting Started

### Prerequisites

- JDK 11 or higher
- Basic knowledge of Java and object-oriented programming

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/nipuna-lakruwan/Java-Project-Based-Learning.git
   cd Intermediate/Project2_BankSystem
   ```

2. **Compile the project:**
   Compile all Java files using the `javac` command or through your preferred IDE:
   ```bash
   javac -d bin src/*.java
   ```

3. **Run the project:**
   Run the compiled application:
   ```bash
   java -cp bin Main
   ```

### Directory Structure

- `src/`: Contains all source code files.
- `data/accounts.txt`: Stores account information in a file for persistence.

## Usage

### Main Menu

Once the application starts, you will be presented with the following options:

1. **Create Account**
   - Choose between Savings or Current accounts.
   - Provide the account holder’s name and initial deposit.

2. **Deposit Funds**
   - Select an account by its account number.
   - Enter the amount to deposit.

3. **Withdraw Funds**
   - Select an account by its account number.
   - Enter the amount to withdraw.

4. **Transfer Funds**
   - Select the source account and the destination account.
   - Enter the amount to transfer.

5. **Check Balance**
   - Select an account by its account number.
   - View the current balance.

6. **Exit**
   - Save account data to file and exit the program.

### Error Handling

- The application includes basic error handling to ensure proper input and prevent invalid transactions (e.g., withdrawing more than the available balance).
- Error messages are displayed when invalid operations are attempted.

## File Persistence

Account data is saved in the `data/accounts.txt` file when the application is exited. When the application is started, it automatically loads the data from the file, allowing for persistent accounts between sessions.

### File Format
The account information is stored in a simple text format:
```
AccountNumber,AccountHolderName,Balance,AccountType
```

## Future Enhancements

- Implement a more secure way to store and retrieve account details.
- Add functionality to calculate interest for savings accounts.
- Add a graphical user interface (GUI) for a better user experience.
- Implement password protection for each account.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

If you'd like to contribute to this project, feel free to fork the repository and submit a pull request. Please ensure that your code adheres to the coding guidelines and is well-documented.

1. Fork the project
2. Create your feature branch: `git checkout -b feature/YourFeature`
3. Commit your changes: `git commit -m 'Add YourFeature'`
4. Push to the branch: `git push origin feature/YourFeature`
5. Submit a pull request

## Contact

For any questions or issues, feel free to contact me at:
- Email: senarath.lakruwan@gmail.com
- GitHub: [Your GitHub Profile](https://github.com/nipuna-lakruwan)

---

Happy coding and enjoy working on the Bank System!
