
public class Boot {
	private String boot;

	Boot(String boot) {
		this.boot = boot;
	}

	public String getBoot() {
		return boot;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + this.boot.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		return obj.toString() == this.toString() ? true : false;
	}

	@Override
	public String toString() {
		return boot;
	}
}
