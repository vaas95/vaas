package com.qapitol;

import com.qapitol.sauron.data.reader.property.TestData;
import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${path}application.properties"})
public interface SouranSampleTestData extends TestData {

  @Key("username")
  String username();

  @Key("password")
  String password();

}
