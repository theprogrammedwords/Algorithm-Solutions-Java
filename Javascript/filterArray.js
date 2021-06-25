/*
Given an array of objects having properties, name and city. Use JavaScript filter() function to return an array containing objects having either Bangalore or Hyderabad as their city property value.


Note: City name can be in lower case too. ex - bangalore, gwalior.
*/

function filterByCity(arr) {

    arr = arr.filter(data => {
        return data.city.toLowerCase() === "bangalore" || 
        data.city.toLowerCase() === "hyderabad"
    })

    return arr;
}


arr = [
    { name: "John", city: "delhi" },
    { name: "Peter", city: "bangalore" },
    { name: "Mike", city: "Bangalore" },
    { name: "Rachel", city: "Hyderabad" }

]
console.log(filterByCity(arr));
module.exports = filterByCity;
