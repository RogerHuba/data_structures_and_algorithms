def selection_sort(lst):
    """This function will do a sort on a string of input."""
    for i in range(len(lst)):
        if len(lst) == 0:
            return False
        min_position = i
        for j in range(i+1, len(lst)):
            if lst[min_position] > lst[j]:
                min_position = j

        temp = lst[i]
        lst[i] = lst[min_position]
        lst[min_position] = temp
    return lst
