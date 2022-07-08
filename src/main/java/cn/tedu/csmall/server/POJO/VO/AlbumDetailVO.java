package cn.tedu.csmall.server.POJO.VO;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AlbumDetailVO implements Serializable {
   private Long id;
   private String name;
   private String description;
   private Integer sort;

}
