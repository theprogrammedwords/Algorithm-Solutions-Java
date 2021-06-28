/*Given a character X you need to find whether X is an alphabet or not.

If yes, return a string "Yes" or otherwise throw an error with the message "Not Alphabet".
*/

function isAlphabet(X) {

    let value = checkAlphabet(X)
    if(value){
        return "Yes"
    }else{
        throw "Not Alphabet"
    }
};

function checkAlphabet(X) {
	let n = X.charCodeAt(0);
	let strStartsWithALetter = (n>=65 && n < 91) || ( n>=97 && n<123);
    if (strStartsWithALetter) {
	// Yes, it starts with an alphabet
	    return true;
    } else {
	// No, it doesnt start with an alphabet
	    return false;
} 
}
module.exports = isAlphabet;
console.log(isAlphabet('a'))
