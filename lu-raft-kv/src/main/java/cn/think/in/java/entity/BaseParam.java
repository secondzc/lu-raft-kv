package cn.think.in.java.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 */
@Getter
@Setter
@ToString
public class BaseParam implements Serializable {

    /** 候选人的任期号  */
    public long term;

    // todo 这是个无用的
    /** 被请求者 ID(ip:selfPort) */
    public String serverId;

}
