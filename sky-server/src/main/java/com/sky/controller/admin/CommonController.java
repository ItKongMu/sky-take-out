package com.sky.controller.admin;

import com.sky.constant.MessageConstant;
import com.sky.result.Result;
import com.sky.utils.AliOssUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/admin/common")
@Api(tags = "公共接口")
@Slf4j
public class CommonController {

    @Autowired
    private AliOssUtil aliOssUtil;

    /**
     * 文件上传
     * @return
     */
    @PostMapping("/upload")
    @ApiOperation(value = "文件上传")
    public Result<String> upload(@RequestBody MultipartFile file) {
        log.info("文件上传,{}",file);

        String url = aliOssUtil.upload(file);
        if (url!= null) {
            return Result.success(url);
        } else {
            return Result.error(MessageConstant.UPLOAD_FAILED);
        }

    }
}
