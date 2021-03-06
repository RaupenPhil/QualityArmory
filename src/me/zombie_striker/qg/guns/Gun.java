package me.zombie_striker.qg.guns;

import me.zombie_striker.qg.ArmoryBaseObject;
import me.zombie_striker.qg.ammo.Ammo;
import me.zombie_striker.qg.guns.utils.WeaponSounds;
import me.zombie_striker.qg.guns.utils.WeaponType;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

public interface Gun extends ArmoryBaseObject{
	public boolean shoot(Player player);
	public int getMaxBullets();
	public boolean playerHasAmmo(Player player);
	public void reload(Player player);	
	public double getDamage();
	public int getDurability();
	public Ammo getAmmoType();
	public boolean hasIronSights();
	public boolean hasUnlimitedAmmo();
	public double getSway();
	public double getMovementMultiplier();
	public boolean isAutomatic();
	

	public WeaponSounds getWeaponSound();
	public WeaponType getWeaponType();
	
	public double getDelayBetweenShotsInSeconds();
	
	public HashMap<UUID, Long> getLastShotForGun();

}
