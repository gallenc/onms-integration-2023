package org.opennms.integration.tmf621.camel.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.opennms.integration.tmf621.camel.model.StatusChange;
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
 * A trouble ticket is a record of an issue that is created, tracked, and managed by a trouble ticket management system
 */

@Schema(name = "TroubleTicket", description = "A trouble ticket is a record of an issue that is created, tracked, and managed by a trouble ticket management system")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-04-07T21:44:00.636857800+01:00[Europe/London]")
public class TroubleTicket {

  private String id;

  private String href;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date creationDate;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date expectedResolutionDate;

  private String externalId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date lastUpdate;

  private String name;

  private String priority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date requestedResolutionDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date resolutionDate;

  private String severity;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date statusChangeDate;

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
  private List<@Valid StatusChange> statusChange;

  @Valid
  private List<@Valid TroubleTicketRelationship> troubleTicketRelationship;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  public TroubleTicket id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the trouble ticket
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier of the trouble ticket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TroubleTicket href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink, a reference to the trouble ticket entity
   * @return href
  */
  
  @Schema(name = "href", description = "Hyperlink, a reference to the trouble ticket entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public TroubleTicket creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date on which the trouble ticket was created
   * @return creationDate
  */
  @Valid 
  @Schema(name = "creationDate", description = "The date on which the trouble ticket was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public TroubleTicket description(String description) {
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

  public TroubleTicket expectedResolutionDate(Date expectedResolutionDate) {
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

  public TroubleTicket externalId(String externalId) {
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

  public TroubleTicket lastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * The date and time that the trouble ticked was last updated
   * @return lastUpdate
  */
  @Valid 
  @Schema(name = "lastUpdate", description = "The date and time that the trouble ticked was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public Date getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public TroubleTicket name(String name) {
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

  public TroubleTicket priority(String priority) {
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

  public TroubleTicket requestedResolutionDate(Date requestedResolutionDate) {
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

  public TroubleTicket resolutionDate(Date resolutionDate) {
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

  public TroubleTicket severity(String severity) {
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

  public TroubleTicket statusChangeDate(Date statusChangeDate) {
    this.statusChangeDate = statusChangeDate;
    return this;
  }

  /**
   * The date and time the status changed.
   * @return statusChangeDate
  */
  @Valid 
  @Schema(name = "statusChangeDate", description = "The date and time the status changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusChangeDate")
  public Date getStatusChangeDate() {
    return statusChangeDate;
  }

  public void setStatusChangeDate(Date statusChangeDate) {
    this.statusChangeDate = statusChangeDate;
  }

  public TroubleTicket statusChangeReason(String statusChangeReason) {
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

  public TroubleTicket ticketType(String ticketType) {
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

  public TroubleTicket attachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public TroubleTicket addAttachmentItem(AttachmentRefOrValue attachmentItem) {
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

  public TroubleTicket channel(ChannelRef channel) {
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

  public TroubleTicket note(List<@Valid Note> note) {
    this.note = note;
    return this;
  }

  public TroubleTicket addNoteItem(Note noteItem) {
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

  public TroubleTicket relatedEntity(List<@Valid RelatedEntity> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public TroubleTicket addRelatedEntityItem(RelatedEntity relatedEntityItem) {
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

  public TroubleTicket relatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public TroubleTicket addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

  public TroubleTicket status(TroubleTicketStatusType status) {
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

  public TroubleTicket statusChange(List<@Valid StatusChange> statusChange) {
    this.statusChange = statusChange;
    return this;
  }

  public TroubleTicket addStatusChangeItem(StatusChange statusChangeItem) {
    if (this.statusChange == null) {
      this.statusChange = new ArrayList<>();
    }
    this.statusChange.add(statusChangeItem);
    return this;
  }

  /**
   * The status change history that are associated to the ticket.Populated by the server
   * @return statusChange
  */
  @Valid 
  @Schema(name = "statusChange", description = "The status change history that are associated to the ticket.Populated by the server", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusChange")
  public List<@Valid StatusChange> getStatusChange() {
    return statusChange;
  }

  public void setStatusChange(List<@Valid StatusChange> statusChange) {
    this.statusChange = statusChange;
  }

  public TroubleTicket troubleTicketRelationship(List<@Valid TroubleTicketRelationship> troubleTicketRelationship) {
    this.troubleTicketRelationship = troubleTicketRelationship;
    return this;
  }

  public TroubleTicket addTroubleTicketRelationshipItem(TroubleTicketRelationship troubleTicketRelationshipItem) {
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

  public TroubleTicket atBaseType(String atBaseType) {
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

  public TroubleTicket atSchemaLocation(URI atSchemaLocation) {
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

  public TroubleTicket atType(String atType) {
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
    TroubleTicket troubleTicket = (TroubleTicket) o;
    return Objects.equals(this.id, troubleTicket.id) &&
        Objects.equals(this.href, troubleTicket.href) &&
        Objects.equals(this.creationDate, troubleTicket.creationDate) &&
        Objects.equals(this.description, troubleTicket.description) &&
        Objects.equals(this.expectedResolutionDate, troubleTicket.expectedResolutionDate) &&
        Objects.equals(this.externalId, troubleTicket.externalId) &&
        Objects.equals(this.lastUpdate, troubleTicket.lastUpdate) &&
        Objects.equals(this.name, troubleTicket.name) &&
        Objects.equals(this.priority, troubleTicket.priority) &&
        Objects.equals(this.requestedResolutionDate, troubleTicket.requestedResolutionDate) &&
        Objects.equals(this.resolutionDate, troubleTicket.resolutionDate) &&
        Objects.equals(this.severity, troubleTicket.severity) &&
        Objects.equals(this.statusChangeDate, troubleTicket.statusChangeDate) &&
        Objects.equals(this.statusChangeReason, troubleTicket.statusChangeReason) &&
        Objects.equals(this.ticketType, troubleTicket.ticketType) &&
        Objects.equals(this.attachment, troubleTicket.attachment) &&
        Objects.equals(this.channel, troubleTicket.channel) &&
        Objects.equals(this.note, troubleTicket.note) &&
        Objects.equals(this.relatedEntity, troubleTicket.relatedEntity) &&
        Objects.equals(this.relatedParty, troubleTicket.relatedParty) &&
        Objects.equals(this.status, troubleTicket.status) &&
        Objects.equals(this.statusChange, troubleTicket.statusChange) &&
        Objects.equals(this.troubleTicketRelationship, troubleTicket.troubleTicketRelationship) &&
        Objects.equals(this.atBaseType, troubleTicket.atBaseType) &&
        Objects.equals(this.atSchemaLocation, troubleTicket.atSchemaLocation) &&
        Objects.equals(this.atType, troubleTicket.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, creationDate, description, expectedResolutionDate, externalId, lastUpdate, name, priority, requestedResolutionDate, resolutionDate, severity, statusChangeDate, statusChangeReason, ticketType, attachment, channel, note, relatedEntity, relatedParty, status, statusChange, troubleTicketRelationship, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TroubleTicket {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedResolutionDate: ").append(toIndentedString(expectedResolutionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedResolutionDate: ").append(toIndentedString(requestedResolutionDate)).append("\n");
    sb.append("    resolutionDate: ").append(toIndentedString(resolutionDate)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    statusChangeDate: ").append(toIndentedString(statusChangeDate)).append("\n");
    sb.append("    statusChangeReason: ").append(toIndentedString(statusChangeReason)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChange: ").append(toIndentedString(statusChange)).append("\n");
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

