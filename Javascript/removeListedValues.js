/*Write a method which returns an array without the listed values

References
Arrays

(MDN) JavaScript: Array

Nesting For Loops in JavaScript

Time complexity in JavaScript (Optional)

ArraInput -
arr: The given array

without: A list of elements which are to be removed from arr.

Output -
Return the array after removing the listed values.

Sample input 1 -
arr: [1, 2, 2, 3, 1, 2]

without: [2, 3]

Sample output 1 -
[1, 1]
*/

function removeListedValues(arr, without) {
    var NewArr = new Array();
    var indexOfArray = 0;
    let valueMatch = false;
    for(let i=0; i< arr.length; i++){

        valueMatch = false;
        for(let j=0; j<without.length; j++){
            if(arr[i] === without[j]){
                valueMatch = true;
            }
        }
        if(valueMatch== false){

            NewArr[indexOfArray] = arr[i];
            indexOfArray++;
        }
    }
    return NewArr;
}

module.exports = removeListedValues;
