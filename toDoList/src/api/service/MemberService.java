package api.service;

import java.util.List;

import common.exception.ExistException;
import common.exception.InvalidParameter;
import common.exception.MissingParameter;
import common.exception.NotFoundException;

import api.dto.Member;

public interface MemberService {
	Member createMember(Member member, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	Member updateMember(Member member, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	boolean deactivateMember(Long id, String principalId)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	Member getMember(Long id) throws NotFoundException,
			ExistException, MissingParameter, InvalidParameter;

	Member getMemberByName(String name)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

	List<Member> getAllMembers(int start, int numberOfRecords)
			throws NotFoundException, ExistException, MissingParameter,
			InvalidParameter;

}
