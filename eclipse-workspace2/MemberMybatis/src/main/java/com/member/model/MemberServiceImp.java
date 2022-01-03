@Service
public class MemberServiceImpl implements MemberService{
	//dao연결
	@Autowired
	private MemberDAO mDao;
	
	//추가
	public void insert(MemberVO member) {
		mDao.dao_insert("insertData", member);
	}
}