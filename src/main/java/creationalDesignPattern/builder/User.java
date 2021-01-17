package creationalDesignPattern.builder;

public class User {
    //required
    private String name;
    private String email;

    //optional
    private String firstName;
    private String lastName;
    private String address;

    //private so can't create User without using builder
    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        //required
        private String name;
        private String email;

        //optional
        private String firstName;
        private String lastName;
        private String address;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }


        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String value){
            this.lastName = value;
            return this;
        }
        
        //User build() an instance of Builder
        public User build(){
            return new User(this); //immutable once created
        }

    }
}
