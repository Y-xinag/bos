package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskdispositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskdispositionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileIsNull() {
            addCriterion("dispositionTitile is null");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileIsNotNull() {
            addCriterion("dispositionTitile is not null");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileEqualTo(String value) {
            addCriterion("dispositionTitile =", value, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileNotEqualTo(String value) {
            addCriterion("dispositionTitile <>", value, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileGreaterThan(String value) {
            addCriterion("dispositionTitile >", value, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileGreaterThanOrEqualTo(String value) {
            addCriterion("dispositionTitile >=", value, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileLessThan(String value) {
            addCriterion("dispositionTitile <", value, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileLessThanOrEqualTo(String value) {
            addCriterion("dispositionTitile <=", value, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileLike(String value) {
            addCriterion("dispositionTitile like", value, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileNotLike(String value) {
            addCriterion("dispositionTitile not like", value, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileIn(List<String> values) {
            addCriterion("dispositionTitile in", values, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileNotIn(List<String> values) {
            addCriterion("dispositionTitile not in", values, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileBetween(String value1, String value2) {
            addCriterion("dispositionTitile between", value1, value2, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositiontitileNotBetween(String value1, String value2) {
            addCriterion("dispositionTitile not between", value1, value2, "dispositiontitile");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentIsNull() {
            addCriterion("dispositionContent is null");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentIsNotNull() {
            addCriterion("dispositionContent is not null");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentEqualTo(String value) {
            addCriterion("dispositionContent =", value, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentNotEqualTo(String value) {
            addCriterion("dispositionContent <>", value, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentGreaterThan(String value) {
            addCriterion("dispositionContent >", value, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentGreaterThanOrEqualTo(String value) {
            addCriterion("dispositionContent >=", value, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentLessThan(String value) {
            addCriterion("dispositionContent <", value, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentLessThanOrEqualTo(String value) {
            addCriterion("dispositionContent <=", value, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentLike(String value) {
            addCriterion("dispositionContent like", value, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentNotLike(String value) {
            addCriterion("dispositionContent not like", value, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentIn(List<String> values) {
            addCriterion("dispositionContent in", values, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentNotIn(List<String> values) {
            addCriterion("dispositionContent not in", values, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentBetween(String value1, String value2) {
            addCriterion("dispositionContent between", value1, value2, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andDispositioncontentNotBetween(String value1, String value2) {
            addCriterion("dispositionContent not between", value1, value2, "dispositioncontent");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNull() {
            addCriterion("positionID is null");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNotNull() {
            addCriterion("positionID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionidEqualTo(Integer value) {
            addCriterion("positionID =", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotEqualTo(Integer value) {
            addCriterion("positionID <>", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThan(Integer value) {
            addCriterion("positionID >", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("positionID >=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThan(Integer value) {
            addCriterion("positionID <", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThanOrEqualTo(Integer value) {
            addCriterion("positionID <=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidIn(List<Integer> values) {
            addCriterion("positionID in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotIn(List<Integer> values) {
            addCriterion("positionID not in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidBetween(Integer value1, Integer value2) {
            addCriterion("positionID between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotBetween(Integer value1, Integer value2) {
            addCriterion("positionID not between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidIsNull() {
            addCriterion("riskLevelID is null");
            return (Criteria) this;
        }

        public Criteria andRisklevelidIsNotNull() {
            addCriterion("riskLevelID is not null");
            return (Criteria) this;
        }

        public Criteria andRisklevelidEqualTo(Integer value) {
            addCriterion("riskLevelID =", value, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidNotEqualTo(Integer value) {
            addCriterion("riskLevelID <>", value, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidGreaterThan(Integer value) {
            addCriterion("riskLevelID >", value, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("riskLevelID >=", value, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidLessThan(Integer value) {
            addCriterion("riskLevelID <", value, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidLessThanOrEqualTo(Integer value) {
            addCriterion("riskLevelID <=", value, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidIn(List<Integer> values) {
            addCriterion("riskLevelID in", values, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidNotIn(List<Integer> values) {
            addCriterion("riskLevelID not in", values, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidBetween(Integer value1, Integer value2) {
            addCriterion("riskLevelID between", value1, value2, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andRisklevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("riskLevelID not between", value1, value2, "risklevelid");
            return (Criteria) this;
        }

        public Criteria andDisposeresultIsNull() {
            addCriterion("disposeResult is null");
            return (Criteria) this;
        }

        public Criteria andDisposeresultIsNotNull() {
            addCriterion("disposeResult is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeresultEqualTo(String value) {
            addCriterion("disposeResult =", value, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultNotEqualTo(String value) {
            addCriterion("disposeResult <>", value, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultGreaterThan(String value) {
            addCriterion("disposeResult >", value, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultGreaterThanOrEqualTo(String value) {
            addCriterion("disposeResult >=", value, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultLessThan(String value) {
            addCriterion("disposeResult <", value, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultLessThanOrEqualTo(String value) {
            addCriterion("disposeResult <=", value, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultLike(String value) {
            addCriterion("disposeResult like", value, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultNotLike(String value) {
            addCriterion("disposeResult not like", value, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultIn(List<String> values) {
            addCriterion("disposeResult in", values, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultNotIn(List<String> values) {
            addCriterion("disposeResult not in", values, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultBetween(String value1, String value2) {
            addCriterion("disposeResult between", value1, value2, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andDisposeresultNotBetween(String value1, String value2) {
            addCriterion("disposeResult not between", value1, value2, "disposeresult");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNull() {
            addCriterion("loginID is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("loginID is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(Integer value) {
            addCriterion("loginID =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(Integer value) {
            addCriterion("loginID <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(Integer value) {
            addCriterion("loginID >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginID >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(Integer value) {
            addCriterion("loginID <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(Integer value) {
            addCriterion("loginID <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<Integer> values) {
            addCriterion("loginID in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<Integer> values) {
            addCriterion("loginID not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(Integer value1, Integer value2) {
            addCriterion("loginID between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(Integer value1, Integer value2) {
            addCriterion("loginID not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("createName is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createName =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createName <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createName >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createName >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createName <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createName <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createName like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createName not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createName in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createName not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createName between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createName not between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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