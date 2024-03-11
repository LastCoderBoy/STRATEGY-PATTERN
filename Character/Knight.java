package ActionGame_Example.Character;

import ActionGame_Example.WeaponBehavior.AxeBehavior;
import ActionGame_Example.WeaponBehavior.BowAndArrowBehavior;
import ActionGame_Example.WeaponBehavior.WeaponBehavior;

public class Knight extends Character{
    String weaponsForKnight;
    WeaponBehavior secondWeapon;
    public Knight() {
        weaponBehavior = new AxeBehavior();
        secondWeapon = new BowAndArrowBehavior();
        weaponsForKnight = weaponBehavior.useWeapon() + ", " + secondWeapon.useWeapon();
    }
    @Override
    public void fight() {
        System.out.println("King mostly fight with a " + weaponsForKnight);
    }
}
