# from .hash_table import HashTable
# import pytest


# @pytest fixture
# def make_hash():
#     """Make the hash table."""
#     h = HashMap()
#     h.add('Bob', '567-1234')
#     h.add('Ming', '567-2345')
#     h.add('Ming', '567-3456')
#     h.add('Mary', '567-4567')
#     h.add('Roger', '567-5678')
#     h.add('Tom', '567-6789')
#     h.add('Tina', '567-7890')
#     h.add('Roger', '929-9401')
#     h.print()
#     h.delete('Bob')
#     h.print()
#     print('Ming ' + h.get('Ming'))


# def test_hash_table_class_exist():
#     """Test HashTable class exist"""
#     assert HashTable


# def test_size_hash_table():
#     """Test length of hash table is 8192"""
#     hash_table = HashTable()
#     assert hash_table.table_size == 8192
