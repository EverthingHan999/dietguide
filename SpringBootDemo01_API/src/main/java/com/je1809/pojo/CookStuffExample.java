package com.je1809.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CookStuffExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CookStuffExample() {
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

        public Criteria andCstidIsNull() {
            addCriterion("cstid is null");
            return (Criteria) this;
        }

        public Criteria andCstidIsNotNull() {
            addCriterion("cstid is not null");
            return (Criteria) this;
        }

        public Criteria andCstidEqualTo(Integer value) {
            addCriterion("cstid =", value, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstidNotEqualTo(Integer value) {
            addCriterion("cstid <>", value, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstidGreaterThan(Integer value) {
            addCriterion("cstid >", value, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cstid >=", value, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstidLessThan(Integer value) {
            addCriterion("cstid <", value, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstidLessThanOrEqualTo(Integer value) {
            addCriterion("cstid <=", value, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstidIn(List<Integer> values) {
            addCriterion("cstid in", values, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstidNotIn(List<Integer> values) {
            addCriterion("cstid not in", values, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstidBetween(Integer value1, Integer value2) {
            addCriterion("cstid between", value1, value2, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstidNotBetween(Integer value1, Integer value2) {
            addCriterion("cstid not between", value1, value2, "cstid");
            return (Criteria) this;
        }

        public Criteria andCstnameIsNull() {
            addCriterion("cstname is null");
            return (Criteria) this;
        }

        public Criteria andCstnameIsNotNull() {
            addCriterion("cstname is not null");
            return (Criteria) this;
        }

        public Criteria andCstnameEqualTo(String value) {
            addCriterion("cstname =", value, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameNotEqualTo(String value) {
            addCriterion("cstname <>", value, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameGreaterThan(String value) {
            addCriterion("cstname >", value, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameGreaterThanOrEqualTo(String value) {
            addCriterion("cstname >=", value, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameLessThan(String value) {
            addCriterion("cstname <", value, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameLessThanOrEqualTo(String value) {
            addCriterion("cstname <=", value, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameLike(String value) {
            addCriterion("cstname like", value, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameNotLike(String value) {
            addCriterion("cstname not like", value, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameIn(List<String> values) {
            addCriterion("cstname in", values, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameNotIn(List<String> values) {
            addCriterion("cstname not in", values, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameBetween(String value1, String value2) {
            addCriterion("cstname between", value1, value2, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstnameNotBetween(String value1, String value2) {
            addCriterion("cstname not between", value1, value2, "cstname");
            return (Criteria) this;
        }

        public Criteria andCstamountIsNull() {
            addCriterion("cstamount is null");
            return (Criteria) this;
        }

        public Criteria andCstamountIsNotNull() {
            addCriterion("cstamount is not null");
            return (Criteria) this;
        }

        public Criteria andCstamountEqualTo(String value) {
            addCriterion("cstamount =", value, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountNotEqualTo(String value) {
            addCriterion("cstamount <>", value, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountGreaterThan(String value) {
            addCriterion("cstamount >", value, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountGreaterThanOrEqualTo(String value) {
            addCriterion("cstamount >=", value, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountLessThan(String value) {
            addCriterion("cstamount <", value, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountLessThanOrEqualTo(String value) {
            addCriterion("cstamount <=", value, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountLike(String value) {
            addCriterion("cstamount like", value, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountNotLike(String value) {
            addCriterion("cstamount not like", value, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountIn(List<String> values) {
            addCriterion("cstamount in", values, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountNotIn(List<String> values) {
            addCriterion("cstamount not in", values, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountBetween(String value1, String value2) {
            addCriterion("cstamount between", value1, value2, "cstamount");
            return (Criteria) this;
        }

        public Criteria andCstamountNotBetween(String value1, String value2) {
            addCriterion("cstamount not between", value1, value2, "cstamount");
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