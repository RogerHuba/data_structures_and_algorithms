from multi_bracket_validation import multi_bracket_validation
import pytest


def test_mbv_empty_string_returns_true():

    input_string = ''
    assert multi_bracket_validation(input_string) is True
