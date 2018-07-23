package lang;
/*
 * DIFFERENCE BETWEEN == &equals() method in java 
 * 
 * 
 * 
 * 			== operator 												.equals()
 * ---------------------------------------------------------------------------------------------------------------------------
 * (1)	it is mean for reference comparison					(1)  it is method applicable for [[REFERENCES BUT NOT FOR PRIMITIVES]]
 * 
 * (2)	we can't override == operator for
 * 		content comparison									(2)	we can override .equals() for content comparison
 * 
 * ============================================================================================================================
 * 
 * in [String] class .equals() is overridden for content comparison
 * 
 * in [[StrngBuffer]] class .equals() is not overridden for content comparison hence .equals() will be executed which is meant for
 * reference comparison
 * 
 * in all wrapper classes .equals() is mean't for content comparison
 */

public class Difference_Equal_Operator {

}
