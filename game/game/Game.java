package game;

/**
 *
 * @author LEUNAME
 */
import Comparar.CompareArmyByDefense;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private Army player;
    private Army emeny;

    public static int verifyInt(String pergunta) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print(pergunta);
        while (!sc.hasNextInt()) {
            System.out.println("introduza um numero válido!");
            sc.next();
        }
        number = sc.nextInt();
        return number;
    }

    private void gameStarted() {
        Scanner scanner = new Scanner(System.in);
        int again = 1;

        int opcao = 1;
        if (emeny.getDefenseForces().isEmpty()) {
            createComputer();
        }
        if (player == null) {
            System.out.println("Sem Exercito Criado.");
        } else {
            do {
                if (player.getDefenseForces().isEmpty()) {
                    System.out.println("O seu exercito encontra sem defesa.");
                    //System.out.print("Pretende continuar?Sim(1),Nao(0)->");
                    opcao = verifyInt("Pretende continuar?Sim(1),Nao(0)->");

                }
                if (opcao == 1) {
                    System.out.println("Poder do seu Exercito:");
                    System.out.println("Poder Máximo de ataque->" + player.CalculateAttackForce());
                    System.out.println("Poder Defensivo->" + player.CalculateDefenseForce());
                    int Rounds = 0;
                    if ((Math.random() * 100) < 50) {
                        do {
                            Rounds++;
                            System.out.println("----------------Round " + Rounds + "-----------------------");
                            System.out.println("Defesa Atual->" + player.CalculateDefenseForce());
                            System.out.println("Player Attack");

                            //função attack
                            player.Attack(emeny);
                            System.out.println("Dano dado->" + player.realAttackForce());
                            if (emeny.CalculateDefenseForce() > 0) {
                                System.out.println("Enemy Attack");
                                emeny.Attack(player);
                                System.out.println("Dano recebido->" + emeny.realAttackForce());
                                //função attack
                            }
                        } while (player.CalculateDefenseForce() > 0 && emeny.CalculateDefenseForce() > 0);
                        if (emeny.CalculateDefenseForce() <= 0) {
                            System.out.println("Voce ganhou!!");
                        } else if (player.CalculateDefenseForce() <= 0) {
                            System.out.println("O computador ganhou!!");
                        }
                    } else {
                        do {
                            Rounds++;
                            System.out.println("----------------Round " + Rounds + "-----------------------");
                            System.out.println("Defesa Atual->" + player.CalculateDefenseForce());
                            System.out.println("Enemy Attack");
                            //função attack
                            emeny.Attack(player);
                            System.out.println("Dano recebido->" + emeny.realAttackForce());
                            if (player.CalculateDefenseForce() > 0) {
                                System.out.println("Player Attack");
                                //função attack
                                player.Attack(emeny);
                                System.out.println("Dano dado->" + player.realAttackForce());
                            }

                        } while (player.CalculateDefenseForce() > 0 && emeny.CalculateDefenseForce() > 0);
                        if (player.CalculateDefenseForce() <= 0) {
                            System.out.println("O computador ganhou!!");
                        } else if (emeny.CalculateDefenseForce() <= 0) {
                            System.out.println("Voce ganhou!!");
                        }
                    }
                }
                again = verifyInt("Jogar outra vez (1) sair (0)");
            } while (again == 1);
        }

    }

    private void inspectArmies() {
        Scanner scanner = new Scanner(System.in);
        if (player == null) {
            System.out.println("Sem Exercito Criado.");
        } else {
            player.toString();
            int AttCat = 0;
            int AttCav = 0;
            int AttInf = 0;
            int DefCat = 0;
            int DefCav = 0;
            int DefInf = 0;
            for (int i = 0; i < player.getAttackForces().size(); i++) {
                if (player.getAttackForces().get(i).getAttack() == 100) {
                    AttCat++;
                } else if (player.getAttackForces().get(i).getAttack() == 50) {
                    AttCav++;
                } else {
                    AttInf++;
                }
            }
            for (int i = 0; i < player.getDefenseForces().size(); i++) {
                if (player.getDefenseForces().get(i).getAttack() == 100) {
                    DefCat++;
                } else if (player.getDefenseForces().get(i).getAttack() == 50) {
                    DefCav++;
                } else {
                    DefInf++;
                }
            }
            System.out.println("\t\tMeu Exercito");
            System.out.println("\tTropas de Ataque:");
            System.out.println("Cataputas->" + AttCat);
            System.out.println("Cavalaria->" + AttCav);
            System.out.println("Infantaria->" + AttInf);
            System.out.println("Poder Máximo de ataque->" + player.CalculateAttackForce());
            System.out.println("\tTropas de Defesa:");
            System.out.println("Cataputas->" + DefCat);
            System.out.println("Cavalaria->" + DefCav);
            System.out.println("Infantaria->" + DefInf);
            System.out.println("Poder de defesa->" + player.CalculateDefenseForce());

            int emeAttCat = 0;
            int emeAttCav = 0;
            int emeAttInf = 0;
            int emeDefCat = 0;
            int emeDefCav = 0;
            int emeDefInf = 0;
            for (int i = 0; i < emeny.getAttackForces().size(); i++) {
                if (emeny.getAttackForces().get(i).getAttack() == 100) {
                    emeAttCat++;
                } else if (emeny.getAttackForces().get(i).getAttack() == 50) {
                    emeAttCav++;
                } else {
                    emeAttInf++;
                }
            }

            for (int i = 0; i < emeny.getDefenseForces().size(); i++) {
                if (emeny.getDefenseForces().get(i).getAttack() == 100) {
                    emeDefCat++;
                } else if (emeny.getDefenseForces().get(i).getAttack() == 50) {
                    emeDefCav++;
                } else {
                    emeDefInf++;
                }
            }
            System.out.println("\t\tExercito do Computador");
            System.out.println("\tTropas de Ataque:");
            System.out.println("Cataputas->" + emeAttCat);
            System.out.println("Cavalaria->" + emeAttCav);
            System.out.println("Infantaria->" + emeAttInf);
            System.out.println("Poder Máximo de ataque->" + emeny.CalculateAttackForce());
            System.out.println("\tTropas de Defesa:");
            System.out.println("Cataputas->" + emeDefCat);
            System.out.println("Cavalaria->" + emeDefCav);
            System.out.println("Infantaria->" + emeDefInf);
            System.out.println("Poder de defesa->" + emeny.CalculateDefenseForce());
            //System.out.println("Prima 1 para ver o exercito detalhado, 0 para continuar...");
            int opcao = 0;
            opcao = verifyInt("Prima 1 para ver o exercito detalhado, 0 para continuar...");
            if (opcao == 1) {
                System.out.println("\t\tMeu exercito");
                System.out.println("\tAtaque");
                player.OrganizeAtt();
                System.out.println(player.getAttackForces());
                player.OrganizeDef();
                System.out.println("\tDefesa");
                System.out.println(player.getDefenseForces());
                System.out.println("\t\tExercito do computador");
                emeny.OrganizeAtt();
                System.out.println("\tAtaque");
                System.out.println(emeny.getAttackForces());
                emeny.OrganizeDef();
                System.out.println("\tDefesa");
                System.out.println(emeny.getDefenseForces());
            }
        }
    }

    public enum Command {
        CRIAR_EXERCITO, INSPECIONAR_EXERCITO, JOGAR, SAIR
    }

    public void createComputer() {
        int emeAttack = (int) (Math.random() * 100);
        int emeAttCat = (int) (Math.random() * emeAttack);
        int emeAttCav = 0;
        int emeAttInf = 0;
        if (emeAttack - emeAttCat > 0) {
            emeAttCav = (int) (Math.random() * (emeAttack - emeAttCat));
            emeAttInf = emeAttack - emeAttCat - emeAttCav;
        }

        int emeDefense = 100 - emeAttack;
        int emeDefCat = 0;
        int emeDefCav = 0;
        int emeDefInf = 0;
        if (emeDefense > 0) {
            emeDefCat = (int) (Math.random() * emeDefense);
            if (emeDefense - emeDefCat > 0) {
                emeDefCav = (int) (Math.random() * (emeDefense - emeDefCat));
                emeDefInf = emeDefense - emeDefCat - emeDefCav;
            }
        }

        emeny = new Army(emeAttCat, emeAttCav, emeAttInf, emeDefCat, emeDefCav, emeDefInf);
    }

    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Máximo de tropas 100");
        //System.out.print("Escolha a quantidade de ataque->");
        int quantAttack = verifyInt("Escolha a quantidade de ataque->");
        while (quantAttack < 0 || quantAttack > 100) {
            System.out.println("O máximo é de tropas 100");
            //System.out.print("Quantidade de ataque->");
            //quantAttack = scanner.nextInt();
            quantAttack = verifyInt("Quantidade de ataque->");
        }
        int quantAttInf = 0;
        int quantAttCav = 0;
        int quantAttCat = 0;
        System.out.println("\n\nTROPAS DE ATAQUE");
        System.out.println("Maximo de ataque:" + quantAttack);
        //System.out.print("Quantas cataputas->");
        quantAttCat = verifyInt("Quantas cataputas->");
        while (quantAttCat < 0 || quantAttCat > quantAttack) {
            System.out.println("O máximo de tropas para ataque é: " + quantAttack);
            //System.out.print("Número de cataputas->");
            quantAttCat = verifyInt("Número de cataputas->");
        }
        if (quantAttack - quantAttCat > 0) {
            System.out.println("Maximo de ataque atual:" + (quantAttack - quantAttCat));
            //System.out.print("Quantas cavalaria->");
            quantAttCav = verifyInt("Quantas cavalaria->");
            while (quantAttCav < 0 || quantAttCav > (quantAttack - quantAttCat)) {
                System.out.println("O máximo de tropas para ataque atualmente é: " + (quantAttack - quantAttCat));
                //System.out.print("Número de cavalaria->");
                quantAttCav = verifyInt("Número de cavalaria->");
            }
            quantAttInf = (quantAttack - quantAttCav - quantAttCat);
            System.out.println("Restantes tropas completadas com " + quantAttInf + " de infantaria.");
        }
        int quantDefense = 100 - quantAttack;
        int quantDefCat = 0;
        int quantDefCav = 0;
        int quantDefInf = 0;
        if (quantDefense > 0) {

            System.out.println("\n \n TROPAS DE DEFESA");
            System.out.println("Maximo de defesa disponivel:" + quantDefense);
            //System.out.print("Quantas cataputas->");
            quantDefCat = verifyInt("Quantas cataputas->");
            while (quantDefCat < 0 || quantDefCat > quantDefense) {
                System.out.println("O máximo de tropas para defesa é: " + quantDefense);
                //System.out.print("Número de cataputas->");
                quantDefCat = verifyInt("Número de cataputas->");
            }
            if (quantDefense - quantDefCat > 0) {
                System.out.println("Maximo de defesa atual:" + (quantDefense - quantDefCat));
                //System.out.print("Quantas cavalaria->");
                quantDefCav = verifyInt("Quantas cavalaria->");
                while (quantDefCav < 0 || quantDefCav > (quantDefense - quantDefCat)) {
                    System.out.println("O máximo de tropas para defesa atualmente é: " + (quantDefense - quantDefCat));
                    //System.out.print("Número de cavalaria->");
                    quantDefCav = verifyInt("Número de cavalaria->");
                }
                quantDefInf = (quantDefense - quantDefCav - quantDefCat);
                System.out.println("Restantes tropas completadas com " + quantDefInf + " de infantaria.");
            }
        }
        player = new Army(quantAttCat, quantAttCav, quantAttInf, quantDefCat, quantDefCav, quantDefInf);
    }

    public static <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equals(value)) {
                return false;
            }
        }
        System.out.println("Introduza um comando válido!!");
        return true;
    }

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        game.createComputer();
        boolean run = true;
        while (run) {
            String line;
            Command command;
            do {
                System.out.println(" _______________________________");
                System.out.println("|\t\tMenu\t\t|");
                System.out.println("|\t1.CRIAR_EXERCITO\t|");
                System.out.println("|\t2.INSPECIONAR_EXERCITO\t|");
                System.out.println("|\t3.JOGAR\t\t\t|");
                System.out.println("|\t4.SAIR\t\t\t|");
                System.out.println("|     Write a command\t\t|");
                System.out.println("|_______________________________|");
                line = scanner.nextLine();
            } while (isInEnum(line.toUpperCase(), Command.class));
            command = Command.valueOf(line.toUpperCase());
            switch (command) {
                case CRIAR_EXERCITO:
                    System.out.println("\t\tCreate Army");
                    game.create();
                    break;
                case INSPECIONAR_EXERCITO:
                    System.out.println("\tInspecionar");
                    game.inspectArmies();
                    break;
                case JOGAR:
                    System.out.println("\tGame starting");
                    game.gameStarted();
                    break;
                case SAIR:
                    System.out.println("\tExit");
                    run = false;
                    break;
            }
        }
    }
}
