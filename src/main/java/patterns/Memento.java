package patterns;

/**
 * Created by romas on 24.09.2016.
 */
public class Memento {
    public static void main (String[] args) {
        Game game = new Game();
        game.set("LVL_1",3000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL_2",53000);
        System.out.println(game);

        System.out.println("LOAD");
        game.load(file.getSave());
        System.out.println(game);

    }
}
class Game{
    private String level;
    private int ms;
    public void set (String level, int ms){
        this.level = level;
        this.ms = ms;
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", ms=" + ms +
                '}';
    }

    public void load(Save save){
        level = save.getLevel();
        ms = save.getMs();
    };
    public Save save(){
        return new Save(level,ms);
    }
}

class Save{
    private final String level;
    private final int ms;

    public String getLevel() {
        return level;
    }

    public int getMs() {
        return ms;
    }

    public Save (String level, int ms){
        this.level = level;
        this.ms = ms;
    }
}

class File{
    Save save;
    public Save getSave() {
        return save;
    }
    public void setSave(Save save) {
        this.save = save;
    }
}
