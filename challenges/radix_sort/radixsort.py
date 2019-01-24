def radixsort(lst):
    """Function to perform a radix sort."""
    lst_length = len(lst)
    modulus = 10
    div = 1

    while True:
        new_list = [[] for x in range(10)]
        for value in lst:
            least_digit = value % modulus
            least_digit /= div
            new_list[int(least_digit)].append(value)
        modulus = modulus * 10
        div = div * 10

        if len(new_list[0]) == lst_length:
            return new_list[0]

        lst = []
        for x in new_list:
            for y in x:
                lst.append(y)










