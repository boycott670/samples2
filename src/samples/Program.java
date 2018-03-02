package samples;

import java.lang.reflect.Modifier;

public final class Program {

	public static void main(String[] args) throws NoSuchMethodException
	{
		assert isMainMethodPresent();
		
		assert Void.class.equals(Program.class.getDeclaredMethod("main", String[].class).getReturnType());
	}
	
	private static boolean isMainMethodPresent ()
	{
		try
		{
			return Modifier.isStatic(Program.class.getDeclaredMethod("main", String[].class).getModifiers());
		}
		catch (final NoSuchMethodException exception)
		{
			return false;
		}
	}

}
