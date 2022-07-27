package com.codegym.ss7_c0222g1.model.login;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", columnDefinition = "INT")
    private Integer roleId;

    public Role() {
    }

    @Column(name = "role_name", columnDefinition = "VARCHAR(45)")
    private String roleName;

    @ManyToMany(mappedBy = "roleList")
    private Set<User> userList;

    public Role(Integer roleId, String roleName, Set<User> userList) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.userList = userList;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getUserList() {
        return userList;
    }

    public void setUserList(Set<User> userList) {
        this.userList = userList;
    }
}