package setshashsets;

import java.util.*;

public final class HeavenlyBody {
	private final String name;
	private final double orbintalPeriod;
	private final Set<HeavenlyBody> satellites;
	
	public HeavenlyBody(String name, double orbintalPeriod) {
		this.name=name;
		this.orbintalPeriod=orbintalPeriod;
		this.satellites=new HashSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public double getOrbintalPeriod() {
		return orbintalPeriod;
	}
	
	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	
	public Set<HeavenlyBody> getSatellites(){
		return new HashSet<>(this.satellites);
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		System.out.println("obj.getClass() is " + obj.getClass());
		System.out.println("this.getClass() is " + this.getClass());
		if((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		}
		String objName = ((HeavenlyBody)obj).getName();
		return this.name.equals(objName);
			}
	
	public int hashCode() {
		System.out.println("HashCode Called");
		return this.name.hashCode() + 57;
	}
}
