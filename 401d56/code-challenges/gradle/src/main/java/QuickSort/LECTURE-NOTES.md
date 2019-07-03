## Lecture Notes: QuickSort

This is a basic sorting an array around a pivot point. Compares items from 2 pointers
to the pivot and if the 2 pointers are < or > respectively it swaps them. If one of the 
pointers is > but the < is not it moves to the next in the list until it finds a < or
they land on the same number.

This is an efficient sorting algorithm.

### Learning Objectives
 - Review: What is the purpose of sorting
 - Different types of sorting continued.
 - Demo (in action) [Demo Site](http://sorting.at/)
 - Quick Sort Visual
 
 ![QuickSort](../../../../../../assets/QuickSort.png)
### Lecture Flow
 - Sorting
    - Insertion Sort Review
    - Merge Sort Review
    - Recursion Review
    - Quicksort Sort
 - Coding Workshop
    - Testing
    
### Diagram
- [3, 6, 7, 9, 1, 2] <- Starting Point 2 Pivot

- [3, 1, 6, 7, 9, {2}]
- 3 and 1 swap put 2 in right place
- [1, 2, 3]<- Sorted [6, 7, {9}] 9 Pivot
- [1, 2, 3]<- Sorted [6, 7, {9}] 9 Pivot
- [1, 2, 3]<- Sorted [6,{7}] Sorted->[9] 7 Pivot
- [1, 2, 3, 6, 7, 9] <- Ending Point




## Algorithm
QuickSort is a Divide and Conquer algorithm.It picks an element as pivot and 
partitions the given array around the picked pivot. There are many different 
versions of quickSort that pick pivot in different ways.

Always pick first element as pivot.
Always pick last element as pivot.
Pick a random element as pivot.
Pick median as pivot.

## Pseudocode
```
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```

## Readings and References
Watch
 - [Video #1](https://www.youtube.com/watch?v=B4URnLNITgw)
 
Read
 - [Article 1](https://en.wikipedia.org/wiki/Quicksort)
 - [Article 2](https://www.geeksforgeeks.org/quick-sort/)
 - [Article 3](https://www.interviewbit.com/tutorial/quicksort-algorithm/)
 
Bookmark
 - [Bookmark](https://www.baeldung.com/java-quicksort)