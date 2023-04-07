package org.opennms.integration.tmf621.camel.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
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
 * A period of time, either as a deadline (endDateTime only) a startDateTime only, or both
 */

@Schema(name = "TimePeriod", description = "A period of time, either as a deadline (endDateTime only) a startDateTime only, or both")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-04-07T21:44:00.636857800+01:00[Europe/London]")
public class TimePeriod {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date endDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date startDateTime;

  public TimePeriod endDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * End of the time period, using IETC-RFC-3339 format
   * @return endDateTime
  */
  @Valid 
  @Schema(name = "endDateTime", description = "End of the time period, using IETC-RFC-3339 format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDateTime")
  public Date getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }

  public TimePeriod startDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Start of the time period, using IETC-RFC-3339 format. If you define a start, you must also define an end
   * @return startDateTime
  */
  @Valid 
  @Schema(name = "startDateTime", description = "Start of the time period, using IETC-RFC-3339 format. If you define a start, you must also define an end", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDateTime")
  public Date getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(this.endDateTime, timePeriod.endDateTime) &&
        Objects.equals(this.startDateTime, timePeriod.startDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, startDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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

