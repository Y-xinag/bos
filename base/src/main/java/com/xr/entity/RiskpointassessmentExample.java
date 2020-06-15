package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskpointassessmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskpointassessmentExample() {
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

        public Criteria andRiskidIsNull() {
            addCriterion("riskid is null");
            return (Criteria) this;
        }

        public Criteria andRiskidIsNotNull() {
            addCriterion("riskid is not null");
            return (Criteria) this;
        }

        public Criteria andRiskidEqualTo(Integer value) {
            addCriterion("riskid =", value, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskidNotEqualTo(Integer value) {
            addCriterion("riskid <>", value, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskidGreaterThan(Integer value) {
            addCriterion("riskid >", value, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("riskid >=", value, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskidLessThan(Integer value) {
            addCriterion("riskid <", value, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskidLessThanOrEqualTo(Integer value) {
            addCriterion("riskid <=", value, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskidIn(List<Integer> values) {
            addCriterion("riskid in", values, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskidNotIn(List<Integer> values) {
            addCriterion("riskid not in", values, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskidBetween(Integer value1, Integer value2) {
            addCriterion("riskid between", value1, value2, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskidNotBetween(Integer value1, Integer value2) {
            addCriterion("riskid not between", value1, value2, "riskid");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationIsNull() {
            addCriterion("riskImfomation is null");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationIsNotNull() {
            addCriterion("riskImfomation is not null");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationEqualTo(String value) {
            addCriterion("riskImfomation =", value, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationNotEqualTo(String value) {
            addCriterion("riskImfomation <>", value, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationGreaterThan(String value) {
            addCriterion("riskImfomation >", value, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationGreaterThanOrEqualTo(String value) {
            addCriterion("riskImfomation >=", value, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationLessThan(String value) {
            addCriterion("riskImfomation <", value, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationLessThanOrEqualTo(String value) {
            addCriterion("riskImfomation <=", value, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationLike(String value) {
            addCriterion("riskImfomation like", value, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationNotLike(String value) {
            addCriterion("riskImfomation not like", value, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationIn(List<String> values) {
            addCriterion("riskImfomation in", values, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationNotIn(List<String> values) {
            addCriterion("riskImfomation not in", values, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationBetween(String value1, String value2) {
            addCriterion("riskImfomation between", value1, value2, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andRiskimfomationNotBetween(String value1, String value2) {
            addCriterion("riskImfomation not between", value1, value2, "riskimfomation");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksIsNull() {
            addCriterion("numberOneRisks is null");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksIsNotNull() {
            addCriterion("numberOneRisks is not null");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksEqualTo(String value) {
            addCriterion("numberOneRisks =", value, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksNotEqualTo(String value) {
            addCriterion("numberOneRisks <>", value, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksGreaterThan(String value) {
            addCriterion("numberOneRisks >", value, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksGreaterThanOrEqualTo(String value) {
            addCriterion("numberOneRisks >=", value, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksLessThan(String value) {
            addCriterion("numberOneRisks <", value, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksLessThanOrEqualTo(String value) {
            addCriterion("numberOneRisks <=", value, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksLike(String value) {
            addCriterion("numberOneRisks like", value, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksNotLike(String value) {
            addCriterion("numberOneRisks not like", value, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksIn(List<String> values) {
            addCriterion("numberOneRisks in", values, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksNotIn(List<String> values) {
            addCriterion("numberOneRisks not in", values, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksBetween(String value1, String value2) {
            addCriterion("numberOneRisks between", value1, value2, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumberonerisksNotBetween(String value1, String value2) {
            addCriterion("numberOneRisks not between", value1, value2, "numberonerisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksIsNull() {
            addCriterion("numberTwoRisks is null");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksIsNotNull() {
            addCriterion("numberTwoRisks is not null");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksEqualTo(String value) {
            addCriterion("numberTwoRisks =", value, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksNotEqualTo(String value) {
            addCriterion("numberTwoRisks <>", value, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksGreaterThan(String value) {
            addCriterion("numberTwoRisks >", value, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksGreaterThanOrEqualTo(String value) {
            addCriterion("numberTwoRisks >=", value, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksLessThan(String value) {
            addCriterion("numberTwoRisks <", value, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksLessThanOrEqualTo(String value) {
            addCriterion("numberTwoRisks <=", value, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksLike(String value) {
            addCriterion("numberTwoRisks like", value, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksNotLike(String value) {
            addCriterion("numberTwoRisks not like", value, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksIn(List<String> values) {
            addCriterion("numberTwoRisks in", values, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksNotIn(List<String> values) {
            addCriterion("numberTwoRisks not in", values, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksBetween(String value1, String value2) {
            addCriterion("numberTwoRisks between", value1, value2, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumbertworisksNotBetween(String value1, String value2) {
            addCriterion("numberTwoRisks not between", value1, value2, "numbertworisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksIsNull() {
            addCriterion("numberThreeRisks is null");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksIsNotNull() {
            addCriterion("numberThreeRisks is not null");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksEqualTo(String value) {
            addCriterion("numberThreeRisks =", value, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksNotEqualTo(String value) {
            addCriterion("numberThreeRisks <>", value, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksGreaterThan(String value) {
            addCriterion("numberThreeRisks >", value, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksGreaterThanOrEqualTo(String value) {
            addCriterion("numberThreeRisks >=", value, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksLessThan(String value) {
            addCriterion("numberThreeRisks <", value, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksLessThanOrEqualTo(String value) {
            addCriterion("numberThreeRisks <=", value, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksLike(String value) {
            addCriterion("numberThreeRisks like", value, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksNotLike(String value) {
            addCriterion("numberThreeRisks not like", value, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksIn(List<String> values) {
            addCriterion("numberThreeRisks in", values, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksNotIn(List<String> values) {
            addCriterion("numberThreeRisks not in", values, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksBetween(String value1, String value2) {
            addCriterion("numberThreeRisks between", value1, value2, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andNumberthreerisksNotBetween(String value1, String value2) {
            addCriterion("numberThreeRisks not between", value1, value2, "numberthreerisks");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeIsNull() {
            addCriterion("riskCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeIsNotNull() {
            addCriterion("riskCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeEqualTo(Date value) {
            addCriterion("riskCreateTime =", value, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeNotEqualTo(Date value) {
            addCriterion("riskCreateTime <>", value, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeGreaterThan(Date value) {
            addCriterion("riskCreateTime >", value, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("riskCreateTime >=", value, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeLessThan(Date value) {
            addCriterion("riskCreateTime <", value, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("riskCreateTime <=", value, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeIn(List<Date> values) {
            addCriterion("riskCreateTime in", values, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeNotIn(List<Date> values) {
            addCriterion("riskCreateTime not in", values, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeBetween(Date value1, Date value2) {
            addCriterion("riskCreateTime between", value1, value2, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("riskCreateTime not between", value1, value2, "riskcreatetime");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidIsNull() {
            addCriterion("riskCreateId is null");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidIsNotNull() {
            addCriterion("riskCreateId is not null");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidEqualTo(Integer value) {
            addCriterion("riskCreateId =", value, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidNotEqualTo(Integer value) {
            addCriterion("riskCreateId <>", value, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidGreaterThan(Integer value) {
            addCriterion("riskCreateId >", value, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("riskCreateId >=", value, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidLessThan(Integer value) {
            addCriterion("riskCreateId <", value, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidLessThanOrEqualTo(Integer value) {
            addCriterion("riskCreateId <=", value, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidIn(List<Integer> values) {
            addCriterion("riskCreateId in", values, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidNotIn(List<Integer> values) {
            addCriterion("riskCreateId not in", values, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidBetween(Integer value1, Integer value2) {
            addCriterion("riskCreateId between", value1, value2, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("riskCreateId not between", value1, value2, "riskcreateid");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameIsNull() {
            addCriterion("riskCreateName is null");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameIsNotNull() {
            addCriterion("riskCreateName is not null");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameEqualTo(String value) {
            addCriterion("riskCreateName =", value, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameNotEqualTo(String value) {
            addCriterion("riskCreateName <>", value, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameGreaterThan(String value) {
            addCriterion("riskCreateName >", value, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("riskCreateName >=", value, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameLessThan(String value) {
            addCriterion("riskCreateName <", value, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameLessThanOrEqualTo(String value) {
            addCriterion("riskCreateName <=", value, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameLike(String value) {
            addCriterion("riskCreateName like", value, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameNotLike(String value) {
            addCriterion("riskCreateName not like", value, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameIn(List<String> values) {
            addCriterion("riskCreateName in", values, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameNotIn(List<String> values) {
            addCriterion("riskCreateName not in", values, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameBetween(String value1, String value2) {
            addCriterion("riskCreateName between", value1, value2, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskcreatenameNotBetween(String value1, String value2) {
            addCriterion("riskCreateName not between", value1, value2, "riskcreatename");
            return (Criteria) this;
        }

        public Criteria andRiskstatusIsNull() {
            addCriterion("riskStatus is null");
            return (Criteria) this;
        }

        public Criteria andRiskstatusIsNotNull() {
            addCriterion("riskStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRiskstatusEqualTo(Integer value) {
            addCriterion("riskStatus =", value, "riskstatus");
            return (Criteria) this;
        }

        public Criteria andRiskstatusNotEqualTo(Integer value) {
            addCriterion("riskStatus <>", value, "riskstatus");
            return (Criteria) this;
        }

        public Criteria andRiskstatusGreaterThan(Integer value) {
            addCriterion("riskStatus >", value, "riskstatus");
            return (Criteria) this;
        }

        public Criteria andRiskstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("riskStatus >=", value, "riskstatus");
            return (Criteria) this;
        }

        public Criteria andRiskstatusLessThan(Integer value) {
            addCriterion("riskStatus <", value, "riskstatus");
            return (Criteria) this;
        }

        public Criteria andRiskstatusLessThanOrEqualTo(Integer value) {
            addCriterion("riskStatus <=", value, "riskstatus");
            return (Criteria) this;
        }

        public Criteria andRiskstatusIn(List<Integer> values) {
            addCriterion("riskStatus in", values, "riskstatus");
            return (Criteria) this;
        }

        public Criteria andRiskstatusNotIn(List<Integer> values) {
            addCriterion("riskStatus not in", values, "riskstatus");
            return (Criteria) this;
        }

        public Criteria andRiskstatusBetween(Integer value1, Integer value2) {
            addCriterion("riskStatus between", value1, value2, "riskstatus");
            return (Criteria) this;
        }

        public Criteria andRiskstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("riskStatus not between", value1, value2, "riskstatus");
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