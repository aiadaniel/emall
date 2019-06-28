package com.vigorous.common.model;

import java.util.Date;

public class Item {
    private Integer id;

    private String alias;

    private Integer shopid;

    private Date gmtCreate;

    private Date gmtUpdate;

    private Boolean status;

    private String title;

    private String summary;

    private Integer cid;

    private String picurls;

    private Short itemType;

    private Boolean fenxiaoType;

    private Long price;

    private Long itemWeight;

    private String itemNo;

    private Integer quantity;

    private Integer soldNum;

    private Boolean isHideStock;

    private Long originalPrice;

    private Boolean isLevelDiscount;

    private Boolean postType;

    private Integer postFee;

    private Integer deliveryTemplateId;

    private Boolean isListing;

    private Integer order;

    private Date autoListingTime;

    private Boolean isLock;

    private String message;

    private Boolean etdStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getPicurls() {
        return picurls;
    }

    public void setPicurls(String picurls) {
        this.picurls = picurls;
    }

    public Short getItemType() {
        return itemType;
    }

    public void setItemType(Short itemType) {
        this.itemType = itemType;
    }

    public Boolean getFenxiaoType() {
        return fenxiaoType;
    }

    public void setFenxiaoType(Boolean fenxiaoType) {
        this.fenxiaoType = fenxiaoType;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Long itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Boolean getIsHideStock() {
        return isHideStock;
    }

    public void setIsHideStock(Boolean isHideStock) {
        this.isHideStock = isHideStock;
    }

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Boolean getIsLevelDiscount() {
        return isLevelDiscount;
    }

    public void setIsLevelDiscount(Boolean isLevelDiscount) {
        this.isLevelDiscount = isLevelDiscount;
    }

    public Boolean getPostType() {
        return postType;
    }

    public void setPostType(Boolean postType) {
        this.postType = postType;
    }

    public Integer getPostFee() {
        return postFee;
    }

    public void setPostFee(Integer postFee) {
        this.postFee = postFee;
    }

    public Integer getDeliveryTemplateId() {
        return deliveryTemplateId;
    }

    public void setDeliveryTemplateId(Integer deliveryTemplateId) {
        this.deliveryTemplateId = deliveryTemplateId;
    }

    public Boolean getIsListing() {
        return isListing;
    }

    public void setIsListing(Boolean isListing) {
        this.isListing = isListing;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Date getAutoListingTime() {
        return autoListingTime;
    }

    public void setAutoListingTime(Date autoListingTime) {
        this.autoListingTime = autoListingTime;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getEtdStatus() {
        return etdStatus;
    }

    public void setEtdStatus(Boolean etdStatus) {
        this.etdStatus = etdStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", alias=").append(alias);
        sb.append(", shopid=").append(shopid);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtUpdate=").append(gmtUpdate);
        sb.append(", status=").append(status);
        sb.append(", title=").append(title);
        sb.append(", summary=").append(summary);
        sb.append(", cid=").append(cid);
        sb.append(", picurls=").append(picurls);
        sb.append(", itemType=").append(itemType);
        sb.append(", fenxiaoType=").append(fenxiaoType);
        sb.append(", price=").append(price);
        sb.append(", itemWeight=").append(itemWeight);
        sb.append(", itemNo=").append(itemNo);
        sb.append(", quantity=").append(quantity);
        sb.append(", soldNum=").append(soldNum);
        sb.append(", isHideStock=").append(isHideStock);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", isLevelDiscount=").append(isLevelDiscount);
        sb.append(", postType=").append(postType);
        sb.append(", postFee=").append(postFee);
        sb.append(", deliveryTemplateId=").append(deliveryTemplateId);
        sb.append(", isListing=").append(isListing);
        sb.append(", order=").append(order);
        sb.append(", autoListingTime=").append(autoListingTime);
        sb.append(", isLock=").append(isLock);
        sb.append(", message=").append(message);
        sb.append(", etdStatus=").append(etdStatus);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Item other = (Item) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtUpdate() == null ? other.getGmtUpdate() == null : this.getGmtUpdate().equals(other.getGmtUpdate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSummary() == null ? other.getSummary() == null : this.getSummary().equals(other.getSummary()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getPicurls() == null ? other.getPicurls() == null : this.getPicurls().equals(other.getPicurls()))
            && (this.getItemType() == null ? other.getItemType() == null : this.getItemType().equals(other.getItemType()))
            && (this.getFenxiaoType() == null ? other.getFenxiaoType() == null : this.getFenxiaoType().equals(other.getFenxiaoType()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getItemWeight() == null ? other.getItemWeight() == null : this.getItemWeight().equals(other.getItemWeight()))
            && (this.getItemNo() == null ? other.getItemNo() == null : this.getItemNo().equals(other.getItemNo()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getSoldNum() == null ? other.getSoldNum() == null : this.getSoldNum().equals(other.getSoldNum()))
            && (this.getIsHideStock() == null ? other.getIsHideStock() == null : this.getIsHideStock().equals(other.getIsHideStock()))
            && (this.getOriginalPrice() == null ? other.getOriginalPrice() == null : this.getOriginalPrice().equals(other.getOriginalPrice()))
            && (this.getIsLevelDiscount() == null ? other.getIsLevelDiscount() == null : this.getIsLevelDiscount().equals(other.getIsLevelDiscount()))
            && (this.getPostType() == null ? other.getPostType() == null : this.getPostType().equals(other.getPostType()))
            && (this.getPostFee() == null ? other.getPostFee() == null : this.getPostFee().equals(other.getPostFee()))
            && (this.getDeliveryTemplateId() == null ? other.getDeliveryTemplateId() == null : this.getDeliveryTemplateId().equals(other.getDeliveryTemplateId()))
            && (this.getIsListing() == null ? other.getIsListing() == null : this.getIsListing().equals(other.getIsListing()))
            && (this.getOrder() == null ? other.getOrder() == null : this.getOrder().equals(other.getOrder()))
            && (this.getAutoListingTime() == null ? other.getAutoListingTime() == null : this.getAutoListingTime().equals(other.getAutoListingTime()))
            && (this.getIsLock() == null ? other.getIsLock() == null : this.getIsLock().equals(other.getIsLock()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getEtdStatus() == null ? other.getEtdStatus() == null : this.getEtdStatus().equals(other.getEtdStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtUpdate() == null) ? 0 : getGmtUpdate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSummary() == null) ? 0 : getSummary().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getPicurls() == null) ? 0 : getPicurls().hashCode());
        result = prime * result + ((getItemType() == null) ? 0 : getItemType().hashCode());
        result = prime * result + ((getFenxiaoType() == null) ? 0 : getFenxiaoType().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getItemWeight() == null) ? 0 : getItemWeight().hashCode());
        result = prime * result + ((getItemNo() == null) ? 0 : getItemNo().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getSoldNum() == null) ? 0 : getSoldNum().hashCode());
        result = prime * result + ((getIsHideStock() == null) ? 0 : getIsHideStock().hashCode());
        result = prime * result + ((getOriginalPrice() == null) ? 0 : getOriginalPrice().hashCode());
        result = prime * result + ((getIsLevelDiscount() == null) ? 0 : getIsLevelDiscount().hashCode());
        result = prime * result + ((getPostType() == null) ? 0 : getPostType().hashCode());
        result = prime * result + ((getPostFee() == null) ? 0 : getPostFee().hashCode());
        result = prime * result + ((getDeliveryTemplateId() == null) ? 0 : getDeliveryTemplateId().hashCode());
        result = prime * result + ((getIsListing() == null) ? 0 : getIsListing().hashCode());
        result = prime * result + ((getOrder() == null) ? 0 : getOrder().hashCode());
        result = prime * result + ((getAutoListingTime() == null) ? 0 : getAutoListingTime().hashCode());
        result = prime * result + ((getIsLock() == null) ? 0 : getIsLock().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getEtdStatus() == null) ? 0 : getEtdStatus().hashCode());
        return result;
    }
}