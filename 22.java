public class Solution {
private void helper(List<String> res, String present, int left, int right) {
    if (right == 0) {
        res.add(present);
    }
    if (left > 0) {
        helper(res, present + "(", left - 1, right);
    }
    if (right > left) {
        helper(res, present + ")", left, right - 1);
    }
}
public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<String>();
    if (n == 0) {
        return res;
    }
    helper(res, "", n, n);
    return res;
}
}
