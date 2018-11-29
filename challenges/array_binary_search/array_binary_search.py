def binary_search(lst, val):
    """This function will bring in a list and a value. Returns index of value or -1 if value not found."""
    status = False
    for n in range(len(lst)):
        if lst[n] == val:
            status = True
            return n
    if status is False:
        return -1
