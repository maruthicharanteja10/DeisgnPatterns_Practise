package BuilderDesign;

public class EarthQuakeResistantBuilder implements Builder{
private Home earthQuakeResistenceHome=new Home();
	@Override
	public void buildfloor() {
		this.earthQuakeResistenceHome.floor="Wooden Floors";
	}

	@Override
	public void buildWalls() {
		this.earthQuakeResistenceHome.walls="Wooden Walls";
	}

	@Override
	public void buildTerrace() {
		this.earthQuakeResistenceHome.terrace="Wooden Terrace";
	}

	@Override
	public Home getComplexHomeObject() {
		return this.earthQuakeResistenceHome;
	}

}
