/*You are given the following API -

GET /api/comments

This will return a list of all comments. A comment object contains the following information
userId - ID of the user who commented
data - comment data


Given a userId, return an Array of comment data of all the comments by the given user.
Apart from .json(), don’t use any other methods on the response object returned from fetch() call. This can cause your tests to fail.

Input -
userId - the user id whose comment is to be returned.
Output -
A list of comments by the given user id

Sample input 1 -

userId = 1

Sample API response
comments = [

{
    'userId': '1',
    "data": 'This looks slick!'
},

{
    'userId': '2',
    "data": 'I think this can be improved.'
},

{
    'userId': '1',
    "data": 'What kind of improvement?'
}]

Sample output 1 -
['This looks slick!', 'What kind of improvement?']
*/

// TODO - Implement getCommentsByUserId() function

async function getCommentsByUserId(userId) {
    
    return fetch("/api/comments")
    .then(response => response.json())
    .then(comments => {
        
        let filteredComments = 
        comments.filter(comments => comments.userId === userId)

        let result = [];
        for(let i=0; i< filteredComments.length; i++){
            result[i] = filteredComments[i].data;
        }
        return result;
    })

}

// ----------- Don't modify -----------
const mockFetch = (url, responseData) => {
    const mockJsonPromise = Promise.resolve(responseData);
    const mockFetchPromise = (callUrl) => {
        if (url === callUrl) {
            return Promise.resolve({
                json: () => mockJsonPromise
             });
        } else {
            return Promise.reject('404: No such url')
        }
    }
    global.fetch = mockFetchPromise;
}

const successResponse = [
    {
        'userId': '1',
        "data": 'This looks slick!'
    },
    {
        'userId': '2',
        "data": 'I think this can be improved.'
    },
    {
        'userId': '1',
        "data": 'What kind of improvement?'
    }];
mockFetch('/api/comments', successResponse);

module.exports = getCommentsByUserId;
// ----------- Don't modify -----------

getCommentsByUserId("1").then((res) => {
  console.log(res);
});
