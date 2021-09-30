ipk = input("Masukan ipk Anda = ")
ipk = float(ipk)

lulusTahun = input("Masukan lama masa studi = ")
lulusTahun = str(lulusTahun)

if (ipk > 3.51 and lulusTahun <= str(4)):
    print("Predikat anda Summa Cumlaude")
elif (ipk >= 3.51):
    print("Predikat anda Cumlaude")
elif (ipk >= 3.01 and ipk < 3.51):
    print("Predikat anda Sangat Memuaskan")
elif (ipk >= 2.76 and ipk < 3.01):
    print("Predikat anda Memuaskan")
elif (ipk >= 2.00 and ipk < 2.76):
    print("Predikat anda Cukup")
elif (ipk < 2.00):
    print("Anda Tidak Lulus")
else:
    print("Anda Tidak/Lulus")