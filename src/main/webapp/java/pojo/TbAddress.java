package pojo;

import java.util.Date;

public class TbAddress {
    private Long id;

    private String user_id;

    private String province_id;

    private String city_id;

    private String town_id;

    private String mobile;

    private String address;

    private String contact;

    private String is_default;

    private String notes;

    private Date create_date;

    private String alias;

    public TbAddress() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return user_id;
    }

    public void setUserId(String userId) {
        this.user_id = userId == null ? null : userId.trim();
    }

    public String getProvinceId() {
        return province_id;
    }

    public void setProvinceId(String provinceId) {
        this.province_id = provinceId == null ? null : provinceId.trim();
    }

    public String getCityId() {
        return city_id;
    }

    public void setCityId(String cityId) {
        this.city_id = cityId == null ? null : cityId.trim();
    }

    public String getTownId() {
        return town_id;
    }

    public void setTownId(String townId) {
        this.town_id = townId == null ? null : townId.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getIsDefault() {
        return is_default;
    }

    public void setIsDefault(String isDefault) {
        this.is_default = isDefault == null ? null : isDefault.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Date getCreateDate() {
        return create_date;
    }

    public void setCreateDate(Date createDate) {
        this.create_date = createDate;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    @Override
    public String toString() {
        return this.address+"-"+this.town_id;
    }
}