@Controller
public class MemberController {
	//���� ����
	@Autowired
	private MemberService mService;
	
	//�߰������� ����
	@RequestMapping("insert.my")
	public void insert() {
		
	}
	
	//�߰��ϱ�
	@RequestMapping(value="insert.my", method=RequestMethod.POST)
	public String insert(MemberVO member) {
		mService.insert(member);
		return "redirect:list.my";
	}

}