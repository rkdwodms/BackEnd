@Repository
public class MemberDAOImpl implements MemberDAO{
	//sql연결
	@Autowired
	private SqlSessionFactory sqlMapper;

	//추가
	public void dao_insert(String sql_Id, MemberVO member) {
		SqlSession sess=sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sql_Id, member); //sql_Id="insertData"
		sess.commit();
	}
}