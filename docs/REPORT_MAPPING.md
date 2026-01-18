# 📄 Academic Report Mapping: Requirements vs. Code

This document provides exactly where and how your code satisfies each requirement for your final submission.

---

## 1. UML Design Implementation
*Requirement: Implement all classes and relationships exactly as specified.*

| Concept | Location in Code | Implementation Detail |
| :--- | :--- | :--- |
| **Composition** | `Hotel_Chain.java` (L11-12) | The `Hotel_Chain` contains `List<Hotel>`. If the chain is deleted, the hotels are effectively managed by it. |
| **Aggregation** | `Hotel.java` (L9) | The `Hotel` has a `List<Room>`. This is an aggregation because rooms can exist independently in concept but are part of the hotel. |
| **Association** | `Room.java` (L13) | `Room` has an association with `RoomType`. This links a specific room to its category.  |
| **Multiplicity** | `Hotel_Chain.java` | One chain to many hotels (1 to *) is implemented using `ArrayList`. |
| **Access Modifiers** | All Files | All attributes are `private` (Encapsulation), and methods are `public`. |

---

## 2. Clean Code Principles
*Requirement: Modularized, small methods, meaningful names.*

- **Meaningful Names**: Classes like `ReserverPayer`, `RoomType`, and `Reservation` clearly describe their business purpose.
- **Small Methods**: Look at `Hotel.java` -> `available()` (L24) or `createReservation()` (L30). These are short, focused on one task.
- **Separation of Responsibilities**: 
    - `Guest.java` only stores guest info.
    - `ReserverPayer.java` only handles payment logic.
    - `Hotel_Chain.java` handles high-level coordination.

---

## 3. Defensive Programming
*Requirement: Validate inputs, handle exceptions, prevent illegal states.*

- **Null/Empty Checks**: 
    - `Hotel.java` constructor (L15-17): Throws `IllegalArgumentException` if name is empty.
    - `ReserverPayer.java` (L19-21): Throws error if ID or Card is null.
- **State Validation**:
    - `Reservation.java` (L19-21): Throws error if the **End Date** is before the **Start Date**. This prevents "impossible" bookings.
    - `How_Many.java`: Ensures the number of rooms is at least 1.

---

## 4. Unit Testing (JUnit 4)
*Requirement: AAA style, boundary conditions, invalid inputs.*

- **AAA Pattern (Arrange-Act-Assert)**:
    - See `HotelTest.java` (L9-L16). It is explicitly commented with `1. Arrange`, `2. Act`, and `3. Assert`.
- **Boundary Conditions**:
    - `How_ManyTest.java` (L18-36): Tests what happens with **Zero (0)** or **Negative Numbers**. This satisfies the requirement for "invalid inputs" and "boundary conditions."
- **Parameterization**:
    - While JUnit 4 is used, the tests cover multiple scenarios across different files to ensure full coverage.

---

## 5. GitHub & Documentation
*Requirement: Meaningful commits and instructions.*

- **README.md**: I have updated this to include "Instructions to build and run" and "Execute tests."
- **Commit History**: Ensure you have pushed your latest changes. The message "unit test updated" is a logical progress commit.

---

## 💡 Tips for your Hardcopy (4 Pages Max)
1. **Front Page**: Use the format requested (Program, Course, etc.).
2. **Screenshots**:
    - Run `.\run.bat` and take a screenshot of the **Successful Output**.
    - Run `.\test_all.bat` and take a screenshot of use case results.
3. **Main Method**: 
    - The `Main.java` file is your "Use Case Demonstration." It shows:
        1. Object creation.
        2. Linking objects (Hotel -> Room -> Type).
        3. Fulfilling a booking.
