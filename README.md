Library Management System

Description:
This is a Java Swing Desktop Application developed as a Data Structures & Algorithms Lab Project.  
The project is a practical demonstration of  OOP, Event-Driven Programming, File Handling, and Serialization in Java without using any external database.


Key Concepts:
1.	Java Swing GUI (JFrame, JPanel, JButton, JLabel, Icons)
2.	Event Handling (ActionListener, actionPerformed)
3.	Object-Oriented Programming (Classes, Objects, Inheritance, Encapsulation)
4.	File Handling (ObjectOutputStream / ObjectInputStream)
5.	Serialization (Serializable interface)
6.	ArrayList for dynamic data storage
7.	Modular Design (each feature in separate class)
8.	NetBeans IDE + Apache Ant

Features:

Role:	Functionalities
Admin:	Login, Add Book, Remove Book, Search Book, View Books, Add User, Remove User, View Users
User:	Login, View Books, Borrow Book, Return Book, View Inventory


1.	Book & user data is stored persistently in `.txt` files via Java serialization.
2.	Each user’s borrowed books tracked in separate files.


Project Structure (Key Classes):

Class Name:	Description
addbooks.java:	Add new books
remove.java:	Remove books
search.java:	Search books/users
returnbooks.java:	Return borrowed books
userrigistration.java:	Register new users
usersloginpage.java:	User login
adminloginpage.java:	Admin login
management.java:	Admin dashboard
viewbook.java:	View book inventory
veiwuser.java:	View user details
deleteuser.java:	Delete user
userviewbook.java:	User view books

How Data is Stored:

1.	Books: data.txt (Serialized)
2.	Users: user.txt (Serialized)
3.	Individual User Inventory: username.txt

How to Run:
1.	Clone or download this repository.
2.	Open the project in NetBeans (recommended) or any Java IDE.
3.	Compile and run adminloginpage.java or usersloginpage.java as entry points.
4.	Follow on-screen instructions for admin or user tasks.
5.	Login: 
   ->	Use the default admin ID & password to access admin features.
6.	Manage books & users through the GUI.
