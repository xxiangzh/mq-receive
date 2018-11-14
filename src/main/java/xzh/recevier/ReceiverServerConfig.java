package xzh.recevier;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * 进行绑定
 * @author 向振华
 * @date 2018/10/24 13:55
 */
@EnableBinding({ReceiverChannel.class})
public class ReceiverServerConfig {

    @StreamListener(ReceiverChannel.SCORE_INPUT)
    public void receive(Object o) {
        //如果需要接受指定实体类，这里Object换成实体对象
        System.out.println("receive接收消息："+o);
    }

//    /*转发*/
//    @SendTo(/*其他通道*/)
//    @StreamListener(/*接受通道*/)
//    public String sendTo(Object o) {
//        return "sendTo";
//    }

}