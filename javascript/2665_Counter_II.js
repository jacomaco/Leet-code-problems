var createCounter = function (init) {
    let val = init

    return {
        increment: () => ++val,
        decrement: () => --val,
        reset: () => val = init,
    }
};
const counter = createCounter(5)
console.log(counter);
counter.increment()
console.log(counter);
counter.reset()
console.log(counter);
counter.decrement()
console.log(counter);
/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */