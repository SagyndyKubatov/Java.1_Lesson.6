public class Weapon extends GameEntity{
    private String weaponType,weaponName;

    public Weapon(int health, int damage, String ability, String weaponType, String weaponName) {
        super(health, damage, ability);
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    @Override
    public void gameInfo() {
        super.gameInfo();
        System.out.println("Weapon type: "+weaponType+". Weapon name: "+weaponName);
        System.out.println("-----------------------------");
    }
}
