# Background

Most of this lab is concerned with really basic object-oriented programming: getters, setters, and simple methods of a class. However, there are a few concepts that may be new even to the most experienced Java programmers:

It covers some concepts that may be new to you, even if you have worked with Java before, including:
* Maven (the `pom.xml` file and the `mvn` command)
* Code Coverage (with Jacoco)

Step-by-Step
============

# Step 1: Get oriented to packages

A few things to notice:

* Under `src`, there are two directory trees:
   * `src/main/java/edu/whitman` contains regular Java classes.
   * `src/test/java/edu/whitman` contains the test classes.

Here are the commands you'll need as you work with the code. 

| To do this | Type this command | Notes |
|-|-|-|
| compile the code | `mvn compile` | |
| reset everything | `mvn clean` | | 
| run the tests | `mvn test` | |
| generate a report of test coverage | `mvn test jacoco:report ` | Open the file `target/site/jacoco/index.html` in a browser to read the report. (Note that a report will only be generated if your unit tests pass) |

# Step 2: Start writing code to make tests pass

In this lab, you'll be implementing several methods of a class called `MenuItem` that represents
item on a restaurant Menu.

A `MenuItem` represents an item on the menu of a restaurant.  It has three attributes:
* the menu item name, e.g. `"Small Poke Bowl"`
* the price, in cents (e.g an item that costs $1.49 is represented by the integer 149)
* a category such as `"Beverages"` or `"Poke Bowls"`

# Details about methods of MenuItem

The constructor has the signature:
```
public MenuItem(String name,
                int priceInCents,
                String category)
```

Here are the instance methods you'll need to implement for `MenuItem`

| Modifier and Type	| Method | Description |
|-|-|-|
|`String`	| `getCategory()` | Returns the category of the menu item |
|`String`	| `getName()` | Returns the name of the menu item |
|`String`	| `getPrice()` | Returns the price, formatted as a string with a $.
|`String`	| `getPrice(int width)` | Returns the price, formatted as a string with a $, right justified in a field with the specified width. |
| `int`	| `getPriceInCents()` | get the price in cents only |
| `String`	| `toString()` | return a string in csv format, in the order name,price,cateogry. <br> For example: `"Small Poke Bowl,1049,Poke Bowls"`<br>In this case, the price is unformatted; just an integer number of cents. |


## Checking the tests

To check the code against the tests that you've written, use:

* `mvn test`

Interpreting the output can be 

# Step 3: Learning about Test Coverage

Now, did you really write unit tests for all of your code? Let's check!

We can automatically compute "test case coverage", using a tool call JaCoCo (Java Code Coverage).

Read these short articles about test coverage:
* <https://ucsb-cs156.github.io/topics/testing/>

Once you've looked over those, it's time to check your test coverage, which
we'll do in Step 4.

# Step 4: Checking Test Case Coverage

Check your test coverage!

## Checking Test Case Coverage Locally.

* Run: `mvn test jacoco:report`
* Then, open the file `target/site/jacoco/index.html` in a browser.
  
# How to read the test coverage reports

* If any line of code is red, that means it is not tested at all&mdash;it is being missed by *line coverage*
* If a line of code is yellow, it means there are multiple ways to execute the line.
   * it may have an if/else, or a boolean expression involving `&&` or `||`, and thus there are multiple paths through the code (multiple branches).  
   * Yellow means it is being missed by *branch coverage*; some branches are covered, and others are not.   
   * Think about the multiple paths through the code and be sure your tests are coverage all of them.

# Step 5: Try to get as close to 100% coverage as you can

Keep reworking your code until you get as close as you can to 100% test coverage. 100% coverage isn't always necessary or
even desirable, but in this case you should be able to get there, or at least pretty close.

# Step 6: Take a screenshoot
Take a screenshoot of the Jacobo test coverage from index.html and upload it to your repository as jacobo.png. Then, commit and push your changes in the main branch.

# Step 7: Go back to Canvas 
Go back to Canvas and copy and past the GitHub lab link of your repository.

# Acknowledgment
UC Santa Barbara and Richard Torres-Molina lab modifications. 
