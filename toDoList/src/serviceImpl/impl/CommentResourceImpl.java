package serviceImpl.impl;

import java.util.List;

import javax.ws.rs.BeanParam;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;
import common.util.FilterBean;

import api.dto.Comment;
import api.dto.Member;
import api.service.CommentResource;

public class CommentResourceImpl implements CommentResource{

	@Override
	public Comment createComment(Comment comment, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateComment(Comment comment) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getCommentsForTast(Long id,
			@BeanParam FilterBean filterBean) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

}
