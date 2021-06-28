/*Given an array of account objects. Account object contains two keys

created

accountHolderName


Sort the array in the following way -

All the elements should be sorted according to the created field such that the most recently created account comes first.

If two accounts are created on the same date then they should be ordered in ascending order of account holders name.
*/

function sortAccounts(arr) {
return arr.sort((a, b)=>{
    if(a.created > b.created){
        return -1
    }else if(b.created > a.created){
        return 1
    }else {
        if(a.accountHolderName > b.accountHolderName)
        return 1 
        else return -1
    }
return arr
})

}


const arr = [

   {

        created: new Date("05/22/1859"),

        accountHolderName: "Arthur"

   },

   {

        created: new Date("03/25/2001"),

        accountHolderName: "Doyle"

   },

   {

        created: new Date("03/25/2001"),

        accountHolderName: "Conan"

   }

]

console.log(sortAccounts(arr))
module.exports = sortAccounts;
