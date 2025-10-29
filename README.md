# 🛒 Product Shopping App (Java)

A **console-based shopping cart system** built using **Object-Oriented Programming (OOP)** and **Data Structures & Algorithms (DSA)** in Java.  
The project simulates a simple e-commerce experience, where users can browse products, add them to a cart, view totals, and complete checkout — all through an interactive terminal interface.

---

## 🚀 Features

✅ **Add Products to Cart** — Select items by short name and dynamically add them.  
✅ **Cart Management** — Auto-increment quantities for duplicate additions.  
✅ **Checkout System** — Calculates total, accepts cash, and returns balance.  
✅ **Efficient Data Handling** — Uses `HashMap` for cart management and `ArrayList` for product listing.  
✅ **Error Handling** — Manages invalid inputs and ensures smooth execution flow.  

---

## 🧠 Concepts & DSA Used

- **OOP Principles:** Encapsulation, Composition, and Abstraction  
- **DSA Concepts:**  
  - HashMap → for O(1) cart operations  
  - ArrayList → for dynamic product storage  
  - Loops, Conditionals, Iteration  
- **Algorithms:** Searching, Counting, and Mapping Logic  

---

## 🧰 Tech Stack

| Component | Technology |
|------------|-------------|
| Language | Java |
| Core Concepts | OOP + DSA |
| Data Structures | HashMap, ArrayList |
| IDE | VS Code / IntelliJ IDEA |
| Version Control | Git & GitHub |

---

## 💾 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/It-iandeepak/Product-Shopping-App-Java.git
   ```
2. Open in your IDE (VS Code / IntelliJ)
3. Compile and run:
   ```bash
   javac src/*.java
   java src/ProductApp
   ```
4. Follow on-screen instructions to shop!

---

## 🧱 Project Structure

```
src/
├── Product.java     → Defines a product (ID, name, price)
├── Item.java        → Represents a cart item (product + quantity)
├── Cart.java        → Manages items and calculates totals
└── ProductApp.java  → Main program and user interface
```

---

## 🌟 Future Enhancements

- 🪟 GUI version using **Swing/JavaFX**  
- 🗃 Product storage with **MySQL**  
- 🌐 Web version using **Spring Boot**  
- 👥 Add authentication and user order history  

---

## 👨‍💻 Author

**Deepak Kumar (Problem Solver)**  
🎓 IT Student | 💡 Future Tech Enthusiast | 🧠 DSA & OOP Practitioner  
📫 Connect on [LinkedIn](https://linkedin.com/in/deepak-kumar-18999232b/)

---

## 🏷️ Tags
`#Java` `#OOP` `#DSA` `#Project` `#ShoppingApp` `#ConsoleApp` `#GitHub`

---

## 📸 Optional (Add a Screenshot)

Take a screenshot of your console showing:
```
Added to cart: Mango : Rs 16
_____________
1 x Mango Rs 16
Total Amount: Rs. 16
_____________
```
Save it as `demo.png` and add it to the repo for visual appeal.

---

## 💬 Example Commit Messages
- `Initial commit: Added core classes Product, Item, Cart`
- `Added checkout functionality`
- `Improved user input handling and comments`
- `Finalized README and documentation`
