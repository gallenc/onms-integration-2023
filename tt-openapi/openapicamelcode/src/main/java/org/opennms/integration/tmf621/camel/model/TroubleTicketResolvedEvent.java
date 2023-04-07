package org.opennms.integration.tmf621.camel.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.opennms.integration.tmf621.camel.model.TroubleTicketResolvedEventPayload;
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
 * The notification data structure
 */

@Schema(name = "TroubleTicketResolvedEvent", description = "The notification data structure")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-04-07T21:44:00.636857800+01:00[Europe/London]")
public class TroubleTicketResolvedEvent {

  private String id;

  private String href;

  private String eventId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date eventTime;

  private String eventType;

  private String correlationId;

  private String domain;

  private String title;

  private String description;

  private String priority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date timeOcurred;

  private TroubleTicketResolvedEventPayload event;

  public TroubleTicketResolvedEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the Process flow
   * @return id
  */
  
  @Schema(name = "id", description = "Identifier of the Process flow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TroubleTicketResolvedEvent href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the ProcessFlow
   * @return href
  */
  
  @Schema(name = "href", description = "Reference of the ProcessFlow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public TroubleTicketResolvedEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
  */
  
  @Schema(name = "eventId", description = "The identifier of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public TroubleTicketResolvedEvent eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
  */
  @Valid 
  @Schema(name = "eventTime", description = "Time of the event occurrence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }

  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  public TroubleTicketResolvedEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
  */
  
  @Schema(name = "eventType", description = "The type of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public TroubleTicketResolvedEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
  */
  
  @Schema(name = "correlationId", description = "The correlation id for this event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public TroubleTicketResolvedEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
  */
  
  @Schema(name = "domain", description = "The domain of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public TroubleTicketResolvedEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
  */
  
  @Schema(name = "title", description = "The title of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TroubleTicketResolvedEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
  */
  
  @Schema(name = "description", description = "An explnatory of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TroubleTicketResolvedEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
  */
  
  @Schema(name = "priority", description = "A priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public TroubleTicketResolvedEvent timeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  /**
   * The time the event occured.
   * @return timeOcurred
  */
  @Valid 
  @Schema(name = "timeOcurred", description = "The time the event occured.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeOcurred")
  public Date getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  public TroubleTicketResolvedEvent event(TroubleTicketResolvedEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public TroubleTicketResolvedEventPayload getEvent() {
    return event;
  }

  public void setEvent(TroubleTicketResolvedEventPayload event) {
    this.event = event;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TroubleTicketResolvedEvent troubleTicketResolvedEvent = (TroubleTicketResolvedEvent) o;
    return Objects.equals(this.id, troubleTicketResolvedEvent.id) &&
        Objects.equals(this.href, troubleTicketResolvedEvent.href) &&
        Objects.equals(this.eventId, troubleTicketResolvedEvent.eventId) &&
        Objects.equals(this.eventTime, troubleTicketResolvedEvent.eventTime) &&
        Objects.equals(this.eventType, troubleTicketResolvedEvent.eventType) &&
        Objects.equals(this.correlationId, troubleTicketResolvedEvent.correlationId) &&
        Objects.equals(this.domain, troubleTicketResolvedEvent.domain) &&
        Objects.equals(this.title, troubleTicketResolvedEvent.title) &&
        Objects.equals(this.description, troubleTicketResolvedEvent.description) &&
        Objects.equals(this.priority, troubleTicketResolvedEvent.priority) &&
        Objects.equals(this.timeOcurred, troubleTicketResolvedEvent.timeOcurred) &&
        Objects.equals(this.event, troubleTicketResolvedEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TroubleTicketResolvedEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

