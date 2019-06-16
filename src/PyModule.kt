import java.io.FileReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

class PyModule(name: String) {
    internal var name = name
    internal var engine: ScriptEngine = ScriptEngineManager().getEngineByName("jython")

    fun initScript() {
        engine.eval(FileReader(name))
    }

    fun call(funcName: String, param: String) {
        engine.eval("$funcName($param)")
    }

    fun makeObj(className: String, param: String, objName: String) {
        engine.eval("$objName=$className($param)")
    }

    fun callObjFunc(funcName: String, param: String, objName: String) {
        engine.eval("$objName.$funcName($param)")
    }
}
