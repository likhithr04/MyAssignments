package week3.day2.HomeAssignements;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using Button
		Button b = new Button();
		b.click();
		b.submit();

		//Using TextField
		TextField tf = new TextField();
		tf.getText();
		tf.click();
		tf.setText("new message");

		// Using CheckBoxButton
		CheckBoxButton checkBox = new CheckBoxButton();
		checkBox.click();
		checkBox.clickCheckButton();

		// Using RadioButton
		RadioButton radioButton = new RadioButton();
		radioButton.click();
		radioButton.selectRadioButton();

		// Using Elements class
		Elements e = new Elements();
		e.click();
		e.setText("demo mes to base class");
		e.submit();

		
	}

}
