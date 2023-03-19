package com.ivanti.jarvis.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  private static final ObjectMapper MAPPER = new ObjectMapper();

  public JsonNode fetchFieldMapping() {
    String jsonStr = "{" +
      "  \"assetFields\": {" +
      "    \"assetType\": \"Host\"," +
      "    \"scannerToRiskSenseFields\": [" +
      "      {" +
      "        \"scannerField\": \"hostName\"," +
      "        \"riskSenseField\": \"name\"" +
      "      }," +
      "      {" +
      "        \"scannerField\": \"hostURL\"," +
      "        \"riskSenseField\": \"url\"" +
      "      }," +
      "      {" +
      "        \"scannerField\": \"ipAddress\"," +
      "        \"riskSenseField\": \"ipAddress\"" +
      "      }," +
      "      {" +
      "        \"scannerField\": \"operatingSystemName\"," +
      "        \"riskSenseField\": \"osName\"" +
      "      }" +
      "    ]" +
      "  }," +
      "  \"findingFields\": {" +
      "    \"findingType\": \"vulnerability\"," +
      "    \"scannerToRiskSenseFields\": [" +
      "      {" +
      "        \"scannerField\": \"uniqueId\"," +
      "        \"riskSenseField\": \"pluginId\"" +
      "      }," +
      "      {" +
      "        \"scannerField\": \"severity\"," +
      "        \"riskSenseField\": \"severity\"" +
      "      }," +
      "      {" +
      "        \"scannerField\": \"patchSolution\"," +
      "        \"riskSenseField\": \"patches\"" +
      "      }," +
      "      {" +
      "        \"scannerField\": \"cve\"," +
      "        \"riskSenseField\": \"cve\"" +
      "      }," +
      "      {" +
      "        \"scannerField\": \"solution\"," +
      "        \"riskSenseField\": \"remediation\"" +
      "      }," +
      "      {" +
      "        \"scannerField\": \"description\"," +
      "        \"riskSenseField\": \"description\"" +
      "      }" +
      "    ]" +
      "  }" +
      "}";
    try {
      return MAPPER.readValue(jsonStr, JsonNode.class);
    } catch (JsonProcessingException e) {
      return MAPPER.createObjectNode().put("error", "Error while processing the request");
    }
  }

  public JsonNode fetchFinalMapping() {
    String jsonStr = "{" +
      "\"scannerName\": \"Automation Scanner\"," +
      "\"scannerType\": \"Host\"," +
      "\"assetFields\": {" +
      "\"assetType\": \"Host\"," +
      "\"scannerToRiskSenseFields\": [{" +
      "\"scannerField\": \"hostName\"," +
      "\"riskSenseField\": \"name\"," +
      "\"endpoint\": \"http://sandbox/assets\"," +
      "\"type\": \"asset\"," +
      "\"isManualOverride\": \"false\"" +
      "}," +
      "{" +
      "\"scannerField\": \"hostURL\"," +
      "\"riskSenseField\": \"url\"," +
      "\"endpoint\": \"http://sandbox/assets\"," +
      "\"type\": \"asset\"," +
      "\"isManualOverride\": \"false\"" +
      "}," +
      "{" +
      "\"scannerField\": \"ipAddress\"," +
      "\"riskSenseField\": \"ipAddress\"," +
      "\"endpoint\": \"http://sandbox/assets\"," +
      "\"type\": \"asset\"," +
      "\"isManualOverride\": \"false\"" +
      "}," +
      "{" +
      "\"scannerField\": \"operatingSystemName\"," +
      "\"riskSenseField\": \"osName\"," +
      "\"endpoint\": \"http://sandbox/assets\"," +
      "\"type\": \"asset\"," +
      "\"isManualOverride\": \"true\"" +
      "}" +
      "]" +
      "}," +
      "\"findingFields\": {" +
      "\"findingType\": \"Vulnerability\"," +
      "\"scannerToRiskSenseFields\": [{" +
      "\"scannerField\": \"uniqueId\"," +
      "\"riskSenseField\": \"pluginId\"," +
      "\"endpoint\": \"http://sandbox/vulnerabilities\"," +
      "\"type\": \"asset\"," +
      "\"isManualOverride\": \"false\"" +
      "}," +
      "{" +
      "\"scannerField\": \"severity\"," +
      "\"riskSenseField\": \"severity\"," +
      "\"endpoint\": \"http://sandbox/vulnerabilities\"," +
      "\"type\": \"asset\"," +
      "\"isManualOverride\": \"false\"" +
      "}," +
      "{" +
      "\"scannerField\": \"patchSolution\"," +
      "\"riskSenseField\": \"patches\"," +
      "\"endpoint\": \"http://sandbox/vulnerabilities\"," +
      "\"type\": \"asset\"," +
      "\"isManualOverride\": \"false\"" +
      "}," +
      "{" +
      "\"scannerField\": \"cve\"," +
      "\"riskSenseField\": \"cve\"," +
      "\"endpoint\": \"http://sandbox/vulnerabilities\"," +
      "\"type\": \"asset\"," +
      "\"isManualOverride\": \"false\"" +
      "}" +
      "]" +
      "}" +
      "}";
    try {
      return MAPPER.readValue(jsonStr, JsonNode.class);
    } catch (JsonProcessingException e) {
      return MAPPER.createObjectNode().put("error", "Error while processing the request");
    }
  }
}
