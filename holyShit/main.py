import os

files = ["geeks.txt", "class.txt", "subjects.txt"]

def clearScreen():
    os.system("cls" if os.name == "nt" else "clear")

def ensureFiles():
    for f in files:
        if not os.path.exists(f):
            open(f, "w").close()



def readFile(name):
    with open(name, "r") as f:
        return [l.strip() for l in f if l.strip()]

def saveFile(name, lines):
    with open(name, "w") as f:
        for l in lines:
            f.write(l + "\n")

def addLine(name, value):
    with open(name, "a") as f:
        f.write(value + "\n")



def listG():
    clearScreen()
    geeks = readFile("geeks.txt")
    if not geeks:
        print("no geeks in sight")
    else:
        for g in geeks:
            print(g)
    input("\n[PRESS ENTER]")

def addG():
    clearScreen()
    name = input("name: ")
    mat = input("id: ")
    age = input("age: ")

    geeks = readFile("geeks.txt")
    for g in geeks:
        if g.split(",")[0] == mat:
            print("ID already exists")
            input()
            return

    addLine("geeks.txt", f"{mat},{name},{age}")

def removeG():
    clearScreen()
    mat = input("id: ")
    geeks = readFile("geeks.txt")

    new = [g for g in geeks if g.split(",")[0] != mat]

    saveFile("geeks.txt", new)
    print("yo mista white, its done")
    input()

def linkC():
    clearScreen()
    mat = input("id: ")
    cls = input("class: ")

    geeks = readFile("geeks.txt")
    new = []

    for g in geeks:
        p = g.split(",")
        if p[0] == mat:
            if len(p) == 3:
                new.append(g + f",{cls}")
            else:
                new.append(f"{p[0]},{p[1]},{p[2]},{cls}")
        else:
            new.append(g)

    saveFile("geeks.txt", new)
    print("within cells interlinked")
    input()



def listC():
    clearScreen()
    for c in readFile("class.txt"):
        print(c)
    input()

def addC():
    clearScreen()
    name = input("class name: ")
    addLine("class.txt", name)

def removeC():
    clearScreen()
    name = input("class name: ")
    classes = readFile("class.txt")
    saveFile("class.txt", [c for c in classes if c != name])
    print("removed")
    input()

def linkS():
    clearScreen()
    cls = input("class: ")
    sub = input("subject: ")

    classes = readFile("class.txt")
    new = []

    for c in classes:
        if c.split(",")[0] == cls:
            new.append(f"{cls},{sub}")
        else:
            new.append(c)

    saveFile("class.txt", new)
    print("within cells interlinked")
    input()



def listS():
    clearScreen()
    for s in readFile("subjects.txt"):
        print(s)
    input()

def addS():
    clearScreen()
    name = input("subject name: ")
    addLine("subjects.txt", name)

def removeS():
    clearScreen()
    name = input("subject name: ")
    subs = readFile("subjects.txt")
    saveFile("subjects.txt", [s for s in subs if s != name])
    print("removed")
    input()



def menuG():
    while True:
        clearScreen()
        print("1 add | 2 list | 3 remove | 4 link class | 0 back")
        op = input()

        if op == "1": addG()
        elif op == "2": listG()
        elif op == "3": removeG()
        elif op == "4": linkC()
        elif op == "0": break

def menuC():
    while True:
        clearScreen()
        print("1 add | 2 list | 3 remove | 4 link subject | 0 back")
        op = input()

        if op == "1": addC()
        elif op == "2": listC()
        elif op == "3": removeC()
        elif op == "4": linkS()
        elif op == "0": break

def menuS():
    while True:
        clearScreen()
        print("1 add | 2 list | 3 remove | 0 back")
        op = input()

        if op == "1": addS()
        elif op == "2": listS()
        elif op == "3": removeS()
        elif op == "0": break



def main():
    ensureFiles()
    while True:
        clearScreen()
        print("1 geeks | 2 classes | 3 subjects | 0 exit")
        op = input()

        if op == "1": menuG()
        elif op == "2": menuC()
        elif op == "3": menuS()
        elif op == "0": break

if __name__ == "__main__":
    main()