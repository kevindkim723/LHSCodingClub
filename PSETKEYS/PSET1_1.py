print("**********")

print()

for i in range(8):
    print("")
    for j in range(10):
        print("*", end="")
        
print()

for i in range(8):
    print("")
    for j in range(10):
        if i>=2 and j>=3 and i<6 and j<7:
            print("!",end="")
        else:
            print("*", end="")
        
