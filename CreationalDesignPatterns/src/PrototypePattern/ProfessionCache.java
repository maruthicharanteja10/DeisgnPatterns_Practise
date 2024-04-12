package PrototypePattern;

import java.util.HashMap;

public class ProfessionCache {
	private static HashMap<Integer, Profession> professionMap = new HashMap<>();

	public static Profession getCloneNewProfession(int id) {
		Profession CacheProfessionInstance = professionMap.get(id);
		return (Profession) CacheProfessionInstance.cloningMethod();
	}

	public static void LoadProfessionCache() {
		Doctor doct = new Doctor();
		doct.id = 1;
		professionMap.put(doct.id, doct);
		
		Engineer engineer = new Engineer();
		engineer.id = 2;
		professionMap.put(engineer.id, engineer);

		Teacher teacher = new Teacher();
		teacher.id = 3;
		professionMap.put(teacher.id, teacher);

	}
}
