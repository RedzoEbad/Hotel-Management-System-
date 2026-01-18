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

## 🧪 Unit Testing: The "Security Guards" of Code

Unit Testing is like a quality control check. We test each small "unit" (class) of the code separately to make sure it doesn't have any bugs.

### 1. Where are the tests?
All files ending in **`Test.java`** are your testing files.

### 2. Test File Breakdown
| Test File | What it checks | Why it's important |
| :--- | :--- | :--- |
| **HotelTest.java** | Checks if hotels are created correctly and if they correctly report as "empty" at the start. | Ensures the system knows when rooms are available. |
| **RoomTest.java** | Checks if room numbers are correct and if guests can enter/leave properly. | Prevents room number errors. |
| **ReservationTest.java** | Checks if booking dates are valid (e.g., prevents check-out before check-in). | Prevents logic errors in dates. |
| **Hotel_ChainTest.java** | Checks if the master system can manage multiple hotels and links payers correctly. | Ensures the whole "Chain" works together. |
| **RoomTypeTest.java** | Checks if categories (Deluxe, Suite) have the correct names and prices. | Ensures pricing is accurate. |
| **How_ManyTest.java** | Checks if the room counter only accepts positive numbers. | Stops someone from booking -5 rooms. |
| **GuestTest.java** | A simple manual check for guest name and address data. | Verifies basic guest info. |
| **IntegrationTest.java** | A "Full System" test. It tries to book a real room from start to finish. | Makes sure all parts of the app talk to each other correctly. |

---

### 3. How do the tests work? (The AAA Pattern)
Professional engineers use a pattern called **AAA** to write tests. You will see this in almost every file:

1.  **Arrange (Setup)**: We create "fake" data (like a fake hotel called "Test Hotel").
2.  **Act (Execute)**: We perform the action (like trying to add a room to that hotel).
3.  **Assert (Verify)**: We check the result. If the result is what we expected, the test **Passes** ✅. If not, it **Fails** ❌.

**Example from `How_ManyTest.java`:**
- **Arrange**: Set `expectedNumber = 5`.
- **Act**: Create a `How_Many` object with `5`.
- **Assert**: Check if `hm.getNumber()` actually gives us `5`.

---

## 🏃 How to Run All Tests

I have made it super easy for you. I added a second shortcut file called **`test_all.bat`**.

Just type this in your terminal:
### **`.\test_all.bat`**

It will run every single test and tell you exactly which ones are passing!
