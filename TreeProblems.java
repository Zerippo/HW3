/*
 *   Joshua Kao  /   COMP 272/400 001
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    Set<Integer> result = new TreeSet<>(setA);  // Create a temporary TreeSet to hold the elements
    result.addAll(setB);   // Add all elements from setB to the result
    Set<Integer> common = new TreeSet<>(setA);  // Create another TreeSet to hold the common elements
    common.retainAll(setB);    // Retain only the elements that are also in setB
    result.removeAll(common);  // Remove the common elements from the result
      
    return result;
  }

  
  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
      // Create an iterator to iterate over the entry set of the treeMap
      Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
      // Iterate through the entries
      while (iterator.hasNext()) {
          Map.Entry<Integer, String> entry = iterator.next();
          // If the key is even, remove the entry
          if (entry.getKey() % 2 == 0) {
              iterator.remove();
          }
      }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    
    return tree1.equals(tree2);

  }

} // end treeProblems class
