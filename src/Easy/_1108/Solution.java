package Easy._1108;

//https://leetcode.com/problems/defanging-an-ip-address/submissions/

public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
