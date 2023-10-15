package patern.home.proxy2;

import java.util.HashMap;
import java.util.Map;

public class SiteProxy implements ISite{
    private ISite site;
    private Map<Integer,String> cache;
    public SiteProxy(ISite site){
        this.site=site;
        cache=new HashMap<>();
    }
    public String getPage(int num){
        String page;
        if (cache.containsKey(num)){
            page=cache.get(num);
            page="сторінка з кешу "+page;
        }else {
            page=site.getPage(num);
            cache.put(num,page);
        }
        return page;
    }
}
