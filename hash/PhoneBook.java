package hash;

import java.util.*;

class PhoneBook {
    public boolean solution(String[] phone_book) {

        HashSet<String> set = new HashSet<>();

        for(String p : phone_book){
            set.add(p);
        }

        for(String phone : phone_book){
            for(int i = 1; i < phone.length(); i++){
                if(set.contains(phone.substring(0, i))){
                    return false;
                }
            }
        }

        return true;
    }
}
