from .hash_table import HashMap

hash_string = "Once upon a time, there was a brave princess who..."
sentence = ''

word_list = hash_string.split()
print(word_list)

for w in word_list:
    print(w)  # Validate Each word.
    HashMap.add(w)

    # Need code to check for repeat words and to return if no words.
    # unable to get hash_table to import.  Need assistance.

