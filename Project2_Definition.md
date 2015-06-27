#Project 2

###Write a program that manages a checking account. Please follow the requirements detailed below:

- Create a class named CheckingAccount
- Create a method called manageCheckingFile
    - Create a variable named balance inside manageCheckingFile that has an initial balance of 200.00 dollars
- Read the dollar amounts of your check from transaction.txt and subtract it from the balance
    - transaction.txt file should have the following numbers:
        - 22.00
        - 103.00
        - 33.00
        - 19.00
        - 18.00
- Create a file called weeklyReport.txt.
	- Write the following report into the file:
    	- The final balance from checking transaction
    	- 2% penalty applied to the account,  if the balance is below zero
    	- 3% of interest applied to the balance, if the balance over 10 dollars