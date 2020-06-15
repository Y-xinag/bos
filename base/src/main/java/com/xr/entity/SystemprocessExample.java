package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemprocessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemprocessExample() {
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

        public Criteria andSysidIsNull() {
            addCriterion("sysid is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("sysid is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(Integer value) {
            addCriterion("sysid =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(Integer value) {
            addCriterion("sysid <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(Integer value) {
            addCriterion("sysid >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysid >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(Integer value) {
            addCriterion("sysid <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(Integer value) {
            addCriterion("sysid <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<Integer> values) {
            addCriterion("sysid in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<Integer> values) {
            addCriterion("sysid not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(Integer value1, Integer value2) {
            addCriterion("sysid between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(Integer value1, Integer value2) {
            addCriterion("sysid not between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSystitleIsNull() {
            addCriterion("sysTitle is null");
            return (Criteria) this;
        }

        public Criteria andSystitleIsNotNull() {
            addCriterion("sysTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSystitleEqualTo(String value) {
            addCriterion("sysTitle =", value, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleNotEqualTo(String value) {
            addCriterion("sysTitle <>", value, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleGreaterThan(String value) {
            addCriterion("sysTitle >", value, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleGreaterThanOrEqualTo(String value) {
            addCriterion("sysTitle >=", value, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleLessThan(String value) {
            addCriterion("sysTitle <", value, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleLessThanOrEqualTo(String value) {
            addCriterion("sysTitle <=", value, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleLike(String value) {
            addCriterion("sysTitle like", value, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleNotLike(String value) {
            addCriterion("sysTitle not like", value, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleIn(List<String> values) {
            addCriterion("sysTitle in", values, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleNotIn(List<String> values) {
            addCriterion("sysTitle not in", values, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleBetween(String value1, String value2) {
            addCriterion("sysTitle between", value1, value2, "systitle");
            return (Criteria) this;
        }

        public Criteria andSystitleNotBetween(String value1, String value2) {
            addCriterion("sysTitle not between", value1, value2, "systitle");
            return (Criteria) this;
        }

        public Criteria andSyscontentIsNull() {
            addCriterion("sysContent is null");
            return (Criteria) this;
        }

        public Criteria andSyscontentIsNotNull() {
            addCriterion("sysContent is not null");
            return (Criteria) this;
        }

        public Criteria andSyscontentEqualTo(String value) {
            addCriterion("sysContent =", value, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentNotEqualTo(String value) {
            addCriterion("sysContent <>", value, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentGreaterThan(String value) {
            addCriterion("sysContent >", value, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentGreaterThanOrEqualTo(String value) {
            addCriterion("sysContent >=", value, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentLessThan(String value) {
            addCriterion("sysContent <", value, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentLessThanOrEqualTo(String value) {
            addCriterion("sysContent <=", value, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentLike(String value) {
            addCriterion("sysContent like", value, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentNotLike(String value) {
            addCriterion("sysContent not like", value, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentIn(List<String> values) {
            addCriterion("sysContent in", values, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentNotIn(List<String> values) {
            addCriterion("sysContent not in", values, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentBetween(String value1, String value2) {
            addCriterion("sysContent between", value1, value2, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscontentNotBetween(String value1, String value2) {
            addCriterion("sysContent not between", value1, value2, "syscontent");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeIsNull() {
            addCriterion("sysCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeIsNotNull() {
            addCriterion("sysCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeEqualTo(Date value) {
            addCriterion("sysCreateTime =", value, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeNotEqualTo(Date value) {
            addCriterion("sysCreateTime <>", value, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeGreaterThan(Date value) {
            addCriterion("sysCreateTime >", value, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sysCreateTime >=", value, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeLessThan(Date value) {
            addCriterion("sysCreateTime <", value, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("sysCreateTime <=", value, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeIn(List<Date> values) {
            addCriterion("sysCreateTime in", values, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeNotIn(List<Date> values) {
            addCriterion("sysCreateTime not in", values, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeBetween(Date value1, Date value2) {
            addCriterion("sysCreateTime between", value1, value2, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSyscreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("sysCreateTime not between", value1, value2, "syscreatetime");
            return (Criteria) this;
        }

        public Criteria andSysloginidIsNull() {
            addCriterion("sysLoginId is null");
            return (Criteria) this;
        }

        public Criteria andSysloginidIsNotNull() {
            addCriterion("sysLoginId is not null");
            return (Criteria) this;
        }

        public Criteria andSysloginidEqualTo(Integer value) {
            addCriterion("sysLoginId =", value, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSysloginidNotEqualTo(Integer value) {
            addCriterion("sysLoginId <>", value, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSysloginidGreaterThan(Integer value) {
            addCriterion("sysLoginId >", value, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSysloginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysLoginId >=", value, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSysloginidLessThan(Integer value) {
            addCriterion("sysLoginId <", value, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSysloginidLessThanOrEqualTo(Integer value) {
            addCriterion("sysLoginId <=", value, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSysloginidIn(List<Integer> values) {
            addCriterion("sysLoginId in", values, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSysloginidNotIn(List<Integer> values) {
            addCriterion("sysLoginId not in", values, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSysloginidBetween(Integer value1, Integer value2) {
            addCriterion("sysLoginId between", value1, value2, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSysloginidNotBetween(Integer value1, Integer value2) {
            addCriterion("sysLoginId not between", value1, value2, "sysloginid");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameIsNull() {
            addCriterion("sysCreateName is null");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameIsNotNull() {
            addCriterion("sysCreateName is not null");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameEqualTo(String value) {
            addCriterion("sysCreateName =", value, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameNotEqualTo(String value) {
            addCriterion("sysCreateName <>", value, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameGreaterThan(String value) {
            addCriterion("sysCreateName >", value, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("sysCreateName >=", value, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameLessThan(String value) {
            addCriterion("sysCreateName <", value, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameLessThanOrEqualTo(String value) {
            addCriterion("sysCreateName <=", value, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameLike(String value) {
            addCriterion("sysCreateName like", value, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameNotLike(String value) {
            addCriterion("sysCreateName not like", value, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameIn(List<String> values) {
            addCriterion("sysCreateName in", values, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameNotIn(List<String> values) {
            addCriterion("sysCreateName not in", values, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameBetween(String value1, String value2) {
            addCriterion("sysCreateName between", value1, value2, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSyscreatenameNotBetween(String value1, String value2) {
            addCriterion("sysCreateName not between", value1, value2, "syscreatename");
            return (Criteria) this;
        }

        public Criteria andSysstatusIsNull() {
            addCriterion("sysStatus is null");
            return (Criteria) this;
        }

        public Criteria andSysstatusIsNotNull() {
            addCriterion("sysStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSysstatusEqualTo(Integer value) {
            addCriterion("sysStatus =", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotEqualTo(Integer value) {
            addCriterion("sysStatus <>", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusGreaterThan(Integer value) {
            addCriterion("sysStatus >", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysStatus >=", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusLessThan(Integer value) {
            addCriterion("sysStatus <", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusLessThanOrEqualTo(Integer value) {
            addCriterion("sysStatus <=", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusIn(List<Integer> values) {
            addCriterion("sysStatus in", values, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotIn(List<Integer> values) {
            addCriterion("sysStatus not in", values, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusBetween(Integer value1, Integer value2) {
            addCriterion("sysStatus between", value1, value2, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sysStatus not between", value1, value2, "sysstatus");
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