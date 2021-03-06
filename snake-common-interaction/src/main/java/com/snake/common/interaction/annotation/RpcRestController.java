package com.snake.common.interaction.annotation;

import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

/**
 * rpc请求注解
 * @author snake
 * @date 2021/03/05
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Rpc
@RestController
public @interface RpcRestController {
}
