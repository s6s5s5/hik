//package sun.repository.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import sun.repository.convert.EncryptStringConvert;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name="crm_lead")
//public class CrmLead {
//
//    @Id
//    @Column(name = "id", columnDefinition = "主键")
//    private Long id;
//
//    @Column(name = "crm_lead_id", columnDefinition = "CRM的lead主键ID")
//    private String crmLeadId;
//
//    @Column(name = "country_code", columnDefinition = "国家Code")
//    private String countryCode;
//
//    @Column(name = "city", columnDefinition = "城市名称")
//    private String city;
//
//    @Column(name = "company_name", columnDefinition = "公司名称")
//    private String companyName;
//
//    @Column(name = "company_phone", columnDefinition = "公司联系电话(加密)")
//    @Convert(converter = EncryptStringConvert.class)
//    private String companyPhone;
//
//    @Column(name = "phone", columnDefinition = "联系电话(加密)")
//    @Convert(converter = EncryptStringConvert.class)
//    private String phone;
//
//    @Column(name = "mobile_phone", columnDefinition = "手机号(加密)")
//    @Convert(converter = EncryptStringConvert.class)
//    private String mobilePhone;
//
//    @Column(name = "post_code", columnDefinition = "公司邮政编码")
//    private String postCode;
//
//    @Column(name = "address", columnDefinition = "公司地址(加密)")
//    @Convert(converter = EncryptStringConvert.class)
//    private String address;
//
//    @Column(name = "industry", columnDefinition = "公司行业")
//    private String industry;
//
//    @Column(name = "business_role", columnDefinition = "公司角色类型")
//    private String businessRole;
//
//    @Column(name = "first_name", columnDefinition = "联系人-名字(加密)")
//    @Convert(converter = EncryptStringConvert.class)
//    private String firstName;
//
//    @Column(name = "last_name", columnDefinition = "联系人-姓(加密)")
//    @Convert(converter = EncryptStringConvert.class)
//    private String lastName;
//
//    @Column(name = "full_name", columnDefinition = "联系人-全名(加密)")
//    @Convert(converter = EncryptStringConvert.class)
//    private String fullName;
//
//    @Column(name = "email", columnDefinition = "联系人邮箱(加密)")
//    @Convert(converter = EncryptStringConvert.class)
//    private String email;
//
//    @Column(name = "job_title", columnDefinition = "联系人职务")
//    private String jobTitle;
//
//    @Column(name = "audit_status", columnDefinition = "审核状态(Reject/Converted)")
//    private String auditStatus;
//
//    @Column(name = "state_code", columnDefinition = "省份编码")
//    private String stateCode;
//
//    @Column(name = "province", columnDefinition = "省份名称")
//    private String province;
//
//    @Column(name = "pp_company_id", columnDefinition = "对应portaluser公司COMPANY_UUID")
//    private String ppCompanyId;
//
//    @Column(name = "pp_company_user_id", columnDefinition = "对应portaluser用户USER_UUID")
//    private String ppCompanyUserId;
//
//    @Column(name = "converted_contact_id", columnDefinition = "对应portalUser用户CRM_CONTACT_ID")
//    private String convertedContactId;
//
//    @Column(name = "converted_account_id", columnDefinition = "对应portalUser公司CRM_ACCOUNT_ID")
//    private String convertedAccountId;
//
//    @Column(name = "account_number", columnDefinition = "对应portalUser公司PARTNER_NO")
//    private String accountNumber;
//
//    @Column(name = "delete_status", columnDefinition = "是否删除0：未删除1：删除")
//    private String deleteStatus;
//
//    @Column(name = "created_by", columnDefinition = "创建人")
//    private String createdBy;
//
//    @Column(name = "creation_time", columnDefinition = "创建时间")
//    private Date creationTime;
//
//    @Column(name = "modified_by", columnDefinition = "修改人")
//    private String modifiedBy;
//
//    @Column(name = "modification_time", columnDefinition = "修改时间")
//    private Date modificationTime;
//
//
//
//
//
//
//}
