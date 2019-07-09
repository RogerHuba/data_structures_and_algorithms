## Hashtable
Class that will create a hashtable.

## Challenge
Without using any builtin functionality, create a hashtable.

## Approach & Efficiency
Time: o(n) Space: o(n)
Creation of Node is o(1)

# API
Node - Builds the LinkedList Node
add - Takes in both key and value.  This method should has they key, and add the key and value 
    pair to the table, handling collisions as needed.
get - Takes in the key and returns the value from the table.
contains - takes in the key and returns a boolean, indicating if the key exists in the table.
hash - Takes in an arbitrary key and returns an index in the collection.
