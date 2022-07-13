package sk.best.newtify.api.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Gets or Sets ETopicType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-13T16:30:07.948661900+02:00[Europe/Prague]")
public enum ETopicType {
  
  NEWS("NEWS"),
  
  GAMING("GAMING"),
  
  FASHION("FASHION"),
  
  FINANCE("FINANCE"),
  
  MOVIE("MOVIE"),
  
  MUSIC("MUSIC");

  private String value;

  ETopicType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ETopicType fromValue(String value) {
    for (ETopicType b : ETopicType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

