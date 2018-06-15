import java.util.List;

import org.apache.log4j.Logger;

import com.bit.struts2.model.GuestDao;
import com.bit.struts2.model.entity.GuestVo;

public class GuestAction {
	//POJO
	
	
	
	
	
	Logger log=Logger.getLogger(getClass());
	private List<GuestVo> list;
	private String msg;
	private int idx;
	
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	
	public String detail() throws Exception{
		log.debug("detail()");
		
	}
	
	
	
	
	
	public String execute() throws Exception{
		GuestDao dao=new GuestDao();
		list=dao.selectAll();
		return "success";
	}
	

}
