# Recursion-Binary-Search

1. Task 1 – Recursion Trace
Use the example array:

{10, 20, 30, 40, 50}
Target: 40

Call	low	high	mid	array[mid]	Action
1	0	4	2	30	Target 40 > 30 → search right half
2	3	4	3	40	Target 40 = 40 → found

Final result: Target found at index 3.

This follows the activity's requirement to record low, high, mid, array[mid], and the action for each recursive call.

2. Task 2 – Modified Program

Your Java program should:

Ask for the number of elements.
Ask for the elements.
Sort the array in ascending order.
Ask for the target.
Perform recursive binary search.
Display the target's index or -1.

The activity specifically requires the array to be sorted before binary search.

Use the filename:

BinarySearch.java

3. Task 3 – Search Trace

Use a modified version named:

BinarySearchTrace.java

It should display something like:

Recursive Search Trace:
binarySearch(0, 4, 40)
  mid = 2, array[mid] = 30
  target > array[mid] -> search right half

binarySearch(3, 4, 40)
  mid = 3, array[mid] = 40
  target found -> return 3

Target found.
Index: 3

This clearly demonstrates that the search interval becomes smaller after each recursive call, which is exactly what Task 3 asks for.

4. Task 4 – Explanation

The recursive binary search returns the index of the target when the target is found, and it returns -1 when the target does not exist in the array.

The first base case is when array[mid] == target. In this situation, the target has been found, so the method returns mid, which is the index of the target.

The second base case is when low > high. This means that there are no more elements left to search, so the target was not found. The method returns -1.

If the target is smaller than array[mid], the method recursively searches the left half using binarySearch(array, low, mid - 1, target). If the target is larger, it searches the right half using binarySearch(array, mid + 1, high, target). The return value from the recursive call is passed back to the previous call using the return statement until the original method call receives the final index or -1.

5. Test Cases

The document provides these expected results.

Test	Target	Expected Output
1	30	Found, Index 2
2	10	Found, Index 1
3	44	Not found, Index -1
4	10	Not found, Index -1
5	50	Found, Index 4

For Test Case 5, the input is unsorted:

40 10 70 20 50 30 60

After sorting:

10 20 30 40 50 60 70

Therefore, 50 is at index 4.

6. Questions

1. What are the three laws of recursion? Briefly describe each law.

The three laws of recursion are: first, a recursive algorithm must have a base case. Second, the algorithm must change its state and move toward the base case. Third, the algorithm must call itself recursively. These laws make sure that the recursive process can eventually stop.

2. In the recursive binary search algorithm, what are the purposes of the variables low, high, and mid?

low represents the starting index of the current search interval, while high represents the ending index. mid represents the middle index between low and high. These variables help the algorithm determine which half of the array should be searched next.

3. What are the two conditions that can cause the recursive binary search to stop? Explain what happens in each condition.

The first condition is when array[mid] == target. The target has been found, so the algorithm returns its index. The second condition is when low > high. This means the search interval is empty, so the target is not present and the algorithm returns -1.

4. Why must the array be sorted before performing binary search? What could happen if an unsorted array is provided?

The array must be sorted because binary search decides whether to search the left or right half based on the comparison with the middle element. If the array is unsorted, this decision may be incorrect and the algorithm can return the wrong result or fail to find an existing value.

5. In Java, what is the difference between an array's index and its position? Give an example using {10, 20, 30, 40, 50}.

An array index is the number used by Java to identify an element, and indexing starts at 0. The position is normally counted starting from 1. For example, in {10, 20, 30, 40, 50}, the value 30 is at index 2 but is in position 3.

6. A student modifies the recursive binary search program but accidentally writes the recursive call without changing low or high. Explain why this can cause a program to repeatedly call itself without reaching the base case. Which of the three laws has been violated?

If low and high do not change, the search interval does not become smaller. Therefore, the same method can repeatedly call itself with the same values and may never reach the base case. This violates the second law of recursion because the state must change and move toward the base case.

8. A student claims that: “binary search is better than linear search because binary search checks fewer elements.” Do you agree or disagree?

I agree that binary search can be faster because it eliminates about half of the remaining elements during each search. However, binary search requires a sorted sequence. Linear search can be more appropriate when the data is unsorted, small, or when sorting the data first would take more time than simply checking the elements one by one.

9. The program works correctly when the user enters a sorted array, but produces incorrect results when the user enters an unsorted array. What happens, and how would you modify the program?

An unsorted array can cause binary search to make incorrect decisions about which half contains the target. I would automatically sort the array before performing the search because this makes the program easier for the user and guarantees that the binary search receives the sorted sequence it requires.

10. How could you modify the program to automatically sort an unsorted array before performing binary search? What additional problem must you consider if the program is required to return the original index of the target?

The program can use Arrays.sort(array) before calling the recursive binary search. However, sorting changes the order of the elements, so the returned index belongs to the sorted array rather than the original array. If the original index is required, the program should keep track of each element's original index while sorting, for example by storing value-index pairs.

11. When do you think recursion is an appropriate solution to a programming problem, and when might an iterative solution be preferable?

I think recursion is appropriate when a problem can naturally be divided into smaller versions of itself, such as binary search. Recursion can make the algorithm easier to understand and write. However, an iterative solution may be preferable when the problem requires many repetitions or when avoiding additional function calls and stack usage is important.

These answers follow the questions and concepts presented in your laboratory document.

7. AI Disclosure Statement
1. Name of AI tool and version:
OpenAI ChatGPT, GPT-5.6 Luna.

2. Task performed by the AI tool:
The AI was used to assist with understanding the recursion and binary search activity, drafting Java source code, creating explanations, preparing recursion traces, and answering the laboratory questions.

3. Extent of use:
The AI provided substantial assistance in drafting and explaining parts of the laboratory activity.

4. Human verification:
I reviewed and verified the AI-assisted answers and source code and made sure that I understood the submitted program.

5. Why and how was AI used?
AI was used as a learning and programming assistance tool to help me understand recursive binary search, trace the recursive calls, identify the base cases, and organize my answers. I also used it to help identify errors and improve the clarity of my explanations.

6. Estimated percentage assisted by AI:
Approximately 70%.

7. Changes made to the AI-generated output:
I reviewed the answers, adjusted the information to match the laboratory instructions and test cases, and made changes to the program and explanations where necessary.

8. What have I learned from using the tool?
I learned how recursive binary search reduces the search interval, how low, high, and mid work, how a recursive method returns a value, and why a base case and a changing state are important in recursion.
