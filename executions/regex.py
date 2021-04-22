import re

text = 'any text here 1 2 3 4 5'
regexLetters = "[a-f]"

print(re.findall(regexLetters, text)) #Return ['a', 'e', 'e', 'e']

valueRegEx = (re.search(regexLetters, text))
print(valueRegEx.start()) # Return 0
print(re.sub(regexLetters, '*', text)) # return *ny t*xt h*r* 1 2 3 4 5
print(re.split(regexLetters, text)) # return ['', 'ny t', 'xt h', 'r', ' 1 2 3 4 5']