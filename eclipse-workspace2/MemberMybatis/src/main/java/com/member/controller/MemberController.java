@Controller
public class MemberController {
	//서비스 연결
	@Autowired
	private MemberService mService;
	
	//추가폼으로 가기
	@RequestMapping("insert.my")
	public void insert() {
		
	}
	
	//추가하기
	@RequestMapping(value="insert.my", method=RequestMethod.POST)
	public String insert(MemberVO member) {
		mService.insert(member);
		return "redirect:list.my";
	}

}