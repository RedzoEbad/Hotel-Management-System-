# 📄 Final Submission Guide: Text for Your Hardcopy

This document contains all the text you need for your final report. Copy and paste the sections below.

---

## 3. Main Program & Use Case Demonstration

### Main Method / Entry Point
**Explanation:**  
The `Main.java` file serves as the system's entry point. Its primary purpose is to orchestrate the initialization of the hotel management ecosystem. It performs the following sequence:
1.  **System Initialization**: Instantiates the `Hotel_Chain` and registers a specific `Hotel` within that chain.
2.  **Resource Configuration**: Defines a `RoomType` (e.g., Deluxe) and populates the hotel with physical `Room` objects linked to that type.
3.  **Customer Management**: Creates a `ReserverPayer` with unique identity and payment details.
4.  **Transaction Flow**: Executes a booking by creating a `Reservation` with specific dates and linking it to the payer through the `Hotel_Chain` logic.
5.  **Occupancy**: Creates a `Guest` object and assigns them to a specific room, demonstrating real-world check-in behavior.

---

### Program Output & Use Case Explanation
**Explanation of Execution:**  
The program output demonstrates the successful interaction of multiple domain objects as defined in the UML diagram:

1.  **Object Creation**: The console logs the creation of a `Guest` ("Ebad Khan") for a specific `Room` (101). This confirms the **Composition** relationship between Hotel and its internal resources.
2.  **Interaction & Availability**: When a reservation is made, the system internally verifies room categorization via `RoomType` and availability through the `Hotel` class logic.
3.  **UML Use Case Fulfillment**:
    *   **Booking a Room**: The "Reservation Summary" confirms that the `Hotel_Chain` successfully linked the `Payer` to a `Reservation`.
    *   **Payer Identification**: The output displays the unique `Payer ID` (P-5501), verifying that customer data is persistent throughout the booking lifecycle.
    *   **Financial Integrity**: The display of "Total Cost per night" shows that the system correctly retrieves pricing data from the `RoomType` association.
    *   **Final Status**: The "System Running Successfully!" message confirms that all defensive checks (date validation, null pointer checks) passed, and the system state is valid.

---

## 4. Requirement Compliance Mapping

### UML Design Implementation
| Relationship | Location in Code | technical Explanation |
| :--- | :--- | :--- |
| **Composition** | `Hotel_Chain.java` | The `Hotel_Chain` owns and manages the lifecycle of `Hotel` objects and `ReserverPayer` objects. |
| **Aggregation** | `Hotel.java` | The `Hotel` contains a collection of `Room` objects. Rooms are parts that make up the Hotel. |
| **Association** | `Room.java` | The `Room` class is associated with a `RoomType` to determine its pricing and category. |
| **Multiplicity** | `Hotel.java` | Implemented as `List<Room>` and `List<Reservation>` to handle "one-to-many" (1..*) relationships. |
| **Encapsulation** | All Classes | All attributes (e.g., `private String name`) use private access modifiers with public getters. |

---

### Clean Code & Defensive Programming
| Principle | Location in Code | How it is applied |
| :--- | :--- | :--- |
| **Meaningful Names** | All Classes | Variables like `addressDetails`, `roomType`, and `isAvailable` are self-explanatory. |
| **Small Methods** | `Reservation.java` | Factory methods like `create()` are focused and modular. |
| **Input Validation** | `Reservation.java` | Constructor checks if `end` date is after `start` date to prevent illegal states. |
| **Null Handling** | `Hotel_Chain.java` | Prevents adding null hotels or making reservations with null payers. |
| **Exception Usage** | All Classes | Uses `IllegalArgumentException` and `NullPointerException` for professional error handling. |

---

### Unit Testing (JUnit 4)
| Feature | Applied In | Implementation |
| :--- | :--- | :--- |
| **AAA Style** | all `*Test.java` | Every test clearly defines **Arrange** (setup), **Act** (run), and **Assert** (check). |
| **Boundary Testing** | `How_ManyTest.java` | Specifically tests for **0** and **negative numbers** to ensure robust logic. |
| **Invalid Inputs** | `ReservationTest.java` | Tests what happens when dates are provided in the wrong order. |
| **Covers All classes** | `src/` folder | There is a dedicated test class for every domain class in the system. |

---

### 💡 Tips for Screenshots:
1.  **Main Method Screenshot**: Open `src/Main.java` in VS Code and take a screenshot of the `public static void main(String[] args)` method.
2.  **Program Output Screenshot**: Run `.\run.bat` and take a screenshot of the terminal window showing the "Reservation Summary".
3.  **Test Results Screenshot**: Run `.\test_all.bat` and take a screenshot showing the "OK (24 tests)" message.
