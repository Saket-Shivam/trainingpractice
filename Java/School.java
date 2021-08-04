public interface School{
	default void attendance() {
		System.out.println("Present mam...");
	}
	static void homework() {
		System.out.println("Sorry..not done");
	}
}
