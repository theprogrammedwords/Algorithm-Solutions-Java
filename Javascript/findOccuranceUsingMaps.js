/*Given an array of strings, names. Find the number of occurrences of every string that exists in the array.


Use Map (named occurrence) data structure to find the number of occurrences.


*/
function findOccurrence(names) {
    var occurence = new Map();
    var nameArr = names

    for (const word of nameArr){
        if(occurence.has(word)){
            occurence.set(word, occurence.get(word)+1)
        }else{
            occurence.set(word,1)
        }
    }

    return occurence;
}


module.exports = findOccurrence;
const arr = ['jim',"selina", "bruce", "jim"]
console.log(findOccurrence(arr))
