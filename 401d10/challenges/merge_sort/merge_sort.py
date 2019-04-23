def merge_sort(lst):
    """Complete a sort based on the merge sort algorithm."""
    if len(lst) < 2:
        return lst
    else:
        mid = int(len(lst) // 2)
        first_half = lst[:mid]
        second_half = lst[mid:]

        merge_sort(first_half)
        merge_sort(second_half)

        i = 0
        j = 0
        k = 0

        while i < len(first_half) and j < len(second_half):
            if first_half[i] < second_half[j]:
                lst[k] = first_half[i]
                i += 1
            else:
                lst[k] = second_half[j]
                j += 1
            k += 1

        while i < len(first_half):
            lst[k] = first_half[i]
            i += 1
            k += 1

        while j < len(second_half):
            lst[k] = second_half[j]
            j += 1
            k += 1
    return lst


lst1 = [54, 26, 93, 17, 77, 31, 44, 55, 20]
merge_sort(lst1)

