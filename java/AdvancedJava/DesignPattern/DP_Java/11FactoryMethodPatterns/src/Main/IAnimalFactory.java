package Main;

abstract class IAnimalFactory 
{
	public abstract IAnimal
	/*if we cannot instantiate in later stage, we'll throw exception*/
	GetAnimalType(String type) throws Exception;
}
