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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.xml.bind.annotation.*;

import java.util.*;
import javax.annotation.Generated;

/**
 * The event data structure
 */

@Schema(name = "TroubleTicketInformationRequiredEventPayload", description = "The event data structure")
@JacksonXmlRootElement(localName = "TroubleTicketInformationRequiredEventPayload")
@XmlRootElement(name = "TroubleTicketInformationRequiredEventPayload")
@XmlAccessorType(XmlAccessType.FIELD)

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-04-07T13:45:44.384647300+01:00[Europe/London]")
public class TroubleTicketInformationRequiredEventPayload {

  @JacksonXmlProperty(localName = "troubleTicket")
  private TroubleTicket troubleTicket;

  public TroubleTicketInformationRequiredEventPayload troubleTicket(TroubleTicket troubleTicket) {
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
    TroubleTicketInformationRequiredEventPayload troubleTicketInformationRequiredEventPayload = (TroubleTicketInformationRequiredEventPayload) o;
    return Objects.equals(this.troubleTicket, troubleTicketInformationRequiredEventPayload.troubleTicket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(troubleTicket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TroubleTicketInformationRequiredEventPayload {\n");
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

