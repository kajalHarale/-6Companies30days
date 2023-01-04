// Java implementation of the approach
class inequality
{

// Function to return the number of
// pairs satisfying the equation
static int countPair(int a, int b)
{
	// Converting integer b to String
	// by using to_String function
	String s = String.valueOf(b);

	// Loop to check if all the digits
	// of b are 9 or not
	int i;
	for (i = 0; i < s.length(); i++)
	{

		// If '9' doesn't appear
		// then break the loop
		if (s.charAt(i) != '9')
			break;
	}

	int result;

	// If all the digits of b contain 9
	// then multiply a with String length
	// else multiply a with String length - 1
	if (i == s.length())
		result = a * s.length();
	else
		result = a * (s.length() - 1);

	// Return the number of pairs
	return result;
}

// Driver code
public static void main(String[] args)
{
	int a = 5, b = 101;

	System.out.print(countPair(a, b));
}
}

// This code is contributed by PrinciRaj1992
