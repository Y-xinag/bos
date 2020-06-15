package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostriskcombingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostriskcombingExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPriskidIsNull() {
            addCriterion("pRiskId is null");
            return (Criteria) this;
        }

        public Criteria andPriskidIsNotNull() {
            addCriterion("pRiskId is not null");
            return (Criteria) this;
        }

        public Criteria andPriskidEqualTo(Integer value) {
            addCriterion("pRiskId =", value, "priskid");
            return (Criteria) this;
        }

        public Criteria andPriskidNotEqualTo(Integer value) {
            addCriterion("pRiskId <>", value, "priskid");
            return (Criteria) this;
        }

        public Criteria andPriskidGreaterThan(Integer value) {
            addCriterion("pRiskId >", value, "priskid");
            return (Criteria) this;
        }

        public Criteria andPriskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pRiskId >=", value, "priskid");
            return (Criteria) this;
        }

        public Criteria andPriskidLessThan(Integer value) {
            addCriterion("pRiskId <", value, "priskid");
            return (Criteria) this;
        }

        public Criteria andPriskidLessThanOrEqualTo(Integer value) {
            addCriterion("pRiskId <=", value, "priskid");
            return (Criteria) this;
        }

        public Criteria andPriskidIn(List<Integer> values) {
            addCriterion("pRiskId in", values, "priskid");
            return (Criteria) this;
        }

        public Criteria andPriskidNotIn(List<Integer> values) {
            addCriterion("pRiskId not in", values, "priskid");
            return (Criteria) this;
        }

        public Criteria andPriskidBetween(Integer value1, Integer value2) {
            addCriterion("pRiskId between", value1, value2, "priskid");
            return (Criteria) this;
        }

        public Criteria andPriskidNotBetween(Integer value1, Integer value2) {
            addCriterion("pRiskId not between", value1, value2, "priskid");
            return (Criteria) this;
        }

        public Criteria andPyearIsNull() {
            addCriterion("pYear is null");
            return (Criteria) this;
        }

        public Criteria andPyearIsNotNull() {
            addCriterion("pYear is not null");
            return (Criteria) this;
        }

        public Criteria andPyearEqualTo(Date value) {
            addCriterion("pYear =", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearNotEqualTo(Date value) {
            addCriterion("pYear <>", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearGreaterThan(Date value) {
            addCriterion("pYear >", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearGreaterThanOrEqualTo(Date value) {
            addCriterion("pYear >=", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearLessThan(Date value) {
            addCriterion("pYear <", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearLessThanOrEqualTo(Date value) {
            addCriterion("pYear <=", value, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearIn(List<Date> values) {
            addCriterion("pYear in", values, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearNotIn(List<Date> values) {
            addCriterion("pYear not in", values, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearBetween(Date value1, Date value2) {
            addCriterion("pYear between", value1, value2, "pyear");
            return (Criteria) this;
        }

        public Criteria andPyearNotBetween(Date value1, Date value2) {
            addCriterion("pYear not between", value1, value2, "pyear");
            return (Criteria) this;
        }

        public Criteria andPdeptidIsNull() {
            addCriterion("pDeptId is null");
            return (Criteria) this;
        }

        public Criteria andPdeptidIsNotNull() {
            addCriterion("pDeptId is not null");
            return (Criteria) this;
        }

        public Criteria andPdeptidEqualTo(Integer value) {
            addCriterion("pDeptId =", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidNotEqualTo(Integer value) {
            addCriterion("pDeptId <>", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidGreaterThan(Integer value) {
            addCriterion("pDeptId >", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pDeptId >=", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidLessThan(Integer value) {
            addCriterion("pDeptId <", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("pDeptId <=", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidIn(List<Integer> values) {
            addCriterion("pDeptId in", values, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidNotIn(List<Integer> values) {
            addCriterion("pDeptId not in", values, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidBetween(Integer value1, Integer value2) {
            addCriterion("pDeptId between", value1, value2, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("pDeptId not between", value1, value2, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidIsNull() {
            addCriterion("pInfomationId is null");
            return (Criteria) this;
        }

        public Criteria andPinfomationidIsNotNull() {
            addCriterion("pInfomationId is not null");
            return (Criteria) this;
        }

        public Criteria andPinfomationidEqualTo(Integer value) {
            addCriterion("pInfomationId =", value, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidNotEqualTo(Integer value) {
            addCriterion("pInfomationId <>", value, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidGreaterThan(Integer value) {
            addCriterion("pInfomationId >", value, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pInfomationId >=", value, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidLessThan(Integer value) {
            addCriterion("pInfomationId <", value, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidLessThanOrEqualTo(Integer value) {
            addCriterion("pInfomationId <=", value, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidIn(List<Integer> values) {
            addCriterion("pInfomationId in", values, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidNotIn(List<Integer> values) {
            addCriterion("pInfomationId not in", values, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidBetween(Integer value1, Integer value2) {
            addCriterion("pInfomationId between", value1, value2, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPinfomationidNotBetween(Integer value1, Integer value2) {
            addCriterion("pInfomationId not between", value1, value2, "pinfomationid");
            return (Criteria) this;
        }

        public Criteria andPprojectIsNull() {
            addCriterion("pProject is null");
            return (Criteria) this;
        }

        public Criteria andPprojectIsNotNull() {
            addCriterion("pProject is not null");
            return (Criteria) this;
        }

        public Criteria andPprojectEqualTo(String value) {
            addCriterion("pProject =", value, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectNotEqualTo(String value) {
            addCriterion("pProject <>", value, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectGreaterThan(String value) {
            addCriterion("pProject >", value, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectGreaterThanOrEqualTo(String value) {
            addCriterion("pProject >=", value, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectLessThan(String value) {
            addCriterion("pProject <", value, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectLessThanOrEqualTo(String value) {
            addCriterion("pProject <=", value, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectLike(String value) {
            addCriterion("pProject like", value, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectNotLike(String value) {
            addCriterion("pProject not like", value, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectIn(List<String> values) {
            addCriterion("pProject in", values, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectNotIn(List<String> values) {
            addCriterion("pProject not in", values, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectBetween(String value1, String value2) {
            addCriterion("pProject between", value1, value2, "pproject");
            return (Criteria) this;
        }

        public Criteria andPprojectNotBetween(String value1, String value2) {
            addCriterion("pProject not between", value1, value2, "pproject");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionIsNull() {
            addCriterion("pRiskPointDescription is null");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionIsNotNull() {
            addCriterion("pRiskPointDescription is not null");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionEqualTo(String value) {
            addCriterion("pRiskPointDescription =", value, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionNotEqualTo(String value) {
            addCriterion("pRiskPointDescription <>", value, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionGreaterThan(String value) {
            addCriterion("pRiskPointDescription >", value, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("pRiskPointDescription >=", value, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionLessThan(String value) {
            addCriterion("pRiskPointDescription <", value, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionLessThanOrEqualTo(String value) {
            addCriterion("pRiskPointDescription <=", value, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionLike(String value) {
            addCriterion("pRiskPointDescription like", value, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionNotLike(String value) {
            addCriterion("pRiskPointDescription not like", value, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionIn(List<String> values) {
            addCriterion("pRiskPointDescription in", values, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionNotIn(List<String> values) {
            addCriterion("pRiskPointDescription not in", values, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionBetween(String value1, String value2) {
            addCriterion("pRiskPointDescription between", value1, value2, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPriskpointdescriptionNotBetween(String value1, String value2) {
            addCriterion("pRiskPointDescription not between", value1, value2, "priskpointdescription");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueIsNull() {
            addCriterion("pProbableLValue is null");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueIsNotNull() {
            addCriterion("pProbableLValue is not null");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueEqualTo(String value) {
            addCriterion("pProbableLValue =", value, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueNotEqualTo(String value) {
            addCriterion("pProbableLValue <>", value, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueGreaterThan(String value) {
            addCriterion("pProbableLValue >", value, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueGreaterThanOrEqualTo(String value) {
            addCriterion("pProbableLValue >=", value, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueLessThan(String value) {
            addCriterion("pProbableLValue <", value, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueLessThanOrEqualTo(String value) {
            addCriterion("pProbableLValue <=", value, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueLike(String value) {
            addCriterion("pProbableLValue like", value, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueNotLike(String value) {
            addCriterion("pProbableLValue not like", value, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueIn(List<String> values) {
            addCriterion("pProbableLValue in", values, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueNotIn(List<String> values) {
            addCriterion("pProbableLValue not in", values, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueBetween(String value1, String value2) {
            addCriterion("pProbableLValue between", value1, value2, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPprobablelvalueNotBetween(String value1, String value2) {
            addCriterion("pProbableLValue not between", value1, value2, "pprobablelvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueIsNull() {
            addCriterion("pCValue is null");
            return (Criteria) this;
        }

        public Criteria andPcvalueIsNotNull() {
            addCriterion("pCValue is not null");
            return (Criteria) this;
        }

        public Criteria andPcvalueEqualTo(String value) {
            addCriterion("pCValue =", value, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueNotEqualTo(String value) {
            addCriterion("pCValue <>", value, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueGreaterThan(String value) {
            addCriterion("pCValue >", value, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueGreaterThanOrEqualTo(String value) {
            addCriterion("pCValue >=", value, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueLessThan(String value) {
            addCriterion("pCValue <", value, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueLessThanOrEqualTo(String value) {
            addCriterion("pCValue <=", value, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueLike(String value) {
            addCriterion("pCValue like", value, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueNotLike(String value) {
            addCriterion("pCValue not like", value, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueIn(List<String> values) {
            addCriterion("pCValue in", values, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueNotIn(List<String> values) {
            addCriterion("pCValue not in", values, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueBetween(String value1, String value2) {
            addCriterion("pCValue between", value1, value2, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPcvalueNotBetween(String value1, String value2) {
            addCriterion("pCValue not between", value1, value2, "pcvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueIsNull() {
            addCriterion("pDValue is null");
            return (Criteria) this;
        }

        public Criteria andPdvalueIsNotNull() {
            addCriterion("pDValue is not null");
            return (Criteria) this;
        }

        public Criteria andPdvalueEqualTo(String value) {
            addCriterion("pDValue =", value, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueNotEqualTo(String value) {
            addCriterion("pDValue <>", value, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueGreaterThan(String value) {
            addCriterion("pDValue >", value, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueGreaterThanOrEqualTo(String value) {
            addCriterion("pDValue >=", value, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueLessThan(String value) {
            addCriterion("pDValue <", value, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueLessThanOrEqualTo(String value) {
            addCriterion("pDValue <=", value, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueLike(String value) {
            addCriterion("pDValue like", value, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueNotLike(String value) {
            addCriterion("pDValue not like", value, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueIn(List<String> values) {
            addCriterion("pDValue in", values, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueNotIn(List<String> values) {
            addCriterion("pDValue not in", values, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueBetween(String value1, String value2) {
            addCriterion("pDValue between", value1, value2, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPdvalueNotBetween(String value1, String value2) {
            addCriterion("pDValue not between", value1, value2, "pdvalue");
            return (Criteria) this;
        }

        public Criteria andPgradeIsNull() {
            addCriterion("pGrade is null");
            return (Criteria) this;
        }

        public Criteria andPgradeIsNotNull() {
            addCriterion("pGrade is not null");
            return (Criteria) this;
        }

        public Criteria andPgradeEqualTo(String value) {
            addCriterion("pGrade =", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotEqualTo(String value) {
            addCriterion("pGrade <>", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeGreaterThan(String value) {
            addCriterion("pGrade >", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeGreaterThanOrEqualTo(String value) {
            addCriterion("pGrade >=", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLessThan(String value) {
            addCriterion("pGrade <", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLessThanOrEqualTo(String value) {
            addCriterion("pGrade <=", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLike(String value) {
            addCriterion("pGrade like", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotLike(String value) {
            addCriterion("pGrade not like", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeIn(List<String> values) {
            addCriterion("pGrade in", values, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotIn(List<String> values) {
            addCriterion("pGrade not in", values, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeBetween(String value1, String value2) {
            addCriterion("pGrade between", value1, value2, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotBetween(String value1, String value2) {
            addCriterion("pGrade not between", value1, value2, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPmeasuresIsNull() {
            addCriterion("pMeasures is null");
            return (Criteria) this;
        }

        public Criteria andPmeasuresIsNotNull() {
            addCriterion("pMeasures is not null");
            return (Criteria) this;
        }

        public Criteria andPmeasuresEqualTo(String value) {
            addCriterion("pMeasures =", value, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresNotEqualTo(String value) {
            addCriterion("pMeasures <>", value, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresGreaterThan(String value) {
            addCriterion("pMeasures >", value, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("pMeasures >=", value, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresLessThan(String value) {
            addCriterion("pMeasures <", value, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresLessThanOrEqualTo(String value) {
            addCriterion("pMeasures <=", value, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresLike(String value) {
            addCriterion("pMeasures like", value, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresNotLike(String value) {
            addCriterion("pMeasures not like", value, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresIn(List<String> values) {
            addCriterion("pMeasures in", values, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresNotIn(List<String> values) {
            addCriterion("pMeasures not in", values, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresBetween(String value1, String value2) {
            addCriterion("pMeasures between", value1, value2, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPmeasuresNotBetween(String value1, String value2) {
            addCriterion("pMeasures not between", value1, value2, "pmeasures");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeIsNull() {
            addCriterion("pCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeIsNotNull() {
            addCriterion("pCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeEqualTo(Date value) {
            addCriterion("pCreateTime =", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeNotEqualTo(Date value) {
            addCriterion("pCreateTime <>", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeGreaterThan(Date value) {
            addCriterion("pCreateTime >", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pCreateTime >=", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeLessThan(Date value) {
            addCriterion("pCreateTime <", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("pCreateTime <=", value, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeIn(List<Date> values) {
            addCriterion("pCreateTime in", values, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeNotIn(List<Date> values) {
            addCriterion("pCreateTime not in", values, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeBetween(Date value1, Date value2) {
            addCriterion("pCreateTime between", value1, value2, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("pCreateTime not between", value1, value2, "pcreatetime");
            return (Criteria) this;
        }

        public Criteria andPcreateidIsNull() {
            addCriterion("pCreateId is null");
            return (Criteria) this;
        }

        public Criteria andPcreateidIsNotNull() {
            addCriterion("pCreateId is not null");
            return (Criteria) this;
        }

        public Criteria andPcreateidEqualTo(Integer value) {
            addCriterion("pCreateId =", value, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreateidNotEqualTo(Integer value) {
            addCriterion("pCreateId <>", value, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreateidGreaterThan(Integer value) {
            addCriterion("pCreateId >", value, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pCreateId >=", value, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreateidLessThan(Integer value) {
            addCriterion("pCreateId <", value, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreateidLessThanOrEqualTo(Integer value) {
            addCriterion("pCreateId <=", value, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreateidIn(List<Integer> values) {
            addCriterion("pCreateId in", values, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreateidNotIn(List<Integer> values) {
            addCriterion("pCreateId not in", values, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreateidBetween(Integer value1, Integer value2) {
            addCriterion("pCreateId between", value1, value2, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("pCreateId not between", value1, value2, "pcreateid");
            return (Criteria) this;
        }

        public Criteria andPcreatenameIsNull() {
            addCriterion("pCreateName is null");
            return (Criteria) this;
        }

        public Criteria andPcreatenameIsNotNull() {
            addCriterion("pCreateName is not null");
            return (Criteria) this;
        }

        public Criteria andPcreatenameEqualTo(String value) {
            addCriterion("pCreateName =", value, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameNotEqualTo(String value) {
            addCriterion("pCreateName <>", value, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameGreaterThan(String value) {
            addCriterion("pCreateName >", value, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("pCreateName >=", value, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameLessThan(String value) {
            addCriterion("pCreateName <", value, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameLessThanOrEqualTo(String value) {
            addCriterion("pCreateName <=", value, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameLike(String value) {
            addCriterion("pCreateName like", value, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameNotLike(String value) {
            addCriterion("pCreateName not like", value, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameIn(List<String> values) {
            addCriterion("pCreateName in", values, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameNotIn(List<String> values) {
            addCriterion("pCreateName not in", values, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameBetween(String value1, String value2) {
            addCriterion("pCreateName between", value1, value2, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPcreatenameNotBetween(String value1, String value2) {
            addCriterion("pCreateName not between", value1, value2, "pcreatename");
            return (Criteria) this;
        }

        public Criteria andPstatusIsNull() {
            addCriterion("pStatus is null");
            return (Criteria) this;
        }

        public Criteria andPstatusIsNotNull() {
            addCriterion("pStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPstatusEqualTo(Integer value) {
            addCriterion("pStatus =", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotEqualTo(Integer value) {
            addCriterion("pStatus <>", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThan(Integer value) {
            addCriterion("pStatus >", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pStatus >=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThan(Integer value) {
            addCriterion("pStatus <", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThanOrEqualTo(Integer value) {
            addCriterion("pStatus <=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusIn(List<Integer> values) {
            addCriterion("pStatus in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotIn(List<Integer> values) {
            addCriterion("pStatus not in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusBetween(Integer value1, Integer value2) {
            addCriterion("pStatus between", value1, value2, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pStatus not between", value1, value2, "pstatus");
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