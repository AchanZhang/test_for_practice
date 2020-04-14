package com.achanzhang.free;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

public class JsonToMapTest {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        AlarmRuleRedisVO alarmRuleRedisVO = new AlarmRuleRedisVO();

        String a = "{\"collectTime\": \"2020-04-07 15:13:48\", \"forwardCumulativeFlow\": \"null\", \"oppositeCumulativeFlow\": \"100\"}";
        String b = "{}";
        String c = null;
        Map<String, Object> map = objectMapper.readValue(b, Map.class);
        AlarmRuleRedisVO alarmRuleRedisVO1 = objectMapper.readValue(Optional.of(b).orElse(alarmRuleRedisVO.toString()), AlarmRuleRedisVO.class);
        map.forEach((k, v) -> {
            System.out.println("key:" + k + "value:" + v);
        });
    }
}
