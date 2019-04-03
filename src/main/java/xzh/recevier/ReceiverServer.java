package xzh.recevier;

import com.mmtvip.ybbankapi.message.notify.R00001;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @author 向振华
 * @date 2019/04/03 11:29
 */
@Service
public class ReceiverServer {

    @StreamListener(ReceiverChannel.INPUT)
    public void receive(R00001 o) {
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
