package main.java.com.magicalarena;

public class Game {
    private Player playerA;
    private Player playerB;
    private Dice dice;

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.dice = new Dice();
    }

    public void start() {
        Player attacker, defender;
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() <= playerB.getHealth()) {
                attacker = playerA;
                defender = playerB;
            } else {
                attacker = playerB;
                defender = playerA;
            }

            takeTurn(attacker, defender);
        }

        if (!playerA.isAlive()) {
            System.out.println("Player A has been defeated!");
        } else {
            System.out.println("Player B has been defeated!");
        }
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendDamage = defender.getStrength() * defendRoll;

        int damageDealt = attackDamage - defendDamage;
        if (damageDealt > 0) {
            defender.setHealth(defender.getHealth() - damageDealt);
        }

        System.out.printf("%s attacks %s: Attack roll = %d, Defend roll = %d, Damage dealt = %d%n",
                attacker == playerA ? "Player A" : "Player B",
                defender == playerA ? "Player A" : "Player B",
                attackRoll, defendRoll, damageDealt);
    }

    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Game game = new Game(playerA, playerB);
        game.start();
    }
}