package cn.com.tcsl.crm7demo;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.List;

public abstract class String2ListAdapter<T> extends TypeAdapter<List<T>> {

    @Override
    public void write(JsonWriter out, List<T> list) throws IOException {
        if (list == null) {
            out.jsonValue("\"\"");
            return;
        }
        String json = JsonUtils.createJson(list);
        out.jsonValue(new StringBuffer("\"").append(json.replace("\"", "\\\"")).append("\"").toString());
    }

    @Override
    public abstract List<T> read(JsonReader in) throws IOException;
}
