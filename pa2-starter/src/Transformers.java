
class UpperCaseTransformer implements MyTransformer<String> {

	public String transformElement(String s) {
		return s.toUpperCase();
	}

}

// Add your transformers here
class LowerCaseTransformer implements MyTransformer<String> {
	public String transformElement(String s) {
		return s.toLowerCase();
	}
}
class DoublerTransformer implements MyTransformer<Integer> {
	public Integer transformElement(Integer s) {
		return s*2;
	}
}