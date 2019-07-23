package com.slxsm.sb;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "sls")
public class SlxsmAbc {

    private List<String> abc = new ArrayList<>();

/*    private String[] def;*/

    public List<String> getAbc() {
        return abc;
    }

    public void setAbc(List<String> abc) {
        this.abc = abc;
    }

    /*public String[] getDef() {
        return def;
    }

    public void setDef(String[] def) {
        this.def = def;
    }*/

    @Override
    public String toString() {
        return "SlxsmAbc{" +
                "abc=" + abc +
                /*", def=" + Arrays.toString(def) +*/
                '}';
    }
}
