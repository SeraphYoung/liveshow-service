package com.yangfeilong.live.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("l_comment", "id", Comment.class);
		arp.addMapping("l_temp_comment", "id", TempComment.class);
		arp.addMapping("l_updator", "id", Updator.class);
		arp.addMapping("l_user", "id", User.class);
		arp.addMapping("l_video", "id", Video.class);
	}
}

