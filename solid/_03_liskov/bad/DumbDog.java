package solid._03_liskov.bad;

// https://medium.com/mindorks/solid-principles-explained-with-examples-79d1ce114ace
class DumbDog extends Animal {
    
    
    // Now, wherever in our code we were using Animal class object we must be able to replace 
    // it with the Dog or Cat without exploding our code. What do we mean here is the child class 
    // should not implement code such that if it is replaced by the parent class then the application 
    // will stop running. For ex. if the following class is replace by Animal then our app will crash.

    @Override
    public void makeNoise() {
        throw new RuntimeException("I can't make noise");
    }
}
