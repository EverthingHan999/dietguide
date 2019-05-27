package com.je1809.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CookCommentAnswerExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CookCommentAnswerExample() {
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

        public Criteria andCkcaidIsNull() {
            addCriterion("ckcaid is null");
            return (Criteria) this;
        }

        public Criteria andCkcaidIsNotNull() {
            addCriterion("ckcaid is not null");
            return (Criteria) this;
        }

        public Criteria andCkcaidEqualTo(Integer value) {
            addCriterion("ckcaid =", value, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcaidNotEqualTo(Integer value) {
            addCriterion("ckcaid <>", value, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcaidGreaterThan(Integer value) {
            addCriterion("ckcaid >", value, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ckcaid >=", value, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcaidLessThan(Integer value) {
            addCriterion("ckcaid <", value, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcaidLessThanOrEqualTo(Integer value) {
            addCriterion("ckcaid <=", value, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcaidIn(List<Integer> values) {
            addCriterion("ckcaid in", values, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcaidNotIn(List<Integer> values) {
            addCriterion("ckcaid not in", values, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcaidBetween(Integer value1, Integer value2) {
            addCriterion("ckcaid between", value1, value2, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcaidNotBetween(Integer value1, Integer value2) {
            addCriterion("ckcaid not between", value1, value2, "ckcaid");
            return (Criteria) this;
        }

        public Criteria andCkcidIsNull() {
            addCriterion("ckcid is null");
            return (Criteria) this;
        }

        public Criteria andCkcidIsNotNull() {
            addCriterion("ckcid is not null");
            return (Criteria) this;
        }

        public Criteria andCkcidEqualTo(Integer value) {
            addCriterion("ckcid =", value, "ckcid");
            return (Criteria) this;
        }

        public Criteria andCkcidNotEqualTo(Integer value) {
            addCriterion("ckcid <>", value, "ckcid");
            return (Criteria) this;
        }

        public Criteria andCkcidGreaterThan(Integer value) {
            addCriterion("ckcid >", value, "ckcid");
            return (Criteria) this;
        }

        public Criteria andCkcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ckcid >=", value, "ckcid");
            return (Criteria) this;
        }

        public Criteria andCkcidLessThan(Integer value) {
            addCriterion("ckcid <", value, "ckcid");
            return (Criteria) this;
        }

        public Criteria andCkcidLessThanOrEqualTo(Integer value) {
            addCriterion("ckcid <=", value, "ckcid");
            return (Criteria) this;
        }

        public Criteria andCkcidIn(List<Integer> values) {
            addCriterion("ckcid in", values, "ckcid");
            return (Criteria) this;
        }

        public Criteria andCkcidNotIn(List<Integer> values) {
            addCriterion("ckcid not in", values, "ckcid");
            return (Criteria) this;
        }

        public Criteria andCkcidBetween(Integer value1, Integer value2) {
            addCriterion("ckcid between", value1, value2, "ckcid");
            return (Criteria) this;
        }

        public Criteria andCkcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ckcid not between", value1, value2, "ckcid");
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

        public Criteria andAnsweruidIsNull() {
            addCriterion("answeruid is null");
            return (Criteria) this;
        }

        public Criteria andAnsweruidIsNotNull() {
            addCriterion("answeruid is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweruidEqualTo(Integer value) {
            addCriterion("answeruid =", value, "answeruid");
            return (Criteria) this;
        }

        public Criteria andAnsweruidNotEqualTo(Integer value) {
            addCriterion("answeruid <>", value, "answeruid");
            return (Criteria) this;
        }

        public Criteria andAnsweruidGreaterThan(Integer value) {
            addCriterion("answeruid >", value, "answeruid");
            return (Criteria) this;
        }

        public Criteria andAnsweruidGreaterThanOrEqualTo(Integer value) {
            addCriterion("answeruid >=", value, "answeruid");
            return (Criteria) this;
        }

        public Criteria andAnsweruidLessThan(Integer value) {
            addCriterion("answeruid <", value, "answeruid");
            return (Criteria) this;
        }

        public Criteria andAnsweruidLessThanOrEqualTo(Integer value) {
            addCriterion("answeruid <=", value, "answeruid");
            return (Criteria) this;
        }

        public Criteria andAnsweruidIn(List<Integer> values) {
            addCriterion("answeruid in", values, "answeruid");
            return (Criteria) this;
        }

        public Criteria andAnsweruidNotIn(List<Integer> values) {
            addCriterion("answeruid not in", values, "answeruid");
            return (Criteria) this;
        }

        public Criteria andAnsweruidBetween(Integer value1, Integer value2) {
            addCriterion("answeruid between", value1, value2, "answeruid");
            return (Criteria) this;
        }

        public Criteria andAnsweruidNotBetween(Integer value1, Integer value2) {
            addCriterion("answeruid not between", value1, value2, "answeruid");
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