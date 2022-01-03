@Repository
public class MemberDAOImpl implements MemberDAO{
	//sql����
	@Autowired
	private SqlSessionFactory sqlMapper;

	//�߰�
	public void dao_insert(String sql_Id, MemberVO member) {
		SqlSession sess=sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sql_Id, member); //sql_Id="insertData"
		sess.commit();
	}
}