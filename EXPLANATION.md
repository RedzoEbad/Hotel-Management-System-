# 🏨 Hotel Management System: Detailed Guide

This project is a Java-based system for managing hotel bookings. It follows a professional design to handle multiple hotels, room types, and reservations.

---

## 📂 File-by-File Explanation

### 1. Core System Files
| File | Purpose (The "What") | How it Works (The "Logic") |
| :--- | :--- | :--- |
| **Hotel_Chain.java** | The big boss (Owner of all hotels). | Contains a list of `Hotel` objects. It is the main entry point for creating payers and making reservations. |
| **Hotel.java** | A single hotel building. | Keeps track of its `Room`s and `Reservation`s. It checks if it has any rooms available. |
| **Room.java** | An actual room (e.g., Room 101). | Knows which `RoomType` it belongs to and which `Guest` is currently staying in it. |
| **RoomType.java** | Categories (e.g., "Deluxe", "Suite"). | Stores the name of the category and the **Price per Night**. Many rooms can share one type. |
| **Guest.java** | The person staying. | Stores the name and address of the person in the room. |
| **Reservation.java** | The booking details. | Stores the Start Date, End Date, and how many rooms are needed. It connects a Payer to a Hotel. |
| **ReserverPayer.java** | The person paying. | Stores Credit Card info. A Payer "owns" a reservation. |
| **How_Many.java** | A counter. | A simple class that ensures the number of rooms requested is a positive number (validates input). |

### 2. The Entry Point
| File | Purpose |
| :--- | :--- |
| **Main.java** | The "Demo" file. | This is where the code starts running. It creates a Hotel, adds a Room, makes a booking, and prints the result to your screen. |

---

## 🔄 The Full Flow (Step-by-Step)

Here is exactly what happens when you run the system:

1.  **Setting up the Chain**: A `Hotel_Chain` (e.g., "Serena Group") is created.
2.  **Adding a Hotel**: A `Hotel` (e.g., "Serena Islamabad") is built and added to that chain.
3.  **Defining Rooms**: 
    - We create a `RoomType` (e.g., "Deluxe" for $25,000).
    - We create a `Room` (e.g., 101) and tell it "You are a Deluxe room".
    - We put that room inside the Hotel.
4.  **Registering a Payer**: A `ReserverPayer` signs up with their credit card.
5.  **Booking**:
    - The Payer asks for a `Reservation`.
    - The system creates a `Reservation` object with the dates and room type.
    - The `Hotel_Chain` links that Reservation to the Payer.
6.  **Check-in**: A `Guest` (the actual person) is created and assigned to `Room 101`.
7.  **Output**: The system prints a summary showing the Hotel name, Payer ID, and total cost.

---

## 🛠️ Key Technical Features
- **Defensive Programming**: The code checks for errors (like empty names or negative prices) and stops them before they cause a crash.
- **Relationships**: The project uses "Composition" (The chain *owns* the hotel) and "Aggregation" (The room *has* a guest).
- **Automation**: I have added a `run.bat` file so you can run all of this logic by just typing `.\run.bat`.

---

## 🧪 Testing (The "Checkers")
The files ending in `Test.java` (like `HotelTest.java`) are not part of the actual app. They are **automatic checkers**. They run small experiments on the code to make sure 1+1=2 and that the price cannot be negative.
