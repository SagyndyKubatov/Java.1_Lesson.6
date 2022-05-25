public class GameEntity {
    private int health,damage;
    private String ability;

    public GameEntity(int health, int damage, String ability) {
        this.health = health;
        this.damage = damage;
        this.ability = ability;
    }

    public GameEntity() {

    }

    public void gameInfo(){
        System.out.println("Health: "+health+". Damage: "+damage+". Ability: "+ability);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
