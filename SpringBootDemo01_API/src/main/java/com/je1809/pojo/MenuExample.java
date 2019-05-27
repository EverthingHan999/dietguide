package com.je1809.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public MenuExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMtidIsNull() {
            addCriterion("mtid is null");
            return (Criteria) this;
        }

        public Criteria andMtidIsNotNull() {
            addCriterion("mtid is not null");
            return (Criteria) this;
        }

        public Criteria andMtidEqualTo(Integer value) {
            addCriterion("mtid =", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidNotEqualTo(Integer value) {
            addCriterion("mtid <>", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidGreaterThan(Integer value) {
            addCriterion("mtid >", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mtid >=", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidLessThan(Integer value) {
            addCriterion("mtid <", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidLessThanOrEqualTo(Integer value) {
            addCriterion("mtid <=", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidIn(List<Integer> values) {
            addCriterion("mtid in", values, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidNotIn(List<Integer> values) {
            addCriterion("mtid not in", values, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidBetween(Integer value1, Integer value2) {
            addCriterion("mtid between", value1, value2, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidNotBetween(Integer value1, Integer value2) {
            addCriterion("mtid not between", value1, value2, "mtid");
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

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMimgIsNull() {
            addCriterion("mimg is null");
            return (Criteria) this;
        }

        public Criteria andMimgIsNotNull() {
            addCriterion("mimg is not null");
            return (Criteria) this;
        }

        public Criteria andMimgEqualTo(String value) {
            addCriterion("mimg =", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgNotEqualTo(String value) {
            addCriterion("mimg <>", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgGreaterThan(String value) {
            addCriterion("mimg >", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgGreaterThanOrEqualTo(String value) {
            addCriterion("mimg >=", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgLessThan(String value) {
            addCriterion("mimg <", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgLessThanOrEqualTo(String value) {
            addCriterion("mimg <=", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgLike(String value) {
            addCriterion("mimg like", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgNotLike(String value) {
            addCriterion("mimg not like", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgIn(List<String> values) {
            addCriterion("mimg in", values, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgNotIn(List<String> values) {
            addCriterion("mimg not in", values, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgBetween(String value1, String value2) {
            addCriterion("mimg between", value1, value2, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgNotBetween(String value1, String value2) {
            addCriterion("mimg not between", value1, value2, "mimg");
            return (Criteria) this;
        }

        public Criteria andMdescrIsNull() {
            addCriterion("mdescr is null");
            return (Criteria) this;
        }

        public Criteria andMdescrIsNotNull() {
            addCriterion("mdescr is not null");
            return (Criteria) this;
        }

        public Criteria andMdescrEqualTo(String value) {
            addCriterion("mdescr =", value, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrNotEqualTo(String value) {
            addCriterion("mdescr <>", value, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrGreaterThan(String value) {
            addCriterion("mdescr >", value, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrGreaterThanOrEqualTo(String value) {
            addCriterion("mdescr >=", value, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrLessThan(String value) {
            addCriterion("mdescr <", value, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrLessThanOrEqualTo(String value) {
            addCriterion("mdescr <=", value, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrLike(String value) {
            addCriterion("mdescr like", value, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrNotLike(String value) {
            addCriterion("mdescr not like", value, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrIn(List<String> values) {
            addCriterion("mdescr in", values, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrNotIn(List<String> values) {
            addCriterion("mdescr not in", values, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrBetween(String value1, String value2) {
            addCriterion("mdescr between", value1, value2, "mdescr");
            return (Criteria) this;
        }

        public Criteria andMdescrNotBetween(String value1, String value2) {
            addCriterion("mdescr not between", value1, value2, "mdescr");
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