package experiment.Random20States10SigmaE20240820075226;
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
public class Random20States10SigmaE20240820075231{
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
trans.addAll(createTransitionsState11());
trans.addAll(createTransitionsState12());
trans.addAll(createTransitionsState13());
trans.addAll(createTransitionsState14());
trans.addAll(createTransitionsState15());
trans.addAll(createTransitionsState16());
trans.addAll(createTransitionsState17());
trans.addAll(createTransitionsState18());
trans.addAll(createTransitionsState19());
trans.addAll(createTransitionsState20());
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
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 10, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 3, new IntPred(22, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 12, new IntPred(55, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 6, new IntPred(149, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 18, new IntPred(245, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 13, new IntPred(251, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 17, new IntPred(335, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 11, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 1, new IntPred(411, 428), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(1, 2, new IntPred(429, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState2() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 18, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 17, new IntPred(22, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 10, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 6, new IntPred(245, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 3, new IntPred(251, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 15, new IntPred(335, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 14, new IntPred(357, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 12, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(2, 20, new IntPred(429, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState3() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 14, new IntPred(22, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 10, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 3, new IntPred(149, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 7, new IntPred(245, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 15, new IntPred(251, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 19, new IntPred(335, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 20, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 9, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(3, 5, new IntPred(429, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState4() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 15, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(22, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 18, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 11, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 20, new IntPred(245, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 2, new IntPred(251, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 8, new IntPred(335, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 3, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 4, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(4, 17, new IntPred(429, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState5() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 12, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 13, new IntPred(22, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(55, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 14, new IntPred(149, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(245, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 16, new IntPred(251, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 19, new IntPred(335, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(357, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(5, 18, new IntPred(429, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState6() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 8, new IntPred(22, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 5, new IntPred(55, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 10, new IntPred(149, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 20, new IntPred(245, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 15, new IntPred(251, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 16, new IntPred(335, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 9, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(6, 14, new IntPred(429, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState7() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 12, new IntPred(22, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 7, new IntPred(55, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 1, new IntPred(149, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 16, new IntPred(245, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 15, new IntPred(251, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 8, new IntPred(335, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 3, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 20, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(7, 13, new IntPred(429, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState8() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 7, new IntPred(22, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 16, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 3, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 1, new IntPred(245, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(251, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 20, new IntPred(335, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 2, new IntPred(357, 410), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 13, new IntPred(411, 428), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(8, 8, new IntPred(429, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState9() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(22, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 10, new IntPred(149, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(245, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 2, new IntPred(251, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 14, new IntPred(335, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 9, new IntPred(357, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 8, new IntPred(411, 428), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(9, 16, new IntPred(429, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState10() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 15, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 14, new IntPred(22, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 5, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 20, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 7, new IntPred(245, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(251, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 13, new IntPred(335, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 2, new IntPred(357, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 17, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(10, 18, new IntPred(429, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState11() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 3, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 18, new IntPred(22, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 4, new IntPred(55, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 20, new IntPred(245, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 1, new IntPred(251, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(335, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 13, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 11, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(11, 19, new IntPred(429, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState12() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(22, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 4, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(149, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(245, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 10, new IntPred(251, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 14, new IntPred(335, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 13, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 12, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(12, 16, new IntPred(429, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState13() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 10, new IntPred(22, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 5, new IntPred(55, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(149, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(245, 250), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 11, new IntPred(251, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 8, new IntPred(335, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 3, new IntPred(357, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 20, new IntPred(411, 428), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(13, 17, new IntPred(429, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState14() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 15, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 2, new IntPred(22, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 17, new IntPred(55, 148), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 5, new IntPred(245, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(251, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 14, new IntPred(335, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 11, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 18, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(14, 7, new IntPred(429, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState15() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 4, new IntPred(22, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 3, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(245, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(251, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(335, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 15, new IntPred(357, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 5, new IntPred(411, 428), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(15, 12, new IntPred(429, null), 'a'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState16() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 4, new IntPred(0, 21), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 9, new IntPred(22, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 13, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 20, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 8, new IntPred(245, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 6, new IntPred(251, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 7, new IntPred(335, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 10, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 2, new IntPred(411, 428), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(16, 18, new IntPred(429, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState17() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(22, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(55, 148), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 13, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 9, new IntPred(245, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 16, new IntPred(251, 334), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 3, new IntPred(335, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 5, new IntPred(357, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 19, new IntPred(411, 428), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(17, 20, new IntPred(429, null), 'b'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState18() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 13, new IntPred(0, 21), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 11, new IntPred(22, 54), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 8, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 4, new IntPred(149, 244), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 7, new IntPred(245, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 5, new IntPred(251, 334), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 20, new IntPred(335, 356), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 17, new IntPred(357, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 15, new IntPred(411, 428), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(18, 14, new IntPred(429, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState19() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 11, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 14, new IntPred(22, 54), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 12, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 7, new IntPred(149, 244), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(245, 250), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 17, new IntPred(251, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 8, new IntPred(335, 356), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 10, new IntPred(357, 410), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 1, new IntPred(411, 428), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(19, 16, new IntPred(429, null), 'c'));
return trans;
}

private static List<SFAMove<IntPred, Integer>> createTransitionsState20() {
List<SFAMove<IntPred, Integer>> trans = new ArrayList<SFAMove<IntPred, Integer>>();
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 12, new IntPred(0, 21), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(22, 54), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 15, new IntPred(55, 148), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(149, 244), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(245, 250), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 8, new IntPred(251, 334), 'c'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 20, new IntPred(335, 356), 'a'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 4, new IntPred(357, 410), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 9, new IntPred(411, 428), 'b'));
trans.add(new SMAInputMove<IntPred, Integer, Character>(20, 11, new IntPred(429, null), 'a'));
return trans;
}

}