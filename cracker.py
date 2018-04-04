import hashlib

def opener(filename):
    "Opens a file and reads it line by line"
    file_object = open(filename, "r")
    l = file_object.readlines()
    for i in range(len(l)):
        l[i] = l[i][:-1]

    digests = []
    count = 0
    for i in range(len(l)):

        if count % 10000 == 0:
            print(str(i) + " " + l[i])
            finish(digests)
            digests = []

        h = passToMd5(l[i])
        digests.append(h)

        count += 1

    file_object.close()

def passToMd5(password):
    "Takes a password and returns the MD5 version"
    """file_object = open(filename, "r")
    md5file = open(str(filename) + "md5", "w")
    for line in file_object:
        digest = hashlib.md5(line).hexdigest()
        print (digest)"""
    #password = "password"
    digest = hashlib.md5(password).hexdigest()
    # print ("Digest (in hex format)::", digest)
    return digest

def finish(digests):
    file = open("fabian-fingerle-h.txt", 'a')
    for word in digests:
        file.write(word + "\n")

def checker():
    "Checks if MD5 text is in file, returns that MD5 text if so"

if __name__ == "__main__":
    opener("./Passwords/Honeypot-Captures/multiplesources-passwords-fabian-fingerle.de.txt")


