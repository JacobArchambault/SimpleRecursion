
class MyArray {

	int[] elements;

	MyArray(final int[] elements) {
		this.elements = elements;
	}

	boolean hasMember(final int value) {
		for (final var member : elements) {
			if (member == value) {
				return true;
			}
		}
		return false;
	}

	boolean hasMemberRecursive(final int value, final int size) {
		return size == 0 ? false : elements[size - 1] == value ? true : hasMemberRecursive(value, size - 1);
	}

}
