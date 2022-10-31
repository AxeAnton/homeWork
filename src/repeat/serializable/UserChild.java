package repeat.serializable;

import java.io.Serializable;

public class UserChild extends User /*implements Serializable*/ {
    int childLevel;


    public UserChild(int lifeValue) {
        super(lifeValue);

    }
}
