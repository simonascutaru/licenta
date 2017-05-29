package com.fii.uaic.repository;


import com.fii.uaic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sscutaru on 1/25/2017.
 */
//@Repository
//@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String userName);

//    List<User> findAll();

//    public User getUserById(long id){
//        int int_id = intValue(id);
//        return em().createNamedQuery(User.GET_USER_BY_ID).getResultList();
//    }

//    private static Map<Long, User> users;
//    static {
//
//        users = new HashMap<Integer, User>(){
//
//            {
//                put(1, new User("Said", "Smith", "mail@mail.com", "password"));
//                put(2, new User("Alex", "Smith","mail@mail.com", "password"));
//                put(3, new User("Anna", "Smith","mail@mail.com", "password"));
//            }
//        };
//    }

//    public Collection<User> getAllUsers(){
//        return this.users.values();
//    }
//
//    public User getUserById(long id){
//        return this.users.get(id);
//    }
//
//    public void removeUserById(long id) {
//        this.users.remove(id);
//    }
//
//    public void updateUser(User user){
//        User u = users.get(user.getUserId());
//        u.setUserName(user.getUserName());
//        u.setUserEmail(user.getUserEmail());
//        u.setUserPassword(user.getUserPassword());
//        u.setRole(user.getRole());
//        users.put(user.getUserId(), user);
//    }
//
//    public void insertUserToDb(User user) {
//        this.users.put(user.getUserId(), user);
//    }
}
