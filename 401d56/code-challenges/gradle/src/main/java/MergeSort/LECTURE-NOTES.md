## Lecture Notes: Merge Sort

This is a basic sorting algorithm implements a divide and conquer approach. 
It is a recursive solution that splits an array in half until only one value is
left.  Once it reached the single value it will begin to merge the array back.

One of the most efficient sorting solutions.

### Learning Objectives
 - What is the purpose of sorting
 - Different types of sorting
 - Demo (in action) [Demo Site](https://www.toptal.com/developers/sorting-algorithms)
    
 ![MergeSort](../../../../../../assets/MergeSortVisual.png)
### Lecture Flow
 - Sorting
    - Merge Sort
 - Coding Workshop
    - Testing
    
### Diagram
- [3, 6, 7, 9, 1, 2] <- Starting Point
- [3, 6, 7] [1, 9, 2]
- [3, 6] [7] [1, 9] [2]
- [3] [6] [7] [1] [9] [2]
- [3, 6] [7, 1] [9, 2]
- [1, 3, 6, 7] [2, 9] 
- [1, 2, 3, 6, 7, 9] <- Ending Point




## Algorithm
Insertion sort is a simple sorting algorithm that builds the final 
sorted array (or list) one item at a time. It is much less efficient
on large lists than more advanced algorithms.

## Pseudocode
```
 ALGORITHM Mergesort(arr, arrLengh)       
     if arrLength > 1
       DECLARE mid <-- n/2
       DECLARE b <-- arr[0...mid]
       DECLARE c <-- arr[mid...n]
       // break down the left side
       Mergesort(b, mid)
       // break down the right side
       Mergesort(c, arrLength-mid)
       // merge the left and the right side together
       Merge(b, c, arr)
 
 ALGORITHM Merge(b, c, a)
     DECLARE i <-- 0
     DECLARE j <-- 0
     DECLARE k <-- 0
 
     while i < b && j < c
         if b[i] <= c[j]
             a[k] <-- b[i]
             i <-- i + 1
         else
             a[k] = c[j]
             j <-- j + 1
             
         k <-- k + 1
 
     if i = b.length
        add remaining items in array c to array a
     else
        add remaining items in array b to array a
        
     return a
```

## Readings and References
Watch
 - [Video #1](https://www.youtube.com/watch?v=KF2j-9iSf4Q)
 
Read
 - [Article 1](https://www.geeksforgeeks.org/merge-sort/)
 - [Article 2](https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm)
 - [Article 3](https://www.baeldung.com/java-merge-sort)
 
Bookmark
 - [Geeks For Geeks](https://www.geeksforgeeks.org/insertion-sort/)