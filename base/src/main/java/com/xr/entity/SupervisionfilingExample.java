package com.xr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupervisionfilingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupervisionfilingExample() {
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

        public Criteria andSfilingidIsNull() {
            addCriterion("sFilingId is null");
            return (Criteria) this;
        }

        public Criteria andSfilingidIsNotNull() {
            addCriterion("sFilingId is not null");
            return (Criteria) this;
        }

        public Criteria andSfilingidEqualTo(Integer value) {
            addCriterion("sFilingId =", value, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSfilingidNotEqualTo(Integer value) {
            addCriterion("sFilingId <>", value, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSfilingidGreaterThan(Integer value) {
            addCriterion("sFilingId >", value, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSfilingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sFilingId >=", value, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSfilingidLessThan(Integer value) {
            addCriterion("sFilingId <", value, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSfilingidLessThanOrEqualTo(Integer value) {
            addCriterion("sFilingId <=", value, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSfilingidIn(List<Integer> values) {
            addCriterion("sFilingId in", values, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSfilingidNotIn(List<Integer> values) {
            addCriterion("sFilingId not in", values, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSfilingidBetween(Integer value1, Integer value2) {
            addCriterion("sFilingId between", value1, value2, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSfilingidNotBetween(Integer value1, Integer value2) {
            addCriterion("sFilingId not between", value1, value2, "sfilingid");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsIsNull() {
            addCriterion("sPaperItems is null");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsIsNotNull() {
            addCriterion("sPaperItems is not null");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsEqualTo(String value) {
            addCriterion("sPaperItems =", value, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsNotEqualTo(String value) {
            addCriterion("sPaperItems <>", value, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsGreaterThan(String value) {
            addCriterion("sPaperItems >", value, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsGreaterThanOrEqualTo(String value) {
            addCriterion("sPaperItems >=", value, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsLessThan(String value) {
            addCriterion("sPaperItems <", value, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsLessThanOrEqualTo(String value) {
            addCriterion("sPaperItems <=", value, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsLike(String value) {
            addCriterion("sPaperItems like", value, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsNotLike(String value) {
            addCriterion("sPaperItems not like", value, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsIn(List<String> values) {
            addCriterion("sPaperItems in", values, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsNotIn(List<String> values) {
            addCriterion("sPaperItems not in", values, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsBetween(String value1, String value2) {
            addCriterion("sPaperItems between", value1, value2, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSpaperitemsNotBetween(String value1, String value2) {
            addCriterion("sPaperItems not between", value1, value2, "spaperitems");
            return (Criteria) this;
        }

        public Criteria andSaccessoryIsNull() {
            addCriterion("sAccessory is null");
            return (Criteria) this;
        }

        public Criteria andSaccessoryIsNotNull() {
            addCriterion("sAccessory is not null");
            return (Criteria) this;
        }

        public Criteria andSaccessoryEqualTo(String value) {
            addCriterion("sAccessory =", value, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryNotEqualTo(String value) {
            addCriterion("sAccessory <>", value, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryGreaterThan(String value) {
            addCriterion("sAccessory >", value, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("sAccessory >=", value, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryLessThan(String value) {
            addCriterion("sAccessory <", value, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryLessThanOrEqualTo(String value) {
            addCriterion("sAccessory <=", value, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryLike(String value) {
            addCriterion("sAccessory like", value, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryNotLike(String value) {
            addCriterion("sAccessory not like", value, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryIn(List<String> values) {
            addCriterion("sAccessory in", values, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryNotIn(List<String> values) {
            addCriterion("sAccessory not in", values, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryBetween(String value1, String value2) {
            addCriterion("sAccessory between", value1, value2, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSaccessoryNotBetween(String value1, String value2) {
            addCriterion("sAccessory not between", value1, value2, "saccessory");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeIsNull() {
            addCriterion("sEnforcementMode is null");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeIsNotNull() {
            addCriterion("sEnforcementMode is not null");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeEqualTo(String value) {
            addCriterion("sEnforcementMode =", value, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeNotEqualTo(String value) {
            addCriterion("sEnforcementMode <>", value, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeGreaterThan(String value) {
            addCriterion("sEnforcementMode >", value, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeGreaterThanOrEqualTo(String value) {
            addCriterion("sEnforcementMode >=", value, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeLessThan(String value) {
            addCriterion("sEnforcementMode <", value, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeLessThanOrEqualTo(String value) {
            addCriterion("sEnforcementMode <=", value, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeLike(String value) {
            addCriterion("sEnforcementMode like", value, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeNotLike(String value) {
            addCriterion("sEnforcementMode not like", value, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeIn(List<String> values) {
            addCriterion("sEnforcementMode in", values, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeNotIn(List<String> values) {
            addCriterion("sEnforcementMode not in", values, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeBetween(String value1, String value2) {
            addCriterion("sEnforcementMode between", value1, value2, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andSenforcementmodeNotBetween(String value1, String value2) {
            addCriterion("sEnforcementMode not between", value1, value2, "senforcementmode");
            return (Criteria) this;
        }

        public Criteria andScostIsNull() {
            addCriterion("sCost is null");
            return (Criteria) this;
        }

        public Criteria andScostIsNotNull() {
            addCriterion("sCost is not null");
            return (Criteria) this;
        }

        public Criteria andScostEqualTo(String value) {
            addCriterion("sCost =", value, "scost");
            return (Criteria) this;
        }

        public Criteria andScostNotEqualTo(String value) {
            addCriterion("sCost <>", value, "scost");
            return (Criteria) this;
        }

        public Criteria andScostGreaterThan(String value) {
            addCriterion("sCost >", value, "scost");
            return (Criteria) this;
        }

        public Criteria andScostGreaterThanOrEqualTo(String value) {
            addCriterion("sCost >=", value, "scost");
            return (Criteria) this;
        }

        public Criteria andScostLessThan(String value) {
            addCriterion("sCost <", value, "scost");
            return (Criteria) this;
        }

        public Criteria andScostLessThanOrEqualTo(String value) {
            addCriterion("sCost <=", value, "scost");
            return (Criteria) this;
        }

        public Criteria andScostLike(String value) {
            addCriterion("sCost like", value, "scost");
            return (Criteria) this;
        }

        public Criteria andScostNotLike(String value) {
            addCriterion("sCost not like", value, "scost");
            return (Criteria) this;
        }

        public Criteria andScostIn(List<String> values) {
            addCriterion("sCost in", values, "scost");
            return (Criteria) this;
        }

        public Criteria andScostNotIn(List<String> values) {
            addCriterion("sCost not in", values, "scost");
            return (Criteria) this;
        }

        public Criteria andScostBetween(String value1, String value2) {
            addCriterion("sCost between", value1, value2, "scost");
            return (Criteria) this;
        }

        public Criteria andScostNotBetween(String value1, String value2) {
            addCriterion("sCost not between", value1, value2, "scost");
            return (Criteria) this;
        }

        public Criteria andSundertakerIsNull() {
            addCriterion("sUndertaker is null");
            return (Criteria) this;
        }

        public Criteria andSundertakerIsNotNull() {
            addCriterion("sUndertaker is not null");
            return (Criteria) this;
        }

        public Criteria andSundertakerEqualTo(String value) {
            addCriterion("sUndertaker =", value, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerNotEqualTo(String value) {
            addCriterion("sUndertaker <>", value, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerGreaterThan(String value) {
            addCriterion("sUndertaker >", value, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerGreaterThanOrEqualTo(String value) {
            addCriterion("sUndertaker >=", value, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerLessThan(String value) {
            addCriterion("sUndertaker <", value, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerLessThanOrEqualTo(String value) {
            addCriterion("sUndertaker <=", value, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerLike(String value) {
            addCriterion("sUndertaker like", value, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerNotLike(String value) {
            addCriterion("sUndertaker not like", value, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerIn(List<String> values) {
            addCriterion("sUndertaker in", values, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerNotIn(List<String> values) {
            addCriterion("sUndertaker not in", values, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerBetween(String value1, String value2) {
            addCriterion("sUndertaker between", value1, value2, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerNotBetween(String value1, String value2) {
            addCriterion("sUndertaker not between", value1, value2, "sundertaker");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidIsNull() {
            addCriterion("sUndertakerDeptId is null");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidIsNotNull() {
            addCriterion("sUndertakerDeptId is not null");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidEqualTo(Integer value) {
            addCriterion("sUndertakerDeptId =", value, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidNotEqualTo(Integer value) {
            addCriterion("sUndertakerDeptId <>", value, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidGreaterThan(Integer value) {
            addCriterion("sUndertakerDeptId >", value, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sUndertakerDeptId >=", value, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidLessThan(Integer value) {
            addCriterion("sUndertakerDeptId <", value, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("sUndertakerDeptId <=", value, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidIn(List<Integer> values) {
            addCriterion("sUndertakerDeptId in", values, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidNotIn(List<Integer> values) {
            addCriterion("sUndertakerDeptId not in", values, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidBetween(Integer value1, Integer value2) {
            addCriterion("sUndertakerDeptId between", value1, value2, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSundertakerdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("sUndertakerDeptId not between", value1, value2, "sundertakerdeptid");
            return (Criteria) this;
        }

        public Criteria andSauditopinionIsNull() {
            addCriterion("sAuditOpinion is null");
            return (Criteria) this;
        }

        public Criteria andSauditopinionIsNotNull() {
            addCriterion("sAuditOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andSauditopinionEqualTo(String value) {
            addCriterion("sAuditOpinion =", value, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionNotEqualTo(String value) {
            addCriterion("sAuditOpinion <>", value, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionGreaterThan(String value) {
            addCriterion("sAuditOpinion >", value, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionGreaterThanOrEqualTo(String value) {
            addCriterion("sAuditOpinion >=", value, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionLessThan(String value) {
            addCriterion("sAuditOpinion <", value, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionLessThanOrEqualTo(String value) {
            addCriterion("sAuditOpinion <=", value, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionLike(String value) {
            addCriterion("sAuditOpinion like", value, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionNotLike(String value) {
            addCriterion("sAuditOpinion not like", value, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionIn(List<String> values) {
            addCriterion("sAuditOpinion in", values, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionNotIn(List<String> values) {
            addCriterion("sAuditOpinion not in", values, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionBetween(String value1, String value2) {
            addCriterion("sAuditOpinion between", value1, value2, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andSauditopinionNotBetween(String value1, String value2) {
            addCriterion("sAuditOpinion not between", value1, value2, "sauditopinion");
            return (Criteria) this;
        }

        public Criteria andScreatetimeIsNull() {
            addCriterion("sCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andScreatetimeIsNotNull() {
            addCriterion("sCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andScreatetimeEqualTo(Date value) {
            addCriterion("sCreateTime =", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeNotEqualTo(Date value) {
            addCriterion("sCreateTime <>", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeGreaterThan(Date value) {
            addCriterion("sCreateTime >", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sCreateTime >=", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeLessThan(Date value) {
            addCriterion("sCreateTime <", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("sCreateTime <=", value, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeIn(List<Date> values) {
            addCriterion("sCreateTime in", values, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeNotIn(List<Date> values) {
            addCriterion("sCreateTime not in", values, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeBetween(Date value1, Date value2) {
            addCriterion("sCreateTime between", value1, value2, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("sCreateTime not between", value1, value2, "screatetime");
            return (Criteria) this;
        }

        public Criteria andScreateidIsNull() {
            addCriterion("sCreateId is null");
            return (Criteria) this;
        }

        public Criteria andScreateidIsNotNull() {
            addCriterion("sCreateId is not null");
            return (Criteria) this;
        }

        public Criteria andScreateidEqualTo(Integer value) {
            addCriterion("sCreateId =", value, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreateidNotEqualTo(Integer value) {
            addCriterion("sCreateId <>", value, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreateidGreaterThan(Integer value) {
            addCriterion("sCreateId >", value, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sCreateId >=", value, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreateidLessThan(Integer value) {
            addCriterion("sCreateId <", value, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreateidLessThanOrEqualTo(Integer value) {
            addCriterion("sCreateId <=", value, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreateidIn(List<Integer> values) {
            addCriterion("sCreateId in", values, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreateidNotIn(List<Integer> values) {
            addCriterion("sCreateId not in", values, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreateidBetween(Integer value1, Integer value2) {
            addCriterion("sCreateId between", value1, value2, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("sCreateId not between", value1, value2, "screateid");
            return (Criteria) this;
        }

        public Criteria andScreatenameIsNull() {
            addCriterion("sCreateName is null");
            return (Criteria) this;
        }

        public Criteria andScreatenameIsNotNull() {
            addCriterion("sCreateName is not null");
            return (Criteria) this;
        }

        public Criteria andScreatenameEqualTo(String value) {
            addCriterion("sCreateName =", value, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameNotEqualTo(String value) {
            addCriterion("sCreateName <>", value, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameGreaterThan(String value) {
            addCriterion("sCreateName >", value, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("sCreateName >=", value, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameLessThan(String value) {
            addCriterion("sCreateName <", value, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameLessThanOrEqualTo(String value) {
            addCriterion("sCreateName <=", value, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameLike(String value) {
            addCriterion("sCreateName like", value, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameNotLike(String value) {
            addCriterion("sCreateName not like", value, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameIn(List<String> values) {
            addCriterion("sCreateName in", values, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameNotIn(List<String> values) {
            addCriterion("sCreateName not in", values, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameBetween(String value1, String value2) {
            addCriterion("sCreateName between", value1, value2, "screatename");
            return (Criteria) this;
        }

        public Criteria andScreatenameNotBetween(String value1, String value2) {
            addCriterion("sCreateName not between", value1, value2, "screatename");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNull() {
            addCriterion("sStatus is null");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNotNull() {
            addCriterion("sStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSstatusEqualTo(Integer value) {
            addCriterion("sStatus =", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotEqualTo(Integer value) {
            addCriterion("sStatus <>", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThan(Integer value) {
            addCriterion("sStatus >", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sStatus >=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThan(Integer value) {
            addCriterion("sStatus <", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThanOrEqualTo(Integer value) {
            addCriterion("sStatus <=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusIn(List<Integer> values) {
            addCriterion("sStatus in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotIn(List<Integer> values) {
            addCriterion("sStatus not in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusBetween(Integer value1, Integer value2) {
            addCriterion("sStatus between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sStatus not between", value1, value2, "sstatus");
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