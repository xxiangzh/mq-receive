package xzh.recevier;

import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * 进行绑定
 * @author 向振华
 * @date 2018/10/24 13:55
 */
@EnableBinding({ReceiverChannel.class})
public class ReceiverServerConfig {
}