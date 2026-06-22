def solution(numbers):
    numberArray = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];

    for i, word in enumerate(numberArray) :
        numbers = numbers.replace(word, str(i))

    return int(numbers);