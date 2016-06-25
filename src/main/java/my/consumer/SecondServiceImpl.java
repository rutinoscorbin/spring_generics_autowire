package my.consumer;

import org.springframework.stereotype.Component;

@Component("secondService")
public class SecondServiceImpl extends BaseService implements SecondService<PayableThing,PayableThingForm<PayableThing>> {

}