package com.achanzhang.free;


public class AlarmRuleRedisVO {
    private Integer continueDay;

    private Integer alarmRuleFlag;

    public Integer getContinueDay() {
        return continueDay;
    }

    public void setContinueDay(Integer continueDay) {
        this.continueDay = continueDay;
    }

    public Integer getAlarmRuleFlag() {
        return alarmRuleFlag;
    }

    public void setAlarmRuleFlag(Integer alarmRuleFlag) {
        this.alarmRuleFlag = alarmRuleFlag;
    }

    @Override
    public String toString() {
        return "{\"continueDay\":0,\"alarmRuleFlag\":0}";
    }
}
