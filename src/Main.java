class Movie{
private String name;
public Movie(String name){
    this.name=name;
}
public String getPlot(){
    return "no plot here";
}

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String getPlot(){
        return "Shark eats people";
    }
}
class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("IndependenceDayy");
    }

    @Override
    public String getPlot(){
        return "Alien invasion";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String getPlot(){
        return "Run through Maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String getPlot(){
        return "Imperial forces invades";
    }
}



class ForgetableMovie extends Movie{
    public ForgetableMovie(){
        super("ForgatbleMovie");
    }{}


}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Movie movie = getRandomMovie();
            System.out.println("Movie is " + movie.getName() + " Movie plot is " + movie.getPlot()+"\n");//movie.getPlot() where Polymorphim happens
        }

    }

    public static Movie getRandomMovie() {


            int Number = (int) (Math.random()*5)+1;
            switch (Number) {
                case 1:
                    return new StarWars();
                case 2:
                    return new MazeRunner();
                case 3:
                    return new Jaws();
                case 4:
                    return new IndependenceDay();
                case 5:
                    return new ForgetableMovie();
            }

        return null;
    }
}

