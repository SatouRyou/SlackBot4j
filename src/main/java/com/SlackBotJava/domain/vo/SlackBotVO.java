package com.SlackBotJava.domain.vo;

import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 * Created by teradashoutarou on 2016/09/18.
 */
@Data
public class SlackBotVO {

    private String url;
    private String attachments;
}
