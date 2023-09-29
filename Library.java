//package com.dbda.main;
//class Book{
//	
//}
//public class Library {
//
//	  private List<Book> books;
//
//	  public Library() {
//	    books = new ArrayList<Book>();
//	  }
//
//	  public void addBook(Book book) {
//	    books.add(book);
//	  }
//
//	  public Book checkOutBook(String title) {
//	     for (Book book : books) {
//	      if (book.getTitle().equals(title)) {
//	        book.setAvailable(false);
//	        return book;
//	      }
//	    }
//	    return null;
//	  }
//
//	  public Book returnBook(Book book) {
//	    book.setAvailable(true);
//	    return book;
//	  }
//
//	} 
//	Example
//	Library library = new Library();
//
//	Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
//	Book book2 = new Book("The Hobbit", "J.R.R. Tolkien");
//
//	library.addBook(book1);
//	library.addBook(book2);
//
//	Book checkedOutBook = library.checkOutBook("The Lord of the Rings");
//	System.out.println("Checked out book: " + checkedOutBook.getTitle());
//
//	library.returnBook(checkedOutBook);
//	System.out.println("Book returned: " + checkedOutBook.getTitle());
//	}
//}
//
//public class Book {
//
//	  private String title;
//	  private String author;
//	  private boolean isAvailable;
//
//	  public Book(String title, String author) {
//	    this.title = title;
//	    this.author = author;
//	    this.isAvailable = true;
//	  }
//
//	  public String getTitle() {
//	    return title;
//	  }
//
//	  public String getAuthor() {
//	    return author;
//	  }
//
//	  public boolean isAvailable() {
//	    return isAvailable;
//	  }
//
//	  public void setAvailable(boolean available) {
//	    isAvailable = available;
//	  }
//
//	} 
//
//public class Library {
//	public static void main(String[] args) {
//		
//	}
//		
//			
//			
//}
