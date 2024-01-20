package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        StringBuilder level = new StringBuilder();
        for(int i = 1; i <= cathetusLength; i++){
            int spacesCountBeforeNum = cathetusLength - i;
            for(int j = 1; j <= spacesCountBeforeNum; j++){
                level.append(" ");
            }
            for(int k = i; k >= 1; k--){
                level.append(k);
            }
            for(int k = 2; k <= i; k++){
                level.append(k);
            }
            System.out.println(level);
            level = new StringBuilder();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
