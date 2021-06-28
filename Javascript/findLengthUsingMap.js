//Given an array of strings, use the JavaScript map() function to return an array containing length of string at each index. The input array can be of length 0
//Return 0 if the string is null or undefined

function findLength(arr) {
    arr = arr.map((str) => {
        if(str === null || str === undefined) return 0
        else return str.length
    })
    return arr;
}

module.exports = findLength;
const arr = [null]
console.log(findLength(arr))
