n = input("Masukan bilangan genap maksimal yang akan ditampilkan: ")
n = int(n)

i = 0
count = 0
while i != n :
    if (i == 5 ** count) :
        print(i)
        count += 1
    i += 1