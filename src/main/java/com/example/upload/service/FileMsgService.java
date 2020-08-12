package com.example.upload.service;

import com.example.upload.entity.FileMsg;
import com.example.upload.mapper.FileMagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 学无止境~冲
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FileMsgService {

    @Autowired
    private FileMagMapper fileMagMapper;

    public boolean add(FileMsg fileMsg) throws Exception {
        return this.fileMagMapper.insertFile(fileMsg) > 0;
    }

}
