package com.je1809.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CookExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CookExample() {
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

        public Criteria andCimgIsNull() {
            addCriterion("cimg is null");
            return (Criteria) this;
        }

        public Criteria andCimgIsNotNull() {
            addCriterion("cimg is not null");
            return (Criteria) this;
        }

        public Criteria andCimgEqualTo(String value) {
            addCriterion("cimg =", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotEqualTo(String value) {
            addCriterion("cimg <>", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgGreaterThan(String value) {
            addCriterion("cimg >", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgGreaterThanOrEqualTo(String value) {
            addCriterion("cimg >=", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLessThan(String value) {
            addCriterion("cimg <", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLessThanOrEqualTo(String value) {
            addCriterion("cimg <=", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLike(String value) {
            addCriterion("cimg like", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotLike(String value) {
            addCriterion("cimg not like", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgIn(List<String> values) {
            addCriterion("cimg in", values, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotIn(List<String> values) {
            addCriterion("cimg not in", values, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgBetween(String value1, String value2) {
            addCriterion("cimg between", value1, value2, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotBetween(String value1, String value2) {
            addCriterion("cimg not between", value1, value2, "cimg");
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

        public Criteria andCopycountIsNull() {
            addCriterion("copycount is null");
            return (Criteria) this;
        }

        public Criteria andCopycountIsNotNull() {
            addCriterion("copycount is not null");
            return (Criteria) this;
        }

        public Criteria andCopycountEqualTo(Integer value) {
            addCriterion("copycount =", value, "copycount");
            return (Criteria) this;
        }

        public Criteria andCopycountNotEqualTo(Integer value) {
            addCriterion("copycount <>", value, "copycount");
            return (Criteria) this;
        }

        public Criteria andCopycountGreaterThan(Integer value) {
            addCriterion("copycount >", value, "copycount");
            return (Criteria) this;
        }

        public Criteria andCopycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("copycount >=", value, "copycount");
            return (Criteria) this;
        }

        public Criteria andCopycountLessThan(Integer value) {
            addCriterion("copycount <", value, "copycount");
            return (Criteria) this;
        }

        public Criteria andCopycountLessThanOrEqualTo(Integer value) {
            addCriterion("copycount <=", value, "copycount");
            return (Criteria) this;
        }

        public Criteria andCopycountIn(List<Integer> values) {
            addCriterion("copycount in", values, "copycount");
            return (Criteria) this;
        }

        public Criteria andCopycountNotIn(List<Integer> values) {
            addCriterion("copycount not in", values, "copycount");
            return (Criteria) this;
        }

        public Criteria andCopycountBetween(Integer value1, Integer value2) {
            addCriterion("copycount between", value1, value2, "copycount");
            return (Criteria) this;
        }

        public Criteria andCopycountNotBetween(Integer value1, Integer value2) {
            addCriterion("copycount not between", value1, value2, "copycount");
            return (Criteria) this;
        }

        public Criteria andLookcountIsNull() {
            addCriterion("lookcount is null");
            return (Criteria) this;
        }

        public Criteria andLookcountIsNotNull() {
            addCriterion("lookcount is not null");
            return (Criteria) this;
        }

        public Criteria andLookcountEqualTo(Integer value) {
            addCriterion("lookcount =", value, "lookcount");
            return (Criteria) this;
        }

        public Criteria andLookcountNotEqualTo(Integer value) {
            addCriterion("lookcount <>", value, "lookcount");
            return (Criteria) this;
        }

        public Criteria andLookcountGreaterThan(Integer value) {
            addCriterion("lookcount >", value, "lookcount");
            return (Criteria) this;
        }

        public Criteria andLookcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lookcount >=", value, "lookcount");
            return (Criteria) this;
        }

        public Criteria andLookcountLessThan(Integer value) {
            addCriterion("lookcount <", value, "lookcount");
            return (Criteria) this;
        }

        public Criteria andLookcountLessThanOrEqualTo(Integer value) {
            addCriterion("lookcount <=", value, "lookcount");
            return (Criteria) this;
        }

        public Criteria andLookcountIn(List<Integer> values) {
            addCriterion("lookcount in", values, "lookcount");
            return (Criteria) this;
        }

        public Criteria andLookcountNotIn(List<Integer> values) {
            addCriterion("lookcount not in", values, "lookcount");
            return (Criteria) this;
        }

        public Criteria andLookcountBetween(Integer value1, Integer value2) {
            addCriterion("lookcount between", value1, value2, "lookcount");
            return (Criteria) this;
        }

        public Criteria andLookcountNotBetween(Integer value1, Integer value2) {
            addCriterion("lookcount not between", value1, value2, "lookcount");
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

        public Criteria andCbtidIsNull() {
            addCriterion("cbtid is null");
            return (Criteria) this;
        }

        public Criteria andCbtidIsNotNull() {
            addCriterion("cbtid is not null");
            return (Criteria) this;
        }

        public Criteria andCbtidEqualTo(Integer value) {
            addCriterion("cbtid =", value, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCbtidNotEqualTo(Integer value) {
            addCriterion("cbtid <>", value, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCbtidGreaterThan(Integer value) {
            addCriterion("cbtid >", value, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCbtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cbtid >=", value, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCbtidLessThan(Integer value) {
            addCriterion("cbtid <", value, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCbtidLessThanOrEqualTo(Integer value) {
            addCriterion("cbtid <=", value, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCbtidIn(List<Integer> values) {
            addCriterion("cbtid in", values, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCbtidNotIn(List<Integer> values) {
            addCriterion("cbtid not in", values, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCbtidBetween(Integer value1, Integer value2) {
            addCriterion("cbtid between", value1, value2, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCbtidNotBetween(Integer value1, Integer value2) {
            addCriterion("cbtid not between", value1, value2, "cbtid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
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