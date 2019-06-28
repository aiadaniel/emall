package com.vigorous.common.model;

public class ItemFenXiao {
    private Integer id;

    private Integer supplierShopId;

    private Integer supplierItemId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupplierShopId() {
        return supplierShopId;
    }

    public void setSupplierShopId(Integer supplierShopId) {
        this.supplierShopId = supplierShopId;
    }

    public Integer getSupplierItemId() {
        return supplierItemId;
    }

    public void setSupplierItemId(Integer supplierItemId) {
        this.supplierItemId = supplierItemId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplierShopId=").append(supplierShopId);
        sb.append(", supplierItemId=").append(supplierItemId);
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
        ItemFenXiao other = (ItemFenXiao) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSupplierShopId() == null ? other.getSupplierShopId() == null : this.getSupplierShopId().equals(other.getSupplierShopId()))
            && (this.getSupplierItemId() == null ? other.getSupplierItemId() == null : this.getSupplierItemId().equals(other.getSupplierItemId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSupplierShopId() == null) ? 0 : getSupplierShopId().hashCode());
        result = prime * result + ((getSupplierItemId() == null) ? 0 : getSupplierItemId().hashCode());
        return result;
    }
}