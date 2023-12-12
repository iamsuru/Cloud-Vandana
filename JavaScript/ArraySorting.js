const readline = require('readline')

function sortArray(nums) {
    const length = nums.length
    for (let i = 1; i < length; i++) {
        let current = nums[i]
        let j = i - 1
        while (j >= 0 && nums[j] < current) {
            nums[j + 1] = nums[j]
            j--;
        }
        nums[j + 1] = current
    }
    return nums
}

const readLine = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

readLine.question('Enter elements separated by space : ', function (input) {
    let nums = input.split(' ').map(Number)
    nums = sortArray(nums)
    console.log(`Sorted Array in Descending order : ${nums}`);
    readLine.close()
})