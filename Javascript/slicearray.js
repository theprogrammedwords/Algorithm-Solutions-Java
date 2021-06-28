/*Complete the function named subarray() in which you are given an array named arr, and two integers start, end. You need to implement the function to return a subarray starting from index start and ending on index end.


Note: Use the slice method of Array.
*/
function subarray(arr, start, end) {

    let result = arr.slice(start,end+1)
    return result
}

const arr =  [[2, 1, 1, 3, 4, 5, 5, 6, 7, 8, -1100 , 9, 8], 4, 10]
const start= 1
const end= 3

console.log(subarray(arr, start, end))
module.exports = subarray;
