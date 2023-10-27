package com.example.fansi.POJO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private long id;
  private String username;
  private String password;
  private String avatar;
  private String email;
  private String phone;

}
