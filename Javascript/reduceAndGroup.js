//Given an array of people having property, name and age. Use JavaScript reduce() function and group peoples by age.
function groupByAge(objectArray) {
    let newObject;
    
    let reducer = (accumulator, currentValue) =>{
        console.log(accumulator)
        let currentAge = currentValue.age;
        if(accumulator[currentAge]){
            accumulator[currentAge].push(currentValue)
        }else{
            accumulator[currentAge] = []
            accumulator[currentAge].push(currentValue)
        }
    return accumulator;
    };
    newObject= objectArray.reduce(reducer,{})
    return newObject
}

let obj = [

  { name: 'John', age: 21 },

  { name: 'Mike', age: 20 },

  { name: 'Harvey', age: 20 }

]

groupByAge(obj)
module.exports = groupByAge;
