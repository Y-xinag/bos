package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditratingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditratingExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNull() {
            addCriterion("reserved1 is null");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNotNull() {
            addCriterion("reserved1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved1EqualTo(String value) {
            addCriterion("reserved1 =", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotEqualTo(String value) {
            addCriterion("reserved1 <>", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThan(String value) {
            addCriterion("reserved1 >", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThanOrEqualTo(String value) {
            addCriterion("reserved1 >=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThan(String value) {
            addCriterion("reserved1 <", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThanOrEqualTo(String value) {
            addCriterion("reserved1 <=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Like(String value) {
            addCriterion("reserved1 like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotLike(String value) {
            addCriterion("reserved1 not like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1In(List<String> values) {
            addCriterion("reserved1 in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotIn(List<String> values) {
            addCriterion("reserved1 not in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Between(String value1, String value2) {
            addCriterion("reserved1 between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotBetween(String value1, String value2) {
            addCriterion("reserved1 not between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNull() {
            addCriterion("reserved2 is null");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNotNull() {
            addCriterion("reserved2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved2EqualTo(String value) {
            addCriterion("reserved2 =", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotEqualTo(String value) {
            addCriterion("reserved2 <>", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThan(String value) {
            addCriterion("reserved2 >", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("reserved2 >=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThan(String value) {
            addCriterion("reserved2 <", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThanOrEqualTo(String value) {
            addCriterion("reserved2 <=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Like(String value) {
            addCriterion("reserved2 like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotLike(String value) {
            addCriterion("reserved2 not like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2In(List<String> values) {
            addCriterion("reserved2 in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotIn(List<String> values) {
            addCriterion("reserved2 not in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Between(String value1, String value2) {
            addCriterion("reserved2 between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotBetween(String value1, String value2) {
            addCriterion("reserved2 not between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIsNull() {
            addCriterion("cCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIsNotNull() {
            addCriterion("cCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeEqualTo(Date value) {
            addCriterion("cCreateTime =", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotEqualTo(Date value) {
            addCriterion("cCreateTime <>", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeGreaterThan(Date value) {
            addCriterion("cCreateTime >", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cCreateTime >=", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeLessThan(Date value) {
            addCriterion("cCreateTime <", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("cCreateTime <=", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIn(List<Date> values) {
            addCriterion("cCreateTime in", values, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotIn(List<Date> values) {
            addCriterion("cCreateTime not in", values, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeBetween(Date value1, Date value2) {
            addCriterion("cCreateTime between", value1, value2, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("cCreateTime not between", value1, value2, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreateidIsNull() {
            addCriterion("cCreateId is null");
            return (Criteria) this;
        }

        public Criteria andCcreateidIsNotNull() {
            addCriterion("cCreateId is not null");
            return (Criteria) this;
        }

        public Criteria andCcreateidEqualTo(Integer value) {
            addCriterion("cCreateId =", value, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreateidNotEqualTo(Integer value) {
            addCriterion("cCreateId <>", value, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreateidGreaterThan(Integer value) {
            addCriterion("cCreateId >", value, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cCreateId >=", value, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreateidLessThan(Integer value) {
            addCriterion("cCreateId <", value, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreateidLessThanOrEqualTo(Integer value) {
            addCriterion("cCreateId <=", value, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreateidIn(List<Integer> values) {
            addCriterion("cCreateId in", values, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreateidNotIn(List<Integer> values) {
            addCriterion("cCreateId not in", values, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreateidBetween(Integer value1, Integer value2) {
            addCriterion("cCreateId between", value1, value2, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("cCreateId not between", value1, value2, "ccreateid");
            return (Criteria) this;
        }

        public Criteria andCcreatenameIsNull() {
            addCriterion("cCreateName is null");
            return (Criteria) this;
        }

        public Criteria andCcreatenameIsNotNull() {
            addCriterion("cCreateName is not null");
            return (Criteria) this;
        }

        public Criteria andCcreatenameEqualTo(String value) {
            addCriterion("cCreateName =", value, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameNotEqualTo(String value) {
            addCriterion("cCreateName <>", value, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameGreaterThan(String value) {
            addCriterion("cCreateName >", value, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("cCreateName >=", value, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameLessThan(String value) {
            addCriterion("cCreateName <", value, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameLessThanOrEqualTo(String value) {
            addCriterion("cCreateName <=", value, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameLike(String value) {
            addCriterion("cCreateName like", value, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameNotLike(String value) {
            addCriterion("cCreateName not like", value, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameIn(List<String> values) {
            addCriterion("cCreateName in", values, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameNotIn(List<String> values) {
            addCriterion("cCreateName not in", values, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameBetween(String value1, String value2) {
            addCriterion("cCreateName between", value1, value2, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCcreatenameNotBetween(String value1, String value2) {
            addCriterion("cCreateName not between", value1, value2, "ccreatename");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNull() {
            addCriterion("cStatus is null");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNotNull() {
            addCriterion("cStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCstatusEqualTo(Integer value) {
            addCriterion("cStatus =", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotEqualTo(Integer value) {
            addCriterion("cStatus <>", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThan(Integer value) {
            addCriterion("cStatus >", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cStatus >=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThan(Integer value) {
            addCriterion("cStatus <", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThanOrEqualTo(Integer value) {
            addCriterion("cStatus <=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIn(List<Integer> values) {
            addCriterion("cStatus in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotIn(List<Integer> values) {
            addCriterion("cStatus not in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusBetween(Integer value1, Integer value2) {
            addCriterion("cStatus between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cStatus not between", value1, value2, "cstatus");
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