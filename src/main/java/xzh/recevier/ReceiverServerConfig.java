package xzh.recevier;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * 进行绑定
 * @author 向振华
 * @date 2018/10/24 13:55
 */
@EnableBinding({ReceiverChannel.class})
public class ReceiverServerConfig {

    @StreamListener(ReceiverChannel.SCORE_INPUT)
    public void receive(Object o) {
        System.out.println("接收消息："+o);
    }
}