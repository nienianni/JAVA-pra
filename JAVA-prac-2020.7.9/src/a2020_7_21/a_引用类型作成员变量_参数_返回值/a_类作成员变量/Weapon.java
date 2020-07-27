package a2020_7_21.a_引用类型作成员变量_参数_返回值.a_类作成员变量;

public class Weapon {

    private String code; // 武器的代号

    public Weapon() {
    }

    public Weapon(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
