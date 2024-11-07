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
public class Random10States10SigmaE20240820060829{
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(85, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(127, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(169, 238), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(239, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 9, new IntPred(282, 338), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(339, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 7, new IntPred(347, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(421, 480), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 8, new IntPred(481, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 2, new IntPred(0, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 5, new IntPred(85, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(127, 168), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(169, 238), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(239, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 9, new IntPred(282, 338), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 1, new IntPred(339, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(347, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 7, new IntPred(421, 480), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(481, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(0, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(85, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(127, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 1, new IntPred(169, 238), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(239, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 2, new IntPred(282, 338), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(339, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(347, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 4, new IntPred(421, 480), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(481, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(85, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(127, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(169, 238), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(239, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(282, 338), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 6, new IntPred(339, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 1, new IntPred(347, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(421, 480), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 5, new IntPred(481, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 8, new IntPred(0, 84), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(85, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(127, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 4, new IntPred(169, 238), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(239, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 1, new IntPred(282, 338), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(339, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 5, new IntPred(347, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 7, new IntPred(421, 480), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 2, new IntPred(481, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(85, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(127, 168), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 7, new IntPred(169, 238), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(239, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 6, new IntPred(282, 338), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(339, 346), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 3, new IntPred(347, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(421, 480), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 4, new IntPred(481, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 6, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(85, 126), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 5, new IntPred(127, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 10, new IntPred(169, 238), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(239, 281), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 4, new IntPred(282, 338), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(339, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(347, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(421, 480), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(481, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(85, 126), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 4, new IntPred(127, 168), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(169, 238), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(239, 281), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 10, new IntPred(282, 338), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(339, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(347, 420), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 9, new IntPred(421, 480), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 6, new IntPred(481, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(0, 84), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(85, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(127, 168), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(169, 238), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(239, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(282, 338), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 7, new IntPred(339, 346), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(347, 420), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(421, 480), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 6, new IntPred(481, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(0, 84), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(85, 126), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 1, new IntPred(127, 168), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(169, 238), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(239, 281), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(282, 338), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(339, 346), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 6, new IntPred(347, 420), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 8, new IntPred(421, 480), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 4, new IntPred(481, null), 'c'));
return trans;
}

}