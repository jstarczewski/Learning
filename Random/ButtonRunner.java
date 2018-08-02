public class ButtonRunner {
	public static void main(String[] args) {
		Button button = new Button("Button");
	
	/*	class OnClickListener implements Button.OnClickListener {
			@Override
			public void onClick() {
				System.out.println("I was clicked from main");
			}
		}
		button.setOnClickListener(new OnClickListener());
		button.onClick();*/
		
		// Anonymous class that is so called simulating creating an instance of interface but
		// it is impossible so thats just an anonymous class !!!!!
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("eloo");
			}
		});
		button.onClick();
	}
		
}
