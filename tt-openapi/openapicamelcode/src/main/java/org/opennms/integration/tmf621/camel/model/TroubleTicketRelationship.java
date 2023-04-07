package org.opennms.integration.tmf621.camel.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
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
 * Represents a relationship between trouble Trouble Tickets
 */

@Schema(name = "TroubleTicketRelationship", description = "Represents a relationship between trouble Trouble Tickets")
@JacksonXmlRootElement(localName = "TroubleTicketRelationship")
@XmlRootElement(name = "TroubleTicketRelationship")
@XmlAccessorType(XmlAccessType.FIELD)

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-04-07T13:45:44.384647300+01:00[Europe/London]")
public class TroubleTicketRelationship {

  @JacksonXmlProperty(localName = "id")
  private String id;

  @JacksonXmlProperty(localName = "href")
  private String href;

  @JacksonXmlProperty(localName = "name")
  private String name;

  @JacksonXmlProperty(localName = "relationshipType")
  private String relationshipType;

  @JacksonXmlProperty(localName = "@baseType")
  private String atBaseType;

  @JacksonXmlProperty(localName = "@schemaLocation")
  private URI atSchemaLocation;

  @JacksonXmlProperty(localName = "@type")
  private String atType;

  public TroubleTicketRelationship id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the Trouble Ticket
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier of the Trouble Ticket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TroubleTicketRelationship href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the Trouble Ticket
   * @return href
  */
  
  @Schema(name = "href", description = "Reference of the Trouble Ticket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public TroubleTicketRelationship name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Trouble Ticket
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the Trouble Ticket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TroubleTicketRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of the  Trouble Ticket relationship can be isChiled, dependent etc...
   * @return relationshipType
  */
  
  @Schema(name = "relationshipType", description = "Type of the  Trouble Ticket relationship can be isChiled, dependent etc...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationshipType")
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public TroubleTicketRelationship atBaseType(String atBaseType) {
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

  public TroubleTicketRelationship atSchemaLocation(URI atSchemaLocation) {
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

  public TroubleTicketRelationship atType(String atType) {
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
    TroubleTicketRelationship troubleTicketRelationship = (TroubleTicketRelationship) o;
    return Objects.equals(this.id, troubleTicketRelationship.id) &&
        Objects.equals(this.href, troubleTicketRelationship.href) &&
        Objects.equals(this.name, troubleTicketRelationship.name) &&
        Objects.equals(this.relationshipType, troubleTicketRelationship.relationshipType) &&
        Objects.equals(this.atBaseType, troubleTicketRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, troubleTicketRelationship.atSchemaLocation) &&
        Objects.equals(this.atType, troubleTicketRelationship.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, relationshipType, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TroubleTicketRelationship {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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

