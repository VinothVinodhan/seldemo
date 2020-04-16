package keyword;

public class Finally_Block {

	public static void main(String[] args) {
		try {
			int x = 300;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is executed");
		}

	}

}
