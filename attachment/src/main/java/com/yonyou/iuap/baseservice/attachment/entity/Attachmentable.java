package com.yonyou.iuap.baseservice.attachment.entity;

import com.yonyou.iuap.baseservice.entity.LogicDel;
import com.yonyou.iuap.baseservice.entity.Model;

import java.util.List;

public interface Attachmentable extends   Model, LogicDel {

    public List<AttachmentEntity> getAttachment() ;

    public void setAttachment(List<AttachmentEntity> attachment);

}
