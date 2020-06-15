package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpvBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpvBackExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andBacktypeIsNull() {
            addCriterion("BackType is null");
            return (Criteria) this;
        }

        public Criteria andBacktypeIsNotNull() {
            addCriterion("BackType is not null");
            return (Criteria) this;
        }

        public Criteria andBacktypeEqualTo(String value) {
            addCriterion("BackType =", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeNotEqualTo(String value) {
            addCriterion("BackType <>", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeGreaterThan(String value) {
            addCriterion("BackType >", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeGreaterThanOrEqualTo(String value) {
            addCriterion("BackType >=", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeLessThan(String value) {
            addCriterion("BackType <", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeLessThanOrEqualTo(String value) {
            addCriterion("BackType <=", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeLike(String value) {
            addCriterion("BackType like", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeNotLike(String value) {
            addCriterion("BackType not like", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeIn(List<String> values) {
            addCriterion("BackType in", values, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeNotIn(List<String> values) {
            addCriterion("BackType not in", values, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeBetween(String value1, String value2) {
            addCriterion("BackType between", value1, value2, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeNotBetween(String value1, String value2) {
            addCriterion("BackType not between", value1, value2, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktitleIsNull() {
            addCriterion("BackTitle is null");
            return (Criteria) this;
        }

        public Criteria andBacktitleIsNotNull() {
            addCriterion("BackTitle is not null");
            return (Criteria) this;
        }

        public Criteria andBacktitleEqualTo(String value) {
            addCriterion("BackTitle =", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleNotEqualTo(String value) {
            addCriterion("BackTitle <>", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleGreaterThan(String value) {
            addCriterion("BackTitle >", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleGreaterThanOrEqualTo(String value) {
            addCriterion("BackTitle >=", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleLessThan(String value) {
            addCriterion("BackTitle <", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleLessThanOrEqualTo(String value) {
            addCriterion("BackTitle <=", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleLike(String value) {
            addCriterion("BackTitle like", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleNotLike(String value) {
            addCriterion("BackTitle not like", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleIn(List<String> values) {
            addCriterion("BackTitle in", values, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleNotIn(List<String> values) {
            addCriterion("BackTitle not in", values, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleBetween(String value1, String value2) {
            addCriterion("BackTitle between", value1, value2, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleNotBetween(String value1, String value2) {
            addCriterion("BackTitle not between", value1, value2, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBackcontentIsNull() {
            addCriterion("BackContent is null");
            return (Criteria) this;
        }

        public Criteria andBackcontentIsNotNull() {
            addCriterion("BackContent is not null");
            return (Criteria) this;
        }

        public Criteria andBackcontentEqualTo(String value) {
            addCriterion("BackContent =", value, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentNotEqualTo(String value) {
            addCriterion("BackContent <>", value, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentGreaterThan(String value) {
            addCriterion("BackContent >", value, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentGreaterThanOrEqualTo(String value) {
            addCriterion("BackContent >=", value, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentLessThan(String value) {
            addCriterion("BackContent <", value, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentLessThanOrEqualTo(String value) {
            addCriterion("BackContent <=", value, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentLike(String value) {
            addCriterion("BackContent like", value, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentNotLike(String value) {
            addCriterion("BackContent not like", value, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentIn(List<String> values) {
            addCriterion("BackContent in", values, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentNotIn(List<String> values) {
            addCriterion("BackContent not in", values, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentBetween(String value1, String value2) {
            addCriterion("BackContent between", value1, value2, "backcontent");
            return (Criteria) this;
        }

        public Criteria andBackcontentNotBetween(String value1, String value2) {
            addCriterion("BackContent not between", value1, value2, "backcontent");
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

        public Criteria andBackaccessoryIsNull() {
            addCriterion("BackAccessory is null");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryIsNotNull() {
            addCriterion("BackAccessory is not null");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryEqualTo(String value) {
            addCriterion("BackAccessory =", value, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryNotEqualTo(String value) {
            addCriterion("BackAccessory <>", value, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryGreaterThan(String value) {
            addCriterion("BackAccessory >", value, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("BackAccessory >=", value, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryLessThan(String value) {
            addCriterion("BackAccessory <", value, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryLessThanOrEqualTo(String value) {
            addCriterion("BackAccessory <=", value, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryLike(String value) {
            addCriterion("BackAccessory like", value, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryNotLike(String value) {
            addCriterion("BackAccessory not like", value, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryIn(List<String> values) {
            addCriterion("BackAccessory in", values, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryNotIn(List<String> values) {
            addCriterion("BackAccessory not in", values, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryBetween(String value1, String value2) {
            addCriterion("BackAccessory between", value1, value2, "backaccessory");
            return (Criteria) this;
        }

        public Criteria andBackaccessoryNotBetween(String value1, String value2) {
            addCriterion("BackAccessory not between", value1, value2, "backaccessory");
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