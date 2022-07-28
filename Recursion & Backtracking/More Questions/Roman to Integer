class Solution {
    public int romanToInt(String num) {
        if (num.length() == 0)
      return 0;

    if (num.charAt(0) == 'M')
      return 1000 + romanToInt(num.substring(1));

    if (num.charAt(0) == 'D')
      return 500 + romanToInt(num.substring(1));

    if (num.charAt(0) == 'C') {
      if (num.length() == 1)
        return 100;
      if (num.charAt(1) == 'M')
        return 900 + romanToInt(num.substring(2));
      if (num.charAt(1) == 'D')
        return 400 + romanToInt(num.substring(2));
      return 100 + romanToInt(num.substring(1));
    }

    if (num.charAt(0) == 'L')
      return 50 + romanToInt(num.substring(1));

    if (num.charAt(0) == 'X') {
      if (num.length() == 1)
        return 10;
      if (num.charAt(1) == 'C')
        return 90 + romanToInt(num.substring(2));
      if (num.charAt(1) == 'L')
        return 40 + romanToInt(num.substring(2));
      return 10 + romanToInt(num.substring(1));
    }

    if (num.charAt(0) == 'V')
      return 5 + romanToInt(num.substring(1));

    if (num.length() == 1)
      return 1;
    if (num.charAt(1) == 'X')
      return 9 + romanToInt(num.substring(2));
    if (num.charAt(1) == 'V')
      return 4 + romanToInt(num.substring(2));
    return 1 + romanToInt(num.substring(1));
    }
}