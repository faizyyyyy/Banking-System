-> ATM Banking Management System

A robust desktop-based banking application developed in **Java** using **Swing** for the GUI and **MySQL** for database management. This system simulates the essential functionalities of a real-world Automated Teller Machine (ATM), providing a secure and user-friendly interface for banking transactions.


-> Features

- Authentication & Security
* **Secure Login:** Users must authenticate using their Card Number and PIN.
* **Sign Up Flow:** A comprehensive 3-step registration process to verify user identity and create a new account.
    * **Page 1:** Personal Details (Name, Address, etc.)
    * **Page 2:** Additional Details (Income, Education, Pan Card, etc.)
    * **Page 3:** Account Details (Account Type, Services required).
* **PIN Change:** Users can securely update their ATM PIN at any time.

- Transactions
* **Deposit:** Add funds to the account instantly.
* **Cash Withdrawal:** Withdraw money with real-time balance validation.
* **Fast Cash:** One-click withdrawal options for common amounts (Rs 100, 500, 1000, 2000, etc.).

- Account Utilities
* **Balance Enquiry:** Check current account balance on screen.
* **Mini Statement:** View a generated receipt of recent transactions (Deposits & Withdrawals) with date and time stamps.


-> Technology Stack

* **Language:** Java (JDK 8+)
* **Frontend:** Java Swing (AWT) for the Graphical User Interface.
* **Database:** MySQL (Relational Database Management System).
* **Connectivity:** JDBC (Java Database Connectivity).
* **IDE:** IntelliJ IDEA / Eclipse / NetBeans.

---

-> Project Structure

The project is organized into the `bank.management.system` package:

| Class Name | Description |
| :--- | :--- |
| **`Login.java`** | The entry point of the application. Handles user authentication. |
| **`Signup.java`** | Step 1 of registration: Captures personal user information. |
| **`Signup2.java`** | Step 2 of registration: Captures additional KYC details. |
| **`Signup3.java`** | Step 3 of registration: Account type selection and card generation. |
| **`main_class.java`** | The main dashboard displaying transaction options (Deposit, Fast Cash, etc.). |
| **`deposit.java`** | Handles logic for adding money to the user's account. |
| **`withdraw.java`** | Handles logic for deducting money (checks for sufficient balance). |
| **`FastCash.java`** | Provides buttons for quick, pre-defined withdrawal amounts. |
| **`Balance.java`** | Fetches and displays the total remaining balance. |
| **`miniStatement.java`** | Generates a transaction history report in a scrollable window. |
| **`changePin.java`** | Updates the user's login PIN in the database. |
| **`connect.java`** | Manages the connection between the Java application and the MySQL database. |


-> Contributing

Contributions are welcome! Please fork the repository and create a pull request for any feature enhancements or bug fixes.

---

-> License

This project is open-source and available for educational purposes.
