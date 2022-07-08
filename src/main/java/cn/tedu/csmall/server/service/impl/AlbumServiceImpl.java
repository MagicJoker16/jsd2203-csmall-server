package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.POJO.DTO.AlbumAddNewDTO;
import cn.tedu.csmall.server.POJO.entity.Album;
import cn.tedu.csmall.server.ex.ServiceException;
import cn.tedu.csmall.server.mapper.AlbumMapper;
import cn.tedu.csmall.server.repo.impl.AlbumRepositoryImpl;
import cn.tedu.csmall.server.service.IAlbumService;
import cn.tedu.csmall.server.web.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AlbumServiceImpl implements IAlbumService {
    @Autowired
    public AlbumRepositoryImpl albumRepository;

    @Autowired
    private AlbumMapper albumMapper;

    public AlbumServiceImpl() {
        log.debug("创建业务逻辑对象：AlbumServiceImpl");
    }


    @Override
    public void addNew(AlbumAddNewDTO albumAddNewDTO) {
        log.debug("开始处理添加相册任务",albumAddNewDTO);

        String name = albumAddNewDTO.getName();
        int count = albumMapper.countByName(name);
        if(count>0){
            String message = "增加类别失败 类别名称["+name+"]已经被占用";
            log.error(message);
            throw new ServiceException(ServiceCode.ERR_CONFLICT,message);
        }


        Album album = new Album();
        //将当前方法参数的值复制到album实体类型的对象中
        BeanUtils.copyProperties(albumAddNewDTO, album);
        log.debug("即将向数据库中写入，数据：{}", album);
        //将相册数据写入到数据库中
        albumMapper.insert(album);
    }





}
