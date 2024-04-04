package solid._01_singleresponsibility.bad;

public class Book {

    private String name;
    private String author;
    private String text;

    //constructor, getters and setters

    // methods that directly relate to the book properties
    public String replaceWordInText(String word, String replacementWord){
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }


    // The Single-responsibility principle: "There should never be more than one reason for a class to change."
    // In other words, every class should have only one responsibility
    
    void printTextToConsole(){
        // our code for formatting and printing the text
    }    
}