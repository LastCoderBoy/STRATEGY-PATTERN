package ActionGame_Example;

import ActionGame_Example.Character.Character;
import ActionGame_Example.Character.Knight;
import ActionGame_Example.Character.Queen;

public class Main {
    public static void main(String[] args){
        Character knight = new Knight();
        knight.fight();

        Character queen = new Queen();
        queen.fight();

    }
}
