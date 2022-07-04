package cn.tedu.csmall.server.POJO.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class Album  implements Serializable {
   private Long id;
   private String name;
   private String description;
   private Integer sort;
   private LocalDateTime gmtCreate;
   private LocalDateTime gmtModified;
}
