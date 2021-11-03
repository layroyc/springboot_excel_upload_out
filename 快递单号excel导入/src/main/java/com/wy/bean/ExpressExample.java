package com.wy.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ExpressExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andPolicyNoIsNull() {
            addCriterion("policy_no is null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIsNotNull() {
            addCriterion("policy_no is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoEqualTo(String value) {
            addCriterion("policy_no =", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotEqualTo(String value) {
            addCriterion("policy_no <>", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoGreaterThan(String value) {
            addCriterion("policy_no >", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoGreaterThanOrEqualTo(String value) {
            addCriterion("policy_no >=", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLessThan(String value) {
            addCriterion("policy_no <", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLessThanOrEqualTo(String value) {
            addCriterion("policy_no <=", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLike(String value) {
            addCriterion("policy_no like", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotLike(String value) {
            addCriterion("policy_no not like", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIn(List<String> values) {
            addCriterion("policy_no in", values, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotIn(List<String> values) {
            addCriterion("policy_no not in", values, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoBetween(String value1, String value2) {
            addCriterion("policy_no between", value1, value2, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotBetween(String value1, String value2) {
            addCriterion("policy_no not between", value1, value2, "policyNo");
            return (Criteria) this;
        }

        public Criteria andCsCompanyIsNull() {
            addCriterion("cs_company is null");
            return (Criteria) this;
        }

        public Criteria andCsCompanyIsNotNull() {
            addCriterion("cs_company is not null");
            return (Criteria) this;
        }

        public Criteria andCsCompanyEqualTo(String value) {
            addCriterion("cs_company =", value, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyNotEqualTo(String value) {
            addCriterion("cs_company <>", value, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyGreaterThan(String value) {
            addCriterion("cs_company >", value, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("cs_company >=", value, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyLessThan(String value) {
            addCriterion("cs_company <", value, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyLessThanOrEqualTo(String value) {
            addCriterion("cs_company <=", value, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyLike(String value) {
            addCriterion("cs_company like", value, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyNotLike(String value) {
            addCriterion("cs_company not like", value, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyIn(List<String> values) {
            addCriterion("cs_company in", values, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyNotIn(List<String> values) {
            addCriterion("cs_company not in", values, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyBetween(String value1, String value2) {
            addCriterion("cs_company between", value1, value2, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCsCompanyNotBetween(String value1, String value2) {
            addCriterion("cs_company not between", value1, value2, "csCompany");
            return (Criteria) this;
        }

        public Criteria andCourierNumberIsNull() {
            addCriterion("courier_number is null");
            return (Criteria) this;
        }

        public Criteria andCourierNumberIsNotNull() {
            addCriterion("courier_number is not null");
            return (Criteria) this;
        }

        public Criteria andCourierNumberEqualTo(String value) {
            addCriterion("courier_number =", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberNotEqualTo(String value) {
            addCriterion("courier_number <>", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberGreaterThan(String value) {
            addCriterion("courier_number >", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("courier_number >=", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberLessThan(String value) {
            addCriterion("courier_number <", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberLessThanOrEqualTo(String value) {
            addCriterion("courier_number <=", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberLike(String value) {
            addCriterion("courier_number like", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberNotLike(String value) {
            addCriterion("courier_number not like", value, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberIn(List<String> values) {
            addCriterion("courier_number in", values, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberNotIn(List<String> values) {
            addCriterion("courier_number not in", values, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberBetween(String value1, String value2) {
            addCriterion("courier_number between", value1, value2, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andCourierNumberNotBetween(String value1, String value2) {
            addCriterion("courier_number not between", value1, value2, "courierNumber");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andMailingDateIsNull() {
            addCriterion("mailing_date is null");
            return (Criteria) this;
        }

        public Criteria andMailingDateIsNotNull() {
            addCriterion("mailing_date is not null");
            return (Criteria) this;
        }

        public Criteria andMailingDateEqualTo(Date value) {
            addCriterion("mailing_date =", value, "mailingDate");
            return (Criteria) this;
        }

        public Criteria andMailingDateNotEqualTo(Date value) {
            addCriterion("mailing_date <>", value, "mailingDate");
            return (Criteria) this;
        }

        public Criteria andMailingDateGreaterThan(Date value) {
            addCriterion("mailing_date >", value, "mailingDate");
            return (Criteria) this;
        }

        public Criteria andMailingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mailing_date >=", value, "mailingDate");
            return (Criteria) this;
        }

        public Criteria andMailingDateLessThan(Date value) {
            addCriterion("mailing_date <", value, "mailingDate");
            return (Criteria) this;
        }

        public Criteria andMailingDateLessThanOrEqualTo(Date value) {
            addCriterion("mailing_date <=", value, "mailingDate");
            return (Criteria) this;
        }

        public Criteria andMailingDateIn(List<Date> values) {
            addCriterion("mailing_date in", values, "mailingDate");
            return (Criteria) this;
        }

        public Criteria andMailingDateNotIn(List<Date> values) {
            addCriterion("mailing_date not in", values, "mailingDate");
            return (Criteria) this;
        }

        public Criteria andMailingDateBetween(Date value1, Date value2) {
            addCriterion("mailing_date between", value1, value2, "mailingDate");
            return (Criteria) this;
        }

        public Criteria andMailingDateNotBetween(Date value1, Date value2) {
            addCriterion("mailing_date not between", value1, value2, "mailingDate");
            return (Criteria) this;
        }
    }

    /**
     */
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