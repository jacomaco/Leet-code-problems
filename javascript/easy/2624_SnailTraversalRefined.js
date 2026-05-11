// 1. split the input arry into n chunks, being the number of rows and the length of each arry being the number of columns,
// and reverse every other array, where the first array is not reversed
// 2. store these arrays in an array, aka matrix
// 3. transpose the matrix

Array.prototype.snail = function (rowsCount, colsCount) {   
    if (rowsCount * colsCount !== this.length) return []

    let matrix = []
    for (let j = 0; j < colsCount; j++) {
        let chunk = this.slice(j * rowsCount, (j + 1) * rowsCount)
        if (j % 2 !== 0) chunk.reverse()
        matrix.push(chunk)
    }
    return Array.from({ length: rowsCount }, (_, i) => (
        matrix.map(column => column[i])
    ))
}

const nums = [19, 10, 3, 7, 9, 8, 5, 2, 1, 17, 16, 14, 12, 18, 6, 13, 11, 20, 4, 15]
// const nums = [19, 10, 3, 7, 9, 8, 5, 2, 1, 17, 16, 14, 12, 18, 6, 13, 11, 20, 4, 15]
// const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
rowsCount = 5
colsCount = 4

console.time()
let result = nums.snail(rowsCount, colsCount)
console.timeEnd()
console.log(result);
