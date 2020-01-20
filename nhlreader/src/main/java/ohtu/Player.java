
package ohtu;

public class Player {
    private String name;
    private String goals;
    private String nationality;
    private String assists;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " goals " + goals + " assists " + assists;
    }
    public String goals() {
        return goals;
    }

    public String nationality() {
        return nationality;
    }
    
    public String assists() {
        return assists;
    }

}
