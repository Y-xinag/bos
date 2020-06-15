package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LetterreportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LetterreportExample() {
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

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("lid not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLetteridIsNull() {
            addCriterion("letterId is null");
            return (Criteria) this;
        }

        public Criteria andLetteridIsNotNull() {
            addCriterion("letterId is not null");
            return (Criteria) this;
        }

        public Criteria andLetteridEqualTo(Integer value) {
            addCriterion("letterId =", value, "letterid");
            return (Criteria) this;
        }

        public Criteria andLetteridNotEqualTo(Integer value) {
            addCriterion("letterId <>", value, "letterid");
            return (Criteria) this;
        }

        public Criteria andLetteridGreaterThan(Integer value) {
            addCriterion("letterId >", value, "letterid");
            return (Criteria) this;
        }

        public Criteria andLetteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("letterId >=", value, "letterid");
            return (Criteria) this;
        }

        public Criteria andLetteridLessThan(Integer value) {
            addCriterion("letterId <", value, "letterid");
            return (Criteria) this;
        }

        public Criteria andLetteridLessThanOrEqualTo(Integer value) {
            addCriterion("letterId <=", value, "letterid");
            return (Criteria) this;
        }

        public Criteria andLetteridIn(List<Integer> values) {
            addCriterion("letterId in", values, "letterid");
            return (Criteria) this;
        }

        public Criteria andLetteridNotIn(List<Integer> values) {
            addCriterion("letterId not in", values, "letterid");
            return (Criteria) this;
        }

        public Criteria andLetteridBetween(Integer value1, Integer value2) {
            addCriterion("letterId between", value1, value2, "letterid");
            return (Criteria) this;
        }

        public Criteria andLetteridNotBetween(Integer value1, Integer value2) {
            addCriterion("letterId not between", value1, value2, "letterid");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNull() {
            addCriterion("lTime is null");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNotNull() {
            addCriterion("lTime is not null");
            return (Criteria) this;
        }

        public Criteria andLtimeEqualTo(Date value) {
            addCriterion("lTime =", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotEqualTo(Date value) {
            addCriterion("lTime <>", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThan(Date value) {
            addCriterion("lTime >", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lTime >=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThan(Date value) {
            addCriterion("lTime <", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThanOrEqualTo(Date value) {
            addCriterion("lTime <=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeIn(List<Date> values) {
            addCriterion("lTime in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotIn(List<Date> values) {
            addCriterion("lTime not in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeBetween(Date value1, Date value2) {
            addCriterion("lTime between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotBetween(Date value1, Date value2) {
            addCriterion("lTime not between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameIsNull() {
            addCriterion("lComplainantName is null");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameIsNotNull() {
            addCriterion("lComplainantName is not null");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameEqualTo(String value) {
            addCriterion("lComplainantName =", value, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameNotEqualTo(String value) {
            addCriterion("lComplainantName <>", value, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameGreaterThan(String value) {
            addCriterion("lComplainantName >", value, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameGreaterThanOrEqualTo(String value) {
            addCriterion("lComplainantName >=", value, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameLessThan(String value) {
            addCriterion("lComplainantName <", value, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameLessThanOrEqualTo(String value) {
            addCriterion("lComplainantName <=", value, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameLike(String value) {
            addCriterion("lComplainantName like", value, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameNotLike(String value) {
            addCriterion("lComplainantName not like", value, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameIn(List<String> values) {
            addCriterion("lComplainantName in", values, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameNotIn(List<String> values) {
            addCriterion("lComplainantName not in", values, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameBetween(String value1, String value2) {
            addCriterion("lComplainantName between", value1, value2, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLcomplainantnameNotBetween(String value1, String value2) {
            addCriterion("lComplainantName not between", value1, value2, "lcomplainantname");
            return (Criteria) this;
        }

        public Criteria andLdeptidIsNull() {
            addCriterion("lDeptId is null");
            return (Criteria) this;
        }

        public Criteria andLdeptidIsNotNull() {
            addCriterion("lDeptId is not null");
            return (Criteria) this;
        }

        public Criteria andLdeptidEqualTo(Integer value) {
            addCriterion("lDeptId =", value, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLdeptidNotEqualTo(Integer value) {
            addCriterion("lDeptId <>", value, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLdeptidGreaterThan(Integer value) {
            addCriterion("lDeptId >", value, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lDeptId >=", value, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLdeptidLessThan(Integer value) {
            addCriterion("lDeptId <", value, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("lDeptId <=", value, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLdeptidIn(List<Integer> values) {
            addCriterion("lDeptId in", values, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLdeptidNotIn(List<Integer> values) {
            addCriterion("lDeptId not in", values, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLdeptidBetween(Integer value1, Integer value2) {
            addCriterion("lDeptId between", value1, value2, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("lDeptId not between", value1, value2, "ldeptid");
            return (Criteria) this;
        }

        public Criteria andLpostidIsNull() {
            addCriterion("lPostId is null");
            return (Criteria) this;
        }

        public Criteria andLpostidIsNotNull() {
            addCriterion("lPostId is not null");
            return (Criteria) this;
        }

        public Criteria andLpostidEqualTo(Integer value) {
            addCriterion("lPostId =", value, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpostidNotEqualTo(Integer value) {
            addCriterion("lPostId <>", value, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpostidGreaterThan(Integer value) {
            addCriterion("lPostId >", value, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lPostId >=", value, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpostidLessThan(Integer value) {
            addCriterion("lPostId <", value, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpostidLessThanOrEqualTo(Integer value) {
            addCriterion("lPostId <=", value, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpostidIn(List<Integer> values) {
            addCriterion("lPostId in", values, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpostidNotIn(List<Integer> values) {
            addCriterion("lPostId not in", values, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpostidBetween(Integer value1, Integer value2) {
            addCriterion("lPostId between", value1, value2, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpostidNotBetween(Integer value1, Integer value2) {
            addCriterion("lPostId not between", value1, value2, "lpostid");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedIsNull() {
            addCriterion("lPersonBeReported is null");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedIsNotNull() {
            addCriterion("lPersonBeReported is not null");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedEqualTo(String value) {
            addCriterion("lPersonBeReported =", value, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedNotEqualTo(String value) {
            addCriterion("lPersonBeReported <>", value, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedGreaterThan(String value) {
            addCriterion("lPersonBeReported >", value, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedGreaterThanOrEqualTo(String value) {
            addCriterion("lPersonBeReported >=", value, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedLessThan(String value) {
            addCriterion("lPersonBeReported <", value, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedLessThanOrEqualTo(String value) {
            addCriterion("lPersonBeReported <=", value, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedLike(String value) {
            addCriterion("lPersonBeReported like", value, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedNotLike(String value) {
            addCriterion("lPersonBeReported not like", value, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedIn(List<String> values) {
            addCriterion("lPersonBeReported in", values, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedNotIn(List<String> values) {
            addCriterion("lPersonBeReported not in", values, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedBetween(String value1, String value2) {
            addCriterion("lPersonBeReported between", value1, value2, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpersonbereportedNotBetween(String value1, String value2) {
            addCriterion("lPersonBeReported not between", value1, value2, "lpersonbereported");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidIsNull() {
            addCriterion("lPbrDeptId is null");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidIsNotNull() {
            addCriterion("lPbrDeptId is not null");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidEqualTo(Integer value) {
            addCriterion("lPbrDeptId =", value, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidNotEqualTo(Integer value) {
            addCriterion("lPbrDeptId <>", value, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidGreaterThan(Integer value) {
            addCriterion("lPbrDeptId >", value, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lPbrDeptId >=", value, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidLessThan(Integer value) {
            addCriterion("lPbrDeptId <", value, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("lPbrDeptId <=", value, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidIn(List<Integer> values) {
            addCriterion("lPbrDeptId in", values, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidNotIn(List<Integer> values) {
            addCriterion("lPbrDeptId not in", values, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidBetween(Integer value1, Integer value2) {
            addCriterion("lPbrDeptId between", value1, value2, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("lPbrDeptId not between", value1, value2, "lpbrdeptid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidIsNull() {
            addCriterion("lPbrPostId is null");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidIsNotNull() {
            addCriterion("lPbrPostId is not null");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidEqualTo(Integer value) {
            addCriterion("lPbrPostId =", value, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidNotEqualTo(Integer value) {
            addCriterion("lPbrPostId <>", value, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidGreaterThan(Integer value) {
            addCriterion("lPbrPostId >", value, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lPbrPostId >=", value, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidLessThan(Integer value) {
            addCriterion("lPbrPostId <", value, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidLessThanOrEqualTo(Integer value) {
            addCriterion("lPbrPostId <=", value, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidIn(List<Integer> values) {
            addCriterion("lPbrPostId in", values, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidNotIn(List<Integer> values) {
            addCriterion("lPbrPostId not in", values, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidBetween(Integer value1, Integer value2) {
            addCriterion("lPbrPostId between", value1, value2, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLpbrpostidNotBetween(Integer value1, Integer value2) {
            addCriterion("lPbrPostId not between", value1, value2, "lpbrpostid");
            return (Criteria) this;
        }

        public Criteria andLcontentIsNull() {
            addCriterion("lContent is null");
            return (Criteria) this;
        }

        public Criteria andLcontentIsNotNull() {
            addCriterion("lContent is not null");
            return (Criteria) this;
        }

        public Criteria andLcontentEqualTo(String value) {
            addCriterion("lContent =", value, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentNotEqualTo(String value) {
            addCriterion("lContent <>", value, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentGreaterThan(String value) {
            addCriterion("lContent >", value, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentGreaterThanOrEqualTo(String value) {
            addCriterion("lContent >=", value, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentLessThan(String value) {
            addCriterion("lContent <", value, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentLessThanOrEqualTo(String value) {
            addCriterion("lContent <=", value, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentLike(String value) {
            addCriterion("lContent like", value, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentNotLike(String value) {
            addCriterion("lContent not like", value, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentIn(List<String> values) {
            addCriterion("lContent in", values, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentNotIn(List<String> values) {
            addCriterion("lContent not in", values, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentBetween(String value1, String value2) {
            addCriterion("lContent between", value1, value2, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLcontentNotBetween(String value1, String value2) {
            addCriterion("lContent not between", value1, value2, "lcontent");
            return (Criteria) this;
        }

        public Criteria andLsynopsisIsNull() {
            addCriterion("lSynopsis is null");
            return (Criteria) this;
        }

        public Criteria andLsynopsisIsNotNull() {
            addCriterion("lSynopsis is not null");
            return (Criteria) this;
        }

        public Criteria andLsynopsisEqualTo(String value) {
            addCriterion("lSynopsis =", value, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisNotEqualTo(String value) {
            addCriterion("lSynopsis <>", value, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisGreaterThan(String value) {
            addCriterion("lSynopsis >", value, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("lSynopsis >=", value, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisLessThan(String value) {
            addCriterion("lSynopsis <", value, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisLessThanOrEqualTo(String value) {
            addCriterion("lSynopsis <=", value, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisLike(String value) {
            addCriterion("lSynopsis like", value, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisNotLike(String value) {
            addCriterion("lSynopsis not like", value, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisIn(List<String> values) {
            addCriterion("lSynopsis in", values, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisNotIn(List<String> values) {
            addCriterion("lSynopsis not in", values, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisBetween(String value1, String value2) {
            addCriterion("lSynopsis between", value1, value2, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsynopsisNotBetween(String value1, String value2) {
            addCriterion("lSynopsis not between", value1, value2, "lsynopsis");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsIsNull() {
            addCriterion("lSupervisionComments is null");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsIsNotNull() {
            addCriterion("lSupervisionComments is not null");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsEqualTo(String value) {
            addCriterion("lSupervisionComments =", value, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsNotEqualTo(String value) {
            addCriterion("lSupervisionComments <>", value, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsGreaterThan(String value) {
            addCriterion("lSupervisionComments >", value, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsGreaterThanOrEqualTo(String value) {
            addCriterion("lSupervisionComments >=", value, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsLessThan(String value) {
            addCriterion("lSupervisionComments <", value, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsLessThanOrEqualTo(String value) {
            addCriterion("lSupervisionComments <=", value, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsLike(String value) {
            addCriterion("lSupervisionComments like", value, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsNotLike(String value) {
            addCriterion("lSupervisionComments not like", value, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsIn(List<String> values) {
            addCriterion("lSupervisionComments in", values, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsNotIn(List<String> values) {
            addCriterion("lSupervisionComments not in", values, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsBetween(String value1, String value2) {
            addCriterion("lSupervisionComments between", value1, value2, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentsNotBetween(String value1, String value2) {
            addCriterion("lSupervisionComments not between", value1, value2, "lsupervisioncomments");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeIsNull() {
            addCriterion("lSupervisionCommentsTime is null");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeIsNotNull() {
            addCriterion("lSupervisionCommentsTime is not null");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeEqualTo(String value) {
            addCriterion("lSupervisionCommentsTime =", value, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeNotEqualTo(String value) {
            addCriterion("lSupervisionCommentsTime <>", value, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeGreaterThan(String value) {
            addCriterion("lSupervisionCommentsTime >", value, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeGreaterThanOrEqualTo(String value) {
            addCriterion("lSupervisionCommentsTime >=", value, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeLessThan(String value) {
            addCriterion("lSupervisionCommentsTime <", value, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeLessThanOrEqualTo(String value) {
            addCriterion("lSupervisionCommentsTime <=", value, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeLike(String value) {
            addCriterion("lSupervisionCommentsTime like", value, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeNotLike(String value) {
            addCriterion("lSupervisionCommentsTime not like", value, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeIn(List<String> values) {
            addCriterion("lSupervisionCommentsTime in", values, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeNotIn(List<String> values) {
            addCriterion("lSupervisionCommentsTime not in", values, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeBetween(String value1, String value2) {
            addCriterion("lSupervisionCommentsTime between", value1, value2, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLsupervisioncommentstimeNotBetween(String value1, String value2) {
            addCriterion("lSupervisionCommentsTime not between", value1, value2, "lsupervisioncommentstime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsIsNull() {
            addCriterion("lDisciplinaryComments is null");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsIsNotNull() {
            addCriterion("lDisciplinaryComments is not null");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsEqualTo(String value) {
            addCriterion("lDisciplinaryComments =", value, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsNotEqualTo(String value) {
            addCriterion("lDisciplinaryComments <>", value, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsGreaterThan(String value) {
            addCriterion("lDisciplinaryComments >", value, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsGreaterThanOrEqualTo(String value) {
            addCriterion("lDisciplinaryComments >=", value, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsLessThan(String value) {
            addCriterion("lDisciplinaryComments <", value, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsLessThanOrEqualTo(String value) {
            addCriterion("lDisciplinaryComments <=", value, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsLike(String value) {
            addCriterion("lDisciplinaryComments like", value, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsNotLike(String value) {
            addCriterion("lDisciplinaryComments not like", value, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsIn(List<String> values) {
            addCriterion("lDisciplinaryComments in", values, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsNotIn(List<String> values) {
            addCriterion("lDisciplinaryComments not in", values, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsBetween(String value1, String value2) {
            addCriterion("lDisciplinaryComments between", value1, value2, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarycommentsNotBetween(String value1, String value2) {
            addCriterion("lDisciplinaryComments not between", value1, value2, "ldisciplinarycomments");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeIsNull() {
            addCriterion("lDisciplinaryTime is null");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeIsNotNull() {
            addCriterion("lDisciplinaryTime is not null");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeEqualTo(Date value) {
            addCriterion("lDisciplinaryTime =", value, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeNotEqualTo(Date value) {
            addCriterion("lDisciplinaryTime <>", value, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeGreaterThan(Date value) {
            addCriterion("lDisciplinaryTime >", value, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lDisciplinaryTime >=", value, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeLessThan(Date value) {
            addCriterion("lDisciplinaryTime <", value, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeLessThanOrEqualTo(Date value) {
            addCriterion("lDisciplinaryTime <=", value, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeIn(List<Date> values) {
            addCriterion("lDisciplinaryTime in", values, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeNotIn(List<Date> values) {
            addCriterion("lDisciplinaryTime not in", values, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeBetween(Date value1, Date value2) {
            addCriterion("lDisciplinaryTime between", value1, value2, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLdisciplinarytimeNotBetween(Date value1, Date value2) {
            addCriterion("lDisciplinaryTime not between", value1, value2, "ldisciplinarytime");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsIsNull() {
            addCriterion("lLeadersComments is null");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsIsNotNull() {
            addCriterion("lLeadersComments is not null");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsEqualTo(String value) {
            addCriterion("lLeadersComments =", value, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsNotEqualTo(String value) {
            addCriterion("lLeadersComments <>", value, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsGreaterThan(String value) {
            addCriterion("lLeadersComments >", value, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsGreaterThanOrEqualTo(String value) {
            addCriterion("lLeadersComments >=", value, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsLessThan(String value) {
            addCriterion("lLeadersComments <", value, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsLessThanOrEqualTo(String value) {
            addCriterion("lLeadersComments <=", value, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsLike(String value) {
            addCriterion("lLeadersComments like", value, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsNotLike(String value) {
            addCriterion("lLeadersComments not like", value, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsIn(List<String> values) {
            addCriterion("lLeadersComments in", values, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsNotIn(List<String> values) {
            addCriterion("lLeadersComments not in", values, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsBetween(String value1, String value2) {
            addCriterion("lLeadersComments between", value1, value2, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderscommentsNotBetween(String value1, String value2) {
            addCriterion("lLeadersComments not between", value1, value2, "lleaderscomments");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeIsNull() {
            addCriterion("lLeadersTime is null");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeIsNotNull() {
            addCriterion("lLeadersTime is not null");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeEqualTo(Date value) {
            addCriterion("lLeadersTime =", value, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeNotEqualTo(Date value) {
            addCriterion("lLeadersTime <>", value, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeGreaterThan(Date value) {
            addCriterion("lLeadersTime >", value, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lLeadersTime >=", value, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeLessThan(Date value) {
            addCriterion("lLeadersTime <", value, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeLessThanOrEqualTo(Date value) {
            addCriterion("lLeadersTime <=", value, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeIn(List<Date> values) {
            addCriterion("lLeadersTime in", values, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeNotIn(List<Date> values) {
            addCriterion("lLeadersTime not in", values, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeBetween(Date value1, Date value2) {
            addCriterion("lLeadersTime between", value1, value2, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLleaderstimeNotBetween(Date value1, Date value2) {
            addCriterion("lLeadersTime not between", value1, value2, "lleaderstime");
            return (Criteria) this;
        }

        public Criteria andLresultIsNull() {
            addCriterion("lResult is null");
            return (Criteria) this;
        }

        public Criteria andLresultIsNotNull() {
            addCriterion("lResult is not null");
            return (Criteria) this;
        }

        public Criteria andLresultEqualTo(String value) {
            addCriterion("lResult =", value, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultNotEqualTo(String value) {
            addCriterion("lResult <>", value, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultGreaterThan(String value) {
            addCriterion("lResult >", value, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultGreaterThanOrEqualTo(String value) {
            addCriterion("lResult >=", value, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultLessThan(String value) {
            addCriterion("lResult <", value, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultLessThanOrEqualTo(String value) {
            addCriterion("lResult <=", value, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultLike(String value) {
            addCriterion("lResult like", value, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultNotLike(String value) {
            addCriterion("lResult not like", value, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultIn(List<String> values) {
            addCriterion("lResult in", values, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultNotIn(List<String> values) {
            addCriterion("lResult not in", values, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultBetween(String value1, String value2) {
            addCriterion("lResult between", value1, value2, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresultNotBetween(String value1, String value2) {
            addCriterion("lResult not between", value1, value2, "lresult");
            return (Criteria) this;
        }

        public Criteria andLresulttimeIsNull() {
            addCriterion("lResultTime is null");
            return (Criteria) this;
        }

        public Criteria andLresulttimeIsNotNull() {
            addCriterion("lResultTime is not null");
            return (Criteria) this;
        }

        public Criteria andLresulttimeEqualTo(Date value) {
            addCriterion("lResultTime =", value, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLresulttimeNotEqualTo(Date value) {
            addCriterion("lResultTime <>", value, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLresulttimeGreaterThan(Date value) {
            addCriterion("lResultTime >", value, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLresulttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lResultTime >=", value, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLresulttimeLessThan(Date value) {
            addCriterion("lResultTime <", value, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLresulttimeLessThanOrEqualTo(Date value) {
            addCriterion("lResultTime <=", value, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLresulttimeIn(List<Date> values) {
            addCriterion("lResultTime in", values, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLresulttimeNotIn(List<Date> values) {
            addCriterion("lResultTime not in", values, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLresulttimeBetween(Date value1, Date value2) {
            addCriterion("lResultTime between", value1, value2, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLresulttimeNotBetween(Date value1, Date value2) {
            addCriterion("lResultTime not between", value1, value2, "lresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlIsNull() {
            addCriterion("lSupervisionResutl is null");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlIsNotNull() {
            addCriterion("lSupervisionResutl is not null");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlEqualTo(String value) {
            addCriterion("lSupervisionResutl =", value, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlNotEqualTo(String value) {
            addCriterion("lSupervisionResutl <>", value, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlGreaterThan(String value) {
            addCriterion("lSupervisionResutl >", value, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlGreaterThanOrEqualTo(String value) {
            addCriterion("lSupervisionResutl >=", value, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlLessThan(String value) {
            addCriterion("lSupervisionResutl <", value, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlLessThanOrEqualTo(String value) {
            addCriterion("lSupervisionResutl <=", value, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlLike(String value) {
            addCriterion("lSupervisionResutl like", value, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlNotLike(String value) {
            addCriterion("lSupervisionResutl not like", value, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlIn(List<String> values) {
            addCriterion("lSupervisionResutl in", values, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlNotIn(List<String> values) {
            addCriterion("lSupervisionResutl not in", values, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlBetween(String value1, String value2) {
            addCriterion("lSupervisionResutl between", value1, value2, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresutlNotBetween(String value1, String value2) {
            addCriterion("lSupervisionResutl not between", value1, value2, "lsupervisionresutl");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeIsNull() {
            addCriterion("lSupervisionResultTime is null");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeIsNotNull() {
            addCriterion("lSupervisionResultTime is not null");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeEqualTo(Date value) {
            addCriterion("lSupervisionResultTime =", value, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeNotEqualTo(Date value) {
            addCriterion("lSupervisionResultTime <>", value, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeGreaterThan(Date value) {
            addCriterion("lSupervisionResultTime >", value, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lSupervisionResultTime >=", value, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeLessThan(Date value) {
            addCriterion("lSupervisionResultTime <", value, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeLessThanOrEqualTo(Date value) {
            addCriterion("lSupervisionResultTime <=", value, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeIn(List<Date> values) {
            addCriterion("lSupervisionResultTime in", values, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeNotIn(List<Date> values) {
            addCriterion("lSupervisionResultTime not in", values, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeBetween(Date value1, Date value2) {
            addCriterion("lSupervisionResultTime between", value1, value2, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLsupervisionresulttimeNotBetween(Date value1, Date value2) {
            addCriterion("lSupervisionResultTime not between", value1, value2, "lsupervisionresulttime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeIsNull() {
            addCriterion("lCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeIsNotNull() {
            addCriterion("lCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeEqualTo(Date value) {
            addCriterion("lCreateTime =", value, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeNotEqualTo(Date value) {
            addCriterion("lCreateTime <>", value, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeGreaterThan(Date value) {
            addCriterion("lCreateTime >", value, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lCreateTime >=", value, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeLessThan(Date value) {
            addCriterion("lCreateTime <", value, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lCreateTime <=", value, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeIn(List<Date> values) {
            addCriterion("lCreateTime in", values, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeNotIn(List<Date> values) {
            addCriterion("lCreateTime not in", values, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeBetween(Date value1, Date value2) {
            addCriterion("lCreateTime between", value1, value2, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lCreateTime not between", value1, value2, "lcreatetime");
            return (Criteria) this;
        }

        public Criteria andLcreateidIsNull() {
            addCriterion("lCreateId is null");
            return (Criteria) this;
        }

        public Criteria andLcreateidIsNotNull() {
            addCriterion("lCreateId is not null");
            return (Criteria) this;
        }

        public Criteria andLcreateidEqualTo(Integer value) {
            addCriterion("lCreateId =", value, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreateidNotEqualTo(Integer value) {
            addCriterion("lCreateId <>", value, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreateidGreaterThan(Integer value) {
            addCriterion("lCreateId >", value, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lCreateId >=", value, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreateidLessThan(Integer value) {
            addCriterion("lCreateId <", value, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreateidLessThanOrEqualTo(Integer value) {
            addCriterion("lCreateId <=", value, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreateidIn(List<Integer> values) {
            addCriterion("lCreateId in", values, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreateidNotIn(List<Integer> values) {
            addCriterion("lCreateId not in", values, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreateidBetween(Integer value1, Integer value2) {
            addCriterion("lCreateId between", value1, value2, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("lCreateId not between", value1, value2, "lcreateid");
            return (Criteria) this;
        }

        public Criteria andLcreatenameIsNull() {
            addCriterion("lCreateName is null");
            return (Criteria) this;
        }

        public Criteria andLcreatenameIsNotNull() {
            addCriterion("lCreateName is not null");
            return (Criteria) this;
        }

        public Criteria andLcreatenameEqualTo(String value) {
            addCriterion("lCreateName =", value, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameNotEqualTo(String value) {
            addCriterion("lCreateName <>", value, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameGreaterThan(String value) {
            addCriterion("lCreateName >", value, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("lCreateName >=", value, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameLessThan(String value) {
            addCriterion("lCreateName <", value, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameLessThanOrEqualTo(String value) {
            addCriterion("lCreateName <=", value, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameLike(String value) {
            addCriterion("lCreateName like", value, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameNotLike(String value) {
            addCriterion("lCreateName not like", value, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameIn(List<String> values) {
            addCriterion("lCreateName in", values, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameNotIn(List<String> values) {
            addCriterion("lCreateName not in", values, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameBetween(String value1, String value2) {
            addCriterion("lCreateName between", value1, value2, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLcreatenameNotBetween(String value1, String value2) {
            addCriterion("lCreateName not between", value1, value2, "lcreatename");
            return (Criteria) this;
        }

        public Criteria andLstatusIsNull() {
            addCriterion("lStatus is null");
            return (Criteria) this;
        }

        public Criteria andLstatusIsNotNull() {
            addCriterion("lStatus is not null");
            return (Criteria) this;
        }

        public Criteria andLstatusEqualTo(Integer value) {
            addCriterion("lStatus =", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusNotEqualTo(Integer value) {
            addCriterion("lStatus <>", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusGreaterThan(Integer value) {
            addCriterion("lStatus >", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lStatus >=", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusLessThan(Integer value) {
            addCriterion("lStatus <", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusLessThanOrEqualTo(Integer value) {
            addCriterion("lStatus <=", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusIn(List<Integer> values) {
            addCriterion("lStatus in", values, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusNotIn(List<Integer> values) {
            addCriterion("lStatus not in", values, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusBetween(Integer value1, Integer value2) {
            addCriterion("lStatus between", value1, value2, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lStatus not between", value1, value2, "lstatus");
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