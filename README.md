# ISB10103 - Lab Exercise Method

### Table of Contents

1.  [Question](#question)
2.  [Answer](#answer)
    1.  [1st Run](#1st-run)
    2.  [2nd Run](#2nd-run)

---

### Question

Create an Aquatic class. This class offers three lessons; Swim, Snorkel and Dive. Each lesson is divided to three skill levels; Beginner, Intermediate and Advanced. Create a method `GetLesson()` for the user to choose a lesson and a method `GetSkill()` for user to enter a skill.
\
\
Fees for each lesson will be calculated based on skill and levels as follows:

![](/assets/images/01.png)

Use `char` type for `lessonID` and `skillID`.
Display total fees for each lesson in `CalculateFees(char lessonID, char skillID)`.
\
\
Test your program with different lesson and skill.

---

### Answer

The code can be found on following links:

- [GitHub](/src/Main.java)
- [GitHub Raw](https://raw.githubusercontent.com/mahran01/ISB10103-Lab-Exercise-Method/main/src/Main.java)
- [JDoodle](https://jdoodle.com/a/4J7I)
- [JDoodle Embed](https://www.jdoodle.com/embed/v0/4J7I)

The output of the code is as follows:

#### 1st Run

Output:

```
Choose a lesson:
1. Swim
2. Snorkel
3. Dive
```

Input:

```
2
```

Output:

```
Choose a skill:
1. Basic
2. Intermediate
3. Advanced
```

Input:

```
2
```

Output:

```
The fee is RM 25.00
```

#### 2nd Run

Output:

```
Choose a lesson:
1. Swim
2. Snorkel
3. Dive
```

Input:

```
1
```

Output:

```
Choose a skill:
1. Basic
2. Intermediate
3. Advanced
```

Input:

```
3
```

Output:

```
The fee is RM 35.00
```
