text = 'any text here 1 2 3 4 5'

regexLetters = /[a-f]/ # This is the regular expression

puts text.scan(regexLetters).join('') # Return aeee
puts text.split(/e/).join # Return any txt hr 1 2 3 4 5
puts text.split(/[12345]/) # Return any text here