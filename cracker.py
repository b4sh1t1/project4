import hashlib

def opener(filename):
    "Opens a file and reads it line by line"
    file_object = open(filename, "r")
    print(file_object.readlines())
    file_object.close()

def passToMd5(filename):
    "Takes a password and returns the MD5 version"
    """file_object = open(filename, "r")
    md5file = open(str(filename) + "md5", "w")
    for line in file_object:
        digest = hashlib.md5(line).hexdigest()
        print (digest)"""
    password = "password"
    digest = hashlib.md5(password).hexdigest()
    print ("Digest (in hex format)::", digest)

def checker():
    "Checks if MD5 text is in file, returns that MD5 text if so"

if __name__ == "__main__":
    passToMd5("/Users/huntervoegele/Desktop/project4/Passwords/clarkson-university-82.txt")