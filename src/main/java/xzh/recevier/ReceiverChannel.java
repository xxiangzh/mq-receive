package xzh.recevier;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 定义接口
 * @author 向振华
 * @date 2018/10/24 13:54
 */
public interface ReceiverChannel {

    String SCORE_INPUT = "mqScoreInput";

    @Input(ReceiverChannel.SCORE_INPUT)
    SubscribableChannel scoreInput();
}
