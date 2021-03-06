package com.yangfeilong.live.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseVideo<M extends BaseVideo<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setVideoName(java.lang.String videoName) {
		set("video_name", videoName);
		return (M)this;
	}

	public java.lang.String getVideoName() {
		return getStr("video_name");
	}

	public M setDescription(java.lang.String description) {
		set("description", description);
		return (M)this;
	}

	public java.lang.String getDescription() {
		return getStr("description");
	}

	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	public M setVideoFormat(java.lang.String videoFormat) {
		set("video_format", videoFormat);
		return (M)this;
	}

	public java.lang.String getVideoFormat() {
		return getStr("video_format");
	}

	public M setDuration(java.lang.Long duration) {
		set("duration", duration);
		return (M)this;
	}

	public java.lang.Long getDuration() {
		return getLong("duration");
	}

	public M setUploadTime(java.util.Date uploadTime) {
		set("upload_time", uploadTime);
		return (M)this;
	}

	public java.util.Date getUploadTime() {
		return get("upload_time");
	}

	public M setCover(java.lang.String cover) {
		set("cover", cover);
		return (M)this;
	}

	public java.lang.String getCover() {
		return getStr("cover");
	}

	public M setCommentAmounts(java.lang.Integer commentAmounts) {
		set("comment_amounts", commentAmounts);
		return (M)this;
	}

	public java.lang.Integer getCommentAmounts() {
		return getInt("comment_amounts");
	}

}
