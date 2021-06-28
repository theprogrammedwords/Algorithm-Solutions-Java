/*You are given a date in the form of "DD/MM/YYYY". Calculate the number of days between the given date and today's date.


Today's day is the date when the program is executed.
*/
function getNumberOfDays(date) {
    let todaysDate = new Date()
    let oldDate = date.split('/')

    let pastDate = new Date(oldDate[2], oldDate[1]-1, oldDate[0])
    const millis = todaysDate.getTime()- pastDate.getTime()

    const dateDifference = millis / (1000*60*60*24);
    
    return Math.floor(dateDifference)
}

module.exports = getNumberOfDays;
let date = "20/06/2021"
console.log(getNumberOfDays(date))
