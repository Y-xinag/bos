package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpvDutyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpvDutyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDutytypeIsNull() {
            addCriterion("DutyType is null");
            return (Criteria) this;
        }

        public Criteria andDutytypeIsNotNull() {
            addCriterion("DutyType is not null");
            return (Criteria) this;
        }

        public Criteria andDutytypeEqualTo(String value) {
            addCriterion("DutyType =", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeNotEqualTo(String value) {
            addCriterion("DutyType <>", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeGreaterThan(String value) {
            addCriterion("DutyType >", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeGreaterThanOrEqualTo(String value) {
            addCriterion("DutyType >=", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeLessThan(String value) {
            addCriterion("DutyType <", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeLessThanOrEqualTo(String value) {
            addCriterion("DutyType <=", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeLike(String value) {
            addCriterion("DutyType like", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeNotLike(String value) {
            addCriterion("DutyType not like", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeIn(List<String> values) {
            addCriterion("DutyType in", values, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeNotIn(List<String> values) {
            addCriterion("DutyType not in", values, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeBetween(String value1, String value2) {
            addCriterion("DutyType between", value1, value2, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeNotBetween(String value1, String value2) {
            addCriterion("DutyType not between", value1, value2, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytitleIsNull() {
            addCriterion("DutyTitle is null");
            return (Criteria) this;
        }

        public Criteria andDutytitleIsNotNull() {
            addCriterion("DutyTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDutytitleEqualTo(String value) {
            addCriterion("DutyTitle =", value, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleNotEqualTo(String value) {
            addCriterion("DutyTitle <>", value, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleGreaterThan(String value) {
            addCriterion("DutyTitle >", value, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleGreaterThanOrEqualTo(String value) {
            addCriterion("DutyTitle >=", value, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleLessThan(String value) {
            addCriterion("DutyTitle <", value, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleLessThanOrEqualTo(String value) {
            addCriterion("DutyTitle <=", value, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleLike(String value) {
            addCriterion("DutyTitle like", value, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleNotLike(String value) {
            addCriterion("DutyTitle not like", value, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleIn(List<String> values) {
            addCriterion("DutyTitle in", values, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleNotIn(List<String> values) {
            addCriterion("DutyTitle not in", values, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleBetween(String value1, String value2) {
            addCriterion("DutyTitle between", value1, value2, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutytitleNotBetween(String value1, String value2) {
            addCriterion("DutyTitle not between", value1, value2, "dutytitle");
            return (Criteria) this;
        }

        public Criteria andDutycontentIsNull() {
            addCriterion("DutyContent is null");
            return (Criteria) this;
        }

        public Criteria andDutycontentIsNotNull() {
            addCriterion("DutyContent is not null");
            return (Criteria) this;
        }

        public Criteria andDutycontentEqualTo(String value) {
            addCriterion("DutyContent =", value, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentNotEqualTo(String value) {
            addCriterion("DutyContent <>", value, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentGreaterThan(String value) {
            addCriterion("DutyContent >", value, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentGreaterThanOrEqualTo(String value) {
            addCriterion("DutyContent >=", value, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentLessThan(String value) {
            addCriterion("DutyContent <", value, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentLessThanOrEqualTo(String value) {
            addCriterion("DutyContent <=", value, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentLike(String value) {
            addCriterion("DutyContent like", value, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentNotLike(String value) {
            addCriterion("DutyContent not like", value, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentIn(List<String> values) {
            addCriterion("DutyContent in", values, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentNotIn(List<String> values) {
            addCriterion("DutyContent not in", values, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentBetween(String value1, String value2) {
            addCriterion("DutyContent between", value1, value2, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andDutycontentNotBetween(String value1, String value2) {
            addCriterion("DutyContent not between", value1, value2, "dutycontent");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryIsNull() {
            addCriterion("DutyAccessory is null");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryIsNotNull() {
            addCriterion("DutyAccessory is not null");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryEqualTo(String value) {
            addCriterion("DutyAccessory =", value, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryNotEqualTo(String value) {
            addCriterion("DutyAccessory <>", value, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryGreaterThan(String value) {
            addCriterion("DutyAccessory >", value, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("DutyAccessory >=", value, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryLessThan(String value) {
            addCriterion("DutyAccessory <", value, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryLessThanOrEqualTo(String value) {
            addCriterion("DutyAccessory <=", value, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryLike(String value) {
            addCriterion("DutyAccessory like", value, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryNotLike(String value) {
            addCriterion("DutyAccessory not like", value, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryIn(List<String> values) {
            addCriterion("DutyAccessory in", values, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryNotIn(List<String> values) {
            addCriterion("DutyAccessory not in", values, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryBetween(String value1, String value2) {
            addCriterion("DutyAccessory between", value1, value2, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andDutyaccessoryNotBetween(String value1, String value2) {
            addCriterion("DutyAccessory not between", value1, value2, "dutyaccessory");
            return (Criteria) this;
        }

        public Criteria andNewtimeIsNull() {
            addCriterion("NewTime is null");
            return (Criteria) this;
        }

        public Criteria andNewtimeIsNotNull() {
            addCriterion("NewTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewtimeEqualTo(Date value) {
            addCriterion("NewTime =", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeNotEqualTo(Date value) {
            addCriterion("NewTime <>", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeGreaterThan(Date value) {
            addCriterion("NewTime >", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NewTime >=", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeLessThan(Date value) {
            addCriterion("NewTime <", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeLessThanOrEqualTo(Date value) {
            addCriterion("NewTime <=", value, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeIn(List<Date> values) {
            addCriterion("NewTime in", values, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeNotIn(List<Date> values) {
            addCriterion("NewTime not in", values, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeBetween(Date value1, Date value2) {
            addCriterion("NewTime between", value1, value2, "newtime");
            return (Criteria) this;
        }

        public Criteria andNewtimeNotBetween(Date value1, Date value2) {
            addCriterion("NewTime not between", value1, value2, "newtime");
            return (Criteria) this;
        }

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}