def main(old_list, value_add):
    '''Function that brings in a list and a value and adds value to the middle of the list
    '''
    if (len(old_list))%2:
        half_a = old_list[:(len(old_list)+1)//2]
        half_b = old_list[(len(old_list)+1)//2:]
    else:
        half_a = old_list[:len(old_list)//2]
        half_b = old_list[len(old_list)//2:]
    new_list = half_a + [value_add] + half_b
    return(new_list)
