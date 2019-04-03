package xzh.recevier;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 定义接口
 * @author 向振华
 * @date 2018/10/24 13:54
 */
public interface ReceiverChannel {

    String INPUT = "R00001Input";

    @Input(ReceiverChannel.INPUT)
    SubscribableChannel input();
}
