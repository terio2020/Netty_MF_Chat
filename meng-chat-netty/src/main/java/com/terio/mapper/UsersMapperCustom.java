package com.terio.mapper;

import java.util.List;

import com.terio.pojo.Users;
import com.terio.pojo.vo.FriendRequestVO;
import com.terio.pojo.vo.MyFriendsVO;
import com.terio.utils.MyMapper;

public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}