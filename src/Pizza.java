public class Pizza {
    private String size;
    private String sauce;
    private boolean cheese;
    private boolean pepperoni;
    private boolean olives;

    private Pizza(Builder builder) {
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.olives = builder.olives;
        this.size = builder.size;
        this.sauce = builder.sauce;
    }

    public String getSize() {
        return size;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isOlives() {
        return olives;
    }

    public static class Builder {
        private String size;
        private String sauce;
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean olives = false;
        public Builder(String size, String sauce){
            this.size = size;
            this.sauce = sauce;
        }

        public Builder withCheese() {
            this.cheese = true;
            return this;
        }

        public Builder withOlives() {
            this.olives = true;
            return this;
        }

        public Builder withPepperoni() {
            this.pepperoni = true;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}