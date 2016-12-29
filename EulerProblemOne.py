#Molly Depew
#Euler problem 1
#Find the sum of all the multiples of 3 and 5 under 1000

def main():
    cap = 1000
    nums = []
    for k in range(cap):
        if findMultThree(k)== 0:
            nums.append(k)
        elif findMultFive(k) == 0:
            nums.append(k)
    ans = sum(nums)
    print(ans)
    
  
# modulus functions. if the functions return anything other than 0
# the integer is not a multiple of 5 or 3
def findMultThree(i):
    r = i%3
    return r
def findMultFive(i) :
    r = i%5
    return r
        
main()
    
    
    
