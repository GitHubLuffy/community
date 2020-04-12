package life.majiang.community.cache;

import life.majiang.community.dto.TagDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: luffy
 * @Date: 2020-04-12 00:30
 * @Description:
 */

public class TagCache {
    public static List<TagDTO> get(){
        List<TagDTO> tagDTOS = new ArrayList<>();

        TagDTO frontEnd = new TagDTO();
        frontEnd.setCategoryName("前端");
        frontEnd.setTags(Arrays.asList("javascript","前端","vue.js","css","html","html5","node.js","react.js","jquery","css3","es6","typescript","chrome","npm","bootstrap","sass","less","chrome-devtools","firefox","angular","coffeescript","safari","postman","postcss","fiddler","yarn","webkit","firebug","edge"));
        tagDTOS.add(frontEnd);

        TagDTO backEnd = new TagDTO();
        backEnd.setCategoryName("后端");
        backEnd.setTags(Arrays.asList("php","java","node.js","python","c++","c","golang","spring","后端","springboot","django","flask","c#","swoole","ruby","asp.net","ruby-on-rails","scala","rust","lavarel","爬虫"));
        tagDTOS.add(backEnd);

        TagDTO mobileTerminal = new TagDTO();
        mobileTerminal.setCategoryName("移动端");
        mobileTerminal.setTags(Arrays.asList("java","android","ios","objective-c","小程序","swift","react-native","xcode","android-studio","webapp","flutter","kotlin"));
        tagDTOS.add(mobileTerminal);

        TagDTO database = new TagDTO();
        database.setCategoryName("数据库");
        database.setTags(Arrays.asList("mysql","redis","mongodb","sql","数据库","json","elasticsearch","nosql","memcached","postgresql","sqlite","mariadb"));
        tagDTOS.add(database);

        TagDTO Operations = new TagDTO();
        Operations.setCategoryName("运维");
        Operations.setTags(Arrays.asList("mysql","redis","mongodb","sql","数据库","json","elasticsearch","nosql","memcached","postgresql","sqlite","mariadb"));
        tagDTOS.add(Operations);

        TagDTO AI = new TagDTO();
        AI.setCategoryName("人工智能");
        AI.setTags(Arrays.asList("算法","机器学习","人工智能","深度学习","数据挖掘","tensorflow","神经网络","图像识别","人脸识别","自然语言处理","机器人","pytorch","自动驾驶"));
        tagDTOS.add(AI);

        TagDTO tools = new TagDTO();
        tools.setCategoryName("工具");
        tools.setTags(Arrays.asList("git","github","macos","visual-studio-code","windows","vim","sublime-text","intellij-idea","phpstorm","eclipse","webstorm","编辑器","svn","visual-studio","pycharm","emacs"));
        tagDTOS.add(tools);

        TagDTO others = new TagDTO();
        others.setCategoryName("其他");
        others.setTags(Arrays.asList("程序员","http","segmentfault","https","安全","websocket","restful","xss","区块链","csrf","graphql","rpc","比特币","以太坊","udp","智能合约"));
        tagDTOS.add(others);

        return tagDTOS;
    }
}

