// DefaultMethods.java
// Looks like a typical class method but is defined inside an interface and contains default specifier.
// It can access everything that is defined within the interface or is inherited by the interface.

default boolean removeIf(Predicate<? super E> filter) {
	Objects.requireNonNull(filter);
	boolean removed = false;
	final Iterator<E> each = iterator();
	while (each.hasNext()) {
		if (filter.test(each.next())) {
			each.remove();
			removed = true;
		}
	}
	return removed;
}
