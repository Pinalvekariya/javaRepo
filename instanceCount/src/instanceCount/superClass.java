package instanceCount;

public class superClass {
	private static int objectCount = 0;

    public superClass() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }
}
