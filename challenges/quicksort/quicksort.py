def quicksort(lst):
    """Function to complete a quicksort."""
    if len(lst) == 1 or len(lst) == 0:
        return lst
    else:
        pivot = lst[0]
        i = 0
        for j in range(len(lst)-1):
            if lst[j+1] < pivot:
                lst[j+1], lst[i+1] = lst[i+1], lst[j+1]  # Swap border with counter
                i += 1  # Advance border
        lst[0], lst[i] = lst[i], lst[0]
        first_part = quicksort(lst[:i])
        second_part = quicksort(lst[i+1:])
        first_part.append(lst[i])
        return first_part + second_part
