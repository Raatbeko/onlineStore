package online.jasper.data;

import java.util.Map;

public class ReportRequestHolder {

    public static ReportRequestHolder of(String path, Map<String, Object> data) {
        return new ReportRequestHolder()
                .setPath(path)
                .setData(data);
    }

    private String path;
    private Map<String, Object> data;

    public ReportRequestHolder() {
    }

    public String getPath() {
        return path;
    }

    public ReportRequestHolder setPath(String path) {
        this.path = path;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public ReportRequestHolder setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }

}
