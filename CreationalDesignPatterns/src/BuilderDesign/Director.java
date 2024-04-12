package BuilderDesign;

public class Director {
	private Builder builder;

	public Director(Builder builderType) {
		super();
		this.builder = builderType;
	}

	public Home getComplexHomeObject() {
		return this.builder.getComplexHomeObject();

	}

	public void manageRequiredHomeConstruction() {
		this.builder.buildfloor();
		this.builder.buildWalls();
		this.builder.buildTerrace();
	}

}
