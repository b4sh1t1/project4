import os, math, string, random

def generatePassword(pass_len):
    symbols = string.printable.strip()
    return ''.join([symbols[math.floor(int(x) / 256 * len(symbols))] for x in os.urandom(pass_len)])

def writePasswords(filename):
    file_object = open(filename, "w", encoding = "utf-8")
    for i in range(1000000):
        file_object.write(generatePassword(random.randint(5,15)) + '\n')
    file_object.close()

if __name__ == "__main__":
    writePasswords("passList1.txt")
