## Lecture Notes: Insertion Sort

Brief description of what this algorithm is, does, and why we care.

Is it more efficient than others? How does it attack the problem differently?

### Learning Objectives
 - What is the purpose of sorting
 - Different types of sorting
 - Demo (in action) [Demo Site](http://sorting.at/)
 - Insertion Sort Visual
### Lecture Flow
 - Sorting
    - Insertion Sort
 - Coding Workshop
    - Testing
    
### Diagram
- [3, 6, 7, 9, 1, 2] <- Starting Point
- [3, 6, 7, 1, 9, 2]
- [3, 6, 7, 1, 9, 2]
- [3, 6, 1, 7, 9, 2]
- [3, 1, 6, 7, 9, 2]
- [1, 3, 6, 7, 9, 2]
- [1, 3, 6, 7, 2, 9]
- [1, 3, 6, 2, 7, 9]
- [1, 3, 2, 6, 7, 9]
- [1, 2, 3, 6, 7, 9] <- Ending Point




## Algorithm
Describe in detail how the algorithm works. Include small code snippets to possibly support the points

## Pseudocode

  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp

## Readings and References
Watch
 - [Video #1](https://www.youtube.com/watch?v=lCDZ0IprFw4)
 
Read
 - [Article 1](https://mathbits.com/MathBits/Java/arrays/InsertionSort.htm)
 - [Article 2](https://www.tutorialspoint.com/insertion-sort-in-Java)
 
Bookmark
 - [Geeks For Geeks](https://www.geeksforgeeks.org/insertion-sort/)