
class LongWordChooser implements MyChooser<String> {

	@Override
	public boolean chooseElement(String s) {
		return s.length() > 5;
	}

} 

// Add your choosers here
class ShortWordChooser implements MyChooser<String> {
	@Override
	public boolean chooseElement(String s) {
		return s.length() < 5;
	}
} 
class BigNumberChooser implements MyChooser<Integer> {
	@Override
	public boolean chooseElement(Integer s) {
		return s > 10000;
	}
} 
class SmallNumberChooser implements MyChooser<Integer> {
	@Override
	public boolean chooseElement(Integer s) {
		return s > 10000;
	}
} 