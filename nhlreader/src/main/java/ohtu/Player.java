
package ohtu;

public class Player {
    private String name;
    private Integer goals;
    private String nationality;
    private Integer assists;
    private Integer total;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " goals " + goals + " assists " + assists + " total " + total;
    }

    public Integer goals() {
        return goals;
    }
    public Integer total() {
        total = goals+assists;
        return total;
    }
    public String nationality() {
        return nationality;
    }
    
    public Integer assists() {
        return assists;
    }

}
