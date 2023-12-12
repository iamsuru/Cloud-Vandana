const readline = require('readline')

function reverseString(sentence){
    var reverseSentence = ""
    for(let i = sentence.length-1;i>=0;i--){
        reverseSentence = reverseSentence+sentence[i]
    }
    return reverseSentence
}


const readLine = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
})

readLine.question('Enter sentence: ', function(sentence) {
    const reverseSentence = reverseString(sentence)
    console.log(`Reverse Sentence is : ${reverseSentence}.`)
    readLine.close()
})