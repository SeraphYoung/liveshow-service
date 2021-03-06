package com.yangfeilong.live.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseComment<M extends BaseComment<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setVideoId(java.lang.Integer videoId) {
		set("video_id", videoId);
		return (M)this;
	}

	public java.lang.Integer getVideoId() {
		return getInt("video_id");
	}

	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	public M setShowSec(java.lang.Float showSec) {
		set("show_sec", showSec);
		return (M)this;
	}

	public java.lang.Float getShowSec() {
		return getFloat("show_sec");
	}

	public M setMode(java.lang.Integer mode) {
		set("mode", mode);
		return (M)this;
	}

	public java.lang.Integer getMode() {
		return getInt("mode");
	}

	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	public java.lang.String getContent() {
		return getStr("content");
	}

	public M setCommentTime(java.util.Date commentTime) {
		set("comment_time", commentTime);
		return (M)this;
	}

	public java.util.Date getCommentTime() {
		return get("comment_time");
	}

}
