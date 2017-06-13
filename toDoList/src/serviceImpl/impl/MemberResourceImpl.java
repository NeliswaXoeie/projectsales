package serviceImpl.impl;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;
import common.util.FilterBean;

import api.dto.Member;
import api.service.MemberResource;

public class MemberResourceImpl implements MemberResource{

	@Override
	public Member createMember(Member member, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateMember(Member member) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deactivateMember(Long id)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Member getMember(Long id) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMemberByName(String name)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getAllMembers(FilterBean filterBean)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

}
