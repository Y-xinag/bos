package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcessrickExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessrickExample() {
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

        public Criteria andProidIsNull() {
            addCriterion("proid is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("proid is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(Integer value) {
            addCriterion("proid =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(Integer value) {
            addCriterion("proid <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(Integer value) {
            addCriterion("proid >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(Integer value) {
            addCriterion("proid >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(Integer value) {
            addCriterion("proid <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(Integer value) {
            addCriterion("proid <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<Integer> values) {
            addCriterion("proid in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<Integer> values) {
            addCriterion("proid not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(Integer value1, Integer value2) {
            addCriterion("proid between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(Integer value1, Integer value2) {
            addCriterion("proid not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNull() {
            addCriterion("processID is null");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNotNull() {
            addCriterion("processID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessidEqualTo(Integer value) {
            addCriterion("processID =", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotEqualTo(Integer value) {
            addCriterion("processID <>", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThan(Integer value) {
            addCriterion("processID >", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("processID >=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThan(Integer value) {
            addCriterion("processID <", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThanOrEqualTo(Integer value) {
            addCriterion("processID <=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidIn(List<Integer> values) {
            addCriterion("processID in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotIn(List<Integer> values) {
            addCriterion("processID not in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidBetween(Integer value1, Integer value2) {
            addCriterion("processID between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotBetween(Integer value1, Integer value2) {
            addCriterion("processID not between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("proName is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("proName is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("proName =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("proName <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("proName >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proName >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("proName <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("proName <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("proName like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("proName not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("proName in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("proName not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("proName between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("proName not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andProyearIsNull() {
            addCriterion("proYear is null");
            return (Criteria) this;
        }

        public Criteria andProyearIsNotNull() {
            addCriterion("proYear is not null");
            return (Criteria) this;
        }

        public Criteria andProyearEqualTo(Date value) {
            addCriterion("proYear =", value, "proyear");
            return (Criteria) this;
        }

        public Criteria andProyearNotEqualTo(Date value) {
            addCriterion("proYear <>", value, "proyear");
            return (Criteria) this;
        }

        public Criteria andProyearGreaterThan(Date value) {
            addCriterion("proYear >", value, "proyear");
            return (Criteria) this;
        }

        public Criteria andProyearGreaterThanOrEqualTo(Date value) {
            addCriterion("proYear >=", value, "proyear");
            return (Criteria) this;
        }

        public Criteria andProyearLessThan(Date value) {
            addCriterion("proYear <", value, "proyear");
            return (Criteria) this;
        }

        public Criteria andProyearLessThanOrEqualTo(Date value) {
            addCriterion("proYear <=", value, "proyear");
            return (Criteria) this;
        }

        public Criteria andProyearIn(List<Date> values) {
            addCriterion("proYear in", values, "proyear");
            return (Criteria) this;
        }

        public Criteria andProyearNotIn(List<Date> values) {
            addCriterion("proYear not in", values, "proyear");
            return (Criteria) this;
        }

        public Criteria andProyearBetween(Date value1, Date value2) {
            addCriterion("proYear between", value1, value2, "proyear");
            return (Criteria) this;
        }

        public Criteria andProyearNotBetween(Date value1, Date value2) {
            addCriterion("proYear not between", value1, value2, "proyear");
            return (Criteria) this;
        }

        public Criteria andProinfomationIsNull() {
            addCriterion("proInfomation is null");
            return (Criteria) this;
        }

        public Criteria andProinfomationIsNotNull() {
            addCriterion("proInfomation is not null");
            return (Criteria) this;
        }

        public Criteria andProinfomationEqualTo(String value) {
            addCriterion("proInfomation =", value, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationNotEqualTo(String value) {
            addCriterion("proInfomation <>", value, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationGreaterThan(String value) {
            addCriterion("proInfomation >", value, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationGreaterThanOrEqualTo(String value) {
            addCriterion("proInfomation >=", value, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationLessThan(String value) {
            addCriterion("proInfomation <", value, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationLessThanOrEqualTo(String value) {
            addCriterion("proInfomation <=", value, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationLike(String value) {
            addCriterion("proInfomation like", value, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationNotLike(String value) {
            addCriterion("proInfomation not like", value, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationIn(List<String> values) {
            addCriterion("proInfomation in", values, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationNotIn(List<String> values) {
            addCriterion("proInfomation not in", values, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationBetween(String value1, String value2) {
            addCriterion("proInfomation between", value1, value2, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProinfomationNotBetween(String value1, String value2) {
            addCriterion("proInfomation not between", value1, value2, "proinfomation");
            return (Criteria) this;
        }

        public Criteria andProaccessoryIsNull() {
            addCriterion("proAccessory is null");
            return (Criteria) this;
        }

        public Criteria andProaccessoryIsNotNull() {
            addCriterion("proAccessory is not null");
            return (Criteria) this;
        }

        public Criteria andProaccessoryEqualTo(String value) {
            addCriterion("proAccessory =", value, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryNotEqualTo(String value) {
            addCriterion("proAccessory <>", value, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryGreaterThan(String value) {
            addCriterion("proAccessory >", value, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("proAccessory >=", value, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryLessThan(String value) {
            addCriterion("proAccessory <", value, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryLessThanOrEqualTo(String value) {
            addCriterion("proAccessory <=", value, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryLike(String value) {
            addCriterion("proAccessory like", value, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryNotLike(String value) {
            addCriterion("proAccessory not like", value, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryIn(List<String> values) {
            addCriterion("proAccessory in", values, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryNotIn(List<String> values) {
            addCriterion("proAccessory not in", values, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryBetween(String value1, String value2) {
            addCriterion("proAccessory between", value1, value2, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProaccessoryNotBetween(String value1, String value2) {
            addCriterion("proAccessory not between", value1, value2, "proaccessory");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeIsNull() {
            addCriterion("proCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeIsNotNull() {
            addCriterion("proCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeEqualTo(Date value) {
            addCriterion("proCreateTime =", value, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeNotEqualTo(Date value) {
            addCriterion("proCreateTime <>", value, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeGreaterThan(Date value) {
            addCriterion("proCreateTime >", value, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("proCreateTime >=", value, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeLessThan(Date value) {
            addCriterion("proCreateTime <", value, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("proCreateTime <=", value, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeIn(List<Date> values) {
            addCriterion("proCreateTime in", values, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeNotIn(List<Date> values) {
            addCriterion("proCreateTime not in", values, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeBetween(Date value1, Date value2) {
            addCriterion("proCreateTime between", value1, value2, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("proCreateTime not between", value1, value2, "procreatetime");
            return (Criteria) this;
        }

        public Criteria andProcreateidIsNull() {
            addCriterion("proCreateId is null");
            return (Criteria) this;
        }

        public Criteria andProcreateidIsNotNull() {
            addCriterion("proCreateId is not null");
            return (Criteria) this;
        }

        public Criteria andProcreateidEqualTo(Integer value) {
            addCriterion("proCreateId =", value, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreateidNotEqualTo(Integer value) {
            addCriterion("proCreateId <>", value, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreateidGreaterThan(Integer value) {
            addCriterion("proCreateId >", value, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("proCreateId >=", value, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreateidLessThan(Integer value) {
            addCriterion("proCreateId <", value, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreateidLessThanOrEqualTo(Integer value) {
            addCriterion("proCreateId <=", value, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreateidIn(List<Integer> values) {
            addCriterion("proCreateId in", values, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreateidNotIn(List<Integer> values) {
            addCriterion("proCreateId not in", values, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreateidBetween(Integer value1, Integer value2) {
            addCriterion("proCreateId between", value1, value2, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("proCreateId not between", value1, value2, "procreateid");
            return (Criteria) this;
        }

        public Criteria andProcreatenameIsNull() {
            addCriterion("proCreateName is null");
            return (Criteria) this;
        }

        public Criteria andProcreatenameIsNotNull() {
            addCriterion("proCreateName is not null");
            return (Criteria) this;
        }

        public Criteria andProcreatenameEqualTo(String value) {
            addCriterion("proCreateName =", value, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameNotEqualTo(String value) {
            addCriterion("proCreateName <>", value, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameGreaterThan(String value) {
            addCriterion("proCreateName >", value, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("proCreateName >=", value, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameLessThan(String value) {
            addCriterion("proCreateName <", value, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameLessThanOrEqualTo(String value) {
            addCriterion("proCreateName <=", value, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameLike(String value) {
            addCriterion("proCreateName like", value, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameNotLike(String value) {
            addCriterion("proCreateName not like", value, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameIn(List<String> values) {
            addCriterion("proCreateName in", values, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameNotIn(List<String> values) {
            addCriterion("proCreateName not in", values, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameBetween(String value1, String value2) {
            addCriterion("proCreateName between", value1, value2, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProcreatenameNotBetween(String value1, String value2) {
            addCriterion("proCreateName not between", value1, value2, "procreatename");
            return (Criteria) this;
        }

        public Criteria andProstatusIsNull() {
            addCriterion("proStatus is null");
            return (Criteria) this;
        }

        public Criteria andProstatusIsNotNull() {
            addCriterion("proStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProstatusEqualTo(Integer value) {
            addCriterion("proStatus =", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusNotEqualTo(Integer value) {
            addCriterion("proStatus <>", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusGreaterThan(Integer value) {
            addCriterion("proStatus >", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("proStatus >=", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusLessThan(Integer value) {
            addCriterion("proStatus <", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusLessThanOrEqualTo(Integer value) {
            addCriterion("proStatus <=", value, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusIn(List<Integer> values) {
            addCriterion("proStatus in", values, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusNotIn(List<Integer> values) {
            addCriterion("proStatus not in", values, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusBetween(Integer value1, Integer value2) {
            addCriterion("proStatus between", value1, value2, "prostatus");
            return (Criteria) this;
        }

        public Criteria andProstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("proStatus not between", value1, value2, "prostatus");
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