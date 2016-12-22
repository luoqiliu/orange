package com.miaoheng.orange.controller;

import com.miaoheng.orange.common.ErrorCode;
import com.miaoheng.orange.common.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luoqi on 16/12/6.
 */
@RestController
@RequestMapping("/bat")
public class BatController {

    @RequestMapping("/run/{batId}")
    public Result<Boolean> runBat(@PathVariable("batId") long batId) {
        if (batId <= 0) {
            return new Result().error(ErrorCode.INVALID_PARAM);
        }
        return new Result().success(true);
    }

}
