from array import array
import numpy as np

def rotateArray(nums, k):

    rotatedArray = []
    rotatedArray = [0 for i in range(nums.size)]

    for i in range(nums.size):

        itemAtI = nums[i]

        nextPosition = i + k


        if nextPosition < nums.size:
            rotatedArray[nextPosition] = itemAtI
            continue
        else:
            nextPosition = nextPosition % nums.size
            rotatedArray[nextPosition] = itemAtI
            continue

    return rotatedArray

# Initialize the array
arr =   np.array([1,2,3,4,5,6,7])

returnedArray = rotateArray(arr, 3)

for i in range(len(returnedArray)):
    print(returnedArray[i])



