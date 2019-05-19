package model;

public class Heroes {

    private String _Id;
    private String name;
    private String desc;

    public Heroes(String _Id, String name, String desc) {
        this._Id = _Id;
        this.name = name;
        this.desc = desc;
    }

    public Heroes(String name, String desc) {
    }

    public String get_Id() {
        return _Id;
    }

    public void set_Id(String _Id) {
        this._Id = _Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
