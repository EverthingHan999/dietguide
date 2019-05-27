package com.je1809.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CookCopyExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CookCopyExample() {
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

        public Criteria andCcidIsNull() {
            addCriterion("ccid is null");
            return (Criteria) this;
        }

        public Criteria andCcidIsNotNull() {
            addCriterion("ccid is not null");
            return (Criteria) this;
        }

        public Criteria andCcidEqualTo(Integer value) {
            addCriterion("ccid =", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotEqualTo(Integer value) {
            addCriterion("ccid <>", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThan(Integer value) {
            addCriterion("ccid >", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccid >=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThan(Integer value) {
            addCriterion("ccid <", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThanOrEqualTo(Integer value) {
            addCriterion("ccid <=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidIn(List<Integer> values) {
            addCriterion("ccid in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotIn(List<Integer> values) {
            addCriterion("ccid not in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidBetween(Integer value1, Integer value2) {
            addCriterion("ccid between", value1, value2, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ccid not between", value1, value2, "ccid");
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCcimgIsNull() {
            addCriterion("ccimg is null");
            return (Criteria) this;
        }

        public Criteria andCcimgIsNotNull() {
            addCriterion("ccimg is not null");
            return (Criteria) this;
        }

        public Criteria andCcimgEqualTo(String value) {
            addCriterion("ccimg =", value, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgNotEqualTo(String value) {
            addCriterion("ccimg <>", value, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgGreaterThan(String value) {
            addCriterion("ccimg >", value, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgGreaterThanOrEqualTo(String value) {
            addCriterion("ccimg >=", value, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgLessThan(String value) {
            addCriterion("ccimg <", value, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgLessThanOrEqualTo(String value) {
            addCriterion("ccimg <=", value, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgLike(String value) {
            addCriterion("ccimg like", value, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgNotLike(String value) {
            addCriterion("ccimg not like", value, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgIn(List<String> values) {
            addCriterion("ccimg in", values, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgNotIn(List<String> values) {
            addCriterion("ccimg not in", values, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgBetween(String value1, String value2) {
            addCriterion("ccimg between", value1, value2, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcimgNotBetween(String value1, String value2) {
            addCriterion("ccimg not between", value1, value2, "ccimg");
            return (Criteria) this;
        }

        public Criteria andCcdescrIsNull() {
            addCriterion("ccdescr is null");
            return (Criteria) this;
        }

        public Criteria andCcdescrIsNotNull() {
            addCriterion("ccdescr is not null");
            return (Criteria) this;
        }

        public Criteria andCcdescrEqualTo(String value) {
            addCriterion("ccdescr =", value, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrNotEqualTo(String value) {
            addCriterion("ccdescr <>", value, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrGreaterThan(String value) {
            addCriterion("ccdescr >", value, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrGreaterThanOrEqualTo(String value) {
            addCriterion("ccdescr >=", value, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrLessThan(String value) {
            addCriterion("ccdescr <", value, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrLessThanOrEqualTo(String value) {
            addCriterion("ccdescr <=", value, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrLike(String value) {
            addCriterion("ccdescr like", value, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrNotLike(String value) {
            addCriterion("ccdescr not like", value, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrIn(List<String> values) {
            addCriterion("ccdescr in", values, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrNotIn(List<String> values) {
            addCriterion("ccdescr not in", values, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrBetween(String value1, String value2) {
            addCriterion("ccdescr between", value1, value2, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCcdescrNotBetween(String value1, String value2) {
            addCriterion("ccdescr not between", value1, value2, "ccdescr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLookCountIsNull() {
            addCriterion("look_count is null");
            return (Criteria) this;
        }

        public Criteria andLookCountIsNotNull() {
            addCriterion("look_count is not null");
            return (Criteria) this;
        }

        public Criteria andLookCountEqualTo(Integer value) {
            addCriterion("look_count =", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountNotEqualTo(Integer value) {
            addCriterion("look_count <>", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountGreaterThan(Integer value) {
            addCriterion("look_count >", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("look_count >=", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountLessThan(Integer value) {
            addCriterion("look_count <", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountLessThanOrEqualTo(Integer value) {
            addCriterion("look_count <=", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountIn(List<Integer> values) {
            addCriterion("look_count in", values, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountNotIn(List<Integer> values) {
            addCriterion("look_count not in", values, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountBetween(Integer value1, Integer value2) {
            addCriterion("look_count between", value1, value2, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountNotBetween(Integer value1, Integer value2) {
            addCriterion("look_count not between", value1, value2, "lookCount");
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