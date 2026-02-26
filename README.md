# Cold Escape

Cold Escape is a 2D top-down adventure game developed in Java. Players navigate through a frozen world, solving puzzles, avoiding deadly traps, and managing resources to find a way out. The game features a dynamic environment and a persistence system for player progress.

---

## Key Features

* **Exploration and Puzzle Solving**: Collect keys to unlock doors and advance through increasingly difficult levels.
* **Dynamic Hazards**: Survive environmental threats like timed floor spikes that toggle between active and inactive states.
* **Enemy AI**: Face patrolling NPCs (Orcas) and challenging boss encounters with custom pathfinding logic.
* **Database Integration**: Features a robust Save/Load system using SQLite to store player coordinates, coin count, keys, and total play time.
* **Immersive Audio and UI**: A dedicated sound system for background music and spatial effects like collecting items, opening chests, or taking damage.
* **Visual HUD**: Real-time tracking of player health via a heart system, score calculation, and a game timer.

---

## Technical Stack

* **Language**: Java.
* **Graphics**: Java Swing and AWT (Graphics2D) for custom rendering.
* **Data Persistence**: JDBC with SQLite.
* **Audio Engine**: Java Sound API (javax.sound.sampled).

---

## Gameplay

1. **Objective**: Navigate the map to find specific keys required to open level-exit doors.
2. **Collectibles**: Gather coins and open chests to increase your final score.
3. **Survival**: Monitor your health; contact with enemies or active spikes will deplete your life hearts.
4. **Controls**: Keyboard-based movement and interaction.

---

## How to Run

1. **Clone or download** the project to your local machine.
2. **Open the project** in an IDE (IntelliJ IDEA is highly recommended).
3. **Mark Resources**: Right-click the `res` folder and select **Mark Directory as > Resources Root**.
4. **Dependencies**: Ensure the SQLite JDBC driver is added to your project libraries to enable saving/loading.
5. **Run**: Locate and run the `Main.java` class to start the game.