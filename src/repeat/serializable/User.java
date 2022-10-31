package repeat.serializable;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    int lifeValue;
    static int staticFild;
    transient Sword sword; // transient поле не сереализуемое

    public User(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return lifeValue == user.lifeValue && sword.equals(user.sword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lifeValue, sword);
    }
}
