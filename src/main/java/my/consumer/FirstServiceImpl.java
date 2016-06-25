package my.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("firstService")
public class FirstServiceImpl extends BaseService implements FirstService {
    @Autowired
    @Qualifier("secondService")
    private SecondService<Shoes, ShoesPayableThingForm> secondService;

}
