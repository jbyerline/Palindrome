class Pal {


    public static void main(String[] args) {

        char front, back
        boolean result = false

        Scanner sc = new Scanner(System.in)

        System.out.println("******* Palindrome Finder *******")

        // Read in String
        System.out.println("Enter a String: ")
        String str = sc.next()

        // Make String lower case
        str = str.toLowerCase()
        // Find reverse of that String
        String rev = str.reverse()

        // Iterate through both Strings
        for(int i = 0; i < str.length(); i++){
            front = str.charAt(i)
            back = rev.charAt(i)

            // Visualization Test
            System.out.println("Comparing " + front + " and " + back )

            // While front == back, return true
            if(front.equals(back)){
                result = true
            }
            // Else, return false
            else{
                result = false
                // Break if ever false
                break
            }
        }
        // Print results
        if(result == true){
            System.out.println(str + " is a palindrome")
        }
        else{
            System.out.println(str + " is not a palindrome")
        }
    }
}
