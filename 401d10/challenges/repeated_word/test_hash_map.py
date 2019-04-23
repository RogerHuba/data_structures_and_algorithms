import pytest
from .hash_map import HashTable

def test_class_esists():
    assert(HashTable)

def test_instance_exists():
    ht = HashTable()
    assert ht

def test_set():
    ht - HashTable()
    ht.set('roger', '9401')

