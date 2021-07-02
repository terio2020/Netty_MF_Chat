package com.terio.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "chat_msg")
public class ChatMsg {
    private String senderId;		// 发送者的用户id
    private String receiverId;		// 接受者的用户id
    private String msgId;			// 用于消息的签收


    @Id
    private String id;
    @Column(name = "send_user_id")
    private String sendUserId;
    @Column(name = "accept_user_id")
    private String acceptUserId;
    private String msg;
    @Column(name = "sign_flag")
    private Integer signFlag;
    @Column(name = "create_time")
    private Date createTime;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSendUserId() {
        return sendUserId;
    }
    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }
    public String getAcceptUserId() {
        return acceptUserId;
    }
    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Integer getSignFlag() {
        return signFlag;
    }
    public void setSignFlag(Integer signFlag) {
        this.signFlag = signFlag;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    private static final long serialVersionUID = 3611169682695799175L;
    public String getSenderId() {
        return senderId;
    }
    public String getReceiverId() {
        return receiverId;
    }
}