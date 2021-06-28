//Complete the function distinctCount() to return the number of distinct elements in the input array.

function distinctCount(array) {
    const myset = new Set()
    for(const num of array){
        myset.add(num)
    }
    return myset.size
}

module.exports = distinctCount;
