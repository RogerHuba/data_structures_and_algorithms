def merge_sort(lst):
    """Complete a sort based on the merge sort algorithm."""
    if len(lst) == '':
        return 'False'
    elif len(lst) < 1:
        return lst
    else:
        new_result = []
        mid = int(len(lst) / 2)
        first_half = lst[:mid]
        second_half = lst[mid:]

    while len(first_half) > 0 or len(second_half) > 0:
        if len(first_half) > 0 and len(second_half) > 0:
            if first_half[0] > second_half[0]:
                new_result.append(second_half[0])
                second_half.pop(0)
            else:
                new_result.append(first_half[0])
                first_half.pop(0)
        elif len(second_half) > 0:
            for i in second_half:
                new_result.append(i)
                second_half.pop(0)
        else:
            for i in first_half:
                new_result.append(i)
                first_half.pop(0)
    return new_result
