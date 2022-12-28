package creational.builder;

public class Sandwich {

    private int noOfPickles;
    private int noOfBreads;
    private int noOfCheeseSlices;

    private Sandwich()
    {}

    public static Builder getBuilder()
    {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "noOfPickles=" + noOfPickles +
                ", noOfBreads=" + noOfBreads +
                ", noOfCheeseSlices=" + noOfCheeseSlices +
                '}';
    }

    static class Builder{
        private int noOfPickles;
        private int noOfBreads;
        private int noOfCheeseSlices;

        public Builder setNoOfPickles(int noOfPickles)
        {
            this.noOfPickles = noOfPickles;
            return this;
        }

        public Builder setNoOfBreads(int noOfBreads)
        {
            this.noOfBreads = noOfBreads;
            return this;
        }

        public Builder setNoOfCheeseSlices(int noOfCheeseSlices)
        {
            this.noOfCheeseSlices = noOfCheeseSlices;
            return this;
        }

        public Sandwich build()
        {
            Sandwich sandwich = new Sandwich();
            sandwich.noOfPickles = this.noOfPickles;
            sandwich.noOfBreads = this.noOfBreads;
            sandwich.noOfCheeseSlices = this.noOfCheeseSlices;
            return sandwich;
        }

    }

}

class Runner
{
    public static void main(String[] args) {
        Sandwich sandwich = Sandwich.getBuilder()
                .setNoOfBreads(3)
                .setNoOfCheeseSlices(4)
                .setNoOfPickles(4)
                .build();
        System.out.println(sandwich);
    }
}

