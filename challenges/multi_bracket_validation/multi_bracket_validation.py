

def multi_bracket_validation(input_string):
    """
    """
    open_bracket = ["[", "{", "("]
    close_bracket = ["]", "}", ")"]
    bracket = Stack()

    for char in input_string:
        if char in open_bracket:
            bracket.push(char)

        if char in close_bracket:
            if char == ')':
                if bracket.peek() == '(':
                    bracket.pop
            elif char == '}':
                if bracket.peek() == '{':
                    bracket.pop
            elif char == ']':
                if bracket.peek() == '[':
                    bracket.pop
    if bracket.peek() is None:
        return True
    else:
        return False
