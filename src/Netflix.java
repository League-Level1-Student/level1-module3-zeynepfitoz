
public class Netflix {
public static void main(String[] args) {
	Movie mg = new Movie("Mean Girls", 3 );
	Movie i = new Movie("Interstellar", 5);
	Movie pd = new Movie("Princess Diaries",  3);
	Movie b = new Movie("The Boy", 3);
	Movie tcl = new Movie("10 Cloverfeild Lane", 4);
	Movie bwp = new Movie("Blair Witch Project", 3);
	System.out.println(mg.getTicketPrice());
	NetflixQueue nq = new NetflixQueue();
	nq.addMovie(i);
	nq.addMovie(pd);
	nq.addMovie(mg);
	nq.addMovie(b);
	nq.addMovie(tcl);
	nq.addMovie(bwp);
	nq.printMovies();
	System.out.println("the best movie is "+nq.getBestMovie());
	System.out.println("the second best movie is 10 Cloverfeild Lane");
}
}
