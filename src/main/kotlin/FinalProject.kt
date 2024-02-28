fun main(){
    polaPiramid()
    polaPiramidTerbalik()
    polaDiamond()
    polaX()
    polaHollowX()
}


fun polaPiramid(){

    print("POLA PIRAMID")
    println()

    for (i in 0 .. 5){
        for (j in 5 downTo i){
            print(" ")
        }
        for (k in 1 .. i){
            print("*")
        }
        for (l in 2 .. i){
            print("*")
        }
        print("\n")
    }

    print("\n")
}

fun polaPiramidTerbalik(){

    print("POLA PIRAMID TERBALIK")
    println()

    var n = 5
    for (i in 1 .. 5){
        for (j in 1 .. i){
            print(" ")
        }
        for (k in 5 downTo  i){
            print("*")
        }
        for (l in n-1 downTo  i){
            print("*")
        }
        print("\n")
    }
    print("\n")
}

fun polaDiamond(){

    print("POLA DIAMOND")
    println()

    var n = 5
    for (i in 0 .. 5){
        for (j in 5 downTo i){
            print(" ")
        }
        for (k in 1 .. i){
            print("*")
        }
        for (l in 2 .. i){
            print("*")
        }
        print("\n")
    }
    for (i in 0 .. 5){
        for (j in 1 .. i){
            print(" ")
        }
        for (k in 5 downTo  i){
            print("*")
        }
        for (l in n-1 downTo  i){
            print("*")
        }
        print("\n")
    }

    print("\n")
}

fun polaX(){

    print("POLA X")
    println()

    var tinggi = 10
    for (i in 0 .. tinggi){
        for (j in 0 .. tinggi){
            if ((i == j) || ( i+ j == tinggi )) {
                print("*")
            }else {
                print(" ")
            }
        }
        print("\n")
    }

    print("\n")
}

fun polaHollowX(){

    print("POLA HOLLOW X")
    println()

    for (i in 1 .. 4) {
        for (j in 1..7) {
            if ((i == 4) || (j+i == 5) || (j-i == 3)){
                print("*")
            }else{
                print(" ")
            }
        }
        print("\n")
    }
}