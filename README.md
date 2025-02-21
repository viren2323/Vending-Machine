# Vending Machine System Using State Design Pattern

## 📌 Project Description  
This project is a **Vending Machine System** designed using the **State Behavioral Design Pattern**. It efficiently manages product selection, payment processing, and item dispensing through different machine states: **Idle, Ready, Dispense, and Return Change**. The system ensures smooth transitions, preventing invalid operations like inserting money before selecting a product.

## 🚀 Features  
- **State Design Pattern** for managing vending machine states.  
- **Inventory Management** using `ConcurrentHashMap` to track product stock.  
- **Payment Handling** with predefined currency notes and automatic change return.  
- **Seamless State Transitions** ensuring a smooth user experience.  
- **Edge Case Handling** for out-of-stock items and insufficient funds.  

## 🛠️ Tech Stack  
- **Java**  
- **Object-Oriented Programming (OOP)**  
- **State Design Pattern**  
- **ConcurrentHashMap (for inventory management)**  

## 🏗️ Project Structure  
VendingMachineSystem
├── src
│ ├── Main.java
│ ├── VendingMachine.java
│ ├── Inventory.java
│ ├── Product.java
│ ├── Note.java
│ ├── states/
│ │ ├── VendingMachineState.java
│ │ ├── Idle.java
│ │ ├── Ready.java
│ │ ├── Dispense.java
│ │ ├── ReturnChangeState.java
├── README.md



## 🎯 How It Works  
1. **Select a Product** → User chooses an item from the vending machine.  
2. **Insert Money** → The system accepts predefined currency notes.  
3. **Dispense Product** → If sufficient payment is made, the product is dispensed.  
4. **Return Change** → If extra money is inserted, change is returned.  

## 🔧 Setup & Run  
1. Clone the repository:  
   ```bash
   git clone https://github.com/viren2323/VendingMachineSystem.git
