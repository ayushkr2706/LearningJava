package BasicJava;

//A builder object is an object whose job is to help create & configure another object.
public class Builder {

    public static void main(String[] args) {

        //Instead of doing Car car = new Car(); and setting its fioelds by constructor parameters
        //or by getters and setters

        Car car = Car.builder()
                    .company("Ford")
                    .price(1200000)
                    .topSpeed(150)
                    .build();

        System.out.println(car.company + " " + car.price + " " +car.topSpeed);            
        
    }
    
}

class Car{

     String company;
     int price;
     int topSpeed;

    public static CarBuilder builder(){
        return new CarBuilder();
    }

       static class CarBuilder{

        private String company;
        private int price;
        private int topSpeed;

        public CarBuilder company(String company){
            this.company = company;
            return this;
        }

        public CarBuilder price(int price){
            this.price = price;
            return this;
        }

        public CarBuilder topSpeed(int topSpeed){
            this.topSpeed = topSpeed;
            return this;
        }

           public Car build(){
            Car car = new Car();

            car.company = this.company;
            car.price = this.price;
            car.topSpeed = this.topSpeed;

            return car;
        }
    }
    
}
