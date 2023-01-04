// Java program to find length of the longest
// prefix which is also suffix
class longestPath
{
	
// Function to find largest prefix
// which is also a suffix
static int longestPrefixSuffix(String s)
{
	int n = s.length();

	// If n is less than 2
	if(n < 2) {
		return 0;
	}

	int len = 0;
	int i = (n + 1)/2;

	// Iterate i till n
	while(i < n)
	{

		// If s.charAt(i) is equal to
		// s.charAt(len)
		if(s.charAt(i) == s.charAt(len))
		{
		++len;
		++i;
		}
		else
		{
		i = i - len + 1;
		len = 0;
		}
	}

	// Return len
	return len;

}
	
	// Driver code
public static void main (String[] args)
{
	String s = "abcaabc";
	System.out.println(longestPrefixSuffix(s));
}
}

// This code is contributed by Anant Agarwal.
