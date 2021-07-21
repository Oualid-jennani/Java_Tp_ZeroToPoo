package java8;

import javax.script.*;


public class MyJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScriptEngineManager manager =new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("nashorn");
		String script = "var name='walid'; name";
		
		try {
			Object object = engine.eval(script);
			System.out.println(object);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
