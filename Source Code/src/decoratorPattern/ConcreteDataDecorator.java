package decoratorPattern;

public class ConcreteDataDecorator implements ConcreteSource {
	private ConcreteSource concreteWrapper;

	public ConcreteDataDecorator(ConcreteSource concreteSource) {
		this.concreteWrapper = concreteSource;
	}

	@Override
	public boolean writeFile(String writeData) {
		if (concreteWrapper.writeFile(writeData)) {
			return true;
		} else {
			return false;
		}
	}

}
