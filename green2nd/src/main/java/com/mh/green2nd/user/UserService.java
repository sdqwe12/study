package com.mh.green2nd.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User login(String email, String password) {
        Optional<User> loginuser = userRepository.findByEmailAndPassword(email,password);
        if (loginuser.isEmpty()){
            throw new RuntimeException(" ʕ •ᴥ•ʔ ━☆ﾟ 검색된 유저가 없습니다. ʕ •ᴥ•ʔ ━☆");
        }
        else if (loginuser.get().getResign().equals(Resign.Y)) {
            throw new RuntimeException(" ʕ •ᴥ•ʔ ━☆ﾟ 이미 탈퇴한 계정입니다. ʕ •ᴥ•ʔ ━☆");
        }
        else {
            return loginuser.get();
        }

    }

    public User signup(User user) {
        User duemail = userRepository.findByEmail(user.getEmail());
        User dunickname = userRepository.findByNickname(user.getNickname());

//        Optional<User>
        if (duemail != null){
            throw new RuntimeException(" ʕ •ᴥ•ʔ ━☆ 중복된 이메일이 있습니다. ʕ •ᴥ•ʔ ━☆");
            //에러코드 제작예정
        }
        if(dunickname != null){
            throw new RuntimeException(" ʕ •ᴥ•ʔ ━☆ 중복된 닉네임이 있습니다. ʕ •ᴥ•ʔ ━☆");
        }
        else {
            User signupUser = userRepository.save(user);

            return signupUser;
    }
        }

    public String resignuser(String email) {
        User user = userRepository.findByEmail(email);
        user.setResign(Resign.Y);
        userRepository.save(user);
        return "ʕ •ᴥ•ʔ ━☆ﾟ 탈퇴 완료되었습니다. ʕ •ᴥ•ʔ ━☆ﾟ";
    }

    public User update(User user) {
        User updateUser = userRepository.findByEmail(user.getEmail());
        User updaterUser = userRepository.save(updateUser);
        return updaterUser;
    }
}
