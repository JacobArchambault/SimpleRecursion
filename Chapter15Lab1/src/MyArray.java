
class MyArray {

	int[] elements;

	MyArray(int[] elements) {
		this.elements = elements;
	}

	boolean hasMember(int value) {
		for (var member : elements) {
			if (member == value) {
				return true;
			}
		}
		return false;
	}

	boolean hasMemberRecursive(final int value, final int size) {
		return (size == 0) ? false : (elements[size - 1] == value) ? true : this.hasMemberRecursive(value, size - 1);
	}

}
