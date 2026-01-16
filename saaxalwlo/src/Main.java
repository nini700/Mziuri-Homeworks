public class Main {
    public static void main(String[] args) {
        System.out.println("=== santas saxelosno ===\n");

        // elpebis sheqmna
        System.out.println("elpebi");
        Elf elf1 = new Elf("jingli", "stprapi", 150, 8, "satamashloebis maketebeli");
        Elf elf2 = new Elf("beli", "zusti", 120, 9, "shemputavi");

        elf1.makeToy();
        elf1.wrapGifts();
        elf2.makeToy();
        elf2.wrapGifts();
        elf1.celebrateChristmas();

        System.out.println("\n" + elf1);
        System.out.println(elf2);

        // irmebis sheqmna
        System.out.println("\nirmebi");
        Reindeer rudolph = new Reindeer("rudolpi", "tsiturcxvila", 8, 95.0, "tsiteli");
        Reindeer dasher = new Reindeer("desheri", "stprapi", 6, 100.0, "qavisperi");

        rudolph.fly();
        dasher.fly();

        rudolph.trainForChristmas();
        System.out.println(rudolph.getName() + "-is pitnes done: " + rudolph.checkFitnessLevel());
        System.out.println(dasher.getName() + "-is pitnes done: " + dasher.checkFitnessLevel());

        System.out.println("\n" + rudolph);
        System.out.println(dasher);

        // bavshvebis sheqmna
        System.out.println("\nbavshvebi");
        Child child1 = new Child("giorgi", 8);
        child1.addWish("velosipedi");
        child1.addWish("konstruktori");

        Child child2 = new Child("mariam", 9);
        child2.addWish("tojina");
        child2.addWish("tsignebi");

        Child child3 = new Child("nika", 3);
        child3.addWish("manqana");

        System.out.println("\n" + child1);
        System.out.println(child2);
        System.out.println(child3);

        // santas sheqmna
        System.out.println("\nsanta klausi");
        Santa santa = new Santa("santa klausi", "papapa noeli", 1000);
        santa.addChild(child1);
        santa.addChild(child2);
        santa.addChild(child3);

        santa.spreadJoy();
        santa.singCarols();
        santa.decorateTree();

        santa.deliverGifts();

        // tovlis babua
        System.out.println("\ntovlis babua");
        Snowman snowman = new Snowman(10.0, "shavi", false);

        snowman.decorate("sharpi");
        snowman.decorate("ghilebi");
        snowman.decorate("ghumeli");

        snowman.makeMagical();

        System.out.println("\n" + snowman);

        System.out.println("\ntovlis babua itsqebs dnobas...");
        snowman.melt();
        snowman.melt();
        snowman.melt();
        snowman.melt();
        snowman.melt();

        System.out.println("\n" + snowman);

        System.out.println("\nprograma ddamtavrda");
    }
}