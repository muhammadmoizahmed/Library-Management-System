# 📚 Library Management System

A **Java Swing Desktop Application** developed as a Data Structures & Algorithms Lab Project.  
This system demonstrates the practical application of:

- Object-Oriented Programming (OOP)
- Event-Driven Programming
- File Handling
- Serialization in Java

🚫 **Note:** This project does **not** use any external database — all data is stored locally using `.txt` files and Java serialization.

---

## 🛠️ Technologies & Concepts Used

- **Java Swing GUI** (`JFrame`, `JPanel`, `JButton`, `JLabel`, `Icons`)
- **Event Handling** (`ActionListener`, `actionPerformed`)
- **OOP Principles** (Classes, Inheritance, Encapsulation)
- **File Handling** (`ObjectOutputStream`, `ObjectInputStream`)
- **Serialization** (`Serializable` interface)
- **Dynamic Storage** using `ArrayList`
- **Modular Code Structure**
- **NetBeans IDE** + Apache Ant Build System

---

## 🔐 Roles & Features

### 👨‍💼 Admin:
- Login with default credentials
- Add New Book
- Remove Existing Book
- Search Book / User
- View All Books
- Add New User
- Remove User
- View All Users

### 👤 User:
- Login with ID and Password
- View Available Books
- Borrow a Book
- Return a Book
- View Personal Inventory

---

## 🗃️ Data Storage

| Data Type       | File Name         | Description                            |
|-----------------|-------------------|----------------------------------------|
| Books           | `data.txt`        | Stores all book records (serialized)   |
| Users           | `user.txt`        | Stores all user records (serialized)   |
| User Inventory  | `username.txt`    | Each user's borrowed books record      |

---

## 📂 Key Classes & Their Functions

| Class Name              | Purpose                           |
|-------------------------|-----------------------------------|
| `addbooks.java`         | Add new books                     |
| `remove.java`           | Remove books                      |
| `search.java`           | Search books or users             |
| `returnbooks.java`      | Return borrowed books             |
| `userrigistration.java` | Register new users                |
| `usersloginpage.java`   | User login                        |
| `adminloginpage.java`   | Admin login                       |
| `management.java`       | Admin dashboard                   |
| `viewbook.java`         | View all books                    |
| `veiwuser.java`         | View all users                    |
| `deleteuser.java`       | Delete user account               |
| `userviewbook.java`     | User’s view of available books    |

---

## ▶️ How to Run

1. **Clone** this repository or download the ZIP.
2. Open the project in **NetBeans** (recommended) or any Java-compatible IDE.
3. Compile and run either of the following files as your entry point:
   - `adminloginpage.java` (for admin access)
   - `usersloginpage.java` (for user access)
4. Follow the on-screen GUI instructions.

### 🔑 Default Login (Admin):
- **Username:** `admin`
- **Password:** `admin`

---

## 📄 License

This project is licensed under the **MIT License** — feel free to use, modify, and distribute with proper attribution.

---

## 🤝 Acknowledgements

Project developed by **Muhammad Moiz Ahmed** as part of the university coursework on **Data Structures & Algorithms**.
