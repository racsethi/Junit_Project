package Junits;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class EnvCheck implements ExecutionCondition {
	
	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		// TODO Auto-generated method stub
		
		String ExpEnv = "DEV";
		String ActEnv = "PROD"; //dev
		if (ExpEnv.equals(ActEnv)) {
			
		return ConditionEvaluationResult.enabled("The env value is same");
		}
		
		return ConditionEvaluationResult.disabled("The env value is different");
		
	}
}
