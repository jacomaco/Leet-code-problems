var map = function(arr, fn) {
    let result = []
    for (let i = 0; i < arr.length; i++) {
        result.push(fn(arr[i]))
    }
    return result
};

const arr = [1,2,3]
const fn = function plusone(n) { return n + 1; }

const newArray = map(arr, fn)
console.log(newArray);
