package ActionGame_Example.Character;

import ActionGame_Example.WeaponBehavior.KnifeBehavior;

public class Queen extends Character{
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
    @Override
    public void fight() {
        System.out.println("Of Course! Queen does not fight");
        System.out.println("But, she has a " + weaponBehavior.useWeapon() + " to protect herself!");
    }
}
