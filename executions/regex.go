package main
import (
    "fmt"
    "regexp"
)

func main() {
    text := "any text here 1 2 3 4 5"
    
    regexLetters, _ := regexp.Compile("[a-f]")
    
    fmt.Println(regexLetters.FindAllString(text, 10)) //Return [a e e e]
    fmt.Println(regexLetters.ReplaceAllString(text, "*")) //Return "*ny t*xt h*r* 1 2 3 4 5
    fmt.Println(regexLetters.Split(text, -1)) // Return [ ny t xt h r  1 2 3 4 5] 
}