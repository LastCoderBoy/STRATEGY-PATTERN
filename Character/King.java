package ActionGame_Example.Character;

import ActionGame_Example.WeaponBehavior.SwordBehavior;
import ActionGame_Example.WeaponBehavior.WeaponBehavior;

public class King extends Character{
    public King() {
        weaponBehavior = new SwordBehavior();
    }
    @Override
    public void fight() {
        System.out.println("King mostly fight with a " + weaponBehavior.useWeapon());
    }
}
