package org.opennms.integration.tmf621.camel.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.opennms.integration.tmf621.camel.model.AttachmentRefOrValue;
import org.opennms.integration.tmf621.camel.model.ChannelRef;
import org.opennms.integration.tmf621.camel.model.Note;
import org.opennms.integration.tmf621.camel.model.RelatedEntity;
import org.opennms.integration.tmf621.camel.model.RelatedParty;
import org.opennms.integration.tmf621.camel.model.TroubleTicketRelationship;
import org.opennms.integration.tmf621.camel.model.TroubleTicketStatusType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A trouble ticket is a record of an issue that is created, tracked, and managed by a trouble ticket management system Skipped properties: id,href,creationDate,lastUpdate,statusChange,statusChangeDate
 */

@Schema(name = "TroubleTicket_Update", description = "A trouble ticket is a record of an issue that is created, tracked, and managed by a trouble ticket management system Skipped properties: id,href,creationDate,lastUpdate,statusChange,statusChangeDate")
@JsonTypeName("TroubleTicket_Update")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-04-07T21:44:00.636857800+01:00[Europe/London]")
public class TroubleTicketUpdate {

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date expectedResolutionDate;

  private String externalId;

  private String name;

  private String priority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date requestedResolutionDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date resolutionDate;

  private String severity;

  private String statusChangeReason;

  private String ticketType;

  @Valid
  private List<@Valid AttachmentRefOrValue> attachment;

  private ChannelRef channel;

  @Valid
  private List<@Valid Note> note;

  @Valid
  private List<@Valid RelatedEntity> relatedEntity;

  @Valid
  private List<@Valid RelatedParty> relatedParty;

  private TroubleTicketStatusType status;

  @Valid
  private List<@Valid TroubleTicketRelationship> troubleTicketRelationship;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  public TroubleTicketUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the trouble or issue
   * @return description
  */
  
  @Schema(name = "description", description = "Description of the trouble or issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TroubleTicketUpdate expectedResolutionDate(Date expectedResolutionDate) {
    this.expectedResolutionDate = expectedResolutionDate;
    return this;
  }

  /**
   * The expected resolution date determined by the trouble ticket system
   * @return expectedResolutionDate
  */
  @Valid 
  @Schema(name = "expectedResolutionDate", description = "The expected resolution date determined by the trouble ticket system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedResolutionDate")
  public Date getExpectedResolutionDate() {
    return expectedResolutionDate;
  }

  public void setExpectedResolutionDate(Date expectedResolutionDate) {
    this.expectedResolutionDate = expectedResolutionDate;
  }

  public TroubleTicketUpdate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Additional identifier coming from an external system
   * @return externalId
  */
  
  @Schema(name = "externalId", description = "Additional identifier coming from an external system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public TroubleTicketUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the trouble ticket, typically a short description provided by the user that create the ticket
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the trouble ticket, typically a short description provided by the user that create the ticket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TroubleTicketUpdate priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The priority of the trouble ticket and how quickly the issue should be resolved. Example: Critical, High, Medium, Low. The value is set by the ticket management system considering the severity, ticket type etc...
   * @return priority
  */
  
  @Schema(name = "priority", description = "The priority of the trouble ticket and how quickly the issue should be resolved. Example: Critical, High, Medium, Low. The value is set by the ticket management system considering the severity, ticket type etc...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public TroubleTicketUpdate requestedResolutionDate(Date requestedResolutionDate) {
    this.requestedResolutionDate = requestedResolutionDate;
    return this;
  }

  /**
   * The resolution date requested by the user
   * @return requestedResolutionDate
  */
  @Valid 
  @Schema(name = "requestedResolutionDate", description = "The resolution date requested by the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedResolutionDate")
  public Date getRequestedResolutionDate() {
    return requestedResolutionDate;
  }

  public void setRequestedResolutionDate(Date requestedResolutionDate) {
    this.requestedResolutionDate = requestedResolutionDate;
  }

  public TroubleTicketUpdate resolutionDate(Date resolutionDate) {
    this.resolutionDate = resolutionDate;
    return this;
  }

  /**
   * The date and time the trouble ticket was resolved
   * @return resolutionDate
  */
  @Valid 
  @Schema(name = "resolutionDate", description = "The date and time the trouble ticket was resolved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolutionDate")
  public Date getResolutionDate() {
    return resolutionDate;
  }

  public void setResolutionDate(Date resolutionDate) {
    this.resolutionDate = resolutionDate;
  }

  public TroubleTicketUpdate severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of the issue. Indicate the implication of the issue on the expected functionality e.g. of a system, application, service etc..  Severity values can be for example : Critical, Major, Minor
   * @return severity
  */
  
  @Schema(name = "severity", description = "The severity of the issue. Indicate the implication of the issue on the expected functionality e.g. of a system, application, service etc..  Severity values can be for example : Critical, Major, Minor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("severity")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public TroubleTicketUpdate statusChangeReason(String statusChangeReason) {
    this.statusChangeReason = statusChangeReason;
    return this;
  }

  /**
   * The reason for changing the status
   * @return statusChangeReason
  */
  
  @Schema(name = "statusChangeReason", description = "The reason for changing the status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusChangeReason")
  public String getStatusChangeReason() {
    return statusChangeReason;
  }

  public void setStatusChangeReason(String statusChangeReason) {
    this.statusChangeReason = statusChangeReason;
  }

  public TroubleTicketUpdate ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

  /**
   * represent a business type of the trouble ticket e.g. incident, complain, request
   * @return ticketType
  */
  
  @Schema(name = "ticketType", description = "represent a business type of the trouble ticket e.g. incident, complain, request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public TroubleTicketUpdate attachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public TroubleTicketUpdate addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * File(s) attached to the trouble ticket. e.g. pictur of broken device, scaning of a bill or charge
   * @return attachment
  */
  @Valid 
  @Schema(name = "attachment", description = "File(s) attached to the trouble ticket. e.g. pictur of broken device, scaning of a bill or charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public List<@Valid AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public TroubleTicketUpdate channel(ChannelRef channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
  */
  @Valid 
  @Schema(name = "channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel")
  public ChannelRef getChannel() {
    return channel;
  }

  public void setChannel(ChannelRef channel) {
    this.channel = channel;
  }

  public TroubleTicketUpdate note(List<@Valid Note> note) {
    this.note = note;
    return this;
  }

  public TroubleTicketUpdate addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * The note(s) that are associated to the ticket.
   * @return note
  */
  @Valid 
  @Schema(name = "note", description = "The note(s) that are associated to the ticket.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public List<@Valid Note> getNote() {
    return note;
  }

  public void setNote(List<@Valid Note> note) {
    this.note = note;
  }

  public TroubleTicketUpdate relatedEntity(List<@Valid RelatedEntity> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public TroubleTicketUpdate addRelatedEntityItem(RelatedEntity relatedEntityItem) {
    if (this.relatedEntity == null) {
      this.relatedEntity = new ArrayList<>();
    }
    this.relatedEntity.add(relatedEntityItem);
    return this;
  }

  /**
   * An entity that is related to the ticket such as a bill, a product, etc. The entity against which the ticket is associated.
   * @return relatedEntity
  */
  @Valid 
  @Schema(name = "relatedEntity", description = "An entity that is related to the ticket such as a bill, a product, etc. The entity against which the ticket is associated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedEntity")
  public List<@Valid RelatedEntity> getRelatedEntity() {
    return relatedEntity;
  }

  public void setRelatedEntity(List<@Valid RelatedEntity> relatedEntity) {
    this.relatedEntity = relatedEntity;
  }

  public TroubleTicketUpdate relatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public TroubleTicketUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * The related party(ies) that are associated to the ticket.
   * @return relatedParty
  */
  @Valid 
  @Schema(name = "relatedParty", description = "The related party(ies) that are associated to the ticket.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<@Valid RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public TroubleTicketUpdate status(TroubleTicketStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public TroubleTicketStatusType getStatus() {
    return status;
  }

  public void setStatus(TroubleTicketStatusType status) {
    this.status = status;
  }

  public TroubleTicketUpdate troubleTicketRelationship(List<@Valid TroubleTicketRelationship> troubleTicketRelationship) {
    this.troubleTicketRelationship = troubleTicketRelationship;
    return this;
  }

  public TroubleTicketUpdate addTroubleTicketRelationshipItem(TroubleTicketRelationship troubleTicketRelationshipItem) {
    if (this.troubleTicketRelationship == null) {
      this.troubleTicketRelationship = new ArrayList<>();
    }
    this.troubleTicketRelationship.add(troubleTicketRelationshipItem);
    return this;
  }

  /**
   * A list of trouble ticket relationships (TroubleTicketRelationship [*]). Represents a relationship between trouble tickets
   * @return troubleTicketRelationship
  */
  @Valid 
  @Schema(name = "troubleTicketRelationship", description = "A list of trouble ticket relationships (TroubleTicketRelationship [*]). Represents a relationship between trouble tickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("troubleTicketRelationship")
  public List<@Valid TroubleTicketRelationship> getTroubleTicketRelationship() {
    return troubleTicketRelationship;
  }

  public void setTroubleTicketRelationship(List<@Valid TroubleTicketRelationship> troubleTicketRelationship) {
    this.troubleTicketRelationship = troubleTicketRelationship;
  }

  public TroubleTicketUpdate atBaseType(String atBaseType) {
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

  public TroubleTicketUpdate atSchemaLocation(URI atSchemaLocation) {
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

  public TroubleTicketUpdate atType(String atType) {
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
    TroubleTicketUpdate troubleTicketUpdate = (TroubleTicketUpdate) o;
    return Objects.equals(this.description, troubleTicketUpdate.description) &&
        Objects.equals(this.expectedResolutionDate, troubleTicketUpdate.expectedResolutionDate) &&
        Objects.equals(this.externalId, troubleTicketUpdate.externalId) &&
        Objects.equals(this.name, troubleTicketUpdate.name) &&
        Objects.equals(this.priority, troubleTicketUpdate.priority) &&
        Objects.equals(this.requestedResolutionDate, troubleTicketUpdate.requestedResolutionDate) &&
        Objects.equals(this.resolutionDate, troubleTicketUpdate.resolutionDate) &&
        Objects.equals(this.severity, troubleTicketUpdate.severity) &&
        Objects.equals(this.statusChangeReason, troubleTicketUpdate.statusChangeReason) &&
        Objects.equals(this.ticketType, troubleTicketUpdate.ticketType) &&
        Objects.equals(this.attachment, troubleTicketUpdate.attachment) &&
        Objects.equals(this.channel, troubleTicketUpdate.channel) &&
        Objects.equals(this.note, troubleTicketUpdate.note) &&
        Objects.equals(this.relatedEntity, troubleTicketUpdate.relatedEntity) &&
        Objects.equals(this.relatedParty, troubleTicketUpdate.relatedParty) &&
        Objects.equals(this.status, troubleTicketUpdate.status) &&
        Objects.equals(this.troubleTicketRelationship, troubleTicketUpdate.troubleTicketRelationship) &&
        Objects.equals(this.atBaseType, troubleTicketUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, troubleTicketUpdate.atSchemaLocation) &&
        Objects.equals(this.atType, troubleTicketUpdate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expectedResolutionDate, externalId, name, priority, requestedResolutionDate, resolutionDate, severity, statusChangeReason, ticketType, attachment, channel, note, relatedEntity, relatedParty, status, troubleTicketRelationship, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TroubleTicketUpdate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedResolutionDate: ").append(toIndentedString(expectedResolutionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedResolutionDate: ").append(toIndentedString(requestedResolutionDate)).append("\n");
    sb.append("    resolutionDate: ").append(toIndentedString(resolutionDate)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    statusChangeReason: ").append(toIndentedString(statusChangeReason)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    troubleTicketRelationship: ").append(toIndentedString(troubleTicketRelationship)).append("\n");
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

