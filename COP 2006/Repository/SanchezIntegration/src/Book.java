
public class Book {
  private String author;
  private String Genre;
 //My Gets and Sets
  public void setAuthor(String newAuthor) { //Use of "this"
    this.author = newAuthor;
  }
  
  public String getAuthor() {
    return author;
  }
  public void setGenre(String newGenre) {
    Genre = newGenre;
  }
  
  public String getGenre(String newGenre) {
    return Genre;
  }
  
   // My constructor with Parameters text and SeriesNumber
   public void publish(String author, String Genre) {
     
   System.out.println("This Book is" + author + "The "+Genre + "genre");
 }


// constructor with parameters
public Book(String Author) { // header for constructor
  // called automatically when objects created
  author = getAuthor;
}

// Constructor without parameters
public Book() {
  Genre = "Horror";
}
}
