package serviceImpl.impl;

import java.util.List;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;

import api.dto.Member;
import api.service.MemberService;

public class MemberServiceImpl implements MemberService{

	@Override
	public Member createMember(Member member, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateMember(Member member, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deactivateMember(Long id, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Member getMember(Long id) throws NotFoundException, ExistException,
			MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMemberByName(String name) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getAllMembers(int start, int numberOfRecords)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter {
		// TODO Auto-generated method stub
		return null;
	}

}
