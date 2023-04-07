package org.opennms.integration.tmf621.camel.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.xml.bind.annotation.*;

import java.util.*;
import javax.annotation.Generated;

/**
 * Holds the status notification reasons and associated date the status changed, populated by the server
 */

@Schema(name = "StatusChange", description = "Holds the status notification reasons and associated date the status changed, populated by the server")
@JacksonXmlRootElement(localName = "StatusChange")
@XmlRootElement(name = "StatusChange")
@XmlAccessorType(XmlAccessType.FIELD)

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-04-07T13:45:44.384647300+01:00[Europe/London]")
public class StatusChange {

  @JacksonXmlProperty(localName = "changeDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date changeDate;

  @JacksonXmlProperty(localName = "changeReason")
  private String changeReason;

  @JacksonXmlProperty(localName = "status")
  private String status;

  @JacksonXmlProperty(localName = "@baseType")
  private String atBaseType;

  @JacksonXmlProperty(localName = "@schemaLocation")
  private URI atSchemaLocation;

  @JacksonXmlProperty(localName = "@type")
  private String atType;

  public StatusChange changeDate(Date changeDate) {
    this.changeDate = changeDate;
    return this;
  }

  /**
   * The date and time the status changed.
   * @return changeDate
  */
  @Valid 
  @Schema(name = "changeDate", description = "The date and time the status changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeDate")
  public Date getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(Date changeDate) {
    this.changeDate = changeDate;
  }

  public StatusChange changeReason(String changeReason) {
    this.changeReason = changeReason;
    return this;
  }

  /**
   * The reason why the status changed.
   * @return changeReason
  */
  
  @Schema(name = "changeReason", description = "The reason why the status changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeReason")
  public String getChangeReason() {
    return changeReason;
  }

  public void setChangeReason(String changeReason) {
    this.changeReason = changeReason;
  }

  public StatusChange status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the trouble ticket
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the trouble ticket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StatusChange atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public StatusChange atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public StatusChange atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return atType
  */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class entity name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusChange statusChange = (StatusChange) o;
    return Objects.equals(this.changeDate, statusChange.changeDate) &&
        Objects.equals(this.changeReason, statusChange.changeReason) &&
        Objects.equals(this.status, statusChange.status) &&
        Objects.equals(this.atBaseType, statusChange.atBaseType) &&
        Objects.equals(this.atSchemaLocation, statusChange.atSchemaLocation) &&
        Objects.equals(this.atType, statusChange.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeDate, changeReason, status, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusChange {\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

