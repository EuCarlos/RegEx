const text = 'any text here 1 2 3 4 5'

const regexLetters = /[a-f]/g  //This is the regular expression

console.log(text.match(regexLetters)) //Return ["a", "e", "e","e"]
console.log(text.search(regexLetters)) // Return 0
console.log(text.replace(regexLetters, '*')) // Return "*ny t*xt h*r* 1 2 3 4 5"
console.log(text.split(regexLetters)) // Return ["", "ny t", "xt h", "r", " 1 2 3 4 5"]