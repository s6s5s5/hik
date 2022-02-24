package sun.repository.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Installer 用户实体
 *
 * @author Ferries.Lv
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company_installer")
public class Installer {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "salt", nullable = false)
    private String salt;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "role_id")
    private String roleId;

    @Column(name = "company_id")
    private String companyId;

    @Column(name = "complate_flag")
    private Boolean complateFlag;

    @Column(name = "invited_status", nullable = false)
    private Boolean invitedStatus;

    @Column(name = "update_time")
    private Long updateTime;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "delete_flag", nullable = false)
    private Boolean deleteFlag;

    @Column(name = "juridical_person_flag")
    private Boolean juridicalPersonFlag;

    /**
     * v1.0.1 新增需求，是否是第一次登陆
     **/
    @Column(name = "first_login", columnDefinition = "bit default 0 comment '是否是第一次登陆（默认false） '")
    private Boolean firstLogin;

    /**
     * v1.1.0 新增需求,用于AX2设备的用户盐
     **/
    @Column(name = "salt_user")
    private String saltUser;

    /**
     * v1.1.0 新增需求,用于AX2设备的用户摘要
     **/
    @Column(name = "digest_user")
    private String digestUser;

    /**
     * v1.1 新增需求，灰度发布
     **/
    @Column(name = "grayscale_release", columnDefinition = "bit default 0 comment '是否是灰度发布体验用户 '")
    private Boolean grayscaleRelease;

    /**
     * v1.1.0 新增需求,国家注册时必选
     **/
    @Column(name = "country")
    private String country;

    /**
     * v1.2  员工账号启用禁用状态
     **/
    @Column(name = "installer_status", columnDefinition = "bit default 1 comment '启用禁用状态（默认启用） '")
    private Boolean installerStatus;

    /**
     * v1.1.1 新增消息订阅
     **/
    @Column(name = "subscribe_status")
    private Boolean subscribeStatus;

//    /**
//     * v1.3.1 用户来源 区分SysCom用户
//     **/
//    @Column(name = "origin_type")
//    private Integer originType;
//
//    /**
//     * v1.3.1 用户源Id 记录SysCom用户在原系统Id
//     **/
//    @Column(name = "origin_id")
//    private String originId;

}
