@Service
public class MemberServiceImpl implements MemberService{
	//dao����
	@Autowired
	private MemberDAO mDao;
	
	//�߰�
	public void insert(MemberVO member) {
		mDao.dao_insert("insertData", member);
	}
}