package com.bistu.intimate.dto;

import java.util.ArrayList;
import java.util.List;

public class MajorDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public MajorDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
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

        public Criteria andMajorDetailIdIsNull() {
            addCriterion("major_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdIsNotNull() {
            addCriterion("major_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdEqualTo(Integer value) {
            addCriterion("major_detail_id =", value, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdNotEqualTo(Integer value) {
            addCriterion("major_detail_id <>", value, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdGreaterThan(Integer value) {
            addCriterion("major_detail_id >", value, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_detail_id >=", value, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdLessThan(Integer value) {
            addCriterion("major_detail_id <", value, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("major_detail_id <=", value, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdIn(List<Integer> values) {
            addCriterion("major_detail_id in", values, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdNotIn(List<Integer> values) {
            addCriterion("major_detail_id not in", values, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("major_detail_id between", value1, value2, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andMajorDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("major_detail_id not between", value1, value2, "majorDetailId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(Integer value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(Integer value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(Integer value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(Integer value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<Integer> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<Integer> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoIsNull() {
            addCriterion("enrollment_no is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoIsNotNull() {
            addCriterion("enrollment_no is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoEqualTo(Integer value) {
            addCriterion("enrollment_no =", value, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoNotEqualTo(Integer value) {
            addCriterion("enrollment_no <>", value, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoGreaterThan(Integer value) {
            addCriterion("enrollment_no >", value, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("enrollment_no >=", value, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoLessThan(Integer value) {
            addCriterion("enrollment_no <", value, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoLessThanOrEqualTo(Integer value) {
            addCriterion("enrollment_no <=", value, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoIn(List<Integer> values) {
            addCriterion("enrollment_no in", values, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoNotIn(List<Integer> values) {
            addCriterion("enrollment_no not in", values, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoBetween(Integer value1, Integer value2) {
            addCriterion("enrollment_no between", value1, value2, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andEnrollmentNoNotBetween(Integer value1, Integer value2) {
            addCriterion("enrollment_no not between", value1, value2, "enrollmentNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoIsNull() {
            addCriterion("participant_no is null");
            return (Criteria) this;
        }

        public Criteria andParticipantNoIsNotNull() {
            addCriterion("participant_no is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantNoEqualTo(Integer value) {
            addCriterion("participant_no =", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoNotEqualTo(Integer value) {
            addCriterion("participant_no <>", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoGreaterThan(Integer value) {
            addCriterion("participant_no >", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("participant_no >=", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoLessThan(Integer value) {
            addCriterion("participant_no <", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoLessThanOrEqualTo(Integer value) {
            addCriterion("participant_no <=", value, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoIn(List<Integer> values) {
            addCriterion("participant_no in", values, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoNotIn(List<Integer> values) {
            addCriterion("participant_no not in", values, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoBetween(Integer value1, Integer value2) {
            addCriterion("participant_no between", value1, value2, "participantNo");
            return (Criteria) this;
        }

        public Criteria andParticipantNoNotBetween(Integer value1, Integer value2) {
            addCriterion("participant_no not between", value1, value2, "participantNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoIsNull() {
            addCriterion("offer_no is null");
            return (Criteria) this;
        }

        public Criteria andOfferNoIsNotNull() {
            addCriterion("offer_no is not null");
            return (Criteria) this;
        }

        public Criteria andOfferNoEqualTo(Integer value) {
            addCriterion("offer_no =", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoNotEqualTo(Integer value) {
            addCriterion("offer_no <>", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoGreaterThan(Integer value) {
            addCriterion("offer_no >", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_no >=", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoLessThan(Integer value) {
            addCriterion("offer_no <", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoLessThanOrEqualTo(Integer value) {
            addCriterion("offer_no <=", value, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoIn(List<Integer> values) {
            addCriterion("offer_no in", values, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoNotIn(List<Integer> values) {
            addCriterion("offer_no not in", values, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoBetween(Integer value1, Integer value2) {
            addCriterion("offer_no between", value1, value2, "offerNo");
            return (Criteria) this;
        }

        public Criteria andOfferNoNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_no not between", value1, value2, "offerNo");
            return (Criteria) this;
        }

        public Criteria andYnIsNull() {
            addCriterion("yn is null");
            return (Criteria) this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("yn is not null");
            return (Criteria) this;
        }

        public Criteria andYnEqualTo(Byte value) {
            addCriterion("yn =", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotEqualTo(Byte value) {
            addCriterion("yn <>", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThan(Byte value) {
            addCriterion("yn >", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Byte value) {
            addCriterion("yn >=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThan(Byte value) {
            addCriterion("yn <", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThanOrEqualTo(Byte value) {
            addCriterion("yn <=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnIn(List<Byte> values) {
            addCriterion("yn in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotIn(List<Byte> values) {
            addCriterion("yn not in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnBetween(Byte value1, Byte value2) {
            addCriterion("yn between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotBetween(Byte value1, Byte value2) {
            addCriterion("yn not between", value1, value2, "yn");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table major_detail
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 07 21:54:18 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table major_detail
     *
     * @mbggenerated Thu Apr 07 21:54:18 CST 2016
     */
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