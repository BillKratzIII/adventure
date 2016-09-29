package com.characters;

import com.app.Weapons.Weapon;
import com.interfaces.JediInterface;
import com.parents.Twilek;

public class TwilekJedi extends Twilek implements JediInterface {

	public TwilekJedi() {
		// TODO Auto-generated constructor stub
	}

	public TwilekJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub
		super.setHealth(health+50);
	}

	@Override
	public void changeMagic() {
		// TODO Auto-generated method stub
		super.setMagic(magic+100);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.LIGHTSABER);
	}

	

}
