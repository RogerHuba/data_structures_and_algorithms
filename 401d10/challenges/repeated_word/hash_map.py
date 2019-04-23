class HashTable():
    """Implements a hashtable."""

    def __init__(selfself):
        # self._list = [[None] for i in range(1024)]
        self._list = [None] * 1024

    def __repr__(self):
        return "<HashTable: {}>".format('coming soon')

    def __len__(self):
        return len(self._list)

    def _hash_key(self, key):
        return 0

    def get(self, key):

        index = self._hash_key(key)

        return self._list[index]

        self._list(index)

        # for item in self.list:
        #     if item[0] == key:
        #         return item[1]

    def set(self, key, value):

        inxex = self._hash_key(key)
        self._list(index) = value

        self._list[index] = value
