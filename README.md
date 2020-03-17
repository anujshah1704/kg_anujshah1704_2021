# Notes:

The code is in java and the steps to run are mentioned below.
Both the .class file and the .java have been added.

# Steps to run:
- 1st compile the main. java file as: javac main.java
- This will create a .class file which can be made to execute by : java main

# Assumptions:
Since there are a few test cases provided there has been an ambiguity.  
As the question suggests "one to one Character Character mapping" and by the example of s1 = "foo" and s2 = "bar" returns false and true for vice versa although the mapping is not one to one for the two sets.   
Thus taking this into consideration I have understood the problem such that the lengths of the strings should be the same and will return false if otherwise.  
Ignores the case where s1 = "abcabc" and s2 = "foo". Although all characters in abc have been mapped to a character in s2 but if it is one to one character mapping then the next part of abc will not be mapped.  
similiarly in the case when s1 = "abc" and s2 = "abcde"