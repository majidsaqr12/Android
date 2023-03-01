package Model;

public class Listitem {

    private String name , description , more;

    public Listitem( String name , String description , String more) {
        this.name = name;
        this.description = description ;
        this.more = more;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
