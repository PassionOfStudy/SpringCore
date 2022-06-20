package hello.core.member;

public interface MemberRepository {
    // 회원 객체를 저장
    void save(Member member);

    // 회원번호로 조회
  Member findById(Long memberId);
}
