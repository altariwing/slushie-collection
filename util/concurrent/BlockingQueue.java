@Component
public class UpdateUserLoginTimeTask {

    /**
     * using singleton queue(spring framework bean or something)
     * */
    @Autowired
    private BlockingQueue<UserLoginTimeEntity> sharedQueue;

    public UpdateUserLoginTimeTask(BlockingQueue<UserLoginTimeEntity> aQueue) {
        this.sharedQueue = aQueue;
    }

    @Scheduled(fixedDelay = 60 * 1000, initialDelay = 1000)
    public void run() {
        try {
            while (sharedQueue.size() > 0) {
                UserLoginTimeEntity user = sharedQueue.take();
                if (1 != userMapper.updateLoginTime(user)) {
                    sharedQueue.put(user);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class XXXService {
    public void login(){
        //使用者登入時間
        sharedQueue.put(new UserLoginTimeEntity(userID, loginTime));
    }
}        

public class UserLoginTimeEntity {

    private Integer userID;
    private Long lastLoginTime;

    public UserLoginTimeEntity() {
    }

    public UserLoginTimeEntity(Integer userID, Long lastLoginTime) {
        this.userID = userID;
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
