import com.huan.builder.BuilderUtil;

import java.io.File;

/**
 * Created by Administrator on 2016/12/3 0003.
 */
public class Main {
    public static void main(String[] args) {
        BuilderUtil.copyFile(new File("src\\app_config.xml"), new File("D:\\Tomcat7\\webapps\\testhhp\\app_config.xml"));
    }
}
