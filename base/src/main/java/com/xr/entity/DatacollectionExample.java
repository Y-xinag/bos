package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatacollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatacollectionExample() {
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

        public Criteria andDtitleIsNull() {
            addCriterion("dTitle is null");
            return (Criteria) this;
        }

        public Criteria andDtitleIsNotNull() {
            addCriterion("dTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDtitleEqualTo(String value) {
            addCriterion("dTitle =", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleNotEqualTo(String value) {
            addCriterion("dTitle <>", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleGreaterThan(String value) {
            addCriterion("dTitle >", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleGreaterThanOrEqualTo(String value) {
            addCriterion("dTitle >=", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleLessThan(String value) {
            addCriterion("dTitle <", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleLessThanOrEqualTo(String value) {
            addCriterion("dTitle <=", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleLike(String value) {
            addCriterion("dTitle like", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleNotLike(String value) {
            addCriterion("dTitle not like", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleIn(List<String> values) {
            addCriterion("dTitle in", values, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleNotIn(List<String> values) {
            addCriterion("dTitle not in", values, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleBetween(String value1, String value2) {
            addCriterion("dTitle between", value1, value2, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleNotBetween(String value1, String value2) {
            addCriterion("dTitle not between", value1, value2, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDfilenameIsNull() {
            addCriterion("dFileName is null");
            return (Criteria) this;
        }

        public Criteria andDfilenameIsNotNull() {
            addCriterion("dFileName is not null");
            return (Criteria) this;
        }

        public Criteria andDfilenameEqualTo(String value) {
            addCriterion("dFileName =", value, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameNotEqualTo(String value) {
            addCriterion("dFileName <>", value, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameGreaterThan(String value) {
            addCriterion("dFileName >", value, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("dFileName >=", value, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameLessThan(String value) {
            addCriterion("dFileName <", value, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameLessThanOrEqualTo(String value) {
            addCriterion("dFileName <=", value, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameLike(String value) {
            addCriterion("dFileName like", value, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameNotLike(String value) {
            addCriterion("dFileName not like", value, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameIn(List<String> values) {
            addCriterion("dFileName in", values, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameNotIn(List<String> values) {
            addCriterion("dFileName not in", values, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameBetween(String value1, String value2) {
            addCriterion("dFileName between", value1, value2, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfilenameNotBetween(String value1, String value2) {
            addCriterion("dFileName not between", value1, value2, "dfilename");
            return (Criteria) this;
        }

        public Criteria andDfileIsNull() {
            addCriterion("dFile is null");
            return (Criteria) this;
        }

        public Criteria andDfileIsNotNull() {
            addCriterion("dFile is not null");
            return (Criteria) this;
        }

        public Criteria andDfileEqualTo(String value) {
            addCriterion("dFile =", value, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileNotEqualTo(String value) {
            addCriterion("dFile <>", value, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileGreaterThan(String value) {
            addCriterion("dFile >", value, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileGreaterThanOrEqualTo(String value) {
            addCriterion("dFile >=", value, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileLessThan(String value) {
            addCriterion("dFile <", value, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileLessThanOrEqualTo(String value) {
            addCriterion("dFile <=", value, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileLike(String value) {
            addCriterion("dFile like", value, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileNotLike(String value) {
            addCriterion("dFile not like", value, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileIn(List<String> values) {
            addCriterion("dFile in", values, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileNotIn(List<String> values) {
            addCriterion("dFile not in", values, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileBetween(String value1, String value2) {
            addCriterion("dFile between", value1, value2, "dfile");
            return (Criteria) this;
        }

        public Criteria andDfileNotBetween(String value1, String value2) {
            addCriterion("dFile not between", value1, value2, "dfile");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeIsNull() {
            addCriterion("dCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeIsNotNull() {
            addCriterion("dCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeEqualTo(Date value) {
            addCriterion("dCreateTime =", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeNotEqualTo(Date value) {
            addCriterion("dCreateTime <>", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeGreaterThan(Date value) {
            addCriterion("dCreateTime >", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dCreateTime >=", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeLessThan(Date value) {
            addCriterion("dCreateTime <", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("dCreateTime <=", value, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeIn(List<Date> values) {
            addCriterion("dCreateTime in", values, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeNotIn(List<Date> values) {
            addCriterion("dCreateTime not in", values, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeBetween(Date value1, Date value2) {
            addCriterion("dCreateTime between", value1, value2, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("dCreateTime not between", value1, value2, "dcreatetime");
            return (Criteria) this;
        }

        public Criteria andDcreateidIsNull() {
            addCriterion("dCreateId is null");
            return (Criteria) this;
        }

        public Criteria andDcreateidIsNotNull() {
            addCriterion("dCreateId is not null");
            return (Criteria) this;
        }

        public Criteria andDcreateidEqualTo(Integer value) {
            addCriterion("dCreateId =", value, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreateidNotEqualTo(Integer value) {
            addCriterion("dCreateId <>", value, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreateidGreaterThan(Integer value) {
            addCriterion("dCreateId >", value, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dCreateId >=", value, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreateidLessThan(Integer value) {
            addCriterion("dCreateId <", value, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreateidLessThanOrEqualTo(Integer value) {
            addCriterion("dCreateId <=", value, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreateidIn(List<Integer> values) {
            addCriterion("dCreateId in", values, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreateidNotIn(List<Integer> values) {
            addCriterion("dCreateId not in", values, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreateidBetween(Integer value1, Integer value2) {
            addCriterion("dCreateId between", value1, value2, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("dCreateId not between", value1, value2, "dcreateid");
            return (Criteria) this;
        }

        public Criteria andDcreatenameIsNull() {
            addCriterion("dCreateName is null");
            return (Criteria) this;
        }

        public Criteria andDcreatenameIsNotNull() {
            addCriterion("dCreateName is not null");
            return (Criteria) this;
        }

        public Criteria andDcreatenameEqualTo(String value) {
            addCriterion("dCreateName =", value, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameNotEqualTo(String value) {
            addCriterion("dCreateName <>", value, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameGreaterThan(String value) {
            addCriterion("dCreateName >", value, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("dCreateName >=", value, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameLessThan(String value) {
            addCriterion("dCreateName <", value, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameLessThanOrEqualTo(String value) {
            addCriterion("dCreateName <=", value, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameLike(String value) {
            addCriterion("dCreateName like", value, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameNotLike(String value) {
            addCriterion("dCreateName not like", value, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameIn(List<String> values) {
            addCriterion("dCreateName in", values, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameNotIn(List<String> values) {
            addCriterion("dCreateName not in", values, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameBetween(String value1, String value2) {
            addCriterion("dCreateName between", value1, value2, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDcreatenameNotBetween(String value1, String value2) {
            addCriterion("dCreateName not between", value1, value2, "dcreatename");
            return (Criteria) this;
        }

        public Criteria andDstatusIsNull() {
            addCriterion("dStatus is null");
            return (Criteria) this;
        }

        public Criteria andDstatusIsNotNull() {
            addCriterion("dStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDstatusEqualTo(Integer value) {
            addCriterion("dStatus =", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotEqualTo(Integer value) {
            addCriterion("dStatus <>", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusGreaterThan(Integer value) {
            addCriterion("dStatus >", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dStatus >=", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusLessThan(Integer value) {
            addCriterion("dStatus <", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusLessThanOrEqualTo(Integer value) {
            addCriterion("dStatus <=", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusIn(List<Integer> values) {
            addCriterion("dStatus in", values, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotIn(List<Integer> values) {
            addCriterion("dStatus not in", values, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusBetween(Integer value1, Integer value2) {
            addCriterion("dStatus between", value1, value2, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dStatus not between", value1, value2, "dstatus");
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