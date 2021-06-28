/*
The getX(x) function returns its parameter x normally under all conditions but throws an error if x equals 5. This must error must be "caught" by the errorHandler() function.


Complete the errorHandler() function such that:

errorHandler() function should call the function getX()

Input to getX() should be x ie. getX(x),

Return the result obtained from getX() function, if error occurs catch and return the error.
*/

function errorHandler(x) {
    try{
       return getX(x)
    }catch(error){
        return error;
    }
}

function getX(x) {
    if(x == 5) {
        return new Error("Error Occured");
    }
    return x;
}

module.exports = errorHandler;
