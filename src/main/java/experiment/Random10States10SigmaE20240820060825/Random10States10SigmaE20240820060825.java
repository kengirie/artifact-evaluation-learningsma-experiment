package experiment.Random10States10SigmaE20240820060825;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import org.sat4j.specs.TimeoutException;
import learning.symbolicmealy.SymbolicMealyAutomatonLearner;
import learning.symbolicmealy.SymbolicMealyAutomatonOracle;
import symbolicmealy.SMAInputMove;
import symbolicmealy.SymbolicMealyAutomaton;
import automata.sfa.SFAMove;
import theory.BooleanAlgebra;
import theory.ProductAlgebra;
import theory.cartesian.CartesianProduct;
import theory.intervals.BoundedIntegerSolver;
import theory.intervals.IntegerSolver;
import theory.intervals.IntPred;
import utilities.Pair;
public class Random10States10SigmaE20240820060825{
public static void main(String[] args){
try{
BooleanAlgebra<IntPred, Integer> ba1 = new BoundedIntegerSolver(0, null);
SymbolicMealyAutomatonLearner<IntPred, Integer, Character> learner = new SymbolicMealyAutomatonLearner<IntPred, Integer, Character>(true);
Integer init = 1;
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.addAll(createTransitionsState1());
trans.addAll(createTransitionsState2());
trans.addAll(createTransitionsState3());
trans.addAll(createTransitionsState4());
trans.addAll(createTransitionsState5());
trans.addAll(createTransitionsState6());
trans.addAll(createTransitionsState7());
trans.addAll(createTransitionsState8());
trans.addAll(createTransitionsState9());
trans.addAll(createTransitionsState10());
SymbolicMealyAutomaton<IntPred, Integer, Character> example1 = SymbolicMealyAutomaton.MkSMA(trans,init,ba1);
example1 = SymbolicMealyAutomaton.getNormalized(example1,ba1);
example1 = SymbolicMealyAutomaton.getClean(example1,ba1);
example1 = SymbolicMealyAutomaton.getMinimal(example1, ba1);
SymbolicMealyAutomatonOracle<IntPred, Integer, Character> oracle = new SymbolicMealyAutomatonOracle<IntPred, Integer, Character>(example1,ba1);
SymbolicMealyAutomaton<IntPred, Integer, Character> learned = learner.learn(oracle, ba1);
} catch (TimeoutException e) {
}
}
private static List<SFAMove<IntPred, Integer>> createTransitionsState1() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(0, 39), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(40, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(120, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(216, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 5, new IntPred(294, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(305, 327), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(328, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(390, 392), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(393, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 4, new IntPred(453, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(0, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(40, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(120, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(216, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 4, new IntPred(294, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(305, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(328, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(390, 392), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(393, 452), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(453, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(0, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(40, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(120, 215), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(216, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(294, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(305, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(328, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(390, 392), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 6, new IntPred(393, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(453, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(0, 39), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(40, 119), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(120, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(216, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(294, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 7, new IntPred(305, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(328, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(390, 392), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 9, new IntPred(393, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(453, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(0, 39), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(40, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(120, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(216, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 3, new IntPred(294, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(305, 327), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(328, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 10, new IntPred(390, 392), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 6, new IntPred(393, 452), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(453, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 1, new IntPred(0, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(40, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(120, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(216, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(294, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(305, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(328, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 2, new IntPred(390, 392), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(393, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(453, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(0, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(40, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 9, new IntPred(120, 215), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(216, 293), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(294, 304), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 2, new IntPred(305, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(328, 389), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(390, 392), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(393, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(453, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(0, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(40, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(120, 215), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(216, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(294, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(305, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(328, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(390, 392), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(393, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(453, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 5, new IntPred(0, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(40, 119), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(120, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(216, 293), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(294, 304), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(305, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(328, 389), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(390, 392), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(393, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 3, new IntPred(453, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(0, 39), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 9, new IntPred(40, 119), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(120, 215), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(216, 293), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(294, 304), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 10, new IntPred(305, 327), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(328, 389), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(390, 392), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(393, 452), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 3, new IntPred(453, null), 'b'));
return trans;
}

}
