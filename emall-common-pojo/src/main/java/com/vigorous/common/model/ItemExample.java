package com.vigorous.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIsNull() {
            addCriterion("gmt_update is null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIsNotNull() {
            addCriterion("gmt_update is not null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateEqualTo(Date value) {
            addCriterion("gmt_update =", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotEqualTo(Date value) {
            addCriterion("gmt_update <>", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThan(Date value) {
            addCriterion("gmt_update >", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_update >=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThan(Date value) {
            addCriterion("gmt_update <", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_update <=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIn(List<Date> values) {
            addCriterion("gmt_update in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotIn(List<Date> values) {
            addCriterion("gmt_update not in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateBetween(Date value1, Date value2) {
            addCriterion("gmt_update between", value1, value2, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_update not between", value1, value2, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
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

        public Criteria andPicurlsIsNull() {
            addCriterion("picurls is null");
            return (Criteria) this;
        }

        public Criteria andPicurlsIsNotNull() {
            addCriterion("picurls is not null");
            return (Criteria) this;
        }

        public Criteria andPicurlsEqualTo(String value) {
            addCriterion("picurls =", value, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsNotEqualTo(String value) {
            addCriterion("picurls <>", value, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsGreaterThan(String value) {
            addCriterion("picurls >", value, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsGreaterThanOrEqualTo(String value) {
            addCriterion("picurls >=", value, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsLessThan(String value) {
            addCriterion("picurls <", value, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsLessThanOrEqualTo(String value) {
            addCriterion("picurls <=", value, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsLike(String value) {
            addCriterion("picurls like", value, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsNotLike(String value) {
            addCriterion("picurls not like", value, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsIn(List<String> values) {
            addCriterion("picurls in", values, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsNotIn(List<String> values) {
            addCriterion("picurls not in", values, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsBetween(String value1, String value2) {
            addCriterion("picurls between", value1, value2, "picurls");
            return (Criteria) this;
        }

        public Criteria andPicurlsNotBetween(String value1, String value2) {
            addCriterion("picurls not between", value1, value2, "picurls");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Short value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Short value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Short value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Short value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Short value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Short> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Short> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Short value1, Short value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Short value1, Short value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeIsNull() {
            addCriterion("fenxiao_type is null");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeIsNotNull() {
            addCriterion("fenxiao_type is not null");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeEqualTo(Boolean value) {
            addCriterion("fenxiao_type =", value, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeNotEqualTo(Boolean value) {
            addCriterion("fenxiao_type <>", value, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeGreaterThan(Boolean value) {
            addCriterion("fenxiao_type >", value, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fenxiao_type >=", value, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeLessThan(Boolean value) {
            addCriterion("fenxiao_type <", value, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("fenxiao_type <=", value, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeIn(List<Boolean> values) {
            addCriterion("fenxiao_type in", values, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeNotIn(List<Boolean> values) {
            addCriterion("fenxiao_type not in", values, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("fenxiao_type between", value1, value2, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andFenxiaoTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fenxiao_type not between", value1, value2, "fenxiaoType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andItemWeightIsNull() {
            addCriterion("item_weight is null");
            return (Criteria) this;
        }

        public Criteria andItemWeightIsNotNull() {
            addCriterion("item_weight is not null");
            return (Criteria) this;
        }

        public Criteria andItemWeightEqualTo(Long value) {
            addCriterion("item_weight =", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightNotEqualTo(Long value) {
            addCriterion("item_weight <>", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightGreaterThan(Long value) {
            addCriterion("item_weight >", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightGreaterThanOrEqualTo(Long value) {
            addCriterion("item_weight >=", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightLessThan(Long value) {
            addCriterion("item_weight <", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightLessThanOrEqualTo(Long value) {
            addCriterion("item_weight <=", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightIn(List<Long> values) {
            addCriterion("item_weight in", values, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightNotIn(List<Long> values) {
            addCriterion("item_weight not in", values, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightBetween(Long value1, Long value2) {
            addCriterion("item_weight between", value1, value2, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightNotBetween(Long value1, Long value2) {
            addCriterion("item_weight not between", value1, value2, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNull() {
            addCriterion("item_no is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("item_no is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(String value) {
            addCriterion("item_no =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(String value) {
            addCriterion("item_no <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(String value) {
            addCriterion("item_no >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("item_no >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(String value) {
            addCriterion("item_no <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(String value) {
            addCriterion("item_no <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLike(String value) {
            addCriterion("item_no like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotLike(String value) {
            addCriterion("item_no not like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<String> values) {
            addCriterion("item_no in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<String> values) {
            addCriterion("item_no not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(String value1, String value2) {
            addCriterion("item_no between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(String value1, String value2) {
            addCriterion("item_no not between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andSoldNumIsNull() {
            addCriterion("sold_num is null");
            return (Criteria) this;
        }

        public Criteria andSoldNumIsNotNull() {
            addCriterion("sold_num is not null");
            return (Criteria) this;
        }

        public Criteria andSoldNumEqualTo(Integer value) {
            addCriterion("sold_num =", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumNotEqualTo(Integer value) {
            addCriterion("sold_num <>", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumGreaterThan(Integer value) {
            addCriterion("sold_num >", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sold_num >=", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumLessThan(Integer value) {
            addCriterion("sold_num <", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumLessThanOrEqualTo(Integer value) {
            addCriterion("sold_num <=", value, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumIn(List<Integer> values) {
            addCriterion("sold_num in", values, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumNotIn(List<Integer> values) {
            addCriterion("sold_num not in", values, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumBetween(Integer value1, Integer value2) {
            addCriterion("sold_num between", value1, value2, "soldNum");
            return (Criteria) this;
        }

        public Criteria andSoldNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sold_num not between", value1, value2, "soldNum");
            return (Criteria) this;
        }

        public Criteria andIsHideStockIsNull() {
            addCriterion("is_hide_stock is null");
            return (Criteria) this;
        }

        public Criteria andIsHideStockIsNotNull() {
            addCriterion("is_hide_stock is not null");
            return (Criteria) this;
        }

        public Criteria andIsHideStockEqualTo(Boolean value) {
            addCriterion("is_hide_stock =", value, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andIsHideStockNotEqualTo(Boolean value) {
            addCriterion("is_hide_stock <>", value, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andIsHideStockGreaterThan(Boolean value) {
            addCriterion("is_hide_stock >", value, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andIsHideStockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hide_stock >=", value, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andIsHideStockLessThan(Boolean value) {
            addCriterion("is_hide_stock <", value, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andIsHideStockLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hide_stock <=", value, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andIsHideStockIn(List<Boolean> values) {
            addCriterion("is_hide_stock in", values, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andIsHideStockNotIn(List<Boolean> values) {
            addCriterion("is_hide_stock not in", values, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andIsHideStockBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hide_stock between", value1, value2, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andIsHideStockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hide_stock not between", value1, value2, "isHideStock");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(Long value) {
            addCriterion("original_price =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(Long value) {
            addCriterion("original_price <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(Long value) {
            addCriterion("original_price >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("original_price >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(Long value) {
            addCriterion("original_price <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(Long value) {
            addCriterion("original_price <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<Long> values) {
            addCriterion("original_price in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<Long> values) {
            addCriterion("original_price not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(Long value1, Long value2) {
            addCriterion("original_price between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(Long value1, Long value2) {
            addCriterion("original_price not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountIsNull() {
            addCriterion("is_level_discount is null");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountIsNotNull() {
            addCriterion("is_level_discount is not null");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountEqualTo(Boolean value) {
            addCriterion("is_level_discount =", value, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountNotEqualTo(Boolean value) {
            addCriterion("is_level_discount <>", value, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountGreaterThan(Boolean value) {
            addCriterion("is_level_discount >", value, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_level_discount >=", value, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountLessThan(Boolean value) {
            addCriterion("is_level_discount <", value, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountLessThanOrEqualTo(Boolean value) {
            addCriterion("is_level_discount <=", value, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountIn(List<Boolean> values) {
            addCriterion("is_level_discount in", values, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountNotIn(List<Boolean> values) {
            addCriterion("is_level_discount not in", values, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountBetween(Boolean value1, Boolean value2) {
            addCriterion("is_level_discount between", value1, value2, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andIsLevelDiscountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_level_discount not between", value1, value2, "isLevelDiscount");
            return (Criteria) this;
        }

        public Criteria andPostTypeIsNull() {
            addCriterion("post_type is null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIsNotNull() {
            addCriterion("post_type is not null");
            return (Criteria) this;
        }

        public Criteria andPostTypeEqualTo(Boolean value) {
            addCriterion("post_type =", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotEqualTo(Boolean value) {
            addCriterion("post_type <>", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeGreaterThan(Boolean value) {
            addCriterion("post_type >", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("post_type >=", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLessThan(Boolean value) {
            addCriterion("post_type <", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("post_type <=", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeIn(List<Boolean> values) {
            addCriterion("post_type in", values, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotIn(List<Boolean> values) {
            addCriterion("post_type not in", values, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("post_type between", value1, value2, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("post_type not between", value1, value2, "postType");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNull() {
            addCriterion("post_fee is null");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNotNull() {
            addCriterion("post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPostFeeEqualTo(Integer value) {
            addCriterion("post_fee =", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotEqualTo(Integer value) {
            addCriterion("post_fee <>", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThan(Integer value) {
            addCriterion("post_fee >", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_fee >=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThan(Integer value) {
            addCriterion("post_fee <", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThanOrEqualTo(Integer value) {
            addCriterion("post_fee <=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeIn(List<Integer> values) {
            addCriterion("post_fee in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotIn(List<Integer> values) {
            addCriterion("post_fee not in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeBetween(Integer value1, Integer value2) {
            addCriterion("post_fee between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("post_fee not between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdIsNull() {
            addCriterion("delivery_template_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdIsNotNull() {
            addCriterion("delivery_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdEqualTo(Integer value) {
            addCriterion("delivery_template_id =", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdNotEqualTo(Integer value) {
            addCriterion("delivery_template_id <>", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdGreaterThan(Integer value) {
            addCriterion("delivery_template_id >", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_template_id >=", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdLessThan(Integer value) {
            addCriterion("delivery_template_id <", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_template_id <=", value, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdIn(List<Integer> values) {
            addCriterion("delivery_template_id in", values, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdNotIn(List<Integer> values) {
            addCriterion("delivery_template_id not in", values, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_template_id between", value1, value2, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_template_id not between", value1, value2, "deliveryTemplateId");
            return (Criteria) this;
        }

        public Criteria andIsListingIsNull() {
            addCriterion("is_listing is null");
            return (Criteria) this;
        }

        public Criteria andIsListingIsNotNull() {
            addCriterion("is_listing is not null");
            return (Criteria) this;
        }

        public Criteria andIsListingEqualTo(Boolean value) {
            addCriterion("is_listing =", value, "isListing");
            return (Criteria) this;
        }

        public Criteria andIsListingNotEqualTo(Boolean value) {
            addCriterion("is_listing <>", value, "isListing");
            return (Criteria) this;
        }

        public Criteria andIsListingGreaterThan(Boolean value) {
            addCriterion("is_listing >", value, "isListing");
            return (Criteria) this;
        }

        public Criteria andIsListingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_listing >=", value, "isListing");
            return (Criteria) this;
        }

        public Criteria andIsListingLessThan(Boolean value) {
            addCriterion("is_listing <", value, "isListing");
            return (Criteria) this;
        }

        public Criteria andIsListingLessThanOrEqualTo(Boolean value) {
            addCriterion("is_listing <=", value, "isListing");
            return (Criteria) this;
        }

        public Criteria andIsListingIn(List<Boolean> values) {
            addCriterion("is_listing in", values, "isListing");
            return (Criteria) this;
        }

        public Criteria andIsListingNotIn(List<Boolean> values) {
            addCriterion("is_listing not in", values, "isListing");
            return (Criteria) this;
        }

        public Criteria andIsListingBetween(Boolean value1, Boolean value2) {
            addCriterion("is_listing between", value1, value2, "isListing");
            return (Criteria) this;
        }

        public Criteria andIsListingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_listing not between", value1, value2, "isListing");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeIsNull() {
            addCriterion("auto_listing_time is null");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeIsNotNull() {
            addCriterion("auto_listing_time is not null");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeEqualTo(Date value) {
            addCriterion("auto_listing_time =", value, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeNotEqualTo(Date value) {
            addCriterion("auto_listing_time <>", value, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeGreaterThan(Date value) {
            addCriterion("auto_listing_time >", value, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auto_listing_time >=", value, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeLessThan(Date value) {
            addCriterion("auto_listing_time <", value, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeLessThanOrEqualTo(Date value) {
            addCriterion("auto_listing_time <=", value, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeIn(List<Date> values) {
            addCriterion("auto_listing_time in", values, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeNotIn(List<Date> values) {
            addCriterion("auto_listing_time not in", values, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeBetween(Date value1, Date value2) {
            addCriterion("auto_listing_time between", value1, value2, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andAutoListingTimeNotBetween(Date value1, Date value2) {
            addCriterion("auto_listing_time not between", value1, value2, "autoListingTime");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Boolean value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Boolean value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Boolean value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Boolean value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Boolean value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Boolean> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Boolean> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andEtdStatusIsNull() {
            addCriterion("etd_status is null");
            return (Criteria) this;
        }

        public Criteria andEtdStatusIsNotNull() {
            addCriterion("etd_status is not null");
            return (Criteria) this;
        }

        public Criteria andEtdStatusEqualTo(Boolean value) {
            addCriterion("etd_status =", value, "etdStatus");
            return (Criteria) this;
        }

        public Criteria andEtdStatusNotEqualTo(Boolean value) {
            addCriterion("etd_status <>", value, "etdStatus");
            return (Criteria) this;
        }

        public Criteria andEtdStatusGreaterThan(Boolean value) {
            addCriterion("etd_status >", value, "etdStatus");
            return (Criteria) this;
        }

        public Criteria andEtdStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("etd_status >=", value, "etdStatus");
            return (Criteria) this;
        }

        public Criteria andEtdStatusLessThan(Boolean value) {
            addCriterion("etd_status <", value, "etdStatus");
            return (Criteria) this;
        }

        public Criteria andEtdStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("etd_status <=", value, "etdStatus");
            return (Criteria) this;
        }

        public Criteria andEtdStatusIn(List<Boolean> values) {
            addCriterion("etd_status in", values, "etdStatus");
            return (Criteria) this;
        }

        public Criteria andEtdStatusNotIn(List<Boolean> values) {
            addCriterion("etd_status not in", values, "etdStatus");
            return (Criteria) this;
        }

        public Criteria andEtdStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("etd_status between", value1, value2, "etdStatus");
            return (Criteria) this;
        }

        public Criteria andEtdStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("etd_status not between", value1, value2, "etdStatus");
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