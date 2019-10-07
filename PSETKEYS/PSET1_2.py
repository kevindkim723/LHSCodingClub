for i in range(35):
    for k in range(int((35-i)/2)):
        print(" ", end="")
    if i%2 != 0:
        for k in range(i):
            print("*", end="")
    print()

for i in range(35):
    i= 35-i
    for k in range(int((35-i)/2)):
        print(" ", end="")
    if i%2 != 0:
        for k in range(i):
            print("*", end="")
    print()
   
