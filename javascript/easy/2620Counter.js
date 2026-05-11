const createCounter = function(n) {
    let value = n
    return function () {
        return value++
    };
};

const coutner = createCounter(10)
console.log(coutner());
console.log(coutner());
console.log(coutner());
