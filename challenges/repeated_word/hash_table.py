class HashMap:
    """A class for a hash table."""
    entries_count = 0
    alphabet_size = 52

    def __init__(self):
        """Initialize Hash Table."""
        self.size = 1024  # sets value of hash array
        self.map = [None] * self.size  # Forces list with None

    def __repr__(self):
        """."""
        return

    def _get_hash(self, key):
        """Calculates the index of the key and returns index."""
        hash = 0
        for char in str(key):
            hash += ord(char)
        return hash % self.size

    def add(self, key, value):
        """."""
        key_hash = self._get_hash(key)  # index value to place value in _get_has function
        key_value = [key, value]  # insert key value into that cell. Constructing a list from key and value

        if self.map[key_hash] is None:  # Check if the cell is empty
            self.map[key_hash] = list([key_value])  # if empty add to map.  Will add a new list.
            return True
        else:
            for pair in self.map[key_hash]:  # Check if the key exists in the map
                if pair[0] == key:
                    pair[1] = value
                    return True
            self.map[key_hash].append(key_value)
            return True

    def get(self, key):
        """."""
        key_hash = self._get_hash(key)
        if self.map[key_hash] is not None:
            for pair in self.map[key_hash]:
                if pair[0] == key:
                    return pair[1]
        return None

    def delete(self, key):
        """."""
        key_hash = self._get_hash(key)

        if self.map[key_hash] is None:
            return False
        for i in range(0, len(self.map[key_hash])):
            if self.map[key_hash][i][0] == key:
                self.map[key_hash].pop(i)
                return True

    def print(self):
        """."""
        print('---HASH MAP---')
        for item in self.map:
            if item is not None:
                print(str(item))


h = HashMap()
h.add('Bob', '567-1234')
h.add('Ming', '567-2345')
h.add('Ming', '567-3456')
h.add('Mary', '567-4567')
h.add('Roger', '567-5678')
h.add('Tom', '567-6789')
h.add('Tina', '567-7890')
h.add('Roger', '929-9401')
h.print()
h.delete('Bob')
h.print()
print('Ming ' + h.get('Ming'))
