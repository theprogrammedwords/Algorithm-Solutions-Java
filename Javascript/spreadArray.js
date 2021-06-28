//Complete the function concatenate() in which you are given 5 arrays as parameters and you have to return a single array after concatenating all the arrays.


Note: Use spread operator
function concatenate(a1, a2, a3, a4, a5) {
    const arr= [...a1, ...a2, ...a3, ...a4, ...a5]
    return arr 
}


module.exports = concatenate;
