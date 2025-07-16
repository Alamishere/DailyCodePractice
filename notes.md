## July 9, 2025

Worked on Java problems: Palindrome, FizzBuzz, Pairs, and PrimeNumbers from Structy.

Faced challenges with Java syntax, especially in Palindrome and Pairs.  
- Learned about `Character.isLetterOrDigit()` and `Character.toLowerCase()`  
- Pairs used 2D arrays, which are new to me

Each problem took around 20 minutes — focused on understanding the logic, not speed.


## July 10th, 2025

Worked on PairSum Problem from Structy

- Was able to mimic pairs problem
- I only solved the Brute Force Solution
- Got solution from Claude/ChatGPT after trying on paper pseudoCode
- Syntax error again
- Was able to iterate but not able to compute result. **Try again**

Later at night I tried to solve frequencyCounter
- Took long time to understand
- A lot of Java Syntax error but am getting there
- Tried first 30 min writing on paper what is the plan
- Reveiwed with chatGPT after 30min


## July 11, 2025

Worked on OOP for Java

- Syntax is the issue
- Learned how to check if email is valid on setter
- Tried for 15 min
- Get comfortable writing constructor, it is not same as creating new instance of User

Worked on Reversing String and TwoSum Problem
- Brute force method seems simple but again syntax issue
- How do I return a pair without using ArrayList new int[]{i,j};
- Reversing String can be done several way. string s = ch+ s;

## July 12, 2025
- Anagram can be solved by converting them to char
- Put them in Char Array
- Sort them and compare the Array
- This gives n log n time complexity
- HashMap solution gives O(n) time complexity 

## July 13, 2025
- PairProduct was using Brute Force which is checking each number multiplying with following number
- HashMap gives better time complexity
- I had hardtime understanding the hashmap solution
- I understand the idea but lot of syntaxes

## July 14, 2025
- mostFrequent Char is complicated than I expected
- How do I know if I need another helping method?
- Also need to know '\0'
-  if (mostFrequent == '\0' || count.get(c) > count.get(mostFrequent)) this is very tricky, you get the most count not each count

## July 15, 2025
- Reversing a string but the way I thought was to iterate from the back which didnt work because I didn't know where I was going 
- Putting a String for reversed and prepending
- Although this is n^2 solution

## July 16, 2025
- Intersection problem I was able to do Brute Force way and the 4th test was giving error
- I was doing O(n^2) for time complexity
- Also I was using hashmap, put keys and index value making it complicated
- Learned about hashset which is just only Value/Key
- The idea is to use a HashSet to store the values from listA, then loop through listB and check if each element exists in the set. If it does, add it to the result