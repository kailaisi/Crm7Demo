package cn.com.tcsl.crm7demo;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CoupBeanListAdapter extends String2ListAdapter<CoupBean> {
    @Override
    public List<CoupBean> read(JsonReader in) throws IOException {
        if (in.hasNext()) {
            String arrayStr = in.nextString();
            List<CoupBean> list = JsonUtils.parseJson(arrayStr, new TypeToken<List<CoupBean>>() {
            });
            return list;
        }
        return new ArrayList<CoupBean>();
    }
}
