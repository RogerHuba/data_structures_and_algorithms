def selectionSort(alist):
    """This function will do a sort on a string of input."""
    for i in range(len(alist)):
        min_position = i
        for j in range(i+1, len(alist)):
            if alist[min_position] > alist[j]:
                min_position = j

        temp = alist[i]
        alist[i] = alist[min_position]
        alist[min_position] = temp
    return alist


print(selectionSort([5, 2, 1, 9, 0, 4, 6]))
