package cn.tedu.csmall.server.POJO.VO;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AlbumListItemVO implements Serializable {
   private Long id;
   private String name;
   private String description;
   private Integer sort;

}
