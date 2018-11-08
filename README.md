# Unit 01 Assessment

This assessment should be completed within 3 (three) hours after it has started. Please download the following project to your computer: 

This project has 7 (seven) tasks which must be completed in their entirety to receive full-credit:

#### Task #01 (16 Points)

Create a `class` called `PrimitiveConverter` in a file called `PrimitiveConverter.java` in the `org.pursuit` package.

This class should have 4 (four) methods:
* `intToInteger`, which accepts a parameter of type `int`, and returns the value of the parameter as an `Integer` object
* `doubleToDouble`, which accepts a parameter of type `double`, and returns the value of the parameter as a `Double` object
* `charToCharacter`, which accepts a parameter of type `char`, and returns the value of the parameter as a `Character` object
* `booleanToBoolean`, which accepts a parameter of type `boolean`, and returns the value of the parameter as a `Boolean` object

#### Task #02 (16 Points)

Create a `class` called `Overloader` in a file called `Overloader.java` in the `org.pursuit` package.

This class should have 4 (four) methods:
* `doubleDivision`, which accepts two parameters of type `int`, stores both parameters as `double` values, divides the first parameter by the second parameter, and returns the result as a `double` value
* `doubleDivision`, which accepts one parameter of type `int` and another parameter of type `double`, stores both parameters as `double` values, divides the first parameter by the second parameter, and returns the result as a `double` value
* `doubleDivision`, which accepts one parameter of type `double` and another parameter of type `int`, stores both parameters as `double` values, divides the first parameter by the second parameter, and returns the result as a `double` value
* `doubleDivision`, which accepts two parameters of type `double`, stores both parameters as `double` values, divides the first parameter by the second parameter, and returns the result as a `double` value

#### Task #03 (16 Points)

Create a `class` called `FourWinds` in a file called `FourWinds.java` in the `org.pursuit` package.

This class should have 4 (four) `static` fields, with `public` access modifiers, which CANNOT be reassigned after assignment:
* `NORTH`, of type `int`, assigned a value of `0`
* `SOUTH`, of type `int`, assigned a value of `1`
* `EAST`, of type `int`, assigned a value of `2`
* `WEST`, of type `int`, assigned a value of `3`

This class should also have 4 (four) `static` "getter" methods, with `public` access modifiers:
* `getNorth`, of type `int`, which returns the value stored in the field `NORTH`
* `getSouth`, of type `int`, which returns the value stored in the field `SOUTH`
* `getEast`, of type `int`, which returns the value stored in the field `EAST`
* `getWest`, of type `int`, which returns the value stored in the field `WEST`

#### Task #04 (16 Points)

Create an `interface` called `DataStructures` in a file called `DataStructures.java` in the `org.pursuit` package.

This interface should have 4 (four) method signatures:
* `stringToCharArray`, which accepts a parameter of type `String` called `word`, and returns an object of type `char[]`
* `multiplicationTableList`, which accepts a parameter of type `int` called `number`, and returns an object of type `ArrayList<Integer>`
* `wordLength`, which accepts a parameter of type `String[]` called `wordArray`, and returns an object of type `HashMap<String, Integer>`
* `uniqueCharacters`, which accepts a parameter of type `String` called `word`, and returns an object of type `HashSet<Character>`

#### Task #05 (16 Points)

Create a `class` called `Algorithms` in a file called `Algorithms.java` in the `org.pursuit` package.

This class should implement the `DataStructures` interface.

This class should `@Override` 4 (four) methods from the `DataStructures` interface, and have the following functionality:
* `stringToCharArray`, which should take every `char` in the `String` parameter passed into the method, add it to a `char[]` array, then return that `char[]` array object
* `multiplicationTableList`, which should add every number from 1 to 10, multiplied by the parameter passed into the method, to an `ArrayList` object with a parameterized type of `Integer`, then return that `ArrayList<Integer>` object
* `wordLength`, which should take every `String` in the `String[]` array parameter passed into the method, and put it in a `HashMap` object with with parameterized key/values types of `String` and `Integer` respectively, with the `String` as a key, and the `String`'s size as a value, then return that `HashMap<String, Integer>` object
* `uniqueCharacters`, which should take every unique `char` in the `String` parameter passed into the method, and add it to a `HashSet` object with a parameterized type of `Character`, then return that `HashSet<Character>` object

#### Task #06 (8 Points)

Create a `class` called `Parent` in a file called `Parent.java` in the `org.pursuit` package.

This class should have 2 (two) `private` fields:
* `eyeColor`, of type `String`
* `hairColor`, of type `String`
* It should have a custom constructor, which assigns values to both fields at the moment of instantiation using 2 (two) parameters
* It should have 2 (two) "getter" methods:
  * `getEyeColor` which should return the `String` value stored in the `eyeColor` field
  * `getHairColor` which should return the `String` value stored in the `hairColor` field

#### Task #07 (12 Points)

Create a `class` called `Child` in a file called `Child.java` in the `org.pursuit` package.

This class should extend from the class `Parent`.

This class should have 1 (one) `private` field:
* `age`, of type `int`
* It should have a custom constructor, using 3 (three) parameters: 2 (two) should be passed to the super's constructor, and 1 (one) should assign a value to the field `age` at the moment of instantiation
* It should have 1 (one) "getter" method:
  * `getAge`, which should return the `int` value stored in the `age` field

### Key Requirement
* all spelling of method names, parameter types, and method return types must be either written or declared **AS DESCRIBED IN EACH TASK DESCRIPTION**.

### Submission

Please initialize a git repository within the root project folder, add and commit your changes, and push to a remote repository, then paste the link to this remote Github repository into Canvas by no later than 10:00pm EST.
