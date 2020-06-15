package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskpointwarningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskpointwarningExample() {
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

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Integer value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Integer value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Integer value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Integer value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Integer value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Integer> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Integer> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Integer value1, Integer value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Integer value1, Integer value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWarningidIsNull() {
            addCriterion("warningId is null");
            return (Criteria) this;
        }

        public Criteria andWarningidIsNotNull() {
            addCriterion("warningId is not null");
            return (Criteria) this;
        }

        public Criteria andWarningidEqualTo(Integer value) {
            addCriterion("warningId =", value, "warningid");
            return (Criteria) this;
        }

        public Criteria andWarningidNotEqualTo(Integer value) {
            addCriterion("warningId <>", value, "warningid");
            return (Criteria) this;
        }

        public Criteria andWarningidGreaterThan(Integer value) {
            addCriterion("warningId >", value, "warningid");
            return (Criteria) this;
        }

        public Criteria andWarningidGreaterThanOrEqualTo(Integer value) {
            addCriterion("warningId >=", value, "warningid");
            return (Criteria) this;
        }

        public Criteria andWarningidLessThan(Integer value) {
            addCriterion("warningId <", value, "warningid");
            return (Criteria) this;
        }

        public Criteria andWarningidLessThanOrEqualTo(Integer value) {
            addCriterion("warningId <=", value, "warningid");
            return (Criteria) this;
        }

        public Criteria andWarningidIn(List<Integer> values) {
            addCriterion("warningId in", values, "warningid");
            return (Criteria) this;
        }

        public Criteria andWarningidNotIn(List<Integer> values) {
            addCriterion("warningId not in", values, "warningid");
            return (Criteria) this;
        }

        public Criteria andWarningidBetween(Integer value1, Integer value2) {
            addCriterion("warningId between", value1, value2, "warningid");
            return (Criteria) this;
        }

        public Criteria andWarningidNotBetween(Integer value1, Integer value2) {
            addCriterion("warningId not between", value1, value2, "warningid");
            return (Criteria) this;
        }

        public Criteria andWtitleIsNull() {
            addCriterion("wTitle is null");
            return (Criteria) this;
        }

        public Criteria andWtitleIsNotNull() {
            addCriterion("wTitle is not null");
            return (Criteria) this;
        }

        public Criteria andWtitleEqualTo(String value) {
            addCriterion("wTitle =", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotEqualTo(String value) {
            addCriterion("wTitle <>", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleGreaterThan(String value) {
            addCriterion("wTitle >", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleGreaterThanOrEqualTo(String value) {
            addCriterion("wTitle >=", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleLessThan(String value) {
            addCriterion("wTitle <", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleLessThanOrEqualTo(String value) {
            addCriterion("wTitle <=", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleLike(String value) {
            addCriterion("wTitle like", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotLike(String value) {
            addCriterion("wTitle not like", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleIn(List<String> values) {
            addCriterion("wTitle in", values, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotIn(List<String> values) {
            addCriterion("wTitle not in", values, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleBetween(String value1, String value2) {
            addCriterion("wTitle between", value1, value2, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotBetween(String value1, String value2) {
            addCriterion("wTitle not between", value1, value2, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWcontentIsNull() {
            addCriterion("wContent is null");
            return (Criteria) this;
        }

        public Criteria andWcontentIsNotNull() {
            addCriterion("wContent is not null");
            return (Criteria) this;
        }

        public Criteria andWcontentEqualTo(String value) {
            addCriterion("wContent =", value, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentNotEqualTo(String value) {
            addCriterion("wContent <>", value, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentGreaterThan(String value) {
            addCriterion("wContent >", value, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentGreaterThanOrEqualTo(String value) {
            addCriterion("wContent >=", value, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentLessThan(String value) {
            addCriterion("wContent <", value, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentLessThanOrEqualTo(String value) {
            addCriterion("wContent <=", value, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentLike(String value) {
            addCriterion("wContent like", value, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentNotLike(String value) {
            addCriterion("wContent not like", value, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentIn(List<String> values) {
            addCriterion("wContent in", values, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentNotIn(List<String> values) {
            addCriterion("wContent not in", values, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentBetween(String value1, String value2) {
            addCriterion("wContent between", value1, value2, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcontentNotBetween(String value1, String value2) {
            addCriterion("wContent not between", value1, value2, "wcontent");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeIsNull() {
            addCriterion("wCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeIsNotNull() {
            addCriterion("wCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeEqualTo(Date value) {
            addCriterion("wCreateTime =", value, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeNotEqualTo(Date value) {
            addCriterion("wCreateTime <>", value, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeGreaterThan(Date value) {
            addCriterion("wCreateTime >", value, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("wCreateTime >=", value, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeLessThan(Date value) {
            addCriterion("wCreateTime <", value, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("wCreateTime <=", value, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeIn(List<Date> values) {
            addCriterion("wCreateTime in", values, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeNotIn(List<Date> values) {
            addCriterion("wCreateTime not in", values, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeBetween(Date value1, Date value2) {
            addCriterion("wCreateTime between", value1, value2, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("wCreateTime not between", value1, value2, "wcreatetime");
            return (Criteria) this;
        }

        public Criteria andWloginidIsNull() {
            addCriterion("wLoginId is null");
            return (Criteria) this;
        }

        public Criteria andWloginidIsNotNull() {
            addCriterion("wLoginId is not null");
            return (Criteria) this;
        }

        public Criteria andWloginidEqualTo(Integer value) {
            addCriterion("wLoginId =", value, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWloginidNotEqualTo(Integer value) {
            addCriterion("wLoginId <>", value, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWloginidGreaterThan(Integer value) {
            addCriterion("wLoginId >", value, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWloginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wLoginId >=", value, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWloginidLessThan(Integer value) {
            addCriterion("wLoginId <", value, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWloginidLessThanOrEqualTo(Integer value) {
            addCriterion("wLoginId <=", value, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWloginidIn(List<Integer> values) {
            addCriterion("wLoginId in", values, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWloginidNotIn(List<Integer> values) {
            addCriterion("wLoginId not in", values, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWloginidBetween(Integer value1, Integer value2) {
            addCriterion("wLoginId between", value1, value2, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWloginidNotBetween(Integer value1, Integer value2) {
            addCriterion("wLoginId not between", value1, value2, "wloginid");
            return (Criteria) this;
        }

        public Criteria andWcreatenameIsNull() {
            addCriterion("wCreateName is null");
            return (Criteria) this;
        }

        public Criteria andWcreatenameIsNotNull() {
            addCriterion("wCreateName is not null");
            return (Criteria) this;
        }

        public Criteria andWcreatenameEqualTo(String value) {
            addCriterion("wCreateName =", value, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameNotEqualTo(String value) {
            addCriterion("wCreateName <>", value, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameGreaterThan(String value) {
            addCriterion("wCreateName >", value, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("wCreateName >=", value, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameLessThan(String value) {
            addCriterion("wCreateName <", value, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameLessThanOrEqualTo(String value) {
            addCriterion("wCreateName <=", value, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameLike(String value) {
            addCriterion("wCreateName like", value, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameNotLike(String value) {
            addCriterion("wCreateName not like", value, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameIn(List<String> values) {
            addCriterion("wCreateName in", values, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameNotIn(List<String> values) {
            addCriterion("wCreateName not in", values, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameBetween(String value1, String value2) {
            addCriterion("wCreateName between", value1, value2, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWcreatenameNotBetween(String value1, String value2) {
            addCriterion("wCreateName not between", value1, value2, "wcreatename");
            return (Criteria) this;
        }

        public Criteria andWstatusIsNull() {
            addCriterion("wStatus is null");
            return (Criteria) this;
        }

        public Criteria andWstatusIsNotNull() {
            addCriterion("wStatus is not null");
            return (Criteria) this;
        }

        public Criteria andWstatusEqualTo(Integer value) {
            addCriterion("wStatus =", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotEqualTo(Integer value) {
            addCriterion("wStatus <>", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusGreaterThan(Integer value) {
            addCriterion("wStatus >", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wStatus >=", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusLessThan(Integer value) {
            addCriterion("wStatus <", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusLessThanOrEqualTo(Integer value) {
            addCriterion("wStatus <=", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusIn(List<Integer> values) {
            addCriterion("wStatus in", values, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotIn(List<Integer> values) {
            addCriterion("wStatus not in", values, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusBetween(Integer value1, Integer value2) {
            addCriterion("wStatus between", value1, value2, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wStatus not between", value1, value2, "wstatus");
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