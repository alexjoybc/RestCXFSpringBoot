package io.fabric8.quickstarts.cxf.jaxrs;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Error  {
  
  @ApiModelProperty(example = "null", value = "")
  private Integer code = null;
  @ApiModelProperty(example = "null", value = "")
  private String message = null;
  @ApiModelProperty(example = "null", value = "")
  private String fields = null;

 /**
   * Get code
   * @return code
  **/
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }
 /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
 /**
   * Get fields
   * @return fields
  **/
  public String getFields() {
    return fields;
  }
  public void setFields(String fields) {
    this.fields = fields;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
