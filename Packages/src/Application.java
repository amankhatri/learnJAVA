/*Import package import followed by packagename.classname;*/
import ocean.Fish;
/*You can't have classes with same name in same package*/
import ocean.plants.Seaweed;
/*You can import everything from a package just by typing pacagename.*;*/
/*Packages are heighacrhical in java so we can have packages in packages*/
public class Application {
/**/
	Fish fish = new Fish();
	Seaweed seaweed = new Seaweed();
}
