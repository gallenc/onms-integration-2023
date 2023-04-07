package org.opennms.integration.tmf621.camel.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.opennms.integration.tmf621.camel.model.TroubleTicket;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The event data structure
 */

@Schema(name = "TroubleTicketAttributeValueChangeEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-04-07T21:44:00.636857800+01:00[Europe/London]")
public class TroubleTicketAttributeValueChangeEventPayload {

  private TroubleTicket troubleTicket;

  public TroubleTicketAttributeValueChangeEventPayload troubleTicket(TroubleTicket troubleTicket) {
    this.troubleTicket = troubleTicket;
    return this;
  }

  /**
   * Get troubleTicket
   * @return troubleTicket
  */
  @Valid 
  @Schema(name = "troubleTicket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("troubleTicket")
  public TroubleTicket getTroubleTicket() {
    return troubleTicket;
  }

  public void setTroubleTicket(TroubleTicket troubleTicket) {
    this.troubleTicket = troubleTicket;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TroubleTicketAttributeValueChangeEventPayload troubleTicketAttributeValueChangeEventPayload = (TroubleTicketAttributeValueChangeEventPayload) o;
    return Objects.equals(this.troubleTicket, troubleTicketAttributeValueChangeEventPayload.troubleTicket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(troubleTicket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TroubleTicketAttributeValueChangeEventPayload {\n");
    sb.append("    troubleTicket: ").append(toIndentedString(troubleTicket)).append("\n");
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

