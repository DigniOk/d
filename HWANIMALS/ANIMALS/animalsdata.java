package HWANIMALS.ANIMALS;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class animalsdata {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
    private int id;
    private String name;
    private ArrayList commands = new ArrayList<String>();
    private AnimalEnum type;
    private Date date_of_birth;

    public animalsdata(int id, String name, String type, ArrayList commands, String date) {
        setId(id);
        setName(name);
        setType(type);
        setCommands(commands);
        setDate_of_birth(date);
    }

    public animalsdata(int id, String name, String type, String commands, String date) {
        setId(id);
        setName(name);
        setType(type);
        setCommands(commands);
        setDate_of_birth(date);
    }

    public animalsdata(String name, String type, ArrayList commands, String date) {
        setName(name);
        setType(type);
        setCommands(commands);
        setDate_of_birth(date);
    }

    public animalsdata(String name, String type, String commands, String date) {
        setName(name);
        setType(type);
        setCommands(commands);
        setDate_of_birth(date);
    }

    public animalsdata(animals animal, String type) {
        setName(animal.getName());
        setType(type);
        setCommands(animal.getCommands());
        setDate_of_birth(animal.getDateOfBirth());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getCommands() {
        return commands;
    }

    public void setCommands(ArrayList commands) {
        this.commands = commands;
    }

    public void setCommands(String commands) {
        commands = commands.replaceAll("[\\[\\]]", "");
        this.commands.add(commands);
    }

    public AnimalEnum getType() {
        return type;
    }

    public void setType(String type) {
        switch (type.toLowerCase()) {
            case ("cat"):
                this.type = AnimalEnum.CAT;
                break;
            case ("dog"):
                this.type = AnimalEnum.DOG;
                break;
            case ("hamster"):
                this.type = AnimalEnum.HAMSTER;
                break;
            case ("horse"):
                this.type = AnimalEnum.HORSE;
                break;
            case ("camel"):
                this.type = AnimalEnum.CAMEL;
                break;
            case ("donkey"):
                this.type = AnimalEnum.DONKEY;
                break;
            default:
                System.out.println("Not recognized type of animal");

        }

    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        try {
            sdf.parse(date_of_birth);
            sdf.setLenient(false);
            this.date_of_birth = Date.valueOf(date_of_birth);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Not valid date of birth");
        }
    }

    @Override
    public String toString() {
        return "AnimalDto {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", commands = '" + commands + '\'' +
                ", type = " + type +
                ", date_of_birth = " + date_of_birth +
                '}';
    }
}
