package com.je1809.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CookSeasoningExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CookSeasoningExample() {
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

        public Criteria andCkseidIsNull() {
            addCriterion("ckseid is null");
            return (Criteria) this;
        }

        public Criteria andCkseidIsNotNull() {
            addCriterion("ckseid is not null");
            return (Criteria) this;
        }

        public Criteria andCkseidEqualTo(Integer value) {
            addCriterion("ckseid =", value, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCkseidNotEqualTo(Integer value) {
            addCriterion("ckseid <>", value, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCkseidGreaterThan(Integer value) {
            addCriterion("ckseid >", value, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCkseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ckseid >=", value, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCkseidLessThan(Integer value) {
            addCriterion("ckseid <", value, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCkseidLessThanOrEqualTo(Integer value) {
            addCriterion("ckseid <=", value, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCkseidIn(List<Integer> values) {
            addCriterion("ckseid in", values, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCkseidNotIn(List<Integer> values) {
            addCriterion("ckseid not in", values, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCkseidBetween(Integer value1, Integer value2) {
            addCriterion("ckseid between", value1, value2, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCkseidNotBetween(Integer value1, Integer value2) {
            addCriterion("ckseid not between", value1, value2, "ckseid");
            return (Criteria) this;
        }

        public Criteria andCksenameIsNull() {
            addCriterion("cksename is null");
            return (Criteria) this;
        }

        public Criteria andCksenameIsNotNull() {
            addCriterion("cksename is not null");
            return (Criteria) this;
        }

        public Criteria andCksenameEqualTo(String value) {
            addCriterion("cksename =", value, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameNotEqualTo(String value) {
            addCriterion("cksename <>", value, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameGreaterThan(String value) {
            addCriterion("cksename >", value, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameGreaterThanOrEqualTo(String value) {
            addCriterion("cksename >=", value, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameLessThan(String value) {
            addCriterion("cksename <", value, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameLessThanOrEqualTo(String value) {
            addCriterion("cksename <=", value, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameLike(String value) {
            addCriterion("cksename like", value, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameNotLike(String value) {
            addCriterion("cksename not like", value, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameIn(List<String> values) {
            addCriterion("cksename in", values, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameNotIn(List<String> values) {
            addCriterion("cksename not in", values, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameBetween(String value1, String value2) {
            addCriterion("cksename between", value1, value2, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksenameNotBetween(String value1, String value2) {
            addCriterion("cksename not between", value1, value2, "cksename");
            return (Criteria) this;
        }

        public Criteria andCksamountIsNull() {
            addCriterion("cksamount is null");
            return (Criteria) this;
        }

        public Criteria andCksamountIsNotNull() {
            addCriterion("cksamount is not null");
            return (Criteria) this;
        }

        public Criteria andCksamountEqualTo(String value) {
            addCriterion("cksamount =", value, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountNotEqualTo(String value) {
            addCriterion("cksamount <>", value, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountGreaterThan(String value) {
            addCriterion("cksamount >", value, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountGreaterThanOrEqualTo(String value) {
            addCriterion("cksamount >=", value, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountLessThan(String value) {
            addCriterion("cksamount <", value, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountLessThanOrEqualTo(String value) {
            addCriterion("cksamount <=", value, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountLike(String value) {
            addCriterion("cksamount like", value, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountNotLike(String value) {
            addCriterion("cksamount not like", value, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountIn(List<String> values) {
            addCriterion("cksamount in", values, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountNotIn(List<String> values) {
            addCriterion("cksamount not in", values, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountBetween(String value1, String value2) {
            addCriterion("cksamount between", value1, value2, "cksamount");
            return (Criteria) this;
        }

        public Criteria andCksamountNotBetween(String value1, String value2) {
            addCriterion("cksamount not between", value1, value2, "cksamount");
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