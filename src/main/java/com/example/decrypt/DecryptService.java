package com.example.decrypt;

import org.springframework.stereotype.Service;

@Service
public class DecryptService {

  public DecryptService(ListProperties listProperties) {
    listProperties
        .getList()
        .forEach(listItem -> System.out.println(listItem.getPlain() + " " + listItem.getCipher()));
  }
}
