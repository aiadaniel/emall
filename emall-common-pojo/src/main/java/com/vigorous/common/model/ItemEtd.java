package com.vigorous.common.model;

import java.util.Date;

public class ItemEtd {
    private Integer id;

    private Boolean etdType;

    private Date etdStartdate;

    private Integer etdDays;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEtdType() {
        return etdType;
    }

    public void setEtdType(Boolean etdType) {
        this.etdType = etdType;
    }

    public Date getEtdStartdate() {
        return etdStartdate;
    }

    public void setEtdStartdate(Date etdStartdate) {
        this.etdStartdate = etdStartdate;
    }

    public Integer getEtdDays() {
        return etdDays;
    }

    public void setEtdDays(Integer etdDays) {
        this.etdDays = etdDays;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", etdType=").append(etdType);
        sb.append(", etdStartdate=").append(etdStartdate);
        sb.append(", etdDays=").append(etdDays);
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
        ItemEtd other = (ItemEtd) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEtdType() == null ? other.getEtdType() == null : this.getEtdType().equals(other.getEtdType()))
            && (this.getEtdStartdate() == null ? other.getEtdStartdate() == null : this.getEtdStartdate().equals(other.getEtdStartdate()))
            && (this.getEtdDays() == null ? other.getEtdDays() == null : this.getEtdDays().equals(other.getEtdDays()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEtdType() == null) ? 0 : getEtdType().hashCode());
        result = prime * result + ((getEtdStartdate() == null) ? 0 : getEtdStartdate().hashCode());
        result = prime * result + ((getEtdDays() == null) ? 0 : getEtdDays().hashCode());
        return result;
    }
}