/*Promises in Javascript
A promise is an object that may produce a single value some time in the future: either a resolved value, or a reason that it’s not resolved (e.g., a network error occurred). A promise may be in one of 3 possible states: fulfilled, rejected, or pending. Promise users can attach callbacks to handle the fulfilled value or the reason for rejection.



Problem Description
Given as inputs to the getLastNames() function

A string representing a first name, firstName.
An Array of person objects with properties, "firstName" and “lastName”


Return a JavaScript Promise which is either
rejected with a message "Invalid" if none of the person objects “firstName” property matches the input first name, firstName
resolved with an sorted Array of "lastName" property values of objects whose “firstName” property matches the given first name, firstName

Note

The "lastName"s array should be sorted in alphabetical order

Function to return a Promise object and not a String or Array
*/

function getLastNames(firstName, people) {

        return new Promise(function (resolve, reject) {
            let matchingPeeps = [];
            matchingPeeps = people.filter((obj) => {
                return obj.firstName === firstName
            })
            
            if (matchingPeeps.length === 0) {
                reject("Invalid");
            } else {
                let unsortedArray = [];

                for (let i = 0; i < matchingPeeps.length; i++) {
                    let lastName = matchingPeeps[i].lastName;
                    unsortedArray.push(lastName);
                }
                unsortedArray.sort();
                resolve(unsortedArray);
            }
            })
}


let firstName = 'David'

people = [

    {

        firstName: 'David',

        lastName: 'Dobrick'

    },

    {

        firstName: 'David',

        lastName: 'Beckham'

    },

    {

        firstName: 'Chris',

        lastName: 'Lee'

    },

    {

        firstName: 'James',

        lastName: 'Bond'

    },

]

console.log(getLastNames(firstName, people))
module.exports = getLastNames;
