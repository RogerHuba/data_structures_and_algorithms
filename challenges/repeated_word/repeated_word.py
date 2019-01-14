"""."""
from ..data_structures_and_algorithms.data_structures.hash_table.hash_table import HashMap

hash_string = "Once upon a time, there was a brave princess who..."
sentence = ''

word_list = hash_string.split()
print(word_list)

for w in word_list:
    HashMap(word_list[w])
    sentence += word_list[w] + ' '


