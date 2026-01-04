### Veterinary Clinic Management System (Assignment 2)

#### Project Overview

This project is an interactive console application designed for a Veterinary Clinic. It transitions from a static data model to a dynamic system where users can manage pets, owners, and veterinarians in real-time. The main focus of this version is **Encapsulation with Data Validation** and **User Interaction**.

#### Key Features (Implemented Requirements)

* **Encapsulation & Validation:** (1) All class fields are private. Setters include validation logic to prevent invalid data (e.g., negative age or empty names).
* **Interactive Menu:** (1) A robust `while` loop system with a `switch-case` menu that allows continuous interaction.
* **Data Persistence (In-Memory):** (1) Uses `ArrayList` to store and manage multiple objects of different types during the program execution.
* **CRUD Operations:** (1) Functional "Add" and "View All" features for Pets, Owners, and Veterinarians.
* **Input Handling:** (1) Uses `Scanner` with input verification to prevent application crashes on invalid numeric entries.

#### Class Structure

* **Pet:** Manages animal data, including life stage calculations.
* **Owner:** Tracks client information and pet ownership status.
* **Veterinarian:** Manages medical staff data and specialization checks.
* **Main:** The entry point of the application containing the menu logic and data collections.

#### How to Run

1. Compile all `.java` files in the same directory.
2. Run `Main.java`.
3. Follow the on-screen instructions to manage clinic records.
