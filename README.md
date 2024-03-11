**Adventure Game with Strategy Pattern**
This project implements an adventure game framework utilizing the Strategy design pattern to handle various weapon behaviors.

**Overview**
In this adventure game, characters engage in battles using different weapons. The game employs the Strategy design pattern to allow for flexible and interchangeable weapon behaviors. 
Each weapon behavior is encapsulated in classes implementing the WeaponBehavior interface, providing a consistent method signature for weapon usage.

**Components**
WeaponBehavior Interface: Defines the contract for weapon behaviors through the useWeapon() method.
Character Class: Represents a character in the game with a fight() method that delegates combat to the equipped weapon behavior.
Concrete Character Classes: Various character classes extending the Character base class, each with its own specialization and behavior. These classes specify the weapon behavior through their constructors.
Concrete Weapon Classes: Different weapon classes implementing the WeaponBehavior interface, offering distinct attack strategies.

**Usage**
To create new characters or weapons, simply extend the appropriate base classes and implement the required methods. 
Specify the desired weapon behavior when constructing character objects. 
The game's flexibility allows for dynamic changes in weapon behavior, facilitating diverse gameplay experiences.

