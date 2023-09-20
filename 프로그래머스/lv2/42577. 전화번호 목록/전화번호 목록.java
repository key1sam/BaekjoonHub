// String1.startsWith(String2)
// String1이 Staring2로 시작되는지 찾아준다.

import java.util.*;

class Solution {
    public boolean solution(String[] phoneBook) {
        // 1. phoneBook을 sorting한다.
        Arrays.sort(phoneBook);

        // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phoneBook.length - 1; i++)
            if (phoneBook[i + 1].startsWith(phoneBook[i]))
                return false;
        
        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return true;
    }
}