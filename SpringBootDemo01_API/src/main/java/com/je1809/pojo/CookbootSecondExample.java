package com.je1809.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CookbootSecondExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CookbootSecondExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andCbsidIsNull() {
            addCriterion("cbsid is null");
            return (Criteria) this;
        }

        public Criteria andCbsidIsNotNull() {
            addCriterion("cbsid is not null");
            return (Criteria) this;
        }

        public Criteria andCbsidEqualTo(Integer value) {
            addCriterion("cbsid =", value, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbsidNotEqualTo(Integer value) {
            addCriterion("cbsid <>", value, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbsidGreaterThan(Integer value) {
            addCriterion("cbsid >", value, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cbsid >=", value, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbsidLessThan(Integer value) {
            addCriterion("cbsid <", value, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbsidLessThanOrEqualTo(Integer value) {
            addCriterion("cbsid <=", value, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbsidIn(List<Integer> values) {
            addCriterion("cbsid in", values, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbsidNotIn(List<Integer> values) {
            addCriterion("cbsid not in", values, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbsidBetween(Integer value1, Integer value2) {
            addCriterion("cbsid between", value1, value2, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbsidNotBetween(Integer value1, Integer value2) {
            addCriterion("cbsid not between", value1, value2, "cbsid");
            return (Criteria) this;
        }

        public Criteria andCbnameIsNull() {
            addCriterion("cbname is null");
            return (Criteria) this;
        }

        public Criteria andCbnameIsNotNull() {
            addCriterion("cbname is not null");
            return (Criteria) this;
        }

        public Criteria andCbnameEqualTo(String value) {
            addCriterion("cbname =", value, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameNotEqualTo(String value) {
            addCriterion("cbname <>", value, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameGreaterThan(String value) {
            addCriterion("cbname >", value, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameGreaterThanOrEqualTo(String value) {
            addCriterion("cbname >=", value, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameLessThan(String value) {
            addCriterion("cbname <", value, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameLessThanOrEqualTo(String value) {
            addCriterion("cbname <=", value, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameLike(String value) {
            addCriterion("cbname like", value, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameNotLike(String value) {
            addCriterion("cbname not like", value, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameIn(List<String> values) {
            addCriterion("cbname in", values, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameNotIn(List<String> values) {
            addCriterion("cbname not in", values, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameBetween(String value1, String value2) {
            addCriterion("cbname between", value1, value2, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbnameNotBetween(String value1, String value2) {
            addCriterion("cbname not between", value1, value2, "cbname");
            return (Criteria) this;
        }

        public Criteria andCbimgIsNull() {
            addCriterion("cbimg is null");
            return (Criteria) this;
        }

        public Criteria andCbimgIsNotNull() {
            addCriterion("cbimg is not null");
            return (Criteria) this;
        }

        public Criteria andCbimgEqualTo(String value) {
            addCriterion("cbimg =", value, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgNotEqualTo(String value) {
            addCriterion("cbimg <>", value, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgGreaterThan(String value) {
            addCriterion("cbimg >", value, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgGreaterThanOrEqualTo(String value) {
            addCriterion("cbimg >=", value, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgLessThan(String value) {
            addCriterion("cbimg <", value, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgLessThanOrEqualTo(String value) {
            addCriterion("cbimg <=", value, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgLike(String value) {
            addCriterion("cbimg like", value, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgNotLike(String value) {
            addCriterion("cbimg not like", value, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgIn(List<String> values) {
            addCriterion("cbimg in", values, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgNotIn(List<String> values) {
            addCriterion("cbimg not in", values, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgBetween(String value1, String value2) {
            addCriterion("cbimg between", value1, value2, "cbimg");
            return (Criteria) this;
        }

        public Criteria andCbimgNotBetween(String value1, String value2) {
            addCriterion("cbimg not between", value1, value2, "cbimg");
            return (Criteria) this;
        }

        public Criteria andDescrIsNull() {
            addCriterion("descr is null");
            return (Criteria) this;
        }

        public Criteria andDescrIsNotNull() {
            addCriterion("descr is not null");
            return (Criteria) this;
        }

        public Criteria andDescrEqualTo(String value) {
            addCriterion("descr =", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotEqualTo(String value) {
            addCriterion("descr <>", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThan(String value) {
            addCriterion("descr >", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThanOrEqualTo(String value) {
            addCriterion("descr >=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThan(String value) {
            addCriterion("descr <", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThanOrEqualTo(String value) {
            addCriterion("descr <=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLike(String value) {
            addCriterion("descr like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotLike(String value) {
            addCriterion("descr not like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrIn(List<String> values) {
            addCriterion("descr in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotIn(List<String> values) {
            addCriterion("descr not in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrBetween(String value1, String value2) {
            addCriterion("descr between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotBetween(String value1, String value2) {
            addCriterion("descr not between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCbidIsNull() {
            addCriterion("cbid is null");
            return (Criteria) this;
        }

        public Criteria andCbidIsNotNull() {
            addCriterion("cbid is not null");
            return (Criteria) this;
        }

        public Criteria andCbidEqualTo(Integer value) {
            addCriterion("cbid =", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotEqualTo(Integer value) {
            addCriterion("cbid <>", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidGreaterThan(Integer value) {
            addCriterion("cbid >", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cbid >=", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidLessThan(Integer value) {
            addCriterion("cbid <", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidLessThanOrEqualTo(Integer value) {
            addCriterion("cbid <=", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidIn(List<Integer> values) {
            addCriterion("cbid in", values, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotIn(List<Integer> values) {
            addCriterion("cbid not in", values, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidBetween(Integer value1, Integer value2) {
            addCriterion("cbid between", value1, value2, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotBetween(Integer value1, Integer value2) {
            addCriterion("cbid not between", value1, value2, "cbid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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