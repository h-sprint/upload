package com.example.upload.mapper;

import com.example.upload.entity.FileMsg;
import org.springframework.stereotype.Component;

/**
 * @author 学无止境~冲
 */
@Component("FileMagMapper")
public interface FileMagMapper {

    /**
     * 写入文件信息
     *
     * @param fileMsg
     * @return int
     */
    int insertFile(FileMsg fileMsg);
}
