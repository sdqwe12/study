package com.mh.restaoi05.member;

public enum Role {
    USER,ADMIN;

    public static Role fromString(String userrole){
        for (Role role : Role.values()){
            if (role.toString().equalsIgnoreCase(userrole)){
                return role;
            }
        }
        //여기까지 오면 user도 아니고 admin도 아닌 이상한 userole
        return null;
    }
}
